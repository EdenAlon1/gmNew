package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axwe extends ffhv implements ffjm {
    private /* synthetic */ Object a;

    public axwe(ffgu ffguVar) {
        super(2, ffguVar);
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((axwe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ekzz f = eleg.f("ContactsSyncDataService#deleteAllContacts");
        try {
            String[] strArr = bqzv.a;
            bqzl bqzlVar = new bqzl();
            bqzlVar.e();
            bqzlVar.f("deleteAllContacts");
            Integer num = new Integer(bqzlVar.d());
            ffig.a(f, null);
            return num;
        } finally {
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        axwe axweVar = new axwe(ffguVar);
        axweVar.a = obj;
        return axweVar;
    }
}
