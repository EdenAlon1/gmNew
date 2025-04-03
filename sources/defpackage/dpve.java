package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpve extends ffhv implements ffjm {
    final /* synthetic */ cxj a;
    final /* synthetic */ Duration b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpve(cxj cxjVar, Duration duration, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = cxjVar;
        this.b = duration;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dpve) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ffqy.d((ffsk) this.c, null, null, new dpvd(this.a, this.b, null), 3);
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        dpve dpveVar = new dpve(this.a, this.b, ffguVar);
        dpveVar.c = obj;
        return dpveVar;
    }
}
