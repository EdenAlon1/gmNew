package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eams extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eanc b;
    final /* synthetic */ exyd c;
    final /* synthetic */ eagp d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eams(eanc eancVar, exyd exydVar, eagp eagpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eancVar;
        this.c = exydVar;
        this.d = eagpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eams) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ffsk ffskVar = (ffsk) this.e;
        eanc eancVar = this.b;
        exyd exydVar = this.c;
        eagp eagpVar = this.d;
        this.a = 1;
        Object g = eanc.g(eancVar, ffskVar, exydVar, false, eagpVar, this);
        return g == ffhhVar ? ffhhVar : g;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        eams eamsVar = new eams(this.b, this.c, this.d, ffguVar);
        eamsVar.e = obj;
        return eamsVar;
    }
}
