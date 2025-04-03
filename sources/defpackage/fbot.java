package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fbot extends ffai {
    public fbot(fdxk fdxkVar, fdxj fdxjVar) {
        super(fdxkVar, fdxjVar);
    }

    @Override // defpackage.ffak
    protected final /* synthetic */ ffak a(fdxk fdxkVar, fdxj fdxjVar) {
        return new fbot(fdxkVar, fdxjVar);
    }

    public final ListenableFuture b(fbyg fbygVar) {
        febs febsVar = fbov.c;
        if (febsVar == null) {
            synchronized (fbov.class) {
                febsVar = fbov.c;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.Messaging", "AckMessages");
                    a.b();
                    fbyg fbygVar2 = fbyg.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fbygVar2);
                    a.b = new ffae(fbyi.a);
                    febsVar = a.a();
                    fbov.c = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), fbygVar);
    }

    public final ListenableFuture c(fbyw fbywVar) {
        febs febsVar = fbov.g;
        if (febsVar == null) {
            synchronized (fbov.class) {
                febsVar = fbov.g;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.Messaging", "Echo");
                    a.b();
                    fbyw fbywVar2 = fbyw.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fbywVar2);
                    a.b = new ffae(fbyy.a);
                    febsVar = a.a();
                    fbov.g = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), fbywVar);
    }

    public final ListenableFuture d(fcap fcapVar) {
        febs febsVar = fbov.b;
        if (febsVar == null) {
            synchronized (fbov.class) {
                febsVar = fbov.b;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.Messaging", "PullMessages");
                    a.b();
                    fcap fcapVar2 = fcap.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fcapVar2);
                    a.b = new ffae(fcar.a);
                    febsVar = a.a();
                    fbov.b = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), fcapVar);
    }

    public final ListenableFuture e(fcch fcchVar) {
        febs febsVar = fbov.e;
        if (febsVar == null) {
            synchronized (fbov.class) {
                febsVar = fbov.e;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.internal.communications.instantmessaging.v1.Messaging", "RevokeMessagesBySender");
                    a.b();
                    fcch fcchVar2 = fcch.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(fcchVar2);
                    a.b = new ffae(fccj.a);
                    febsVar = a.a();
                    fbov.e = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), fcchVar);
    }

    public final ListenableFuture f(fbzv fbzvVar) {
        return ffat.a(this.a.a(fbov.c(), this.b), fbzvVar);
    }
}
