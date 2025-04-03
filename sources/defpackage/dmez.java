package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dmez extends ffhv implements ffjm {
    int a;
    final /* synthetic */ dji b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dmez(dji djiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = djiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dmez) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object d;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            dji djiVar = this.b;
            int b = djiVar.b();
            this.a = 1;
            d = djiVar.d(b, new dac(0.0f, (Object) null, 7), this);
            if (d == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dmez(this.b, ffguVar);
    }
}
