package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qxa implements quc {
    final /* synthetic */ ran a;
    final /* synthetic */ qxb b;

    public qxa(qxb qxbVar, ran ranVar) {
        this.a = ranVar;
        this.b = qxbVar;
    }

    @Override // defpackage.quc
    public final void c(Object obj) {
        if (this.b.e(this.a)) {
            qxb qxbVar = this.b;
            ran ranVar = this.a;
            qvx qvxVar = qxbVar.a.o;
            if (obj != null && qvxVar.c(ranVar.c.eV())) {
                qxbVar.c = obj;
                ((qvq) qxbVar.b).f(2);
            } else {
                qvj qvjVar = qxbVar.b;
                qtp qtpVar = ranVar.a;
                qud qudVar = ranVar.c;
                qvjVar.d(qtpVar, obj, qudVar, qudVar.eV(), qxbVar.d);
            }
        }
    }

    @Override // defpackage.quc
    public final void f(Exception exc) {
        if (this.b.e(this.a)) {
            qxb qxbVar = this.b;
            ran ranVar = this.a;
            qvh qvhVar = qxbVar.d;
            qud qudVar = ranVar.c;
            qxbVar.b.c(qvhVar, exc, qudVar, qudVar.eV());
        }
    }
}
