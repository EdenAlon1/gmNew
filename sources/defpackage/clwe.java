package defpackage;

import j$.util.Optional;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clwe implements cfvv {
    public static final /* synthetic */ int b = 0;
    private final akzt d;
    private final Optional e;
    private final cfyo f;
    private final cfxl g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private static final enru c = enru.c("com/google/android/apps/messaging/shared/rcs/performance/PrewarmTickleHandler");
    static final cfva a = cfvl.i(cfvl.b, "open_bind_after_prewarm", true);

    public clwe(akzt akztVar, Optional optional, cfyo cfyoVar, cfxl cfxlVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.d = akztVar;
        this.e = optional;
        this.f = cfyoVar;
        this.g = cfxlVar;
        this.h = ffbrVar;
        this.i = ffbrVar2;
        this.j = ffbrVar3;
    }

    @Override // defpackage.cfvv
    public final int a(euxg euxgVar) {
        return 0;
    }

    @Override // defpackage.cfvv
    public final void b(euxg euxgVar) {
        if (!((Boolean) a.e()).booleanValue()) {
            return;
        }
        enru enruVar = c;
        ((enrr) ((enrr) enruVar.h()).h("com/google/android/apps/messaging/shared/rcs/performance/PrewarmTickleHandler", "onMessageReceived", 103, "PrewarmTickleHandler.java")).q("Received prewarm tickle");
        ekzz f = eleg.f("PrewarmTickleHandler::onTickleReceived");
        try {
            String str = (String) euxgVar.c().get("receiverId");
            String str2 = null;
            fcek a2 = str != null ? cfye.a(str) : null;
            if (a2 == null) {
                ((enrr) ((enrr) enruVar.h()).h("com/google/android/apps/messaging/shared/rcs/performance/PrewarmTickleHandler", "onMessageReceived", 111, "PrewarmTickleHandler.java")).q("Received null receiver id in prewarm tickle.");
                String str3 = (String) euxgVar.c().get("id_hash");
                if (str3 == null) {
                    ((enrr) ((enrr) enruVar.j()).h("com/google/android/apps/messaging/shared/rcs/performance/PrewarmTickleHandler", "onMessageReceived", 116, "PrewarmTickleHandler.java")).q("Tickle was missing id_hash");
                } else {
                    caga cagaVar = (caga) this.h.b();
                    int i = eodh.a;
                    eodc eodcVar = eode.a;
                    eoeg eoegVar = eoeg.h;
                    comy comyVar = (comy) cagaVar.a.b();
                    comu c2 = comv.c();
                    c2.d(comb.TACHYON_PHONE);
                    c2.f(chod.a);
                    c2.c(new Supplier() { // from class: cafz
                        @Override // java.util.function.Supplier
                        public final Object get() {
                            return new choe();
                        }
                    });
                    c2.b(true);
                    enqu listIterator = comyVar.a(c2.a()).k().keySet().listIterator();
                    while (true) {
                        if (!listIterator.hasNext()) {
                            break;
                        }
                        String str4 = (String) listIterator.next();
                        if (eoegVar.f().j(eodcVar.c(str4, StandardCharsets.US_ASCII).e()).equals(str3)) {
                            str2 = str4;
                            break;
                        }
                    }
                    if (str2 == null) {
                        ((enrr) ((enrr) c.j()).h("com/google/android/apps/messaging/shared/rcs/performance/PrewarmTickleHandler", "onMessageReceived", 122, "PrewarmTickleHandler.java")).q("Unable to find PN for id_hash.");
                    } else {
                        fcej fcejVar = (fcej) fcek.a.createBuilder();
                        fcejVar.copyOnWrite();
                        ((fcek) fcejVar.instance).d = "RCS";
                        fcejVar.copyOnWrite();
                        ((fcek) fcejVar.instance).c = str2;
                        fgtg fgtgVar = fgtg.PHONE_NUMBER;
                        fcejVar.copyOnWrite();
                        ((fcek) fcejVar.instance).b = fgtgVar.a();
                        a2 = (fcek) fcejVar.build();
                    }
                }
                f.close();
            }
            String str5 = (String) euxgVar.c().get("tickle");
            if (str5 == null) {
                ((enrr) ((enrr) c.j()).h("com/google/android/apps/messaging/shared/rcs/performance/PrewarmTickleHandler", "onMessageReceived", 135, "PrewarmTickleHandler.java")).q("Received null tickle id in prewarm tickle.");
            } else {
                int b2 = euxgVar.b();
                int a3 = euxgVar.a();
                if (this.e.isEmpty()) {
                    ((enrr) ((enrr) c.h()).h("com/google/android/apps/messaging/shared/rcs/performance/PrewarmTickleHandler", "onTickleReceivedInSpan", 73, "PrewarmTickleHandler.java")).q("Ignore received Firebase message because TachyonReceiverManager is not present.");
                } else {
                    if (chru.a()) {
                        cimr cimrVar = (cimr) this.i.b();
                        fjay a4 = cslr.a();
                        fgkd fgkdVar = (fgkd) fgki.a.createBuilder();
                        fgkdVar.copyOnWrite();
                        fgki fgkiVar = (fgki) fgkdVar.instance;
                        a4.getClass();
                        fgkiVar.c = a4;
                        fgkiVar.b = 1 | fgkiVar.b;
                        fgkdVar.copyOnWrite();
                        ((fgki) fgkdVar.instance).e = fgkh.a(5);
                        fgkdVar.copyOnWrite();
                        ((fgki) fgkdVar.instance).g = fgkg.a(48);
                        fgkb fgkbVar = (fgkb) fgkc.a.createBuilder();
                        fgkbVar.copyOnWrite();
                        fgkc fgkcVar = (fgkc) fgkbVar.instance;
                        eygr eygrVar = fgkcVar.b;
                        if (!eygrVar.c()) {
                            fgkcVar.b = eyfy.mutableCopy(eygrVar);
                        }
                        fgkcVar.b.add(str5);
                        fgkc fgkcVar2 = (fgkc) fgkbVar.build();
                        fgkdVar.copyOnWrite();
                        fgki fgkiVar2 = (fgki) fgkdVar.instance;
                        fgkcVar2.getClass();
                        fgkiVar2.d = fgkcVar2;
                        fgkiVar2.b |= 2;
                        if (cslz.a(a4)) {
                            cimrVar.a(fgkdVar);
                        }
                        this.d.c("Bugle.PhoneIdentity.Prewarm.FcmPush");
                        fcek fcekVar = a2;
                        cfyo cfyoVar = this.f;
                        final cfxl cfxlVar = this.g;
                        cfyoVar.b(str5, fcekVar, new emwl() { // from class: clwc
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                return cfxl.this.c((fcek) obj);
                            }
                        }, new emwl() { // from class: clwd
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                int i2 = clwe.b;
                                return elfo.e(null);
                            }
                        }, "Prewarm", cfyo.c(b2, a3), true, ((Boolean) cpex.a.e()).booleanValue(), ((Boolean) cpex.b.e()).booleanValue(), ((Boolean) cpex.c.e()).booleanValue());
                    } else {
                        ((enrr) ((enrr) c.h()).h("com/google/android/apps/messaging/shared/rcs/performance/PrewarmTickleHandler", "onTickleReceivedInSpan", 79, "PrewarmTickleHandler.java")).q("Ignore phone tickle when phone registration is not enabled.");
                    }
                }
            }
            f.close();
        } finally {
        }
    }

    @Override // defpackage.cfvv
    public final void c() {
    }
}
