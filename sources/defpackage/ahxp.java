package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahxp extends ffhv implements ffjo {
    /* synthetic */ int a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    final /* synthetic */ ahxq d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahxp(ahxq ahxqVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = ahxqVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        int intValue = ((Number) obj).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        ahxp ahxpVar = new ahxp(this.d, (ffgu) obj4);
        ahxpVar.a = intValue;
        ahxpVar.b = (xhu) obj2;
        ahxpVar.c = booleanValue;
        return ahxpVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        int i = this.a;
        Object obj2 = this.b;
        boolean z = this.c;
        if (((auhm) this.d.a.b()).a() && z) {
            return new ahxl(this.d.d);
        }
        xhu xhuVar = (xhu) obj2;
        String str = xhuVar.a;
        return ((str == null || str.length() == 0) && xhuVar.b.isEmpty()) ? new ahxl(this.d.b) : (str == null || str.length() == 0 || str.length() <= i) ? new ahxm(xhuVar) : new ahxl(this.d.c);
    }
}
