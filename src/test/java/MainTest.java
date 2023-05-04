import gun.Machine;
import gun.Sniper;
import gun.Wepon;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import user.User;

import java.util.ArrayList;

import static org.assertj.core.api.Assertions.assertThat;

class MainTest  {
    @Test
    @DisplayName("유저가 총을 집을때 인벤토리에 잘들어갔는가 확인하는 테스트")
    void userTakeGunTest() throws Exception {
        //given
        ArrayList<Wepon> list = new ArrayList<>();
        list.add(new Wepon());
        list.add(new Machine());
        list.add(new Sniper());
        User user = new User();

        //when
        boolean true_0 = user.takeGun(list.get(0));
        boolean true_1 = user.takeGun(list.get(1));
        boolean true_2 = user.takeGun(list.get(2));
        //then
        assertThat(true_0).isTrue();
        assertThat(true_1).isTrue();
        assertThat(true_2).isTrue();

    }

    @Test
    @DisplayName("유저가 공격을 하였을 때 데미지가 리턴이 되는가 테스트")
    void userAttackTest() throws Exception {
        //given
        User user = new User();
        //when
        int attack = user.attackEnemy();
        //then
        assertThat(attack).isEqualTo(1);
    }

    @Test
    @DisplayName("유저가 총을 변경하는 테스트함수 추가")
    void userChangeWeponTest() throws Exception {
        //given
        User user = new User();

        //when
        boolean result = user.ChangeWepon();

        //then
        assertThat(result).isTrue();
    }

    @Test
    @DisplayName("유저가 총을 줍고, 변경하고 총을 싸면 데미지가 잘나오는가 확인")
    void userChangeWeponAndAttack() throws Exception {
        //given
        User user = new User();
        ArrayList<Wepon> list = new ArrayList<>();
        list.add(new Machine());
        list.add(new Sniper());
        //when
        for (int i = 0; i < 2; i++) {
            user.takeGun(list.get(i));
        }
        int result_0 = user.attackEnemy(); // 1 기본
        user.ChangeWepon();
        int result_1 = user.attackEnemy(); // 1 머신건
        user.ChangeWepon();
        int result_2 = user.attackEnemy(); // 10 저격총
        //then
        assertThat(result_0).isEqualTo(1);
        assertThat(result_1).isEqualTo(1);
        assertThat(result_2).isEqualTo(10);
    }
}
