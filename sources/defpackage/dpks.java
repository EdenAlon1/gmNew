package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpks extends ffhv implements ffjm {
    final /* synthetic */ cxj a;
    final /* synthetic */ Duration b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpks(cxj cxjVar, Duration duration, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cxjVar;
        this.b = duration;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpks) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        return ffqy.d((ffsk) this.c, null, null, new dpkr(this.a, this.b, null), 3);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dpks dpksVar = new dpks(this.a, this.b, ffguVar);
        dpksVar.c = obj;
        return dpksVar;
    }
}
