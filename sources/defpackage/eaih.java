package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaih extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eaii b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaih(eaii eaiiVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eaiiVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eaih) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                eaii.a.o().q("Syncing registration statuses due to Timezone change.");
                eafe eafeVar = this.b.b;
                exyd exydVar = exyd.TIMEZONE_CHANGED;
                this.a = 1;
                if (eafeVar.a(exydVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        } catch (Exception e) {
            ((ensz) ((ensz) eaii.a.i()).g(e)).q("Failed scheduling registration");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eaih(this.b, ffguVar);
    }
}
