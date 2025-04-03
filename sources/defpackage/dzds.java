package defpackage;

import android.graphics.Color;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzds {
    public static int a(faul faulVar) {
        int d = d(faulVar.c);
        int d2 = d(faulVar.d);
        int d3 = d(faulVar.e);
        if ((faulVar.b & 1) == 0) {
            return Color.rgb(d, d2, d3);
        }
        eyfn eyfnVar = faulVar.f;
        if (eyfnVar == null) {
            eyfnVar = eyfn.a;
        }
        return Color.argb(d(eyfnVar.b), d, d2, d3);
    }

    public static faul b(int i) {
        fauk faukVar = (fauk) faul.a.createBuilder();
        float c = c(Color.red(i));
        faukVar.copyOnWrite();
        ((faul) faukVar.instance).c = c;
        float c2 = c(Color.green(i));
        faukVar.copyOnWrite();
        ((faul) faukVar.instance).d = c2;
        float c3 = c(Color.blue(i));
        faukVar.copyOnWrite();
        ((faul) faukVar.instance).e = c3;
        eyfm eyfmVar = (eyfm) eyfn.a.createBuilder();
        float c4 = c(Color.alpha(i));
        eyfmVar.copyOnWrite();
        ((eyfn) eyfmVar.instance).b = c4;
        faukVar.copyOnWrite();
        faul faulVar = (faul) faukVar.instance;
        eyfn eyfnVar = (eyfn) eyfmVar.build();
        eyfnVar.getClass();
        faulVar.f = eyfnVar;
        faulVar.b |= 1;
        return (faul) faukVar.build();
    }

    private static float c(int i) {
        return i / 255.0f;
    }

    private static int d(float f) {
        if (f <= 1.0f) {
            f *= 255.0f;
        }
        int i = (int) f;
        if (i < 0) {
            return 0;
        }
        return i > 255 ? PrivateKeyType.INVALID : i;
    }
}
