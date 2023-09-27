package shim.WalletScheduler.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import shim.WalletScheduler.entity.WalletQueues;
import shim.WalletScheduler.entity.Wallets;
import shim.WalletScheduler.repository.WalletQueuesRepository;
import shim.WalletScheduler.repository.WalletsRepository;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

@SpringBootTest
class WalletQueuesServiceTest {

    @Autowired
    private WalletQueuesService walletQueuesService;

    @DisplayName("큐테이블에서 잘 가져오는지 확인")
    @Test
    public void t1() throws Exception {
        List<WalletQueues> result = walletQueuesService.getWalletQueues();
        assertThat(result.size()).isEqualTo(100);
    }

    @DisplayName("calc()메소드 작동 테스트")
    @Test
    public void t2() throws Exception {

        walletQueuesService.calc();
    }
}