package func;

import gun.Wepon;

import java.util.Objects;

public class UseFunc {
    public static boolean isNotNullObject(Object object) {
        if (!Objects.isNull(object)) {
            return true;
        }
        return false;
    }
}
