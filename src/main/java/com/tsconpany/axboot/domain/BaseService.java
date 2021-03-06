package com.tsconpany.axboot.domain;

import java.io.Serializable;

import com.chequer.axboot.core.domain.base.AXBootBaseService;
import com.chequer.axboot.core.domain.base.AXBootJPAQueryDSLRepository;
import com.tsconpany.axboot.domain.code.QCommonCode;
import com.tsconpany.axboot.domain.file.QCommonFile;
import com.tsconpany.axboot.domain.program.QProgram;
import com.tsconpany.axboot.domain.program.menu.QMenu;
import com.tsconpany.axboot.domain.user.QUser;
import com.tsconpany.axboot.domain.user.auth.QUserAuth;
import com.tsconpany.axboot.domain.user.auth.menu.QAuthGroupMenu;
import com.tsconpany.axboot.domain.user.role.QUserRole;


public class BaseService<T, ID extends Serializable> extends AXBootBaseService<T, ID> {

    protected QUserRole qUserRole = QUserRole.userRole;
    protected QAuthGroupMenu qAuthGroupMenu = QAuthGroupMenu.authGroupMenu;
    protected QCommonCode qCommonCode = QCommonCode.commonCode;
    protected QUser qUser = QUser.user;
    protected QProgram qProgram = QProgram.program;
    protected QUserAuth qUserAuth = QUserAuth.userAuth;
    protected QMenu qMenu = QMenu.menu;
    protected QCommonFile qCommonFile = QCommonFile.commonFile;

    protected AXBootJPAQueryDSLRepository<T, ID> repository;

    public BaseService() {
        super();
    }

    public BaseService(AXBootJPAQueryDSLRepository<T, ID> repository) {
        super(repository);
        this.repository = repository;
    }
}
