package defpackage;

import j$.time.Duration;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spt extends ffhv implements ffjm {
    int a;
    final /* synthetic */ spw b;
    final /* synthetic */ dfjo c;
    final /* synthetic */ UUID d;
    final /* synthetic */ ffbc e;
    final /* synthetic */ Duration f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spt(spw spwVar, dfjo dfjoVar, UUID uuid, ffbc ffbcVar, Duration duration, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = spwVar;
        this.c = dfjoVar;
        this.d = uuid;
        this.e = ffbcVar;
        this.f = duration;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spt) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            spw spwVar = this.b;
            dfjo dfjoVar = this.c;
            UUID uuid = this.d;
            ffbc ffbcVar = this.e;
            Duration duration = this.f;
            bbhj bbhjVar = bbhj.a;
            sps spsVar = new sps(spwVar, dfjoVar, uuid, ffbcVar, duration, null);
            this.a = 1;
            obj = bbhjVar.a("CustomD2DSourceServiceImpl#handshake", spsVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ((ensz) this.b.k.h()).s("CustomD2DSourceServiceImpl#handshake time: [%s]ms", ffpw.g(((ffpw) obj).c));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new spt(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
