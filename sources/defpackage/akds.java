package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class akds extends ffhv implements ffjm {
    int a;
    final /* synthetic */ akee b;
    final /* synthetic */ ffbc c;
    final /* synthetic */ Duration d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akds(akee akeeVar, ffbc ffbcVar, Duration duration, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = akeeVar;
        this.c = ffbcVar;
        this.d = duration;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akds) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            akee akeeVar = this.b;
            ffbc ffbcVar = this.c;
            Duration duration = this.d;
            bbhj bbhjVar = bbhj.a;
            akdr akdrVar = new akdr(akeeVar, ffbcVar, duration, null);
            this.a = 1;
            obj = bbhjVar.a("CustomD2DTargetServiceImpl#handshake", akdrVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        long j = ((ffpw) obj).c;
        ensk h = akee.a.h();
        h.Y(ente.a, "BugleBackup");
        ((ensz) h).s("CustomD2DTargetServiceImpl#handshake time: [%s]ms", ffpw.g(j));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new akds(this.b, this.c, this.d, ffguVar);
    }
}
