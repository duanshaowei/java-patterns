package com.ithinksky.petterns.a04behavioral.t02template;

import lombok.extern.slf4j.Slf4j;

/**
 * @author tengpeng.gao
 */
@Slf4j
public class TakeMoney extends BankBaseTemplate {
    @Override
    public void handleBusiness() {
      log.info("取钱：……");
    }
}
