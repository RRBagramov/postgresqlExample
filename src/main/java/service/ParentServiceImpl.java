package service;

import dao.ParentDao;
import models.Parent;

import java.util.List;

public class ParentServiceImpl implements ParentService {
    private ParentDao parentDao;

    public ParentServiceImpl(ParentDao parentDao) {
        this.parentDao = parentDao;
    }

    public boolean isRegistered(String name) throws Exception {
        List<Parent> allParents = parentDao.findAll();

        for (int i = 0; i < allParents.size(); i++) {
            if (allParents.get(i).getName().equals(name)) {
                return true;
            }
        }

        return false;
    }
}
