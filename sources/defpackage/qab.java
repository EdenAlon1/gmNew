package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qab implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ qac b;

    public qab(qac qacVar, Object obj) {
        this.b = qacVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.b) {
            Object a = this.b.c.a(this.a);
            qac qacVar = this.b;
            Object obj = qacVar.a;
            if (obj == null && a != null) {
                qacVar.a = a;
                qacVar.d.j(a);
            } else if (obj != null && !obj.equals(a)) {
                qac qacVar2 = this.b;
                qacVar2.a = a;
                qacVar2.d.j(a);
            }
        }
    }
}
