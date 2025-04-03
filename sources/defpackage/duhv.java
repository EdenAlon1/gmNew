package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duhv implements qud, quc {
    public final int a;
    public final int b;
    public final qtu c;
    public final duhq d;
    public volatile qqe e;
    public volatile boolean f;
    public volatile qud g;
    final /* synthetic */ duhy h;
    private volatile quc i;
    private volatile boolean j;
    private volatile ListenableFuture k;

    public duhv(duhy duhyVar, duhq duhqVar, int i, int i2, qtu qtuVar) {
        this.h = duhyVar;
        this.a = i;
        this.b = i2;
        this.c = qtuVar;
        this.d = duhqVar;
    }

    @Override // defpackage.qud
    public final Class a() {
        return this.h.e;
    }

    @Override // defpackage.quc
    public final void c(Object obj) {
        if (this.f) {
            return;
        }
        this.i.c(obj);
    }

    @Override // defpackage.qud
    public final void d() {
        this.f = true;
        qud qudVar = this.g;
        if (qudVar != null) {
            qudVar.d();
        }
    }

    @Override // defpackage.qud
    public final void e() {
        qud qudVar = this.g;
        if (qudVar != null) {
            qudVar.e();
        }
    }

    @Override // defpackage.qud
    public final qsy eV() {
        return qsy.REMOTE;
    }

    @Override // defpackage.quc
    public final void f(Exception exc) {
        if (!this.f && !this.j) {
            qtt qttVar = duhy.a;
            if ((exc instanceof qtb) && ((qtb) exc).a == 403) {
                this.j = true;
                rkf.f(this.h.d);
                duhy duhyVar = this.h;
                duhyVar.d.b(this.d);
                g(this.e, this.i);
                return;
            }
        }
        this.i.f(exc);
    }

    @Override // defpackage.qud
    public final void g(qqe qqeVar, quc qucVar) {
        this.e = qqeVar;
        this.i = qucVar;
        if (this.f) {
            return;
        }
        duig duigVar = this.h.d;
        rkf.f(duigVar);
        ListenableFuture i = erqt.i(duigVar.a(this.d));
        this.k = i;
        erqt.r(i, new duhu(this, qucVar), erpp.a);
        if (this.f) {
            d();
        }
    }
}
