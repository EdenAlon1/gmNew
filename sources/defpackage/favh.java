package defpackage;

import j$.util.Comparator;
import java.util.function.ToIntFunction;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class favh {
    public static final /* synthetic */ int a = 0;

    static {
        Comparator.EL.thenComparingInt(Comparator.EL.thenComparingInt(Comparator.CC.comparingInt(new ToIntFunction() { // from class: fave
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((faun) obj).b;
            }
        }), new ToIntFunction() { // from class: favf
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((faun) obj).c;
            }
        }), new ToIntFunction() { // from class: favg
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((faun) obj).d;
            }
        });
    }

    public static boolean a(int i, int i2, boolean z) {
        boolean z2 = false;
        if (i2 > 0 && i2 <= 12) {
            z2 = true;
        }
        emxf.d(z2, "invalid month %s", i2);
        return d(i, i2 == 2 ? z ? 29 : 28 : ((5546 >> i2) & 1) + 30);
    }

    public static boolean b(int i) {
        return d(i, 12);
    }

    public static boolean c(int i) {
        return d(i, 9999);
    }

    private static boolean d(int i, int i2) {
        return i > 0 && i <= i2;
    }
}
