package defpackage;

import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class spc extends ffhv implements ffjm {
    int a;
    final /* synthetic */ spw b;
    final /* synthetic */ dfjg c;
    final /* synthetic */ fdyn d;
    final /* synthetic */ ffbc e;
    final /* synthetic */ Duration f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spc(spw spwVar, dfjg dfjgVar, fdyn fdynVar, ffbc ffbcVar, Duration duration, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = spwVar;
        this.c = dfjgVar;
        this.d = fdynVar;
        this.e = ffbcVar;
        this.f = duration;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spc) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            spw spwVar = this.b;
            dfjg dfjgVar = this.c;
            fdyn fdynVar = this.d;
            ffbc ffbcVar = this.e;
            Duration duration = this.f;
            bbhj bbhjVar = bbhj.a;
            spb spbVar = new spb(spwVar, dfjgVar, fdynVar, ffbcVar, duration, null);
            this.a = 1;
            obj = bbhjVar.a("CustomD2DSourceServiceImpl#getCustomD2DItem", spbVar, this);
            if (obj == ffhhVar) {
                return ffhhVar;
            }
        }
        ((ensz) this.b.k.h()).s("CustomD2DSourceServiceImpl#getCustomD2DItem time: [%s]ms", ffpw.g(((ffpw) obj).c));
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new spc(this.b, this.c, this.d, this.e, this.f, ffguVar);
    }
}
