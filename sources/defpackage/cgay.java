package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgay extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cgaz b;
    final /* synthetic */ elfl c;
    final /* synthetic */ ffix d;
    final /* synthetic */ Duration e;
    final /* synthetic */ Throwable f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgay(cgaz cgazVar, elfl elflVar, ffix ffixVar, Duration duration, Throwable th, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cgazVar;
        this.c = elflVar;
        this.d = ffixVar;
        this.e = duration;
        this.f = th;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cgay) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cgaz cgazVar = this.b;
            elfl elflVar = this.c;
            Duration duration = this.e;
            Throwable th = this.f;
            this.a = 1;
            if (cgazVar.a(elflVar, duration, th, this) == ffhhVar) {
                return ffhhVar;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cgay(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
