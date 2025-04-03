package defpackage;

import java.util.Objects;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final /* synthetic */ class ffui {
    public static final Object a(ffud ffudVar, ffgu ffguVar) {
        ffudVar.t(null);
        Object o = ffudVar.o(ffguVar);
        return o == ffhh.a ? o : ffcu.a;
    }

    public static final ffte b(ffud ffudVar, boolean z, ffuj ffujVar) {
        return ffudVar instanceof ffuq ? ((ffuq) ffudVar).K(z, ffujVar) : ffudVar.s(ffujVar.b(), z, new ffuh(ffujVar));
    }

    public static final ffud c(ffhd ffhdVar) {
        ffud ffudVar = (ffud) ffhdVar.get(ffud.c);
        if (ffudVar != null) {
            return ffudVar;
        }
        Objects.toString(ffhdVar);
        throw new IllegalStateException("Current context doesn't contain Job in it: ".concat(String.valueOf(ffhdVar)));
    }

    public static final void d(ffhd ffhdVar, CancellationException cancellationException) {
        ffud ffudVar = (ffud) ffhdVar.get(ffud.c);
        if (ffudVar != null) {
            ffudVar.t(cancellationException);
        }
    }

    public static final void e(ffud ffudVar, String str, Throwable th) {
        ffudVar.t(fftq.a(str, th));
    }

    public static final void f(ffhd ffhdVar) {
        ffud ffudVar = (ffud) ffhdVar.get(ffud.c);
        if (ffudVar != null) {
            g(ffudVar);
        }
    }

    public static final void g(ffud ffudVar) {
        if (!ffudVar.v()) {
            throw ffudVar.p();
        }
    }

    public static final boolean h(ffhd ffhdVar) {
        ffud ffudVar = (ffud) ffhdVar.get(ffud.c);
        if (ffudVar != null) {
            return ffudVar.v();
        }
        return true;
    }
}
