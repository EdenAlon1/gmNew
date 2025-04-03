package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaif extends ffhv implements ffjm {
    int a;
    final /* synthetic */ eaig b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eaif(eaig eaigVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = eaigVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((eaif) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                eaig.a.o().q("Syncing registration status due to device restart.");
                eafe eafeVar = this.b.b;
                exyd exydVar = exyd.DEVICE_START;
                this.a = 1;
                if (eafeVar.a(exydVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        } catch (Exception e) {
            ((ensz) ((ensz) eaig.a.i()).g(e)).q("Failed scheduling registration");
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new eaif(this.b, ffguVar);
    }
}
