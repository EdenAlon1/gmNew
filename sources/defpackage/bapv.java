package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bapv extends ffhv implements ffjm {
    int a;
    final /* synthetic */ bara b;
    final /* synthetic */ bbcg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bapv(bara baraVar, bbcg bbcgVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = baraVar;
        this.c = bbcgVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bapv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        bara baraVar = this.b;
        bbcg bbcgVar = this.c;
        this.a = 1;
        Object a = ffra.a(ekxi.a(baraVar.I), new bapt(null, bbcgVar, baraVar), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bapv(this.b, this.c, ffguVar);
    }
}
