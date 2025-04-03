package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fxc extends ffkk implements ffji {
    final /* synthetic */ float a;
    final /* synthetic */ idh b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fxc(float f, idh idhVar) {
        super(1);
        this.a = f;
        this.b = idhVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        idd iddVar = (idd) obj;
        iddVar.a(this.a);
        iddVar.A(this.b);
        iddVar.r(true);
        return ffcu.a;
    }
}
