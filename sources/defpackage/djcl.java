package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djcl implements dkkr {
    private final errl a;
    private final djct b;

    public djcl(errl errlVar, djct djctVar) {
        this.a = errlVar;
        this.b = djctVar;
    }

    private final void g(ListenableFuture listenableFuture) {
        erqt.r(listenableFuture, new djcj(), this.a);
    }

    private final void h(dklm dklmVar) {
        djbf djbfVar = new djbf();
        djbfVar.c(dklmVar);
        g(a(djbfVar.a()));
    }

    private final void i(dklp dklpVar) {
        djbf djbfVar = new djbf();
        djbfVar.c(dklpVar);
        g(a(djbfVar.a()));
    }

    public final ListenableFuture a(djeb djebVar) {
        return this.b.a(djebVar);
    }

    @Override // defpackage.dkkr
    public final void b(dkkj dkkjVar) {
        i((dklp) dkkjVar);
    }

    @Override // defpackage.dkkr
    public final void c(dkkj dkkjVar) {
        h((dklm) dkkjVar);
    }

    @Override // defpackage.dkkr
    public final void d(dkkj dkkjVar) {
        h((dklm) dkkjVar);
    }

    @Override // defpackage.dkkr
    public final void e(dkkj dkkjVar) {
        i((dklp) dkkjVar);
    }

    @Override // defpackage.dkkr
    public final void f(dkjt dkjtVar) {
        djbf djbfVar = new djbf();
        djbfVar.b(dkjtVar);
        g(a(djbfVar.a()));
    }
}
