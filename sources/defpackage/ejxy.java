package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejxy implements ejxk {
    private final ejxk a;
    private ejyx b = null;

    public ejxy(ejxk ejxkVar) {
        this.a = ejxkVar;
    }

    @Override // defpackage.ejxk
    public final void a(Throwable th) {
        efbd.c();
        ejyx ejyxVar = this.b;
        ejxg ejxgVar = new ejxg(th);
        this.b = ejxgVar;
        if (ejxgVar.equals(ejyxVar)) {
            return;
        }
        this.a.a(th);
    }

    @Override // defpackage.ejxk
    public final void b(Object obj) {
        efbd.c();
        ejyx ejyxVar = this.b;
        ejxh ejxhVar = new ejxh(obj);
        this.b = ejxhVar;
        if (ejxhVar.equals(ejyxVar)) {
            return;
        }
        this.a.b(obj);
    }
}
