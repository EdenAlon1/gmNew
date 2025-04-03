package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chje {
    private static final entd a = entd.c("BugleMdmCall");
    private static final cfva b = cfvl.r(181707163, "log_mdm_requests");
    private final ffbr c;
    private final ffbr d;
    private final chga e;

    public chje(ffbr ffbrVar, ffbr ffbrVar2, chga chgaVar) {
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = chgaVar;
    }

    public final elfl a() {
        fcfo fcfoVar = (fcfo) this.e.a("CMS").build();
        if (((Boolean) b.e()).booleanValue()) {
            ensz enszVar = (ensz) a.h();
            enszVar.Y(cdii.H, "getFiUserStanding");
            enszVar.Y(cdii.G, fcfoVar.c);
            ((ensz) enszVar.h("com/google/android/apps/messaging/shared/net/common/tachyontiktokgrpc/MessagesMultiDeviceClient", "getFiUserStanding", 77, "MessagesMultiDeviceClient.java")).o();
        }
        fbet fbetVar = (fbet) fbeu.a.createBuilder();
        fbetVar.copyOnWrite();
        fbeu fbeuVar = (fbeu) fbetVar.instance;
        fcfoVar.getClass();
        fbeuVar.c = fcfoVar;
        fbeuVar.b |= 1;
        fbeu fbeuVar2 = (fbeu) fbetVar.build();
        fboq fboqVar = (fboq) chiu.b((fboq) this.d.b(), false);
        fdxi fdxiVar = evcy.a;
        evby evbyVar = new evby();
        evbyVar.b(enip.r("https://www.googleapis.com/auth/carrier-message-store", "https://www.googleapis.com/auth/android-messages"));
        fboq fboqVar2 = (fboq) chiu.a((fboq) fboqVar.m(fdxiVar, new evce(evbyVar.c())), Boolean.TRUE.equals(this.c.b()), 8752);
        fdxk fdxkVar = fboqVar2.a;
        febs febsVar = fbor.a;
        if (febsVar == null) {
            synchronized (fbor.class) {
                febsVar = fbor.a;
                if (febsVar == null) {
                    febp a2 = febs.a();
                    a2.c = febr.UNARY;
                    a2.d = febs.c("google.internal.communications.instantmessaging.v1.MessagesMultiDevice", "GetFiUserStanding");
                    a2.b();
                    fbeu fbeuVar3 = fbeu.a;
                    eyfc eyfcVar = ffag.a;
                    a2.a = new ffae(fbeuVar3);
                    a2.b = new ffae(fbew.a);
                    febsVar = a2.a();
                    fbor.a = febsVar;
                }
            }
        }
        return elfl.g(ffat.a(fdxkVar.a(febsVar, fboqVar2.b), fbeuVar2));
    }
}
