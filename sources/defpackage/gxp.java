package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gxp extends ffkk implements ffji {
    final /* synthetic */ gxe a;
    final /* synthetic */ float b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gxp(gxe gxeVar, float f) {
        super(1);
        this.a = gxeVar;
        this.b = f;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        gxi gxiVar = (gxi) obj;
        gxe gxeVar = this.a;
        int a = gxeVar.a();
        for (int i = 0; i < a; i++) {
            float f = this.b;
            gxd gxdVar = gxeVar.get(i);
            gxiVar.b(gxdVar.a - Math.abs(f), gxdVar.e);
        }
        return ffcu.a;
    }
}
