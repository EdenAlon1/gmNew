package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chjc implements chkj {
    private final ffbr a;
    private final String b;

    public chjc(ffbr ffbrVar, String str) {
        this.a = ffbrVar;
        this.b = str;
        emxf.b(!str.isEmpty(), "Tachyon host cannot be empty");
        emxf.b(true, "Tachyon port must be greater than 0");
        emxf.b(true, "Tachyon port must be less than 65536");
    }

    @Override // defpackage.chkj
    public final elfl a(fbze fbzeVar) {
        fbqa e = e();
        fdxk fdxkVar = e.a;
        febs febsVar = fbqb.k;
        if (febsVar == null) {
            synchronized (fbqb.class) {
                febsVar = fbqb.k;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.Registration", "GetGaiaDeviceInfo");
                    a.b();
                    fbze fbzeVar2 = fbze.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fbzeVar2);
                    a.b = new ffae(fbzg.a);
                    febsVar = a.a();
                    fbqb.k = febsVar;
                }
            }
        }
        return elfl.g(ffat.a(fdxkVar.a(febsVar, e.b), fbzeVar));
    }

    @Override // defpackage.chkj
    public final elfl b(fcbt fcbtVar) {
        return elfl.g(e().c(fcbtVar));
    }

    @Override // defpackage.chkj
    public final elfl c(fccv fccvVar) {
        return elfl.g(e().d(fccvVar));
    }

    @Override // defpackage.chkj
    public final elfl d(fcdk fcdkVar) {
        return elfl.g(e().e(fcdkVar));
    }

    final fbqa e() {
        fbqa fbqaVar = (fbqa) ((fbqa) chiu.b((fbqa) this.a.b(), false)).m(evbm.a, this.b + ":443");
        fdxi fdxiVar = evcy.a;
        evby evbyVar = new evby();
        evbyVar.b(enip.r("https://www.googleapis.com/auth/carrier-message-store", "https://www.googleapis.com/auth/android-messages"));
        return (fbqa) fbqaVar.m(fdxiVar, new evce(evbyVar.c()));
    }
}
