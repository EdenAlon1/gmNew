package defpackage;

import android.util.Size;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aum {
    public static final ben a;
    private static final Size b;
    private static final aua c;
    private static final boy d;

    static {
        Size size = new Size(640, 480);
        b = size;
        aua auaVar = aua.b;
        c = auaVar;
        boy boyVar = new boy(bow.a, new boz(blz.c, 1));
        d = boyVar;
        aul aulVar = new aul();
        aulVar.a.c(bet.J, size);
        aulVar.a.c(bhh.t, 1);
        aulVar.a.c(bet.E, 0);
        aulVar.e(boyVar);
        if (!Objects.equals(aua.b, auaVar)) {
            throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
        }
        aulVar.a.c(beq.o, auaVar);
        a = aulVar.c();
    }
}
