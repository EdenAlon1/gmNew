package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dega extends ffhv implements ffjm {
    int a;
    final /* synthetic */ degd b;
    final /* synthetic */ cvia c;
    final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dega(degd degdVar, cvia cviaVar, String str, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = degdVar;
        this.c = cviaVar;
        this.d = str;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dega) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        degd degdVar = this.b;
        cvia cviaVar = this.c;
        String str = this.d;
        this.a = 1;
        Object a = ffra.a(ekxi.a(degdVar.d), new defu(null, degdVar, cviaVar, str), this);
        return a == ffhhVar ? ffhhVar : a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dega(this.b, this.c, this.d, ffguVar);
    }
}
