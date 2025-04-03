package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class chgv implements chir {
    private final fdxk a;
    private final febo b;

    public chgv(fdxk fdxkVar, febo feboVar) {
        this.a = fdxkVar;
        this.b = feboVar;
    }

    private final fbqa j() {
        return (fbqa) chiu.c(fbqb.a(this.a), this.b, false);
    }

    private static fbqa k(fdxk fdxkVar, febo feboVar, evbw evbwVar) {
        febj febjVar = chhu.a;
        febo feboVar2 = new febo();
        feboVar2.f(feboVar);
        febf febfVar = febo.c;
        int i = febj.d;
        febe febeVar = new febe("X-Goog-Api-Key", febfVar);
        if (feboVar2.h(febeVar)) {
            feboVar2.m(febeVar, (String) feboVar2.b(febeVar));
        }
        feboVar2.g(chhu.a, "Bearer ".concat(String.valueOf(evbwVar.a)));
        feboVar2.g(chhu.b, Long.toString(evbwVar.b));
        return (fbqa) chiu.c(fbqb.a(fdxkVar), feboVar2, false);
    }

    @Override // defpackage.chir
    public final elfl a(fbza fbzaVar) {
        fbqa j = j();
        fdxk fdxkVar = j.a;
        febs febsVar = fbqb.i;
        if (febsVar == null) {
            synchronized (fbqb.class) {
                febsVar = fbqb.i;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.Registration", "GetAccountInfo");
                    a.b();
                    fbza fbzaVar2 = fbza.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fbzaVar2);
                    a.b = new ffae(fbzc.a);
                    febsVar = a.a();
                    fbqb.i = febsVar;
                }
            }
        }
        return elfl.g(ffat.a(fdxkVar.a(febsVar, j.b), fbzaVar));
    }

    @Override // defpackage.chir
    public final elfl b(fcla fclaVar) {
        fbqa j = j();
        fdxk fdxkVar = j.a;
        febs febsVar = fbqb.f;
        if (febsVar == null) {
            synchronized (fbqb.class) {
                febsVar = fbqb.f;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.Registration", "GetPreKeyBatch");
                    a.b();
                    fcla fclaVar2 = fcla.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fclaVar2);
                    a.b = new ffae(fclg.a);
                    febsVar = a.a();
                    fbqb.f = febsVar;
                }
            }
        }
        return elfl.g(ffat.a(fdxkVar.a(febsVar, j.b), fclaVar));
    }

    @Override // defpackage.chir
    public final elfl c(fbzz fbzzVar, evbw evbwVar) {
        fbqa k = k(this.a, this.b, evbwVar);
        fdxk fdxkVar = k.a;
        febs febsVar = fbqb.l;
        if (febsVar == null) {
            synchronized (fbqb.class) {
                febsVar = fbqb.l;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.Registration", "LinkIdentity");
                    a.b();
                    fbzz fbzzVar2 = fbzz.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fbzzVar2);
                    a.b = new ffae(fcab.a);
                    febsVar = a.a();
                    fbqb.l = febsVar;
                }
            }
        }
        return elfl.g(ffat.a(fdxkVar.a(febsVar, k.b), fbzzVar));
    }

    @Override // defpackage.chir
    public final elfl d(fcad fcadVar) {
        fbqa j = j();
        return elfl.g(ffat.a(j.a.a(fbqb.b(), j.b), fcadVar));
    }

    @Override // defpackage.chir
    public final elfl e(fcbx fcbxVar) {
        return elfl.g(j().b(fcbxVar));
    }

    @Override // defpackage.chir
    public final elfl f(fcbt fcbtVar) {
        return elfl.g(j().c(fcbtVar));
    }

    @Override // defpackage.chir
    public final elfl g(fcmc fcmcVar) {
        fbqa j = j();
        fdxk fdxkVar = j.a;
        febs febsVar = fbqb.g;
        if (febsVar == null) {
            synchronized (fbqb.class) {
                febsVar = fbqb.g;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.Registration", "SetPreKeys");
                    a.b();
                    fcmc fcmcVar2 = fcmc.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fcmcVar2);
                    a.b = new ffae(fcme.a);
                    febsVar = a.a();
                    fbqb.g = febsVar;
                }
            }
        }
        return elfl.g(ffat.a(fdxkVar.a(febsVar, j.b), fcmcVar));
    }

    @Override // defpackage.chir
    public final elfl h(fcdc fcdcVar, evbw evbwVar) {
        fbqa k = k(this.a, this.b, evbwVar);
        fdxk fdxkVar = k.a;
        febs febsVar = fbqb.m;
        if (febsVar == null) {
            synchronized (fbqb.class) {
                febsVar = fbqb.m;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.Registration", "UnlinkIdentity");
                    a.b();
                    fcdc fcdcVar2 = fcdc.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fcdcVar2);
                    a.b = new ffae(fcde.a);
                    febsVar = a.a();
                    fbqb.m = febsVar;
                }
            }
        }
        return elfl.g(ffat.a(fdxkVar.a(febsVar, k.b), fcdcVar));
    }

    @Override // defpackage.chir
    public final elfl i(fcdq fcdqVar) {
        fbqa j = j();
        fdxk fdxkVar = j.a;
        febs febsVar = fbqb.d;
        if (febsVar == null) {
            synchronized (fbqb.class) {
                febsVar = fbqb.d;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.Registration", "Verify");
                    a.b();
                    fcdq fcdqVar2 = fcdq.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fcdqVar2);
                    a.b = new ffae(fcds.a);
                    febsVar = a.a();
                    fbqb.d = febsVar;
                }
            }
        }
        return elfl.g(ffat.a(fdxkVar.a(febsVar, j.b), fcdqVar));
    }
}
