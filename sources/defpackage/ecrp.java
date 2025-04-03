package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecrp extends ecrj implements ecje, ecre {
    private static final Callable a = new Callable() { // from class: ecro
        @Override // java.util.concurrent.Callable
        public final Object call() {
            return null;
        }
    };
    private final ecrn b;
    private final ecsa c;

    /* JADX WARN: Type inference failed for: r1v1, types: [ffbr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [ecsa, java.lang.Object] */
    public ecrp(ecrn ecrnVar, emxc emxcVar) {
        this.b = ecrnVar;
        this.c = ((emxn) emxcVar).a.b();
    }

    private static ListenableFuture h(ListenableFuture... listenableFutureArr) {
        return erqt.d(listenableFutureArr).a(a, erpp.a);
    }

    private final ListenableFuture i(ecri ecriVar, String str, String str2) {
        if (ecriVar == null || ecri.e(ecriVar)) {
            return erre.a;
        }
        if (ecriVar.d) {
            return this.c.a(str, str2);
        }
        ecsa ecsaVar = this.c;
        ecjk ecjkVar = ecriVar.b;
        ecsaVar.c(str, ((ecio) ecjkVar.a).a, ecriVar.a());
        return erre.a;
    }

    private final void j(ecri ecriVar, String str) {
        if (!ecri.e(ecriVar) && this.c.d(str)) {
            ecriVar.d = true;
        }
    }

    @Override // defpackage.ecre
    public final ListenableFuture a(ecda ecdaVar, long j, long j2, fgmh fgmhVar) {
        return this.b.a(ecdaVar, j, j2, fgmhVar);
    }

    @Override // defpackage.ecre
    public final ListenableFuture b(ecda ecdaVar, long j, long j2, ecrh ecrhVar) {
        return this.b.b(ecdaVar, j, j2, ecrhVar);
    }

    @Override // defpackage.ecrj
    public final synchronized ecri c(ecda ecdaVar) {
        ecri c;
        c = this.b.c(ecdaVar);
        if (!ecri.e(c) && c.d) {
            this.c.b();
        }
        return c;
    }

    @Override // defpackage.ecrj
    public final synchronized ecri d() {
        ecri d;
        d = this.b.d();
        j(d, "");
        return d;
    }

    @Override // defpackage.ecrj
    public final ecri e(ecda ecdaVar) {
        ecri e = this.b.e(ecdaVar);
        j(e, ecdaVar.a);
        return e;
    }

    @Override // defpackage.ecrj
    public final ListenableFuture f(ecri ecriVar, ecda ecdaVar, fgmh fgmhVar, ecrh ecrhVar) {
        return h(this.b.f(ecriVar, ecdaVar, fgmhVar, ecrhVar), i(ecriVar, ecdaVar.a, null));
    }

    @Override // defpackage.ecrj
    public final ListenableFuture g(ecda ecdaVar, ecda ecdaVar2, fgmh fgmhVar, ecrh ecrhVar) {
        return h(this.b.g(ecdaVar, ecdaVar2, fgmhVar, ecrhVar), i((ecri) this.b.c.get(ecdaVar.a), ecdaVar.a, ecda.d(ecdaVar2)));
    }

    @Override // defpackage.ecje
    public final /* synthetic */ void n() {
    }
}
