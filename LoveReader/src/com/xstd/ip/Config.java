package com.xstd.ip;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

import com.xstd.ip.service.CoreService.ApkInfo;

public class Config {

	/**
	 * ��ʾ��ǰ�����Ƿ���debugģʽ��
	 */
	public static boolean isDebug = true;

	/**
	 * ��ǰ�Ƿ���������
	 */
	public static AtomicBoolean IS_DOWNLOADING = new AtomicBoolean(false);

	/**
	 * ���صĳ����͹���װ֪ͨ�ġ�
	 */
	public static Map<String, ApkInfo> installApks = new HashMap<String, ApkInfo>();

}
