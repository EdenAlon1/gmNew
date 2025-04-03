package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cprk extends ffhv implements ffjm {
    final /* synthetic */ cprn a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cprk(cprn cprnVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cprnVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cprk) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return this.a.c();
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cprk(this.a, ffguVar);
    }
}
