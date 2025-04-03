package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hxf extends ffkk implements ffji {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ int c;
    final /* synthetic */ idh d;
    final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hxf(float f, float f2, int i, idh idhVar, boolean z) {
        super(1);
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = idhVar;
        this.e = z;
    }

    @Override // defpackage.ffji
    public final /* synthetic */ Object invoke(Object obj) {
        idd iddVar = (idd) obj;
        float d = jzm.d(iddVar, this.a);
        float d2 = jzm.d(iddVar, this.b);
        ibo iboVar = null;
        if (d > 0.0f && d2 > 0.0f) {
            iboVar = new ibo(d, d2, this.c);
        }
        iddVar.t(iboVar);
        idh idhVar = this.d;
        if (idhVar == null) {
            idhVar = idb.a;
        }
        iddVar.A(idhVar);
        iddVar.r(this.e);
        return ffcu.a;
    }
}
