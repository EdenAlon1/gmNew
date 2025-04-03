package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class bckv extends ffhv implements ffjm {
    final /* synthetic */ bckw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bckv(bckw bckwVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = bckwVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bckv) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ((baiv) this.a.b.b()).a().y(301, 0L);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new bckv(this.a, ffguVar);
    }
}
