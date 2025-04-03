package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cupl {
    public final fazb a;
    public final errl b;
    public dkzr c;

    public cupl(fazb fazbVar, errl errlVar) {
        this.a = fazbVar;
        this.b = errlVar;
    }

    public final elfl a(dlfy dlfyVar) {
        ListenableFuture b;
        dkzr dkzrVar = this.c;
        if (dkzrVar == null) {
            return elfo.e(new dlgu("NOT_AVAILABLE", dlfs.e, 4));
        }
        b = fgfz.b(ffsl.b(fftc.b), ffhe.a, ffsm.a, new dkzp(dkzrVar.a, dlfyVar, null));
        return elfl.g(b);
    }

    public final elfl b(dlfy dlfyVar, rum rumVar) {
        ListenableFuture b;
        dkzr dkzrVar = this.c;
        if (dkzrVar == null) {
            return elfo.e(null);
        }
        b = fgfz.b(ffsl.b(fftc.b), ffhe.a, ffsm.a, new dkzq(dkzrVar.a, dlfyVar, rumVar, null));
        return elfl.g(b);
    }
}
