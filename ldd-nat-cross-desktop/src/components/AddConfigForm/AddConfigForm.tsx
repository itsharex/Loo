import { LocalProxyConfig } from '@/models/types';
import { PlusOutlined } from '@ant-design/icons';
import {
  ModalForm,
  ProCard,
  ProForm,
  ProFormDigit,
  ProFormGroup,
  ProFormList,
  ProFormSelect,
  ProFormText,
} from '@ant-design/pro-components';
import { Button, Tag } from 'antd';

interface Props {
  type: 'server' | 'proxy';
  initProxy?: LocalProxyConfig[];
  onFinish: (formData: any) => Promise<any>;
}

const AddConfigForm: React.FC<Props> = (props) => {
  return (
    <ModalForm
      title="新增配置"
      layout="horizontal"
      trigger={
        <Button type="primary">
          <PlusOutlined />
          {props.type === 'server' ? '服务配置' : '代理配置'}
        </Button>
      }
      autoFocusFirstInput
      onFinish={async (formData) => {
        await props.onFinish(formData);
        return true;
      }}
    >
      {props.type === 'server' ? (
        <ProForm.Group>
          <ProFormText
            vertical
            width="md"
            name="serverHost"
            label="主机名称"
            placeholder="请输入服务端主机名称"
          />
          <ProFormDigit
            vertical
            width="md"
            name="serverPort"
            min={1024}
            max={65535}
            fieldProps={{ precision: 0 }}
            label="接入端口"
            placeholder="请输入服务端的接入端口"
          />
          <ProFormText.Password
            vertical
            width="md"
            name="password"
            label="接入密码"
            placeholder="请输入接入密码"
          />
        </ProForm.Group>
      ) : (
        <ProFormList
          name="proxies"
          copyIconProps={false}
          creatorButtonProps={{
            creatorButtonText: '添加代理配置',
          }}
          initialValue={props.initProxy}
          min={1}
          itemRender={({ listDom, action }, { index }) => (
            <ProCard
              bordered
              style={{ marginBlockEnd: 8 }}
              title={`配置${index + 1}`}
              extra={action}
              bodyStyle={{ paddingBlockEnd: 0 }}
            >
              {listDom}
            </ProCard>
          )}
        >
          <ProFormGroup>
            <ProFormText
              vertical
              width="md"
              name="host"
              label="代理主机"
              placeholder="请输入代理主机名称"
            />
            <ProFormDigit
              vertical
              width="md"
              name="port"
              min={1024}
              max={65535}
              fieldProps={{ precision: 0 }}
              label="代理端口"
              placeholder="请输入代理端口"
            />
            <ProFormDigit
              vertical
              width="md"
              name="openPort"
              min={1024}
              max={65535}
              fieldProps={{ precision: 0 }}
              label="映射端口"
              placeholder="请输入映射端口"
            />
            <ProFormSelect
              vertical
              width="md"
              name="protocol"
              label="代理协议"
              placeholder="请选择代理协议"
              valueEnum={{
                tcp: <Tag color="success">TCP</Tag>,
                udp: <Tag color="warning">UDP</Tag>,
              }}
            />
          </ProFormGroup>
        </ProFormList>
      )}
    </ModalForm>
  );
};

export default AddConfigForm;
