package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfyh {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/fcm/impl/SmsTickleHandler");
    public final cfxl a;
    private final akzt c;
    private final Optional d;
    private final cfyo e;

    public cfyh(akzt akztVar, Optional optional, cfyo cfyoVar, cfxl cfxlVar) {
        akztVar.getClass();
        optional.getClass();
        this.c = akztVar;
        this.d = optional;
        this.e = cfyoVar;
        this.a = cfxlVar;
    }

    public final void a(fcjy fcjyVar) {
        fcjyVar.getClass();
        if (this.d.isEmpty()) {
            ensk j = b.j();
            j.Y(ente.a, "BugleSatellite");
            ((enrr) j.h("com/google/android/apps/messaging/shared/fcm/impl/SmsTickleHandler", "onTickleReceived", 29, "SmsTickleHandler.kt")).q("Ignore received sms tickle because TachyonReceiverManager is not present.");
            return;
        }
        this.c.c("Bugle.PhoneIdentity.FcmPush");
        fcej fcejVar = (fcej) fcek.a.createBuilder();
        fgtg b2 = fgtg.b(fcjyVar.e);
        if (b2 == null) {
            b2 = fgtg.UNRECOGNIZED;
        }
        fcejVar.copyOnWrite();
        ((fcek) fcejVar.instance).b = b2.a();
        String str = fcjyVar.g;
        fcejVar.copyOnWrite();
        fcek fcekVar = (fcek) fcejVar.instance;
        str.getClass();
        fcekVar.d = str;
        String str2 = fcjyVar.f;
        fcejVar.copyOnWrite();
        fcek fcekVar2 = (fcek) fcejVar.instance;
        str2.getClass();
        fcekVar2.c = str2;
        eyfy build = fcejVar.build();
        build.getClass();
        cfyo cfyoVar = this.e;
        fcek fcekVar3 = (fcek) build;
        String str3 = (fcjyVar.b == 7 ? (fcjx) fcjyVar.c : fcjx.a).b;
        emwl emwlVar = new emwl() { // from class: cfyf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return cfyh.this.a.d((fcek) obj);
            }
        };
        emwl emwlVar2 = new emwl() { // from class: cfyg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return cfyh.this.a.d((fcek) obj);
            }
        };
        Object e = cpex.a.e();
        e.getClass();
        boolean booleanValue = ((Boolean) e).booleanValue();
        Object e2 = cpex.b.e();
        e2.getClass();
        boolean booleanValue2 = ((Boolean) e2).booleanValue();
        Object e3 = cpex.c.e();
        e3.getClass();
        cfyoVar.b(str3, fcekVar3, emwlVar, emwlVar2, "Sms", true, false, booleanValue, booleanValue2, ((Boolean) e3).booleanValue());
    }
}
