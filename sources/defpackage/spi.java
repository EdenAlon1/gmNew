package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spi extends ffhv implements ffjm {
    int a;
    final /* synthetic */ spw b;
    final /* synthetic */ dfjk c;
    final /* synthetic */ ffbc d;
    final /* synthetic */ Duration e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spi(spw spwVar, dfjk dfjkVar, ffbc ffbcVar, Duration duration, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = spwVar;
        this.c = dfjkVar;
        this.d = ffbcVar;
        this.e = duration;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spi) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            spw spwVar = this.b;
            dfjk dfjkVar = this.c;
            ffbc ffbcVar = this.d;
            Duration duration = this.e;
            bbhj bbhjVar = bbhj.a;
            sph sphVar = new sph(spwVar, dfjkVar, ffbcVar, duration, null);
            this.a = 1;
            obj = bbhjVar.a("CustomD2DSourceServiceImpl#getMetadata", sphVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ((ensz) this.b.k.h()).s("CustomD2DSourceServiceImpl#getMetadata time: [%s]ms", ffpw.g(((ffpw) obj).c));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new spi(this.b, this.c, this.d, this.e, ffguVar);
    }
}
