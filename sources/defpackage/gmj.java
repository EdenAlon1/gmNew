package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gmj extends ffhv implements ffjo {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ gmk d;
    final /* synthetic */ float e;
    final /* synthetic */ cyq f;
    private /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gmj(gmk gmkVar, float f, cyq cyqVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = gmkVar;
        this.e = f;
        this.f = cyqVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        gmj gmjVar = new gmj(this.d, this.e, this.f, (ffgu) obj4);
        gmjVar.g = (gzd) obj;
        gmjVar.b = (hbq) obj2;
        gmjVar.c = (gml) obj3;
        return gmjVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Object obj2 = this.g;
            float b = ((hbq) this.b).b(this.c);
            if (!Float.isNaN(b)) {
                ffky ffkyVar = new ffky();
                float a = Float.isNaN(this.d.a()) ? 0.0f : this.d.a();
                ffkyVar.a = a;
                float f = this.e;
                cyq cyqVar = this.f;
                gmi gmiVar = new gmi((gzd) obj2, ffkyVar);
                this.g = null;
                this.b = null;
                this.a = 1;
                if (dap.c(a, b, f, cyqVar, gmiVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        }
        return ffcu.a;
    }
}
