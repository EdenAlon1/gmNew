package defpackage;

import androidx.car.app.model.CarColor;
import java.util.HashSet;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjl {
    public static final cjl a = new cjl(new int[]{0, 1, 2, 3, 4, 5, 6, 7});
    private final HashSet b = new HashSet();

    static {
        new cjl(new int[]{1, 2, 3, 4, 5, 6, 7});
    }

    private cjl(int[] iArr) {
        for (int i : iArr) {
            this.b.add(Integer.valueOf(i));
        }
    }

    public final void a(CarColor carColor) {
        if (this.b.contains(Integer.valueOf(carColor.getType()))) {
            return;
        }
        Objects.toString(carColor);
        throw new IllegalArgumentException("Car color type is not allowed: ".concat(String.valueOf(carColor)));
    }
}
