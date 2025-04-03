package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cjkw extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cjkz b;
    final /* synthetic */ String c;
    final /* synthetic */ cjlk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cjkw(cjkz cjkzVar, String str, cjlk cjlkVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cjkzVar;
        this.c = str;
        this.d = cjlkVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cjkw) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        cjkz cjkzVar = this.b;
        cjlk cjlkVar = this.d;
        cjkl cjklVar = (cjkl) cjkm.a.createBuilder();
        cjklVar.getClass();
        String a = cjlkVar.a();
        cjklVar.copyOnWrite();
        ((cjkm) cjklVar.instance).b = a;
        eyfy build = cjklVar.build();
        build.getClass();
        cetp cetpVar = new cetp();
        cetpVar.a = this.c;
        elfl b = ((cevh) cjkzVar.b.a.b()).a(ceyr.h("pipeline_work_handler", (cjkm) build, cetpVar.a())).b();
        b.getClass();
        this.a = 1;
        Object c = fgfz.c(b, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cjkw(this.b, this.c, this.d, ffguVar);
    }
}
