package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class fexg extends fexj {
    final /* synthetic */ fexk a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fexg(fexk fexkVar) {
        super(fexkVar);
        this.a = fexkVar;
        int i = ffbo.a;
    }

    @Override // defpackage.fexj
    public final void a() {
        fhmt fhmtVar = new fhmt();
        int i = ffbo.a;
        synchronized (this.a.a) {
            fhmt fhmtVar2 = this.a.b;
            fhmtVar.id(fhmtVar2, fhmtVar2.b);
            this.a.e = false;
        }
        this.a.f.id(fhmtVar, fhmtVar.b);
        this.a.f.flush();
    }
}
