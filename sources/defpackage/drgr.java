package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class drgr extends ffhv implements ffjm {
    int a;
    final /* synthetic */ drgw b;
    final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drgr(drgw drgwVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = drgwVar;
        this.c = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((drgr) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        drgw drgwVar = this.b;
        String str = this.c;
        this.a = 1;
        Object g = drgwVar.g(str, this);
        return g == ffhhVar ? ffhhVar : g;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new drgr(this.b, this.c, ffguVar);
    }
}
