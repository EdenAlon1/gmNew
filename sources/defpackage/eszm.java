package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eszm extends ffai {
    public eszm(fdxk fdxkVar, fdxj fdxjVar) {
        super(fdxkVar, fdxjVar);
    }

    @Override // defpackage.ffak
    protected final /* synthetic */ ffak a(fdxk fdxkVar, fdxj fdxjVar) {
        return new eszm(fdxkVar, fdxjVar);
    }

    public final ListenableFuture b(eswy eswyVar) {
        febs febsVar = eszn.a;
        if (febsVar == null) {
            synchronized (eszn.class) {
                febsVar = eszn.a;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "CreateObject");
                    a.b();
                    eswy eswyVar2 = eswy.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(eswyVar2);
                    a.b = new ffae(eszz.a);
                    febsVar = a.a();
                    eszn.a = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), eswyVar);
    }

    public final ListenableFuture c(esxu esxuVar) {
        febs febsVar = eszn.o;
        if (febsVar == null) {
            synchronized (eszn.class) {
                febsVar = eszn.o;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "GetObjectByCorrelationId");
                    a.b();
                    esxu esxuVar2 = esxu.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(esxuVar2);
                    a.b = new ffae(eszz.a);
                    febsVar = a.a();
                    eszn.o = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), esxuVar);
    }

    public final ListenableFuture d(esyb esybVar) {
        febs febsVar = eszn.D;
        if (febsVar == null) {
            synchronized (eszn.class) {
                febsVar = eszn.D;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "GetUserStorageInfo");
                    a.b();
                    esyb esybVar2 = esyb.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(esybVar2);
                    a.b = new ffae(esyd.a);
                    febsVar = a.a();
                    eszn.D = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), esybVar);
    }

    public final ListenableFuture e(esyw esywVar) {
        febs febsVar = eszn.c;
        if (febsVar == null) {
            synchronized (eszn.class) {
                febsVar = eszn.c;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "ListObjects");
                    a.b();
                    esyw esywVar2 = esyw.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(esywVar2);
                    a.b = new ffae(esyy.a);
                    febsVar = a.a();
                    eszn.c = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), esywVar);
    }

    public final ListenableFuture f(etba etbaVar) {
        febs febsVar = eszn.s;
        if (febsVar == null) {
            synchronized (eszn.class) {
                febsVar = eszn.s;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "UpdateBox");
                    a.b();
                    etba etbaVar2 = etba.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(etbaVar2);
                    a.b = new ffae(esvv.b);
                    febsVar = a.a();
                    eszn.s = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), etbaVar);
    }

    public final ListenableFuture g(etbg etbgVar) {
        febs febsVar = eszn.e;
        if (febsVar == null) {
            synchronized (eszn.class) {
                febsVar = eszn.e;
                if (febsVar == null) {
                    febp a = febs.a();
                    a.c = febr.UNARY;
                    a.d = febs.c("google.communications.jibemessagestore.v1.MessageStore", "UpdateObject");
                    a.b();
                    etbg etbgVar2 = etbg.a;
                    eyfc eyfcVar = ffag.a;
                    a.a = new ffae(etbgVar2);
                    a.b = new ffae(eszz.a);
                    febsVar = a.a();
                    eszn.e = febsVar;
                }
            }
        }
        return ffat.a(this.a.a(febsVar, this.b), etbgVar);
    }
}
