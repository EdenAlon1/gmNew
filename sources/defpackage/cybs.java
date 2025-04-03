package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cybs extends ffhv implements ffjm {
    final /* synthetic */ cybu a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cybs(cybu cybuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cybuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cybs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ekzz f = eleg.f("AddContactBanner2DataServiceImpl#setAddContactBannerDismissed");
        cyco cycoVar = this.a.d;
        try {
            ((cycv) ((cycu) cycoVar).e.b()).b(((cycu) cycoVar).b);
            ffig.a(f, null);
            return ffcu.a;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cybs(this.a, ffguVar);
    }
}
