package com.ithinksky.petterns.a04behavioral.t05chain;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class AuthHandler extends AbstractHandler implements Handler {

    @Override
    public void operator() {
        log.info("AuthHandler …… ");
        if (getHandler() != null) {
            getHandler().operator();
        }
    }
}
