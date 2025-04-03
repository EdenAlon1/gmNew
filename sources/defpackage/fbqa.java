package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbqa extends ffai {
    public fbqa(fdxk fdxkVar, fdxj fdxjVar) {
        super(fdxkVar, fdxjVar);
    }

    @Override // defpackage.ffak
    protected final /* synthetic */ ffak a(fdxk fdxkVar, fdxj fdxjVar) {
        return new fbqa(fdxkVar, fdxjVar);
    }

    public final ListenableFuture b(fcbx fcbxVar) {
        febs febsVar = fbqb.a;
        if (febsVar == null) {
            synchronized (fbqb.class) {
                febsVar = fbqb.a;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.Registration", "Register");
                    a.b();
                    fcbx fcbxVar2 = fcbx.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fcbxVar2);
                    a.b = new ffae(fcbz.a);
                    febsVar = a.a();
                    fbqb.a = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), fcbxVar);
    }

    public final ListenableFuture c(fcbt fcbtVar) {
        febs febsVar = fbqb.c;
        if (febsVar == null) {
            synchronized (fbqb.class) {
                febsVar = fbqb.c;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.Registration", "RegisterRefresh");
                    a.b();
                    fcbt fcbtVar2 = fcbt.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fcbtVar2);
                    a.b = new ffae(fcbv.a);
                    febsVar = a.a();
                    fbqb.c = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), fcbtVar);
    }

    public final ListenableFuture d(fccv fccvVar) {
        febs febsVar = fbqb.h;
        if (febsVar == null) {
            synchronized (fbqb.class) {
                febsVar = fbqb.h;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.Registration", "SignInGaia");
                    a.b();
                    fccv fccvVar2 = fccv.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fccvVar2);
                    a.b = new ffae(fccx.a);
                    febsVar = a.a();
                    fbqb.h = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), fccvVar);
    }

    public final ListenableFuture e(fcdk fcdkVar) {
        febs febsVar = fbqb.e;
        if (febsVar == null) {
            synchronized (fbqb.class) {
                febsVar = fbqb.e;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.Registration", "Unregister");
                    a.b();
                    fcdk fcdkVar2 = fcdk.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fcdkVar2);
                    a.b = new ffae(fcdm.a);
                    febsVar = a.a();
                    fbqb.e = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), fcdkVar);
    }
}
