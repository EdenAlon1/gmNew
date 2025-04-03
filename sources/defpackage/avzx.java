package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class avzx extends ffhv implements ffjm {
    int a;
    final /* synthetic */ awaa b;
    final /* synthetic */ String c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avzx(ffgu ffguVar, awaa awaaVar, String str) {
        super(2, ffguVar);
        this.b = awaaVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avzx) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        awaa awaaVar = this.b;
        avzp avzpVar = (avzp) avzq.a.createBuilder();
        avzpVar.getClass();
        String str = this.c;
        str.getClass();
        avzpVar.copyOnWrite();
        avzq avzqVar = (avzq) avzpVar.instance;
        avzqVar.b |= 1;
        avzqVar.c = str;
        eyfy build = avzpVar.build();
        build.getClass();
        cetp cetpVar = new cetp();
        String str2 = this.c;
        cetpVar.d = str2;
        cetpVar.b = str2;
        elfl b = ((cevh) awaaVar.b.a.b()).a(ceyr.h("file_transfer_processor", (avzq) build, cetpVar.a())).b();
        b.getClass();
        this.a = 1;
        Object c = fgfz.c(b, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        avzx avzxVar = new avzx(ffguVar, this.b, this.c);
        avzxVar.d = obj;
        return avzxVar;
    }
}
