package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eahk extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eahl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eahk(eahl eahlVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eahlVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eahk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                eahl.a.o().q("Syncing registration statuses due to Locale change.");
                eafe eafeVar = this.b.b;
                exyd exydVar = exyd.LOCALE_CHANGED;
                this.a = 1;
                if (eafeVar.a(exydVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        } catch (Exception e) {
            ((ensz) ((ensz) eahl.a.i()).g(e)).q("Failed scheduling registration");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eahk(this.b, ffguVar);
    }
}
