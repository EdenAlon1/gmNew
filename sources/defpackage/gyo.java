package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gyo extends ffhv implements ffjo {
    int a;
    /* synthetic */ Object b;
    /* synthetic */ Object c;
    final /* synthetic */ gzl d;
    final /* synthetic */ float e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyo(gzl gzlVar, float f, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = gzlVar;
        this.e = f;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        gyo gyoVar = new gyo(this.d, this.e, (ffgu) obj4);
        gyoVar.f = (gzd) obj;
        gyoVar.b = (hbq) obj2;
        gyoVar.c = obj3;
        return gyoVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Object obj2 = this.f;
            float b = ((hbq) this.b).b(this.c);
            if (!Float.isNaN(b)) {
                ffky ffkyVar = new ffky();
                float b2 = Float.isNaN(this.d.b()) ? 0.0f : this.d.b();
                ffkyVar.a = b2;
                float f = this.e;
                cxt cxtVar = (cxt) this.d.a.invoke();
                gyn gynVar = new gyn((gzd) obj2, ffkyVar);
                this.f = null;
                this.b = null;
                this.a = 1;
                if (dap.c(b2, b, f, cxtVar, gynVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        }
        return ffcu.a;
    }
}
