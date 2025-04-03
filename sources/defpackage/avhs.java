package defpackage;

import j$.util.concurrent.ConcurrentMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class avhs extends ffhv implements ffjm {
    final /* synthetic */ avhw a;
    final /* synthetic */ avht b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public avhs(avhw avhwVar, avht avhtVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = avhwVar;
        this.b = avhtVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((avhs) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ConcurrentMap.EL.getOrDefault(this.a.m, this.b.a, ejug.a);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new avhs(this.a, this.b, ffguVar);
    }
}
