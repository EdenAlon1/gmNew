package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adkd extends ffhv implements ffjm {
    int a;
    final /* synthetic */ adke b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adkd(adke adkeVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = adkeVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((adkd) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        adke adkeVar = this.b;
        this.a = 1;
        Object b = ctzl.b(adkeVar.d, new ffji() { // from class: adjy
            @Override // defpackage.ffji
            public final Object invoke(Object obj2) {
                adjs adjsVar = (adjs) obj2;
                enru enruVar = adke.a;
                adjsVar.copyOnWrite();
                adjt adjtVar = (adjt) adjsVar.instance;
                adjt adjtVar2 = adjt.a;
                adjtVar.b |= 1;
                adjtVar.c = true;
                return ffcu.a;
            }
        }, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new adkd(this.b, ffguVar);
    }
}
