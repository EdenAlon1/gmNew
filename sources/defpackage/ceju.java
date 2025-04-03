package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ceju extends ffhv implements ffjm {
    final /* synthetic */ cejy a;
    final /* synthetic */ int b;
    final /* synthetic */ csgw c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ceju(ffgu ffguVar, cejy cejyVar, int i, csgw csgwVar) {
        super(2, ffguVar);
        this.a = cejyVar;
        this.b = i;
        this.c = csgwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ceju) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        this.a.a.n(epfx.RESTORE_BACKUP_KEY, this.b, this.c);
        return csgx.RETRY;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ceju cejuVar = new ceju(ffguVar, this.a, this.b, this.c);
        cejuVar.d = obj;
        return cejuVar;
    }
}
