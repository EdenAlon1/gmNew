package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ftk extends ffkk implements ffji {
    final /* synthetic */ hkx a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ftk(hkx hkxVar) {
        super(1);
        this.a = hkxVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ifr ifrVar = (ifr) obj;
        long j = ((ibw) this.a.a()).i;
        if (!ffcp.a(j, ibw.h)) {
            ifrVar.r(j, 0L, (r20 & 4) != 0 ? ifq.c(ifrVar.b(), 0L) : 0L, (r20 & 8) != 0 ? 1.0f : 0.0f, (r20 & 16) != 0 ? ifu.a : null, (r20 & 32) != 0 ? null : null, (r20 & 64) != 0 ? 3 : 0);
        }
        return ffcu.a;
    }
}
