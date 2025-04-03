package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffsl {
    public static final Object a(ffjm ffjmVar, ffgu ffguVar) {
        fghk fghkVar = new fghk(ffguVar.u(), ffguVar);
        Object a = fgib.a(fghkVar, fghkVar, ffjmVar);
        if (a == ffhh.a) {
            ffguVar.getClass();
        }
        return a;
    }

    public static final ffsk b(ffhd ffhdVar) {
        if (ffhdVar.get(ffud.c) == null) {
            ffhdVar = ffhdVar.plus(new ffuf(null));
        }
        return new fggf(ffhdVar);
    }

    public static final ffsk c() {
        ffvf ffvfVar = new ffvf(null);
        ffsd ffsdVar = fftc.a;
        return new fggf(ffgz.d(ffvfVar, fghh.a));
    }

    public static final ffsk d(ffsk ffskVar, ffhd ffhdVar) {
        return new fggf(ffskVar.hT().plus(ffhdVar));
    }

    public static final void e(ffsk ffskVar, CancellationException cancellationException) {
        ffud ffudVar = (ffud) ffskVar.hT().get(ffud.c);
        if (ffudVar != null) {
            ffudVar.t(cancellationException);
        } else {
            Objects.toString(ffskVar);
            throw new IllegalStateException("Scope cannot be cancelled because it does not have a job: ".concat(String.valueOf(ffskVar)));
        }
    }

    public static final void f(ffsk ffskVar) {
        ffui.f(ffskVar.hT());
    }

    public static final boolean g(ffsk ffskVar) {
        ffud ffudVar = (ffud) ffskVar.hT().get(ffud.c);
        if (ffudVar != null) {
            return ffudVar.v();
        }
        return true;
    }
}
