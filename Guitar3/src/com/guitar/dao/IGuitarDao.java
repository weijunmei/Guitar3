package com.guitar.dao;

import java.util.List;

import com.guitar.model.Guitar;
import com.guitar.model.GuitarSpec;

   /**
   * GuitarDao ���ݿ���ʲ㣬�ӿ�
   */
  public interface IGuitarDao {

	/**
	 * ���
	 * @return
	 */
	public void addGuitar(Guitar guitar);

	/**
	 * ��ѯ
	 * @return
	 */
	public List<Guitar> searchGuitar();

	/**
	 * ɾ��
	 * @return
	 */
	public void delGuitar(String serialNumber);

}
