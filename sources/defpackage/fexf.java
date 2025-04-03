package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fexf extends fexj {
    final /* synthetic */ fexk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fexf(fexk fexkVar) {
        super(fexkVar);
        this.a = fexkVar;
        int i = ffbo.a;
    }

    @Override // defpackage.fexj
    public final void a() {
        int i;
        fhmt fhmtVar = new fhmt();
        int i2 = ffbo.a;
        synchronized (this.a.a) {
            fhmt fhmtVar2 = this.a.b;
            fhmtVar.id(fhmtVar2, fhmtVar2.h());
            fexk fexkVar = this.a;
            fexkVar.d = false;
            i = fexkVar.i;
        }
        this.a.f.id(fhmtVar, fhmtVar.b);
        synchronized (this.a.a) {
            this.a.i -= i;
        }
    }
}
