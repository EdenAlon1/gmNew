package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftr extends ffhv implements ffjn {
    int a;
    /* synthetic */ float b;
    final /* synthetic */ gvo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftr(gvo gvoVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = gvoVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        float floatValue = ((Number) obj2).floatValue();
        ftr ftrVar = new ftr(this.c, (ffgu) obj3);
        ftrVar.b = floatValue;
        return ftrVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            float f = this.b;
            gvo gvoVar = this.c;
            gvr b = gvoVar.b();
            cyj d = gvoVar.d();
            cxt a = gvoVar.a();
            this.a = 1;
            if (fub.b(b, f, d, a, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }
}
