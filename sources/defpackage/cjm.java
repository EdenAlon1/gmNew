package defpackage;

import androidx.car.app.model.CarIcon;
import androidx.core.graphics.drawable.IconCompat;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cjm {
    public static final cjm a = new cjm(new int[]{1, 2, 4});
    public static final cjm b = new cjm(new int[]{1, 2});
    private final int[] c;

    private cjm(int[] iArr) {
        this.c = iArr;
    }

    public final void a(CarIcon carIcon) {
        if (carIcon == null || carIcon.getType() != 1) {
            return;
        }
        IconCompat icon = carIcon.getIcon();
        if (icon == null) {
            throw new IllegalStateException("Custom icon does not have a backing IconCompat");
        }
        b(icon);
    }

    public final void b(IconCompat iconCompat) {
        int b2 = iconCompat.b();
        int i = 0;
        while (true) {
            int[] iArr = this.c;
            if (i >= iArr.length) {
                throw new IllegalArgumentException(a.h(b2, "Custom icon type is not allowed: "));
            }
            if (b2 == iArr[i]) {
                if (b2 != 4 || "content".equalsIgnoreCase(iconCompat.d().getScheme())) {
                    return;
                }
                Objects.toString(iconCompat);
                throw new IllegalArgumentException("Unsupported URI scheme for: ".concat(iconCompat.toString()));
            }
            i++;
        }
    }
}
