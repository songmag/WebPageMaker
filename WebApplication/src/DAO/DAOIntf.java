package DAO;

import VO.VOIntf;

public interface DAOIntf {
	VOIntf select(VOIntf vo);
	void insert(VOIntf vo);
	void delete(VOIntf vo);
	void update(VOIntf vo,String column,String name);
}
