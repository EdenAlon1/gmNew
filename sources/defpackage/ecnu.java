package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ecnu implements ecgn {
    final /* synthetic */ errm a;
    final /* synthetic */ ecnw b;

    public ecnu(ecnw ecnwVar, errm errmVar) {
        this.a = errmVar;
        this.b = ecnwVar;
    }

    @Override // defpackage.ecgn
    public final void i(final ecda ecdaVar) {
        this.b.d.a(3, ecdaVar.a);
        this.b.a();
        this.b.f = this.a.schedule(new Runnable() { // from class: ecns
            @Override // java.lang.Runnable
            public final void run() {
                ecnu.this.b.d.a(5, ecdaVar.a);
            }
        }, 10L, TimeUnit.SECONDS);
    }

    @Override // defpackage.ecgn
    public final void j(final ecda ecdaVar) {
        this.b.d.a(4, ecdaVar.a);
        this.b.a();
        this.b.e = this.a.schedule(new Runnable() { // from class: ecnt
            @Override // java.lang.Runnable
            public final void run() {
                ecnu.this.b.d.a(6, ecdaVar.a);
            }
        }, 10L, TimeUnit.SECONDS);
    }
}
