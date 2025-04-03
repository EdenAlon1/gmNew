package defpackage;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajmw implements ajmc {
    public static final enru a = enru.c("com/google/android/apps/messaging/profile/sendingas/SendingAsUiAdapterImpl");
    public final ffsk b;
    public final ffxx c;
    public final ffxx d;
    public final ffxx e;
    public final ffhd f;
    public final cjso g;
    public final crpw h;
    public final cjtu i;
    public final ffbr j;
    public final ffbr k;
    public final ConcurrentHashMap l;
    private final zer m;
    private final fgdj n;
    private final fgdj o;

    public ajmw(ffsk ffskVar, ffxx ffxxVar, ffxx ffxxVar2, ffxx ffxxVar3, ffhd ffhdVar, cjso cjsoVar, zqx zqxVar, crpw crpwVar, cjtu cjtuVar, zer zerVar, ffbr ffbrVar, ffbr ffbrVar2) {
        ffskVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        ffhdVar.getClass();
        zqxVar.getClass();
        cjtuVar.getClass();
        zerVar.getClass();
        ffbrVar2.getClass();
        this.b = ffskVar;
        this.c = ffxxVar;
        this.d = ffxxVar2;
        this.e = ffxxVar3;
        this.f = ffhdVar;
        this.g = cjsoVar;
        this.h = crpwVar;
        this.i = cjtuVar;
        this.m = zerVar;
        this.j = ffbrVar;
        this.k = ffbrVar2;
        this.l = new ConcurrentHashMap();
        fgdj fgdjVar = zerVar.a;
        this.n = fgdjVar;
        ffxx a2 = ffyy.a(new ajmq(fgdjVar));
        ajmr ajmrVar = new ajmr(null, this);
        int i = fgau.a;
        fgen fgenVar = new fgen(ajmrVar, a2);
        int i2 = fgcz.a;
        this.o = fgbn.b(fgenVar, ffskVar, fgcy.a(0L, 3), null);
    }

    @Override // defpackage.ajmc
    public final fgdj a() {
        return this.o;
    }
}
