package defpackage;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class ber {
    static {
        bdn bdnVar = bet.E;
    }

    public static int a(bet betVar) {
        return ((Integer) betVar.l(bet.E)).intValue();
    }

    public static int b(bet betVar, int i) {
        return ((Integer) betVar.m(bet.F, Integer.valueOf(i))).intValue();
    }

    public static boy c(bet betVar) {
        return (boy) betVar.l(bet.M);
    }

    public static void d(bet betVar) {
        boolean E = betVar.E();
        boolean z = betVar.N() != null;
        if (E && z) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (betVar.L() != null) {
            if (E || z) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    public static boolean e(bet betVar) {
        return betVar.s(bet.E);
    }

    public static int f(bet betVar) {
        return ((Integer) betVar.m(bet.G, -1)).intValue();
    }

    public static List g(bet betVar) {
        List list = (List) betVar.m(bet.N, null);
        if (list != null) {
            return new ArrayList(list);
        }
        return null;
    }

    public static Size h(bet betVar) {
        return (Size) betVar.m(bet.J, null);
    }

    public static Size i(bet betVar) {
        return (Size) betVar.m(bet.K, null);
    }

    public static int j(bet betVar) {
        return ((Integer) betVar.m(bet.H, -1)).intValue();
    }

    public static boy k(bet betVar) {
        return (boy) betVar.m(bet.M, null);
    }

    public static List l(bet betVar) {
        return (List) betVar.m(bet.L, null);
    }

    public static Size m(bet betVar) {
        return (Size) betVar.m(bet.I, null);
    }
}
