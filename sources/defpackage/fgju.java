package defpackage;

import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fgju {
    public static final Object a(dhre dhreVar, ffgu ffguVar) {
        return b(dhreVar, null, ffguVar);
    }

    public static final Object b(dhre dhreVar, dhqg dhqgVar, ffgu ffguVar) {
        if (dhreVar.l()) {
            Exception h = dhreVar.h();
            if (h != null) {
                throw h;
            }
            if (((dhrm) dhreVar).d) {
                throw new CancellationException(a.i(dhreVar, "Task ", " was cancelled normally."));
            }
            return dhreVar.i();
        }
        ffrh ffrhVar = new ffrh(ffhi.c(ffguVar), 1);
        ffrhVar.B();
        dhreVar.o(fgjp.a, new fgjs(ffrhVar));
        if (dhqgVar != null) {
            ffrhVar.d(new fgjt(dhqgVar));
        }
        Object m = ffrhVar.m();
        if (m == ffhh.a) {
            ffguVar.getClass();
        }
        return m;
    }
}
