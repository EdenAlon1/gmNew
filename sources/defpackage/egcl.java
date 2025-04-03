package defpackage;

import android.util.Log;
import com.google.common.util.concurrent.ListenableFuture;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egcl implements egcn {
    public final egco a;
    private final errl b;

    public egcl(egco egcoVar, errl errlVar) {
        this.a = egcoVar;
        this.b = errlVar;
    }

    private final ListenableFuture l(final egck egckVar) {
        return ernq.g(a(egckVar), fedn.class, new eroh() { // from class: egcc
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                fedn fednVar = (fedn) obj;
                if (!fednVar.a.getCode().equals(Status.Code.UNAUTHENTICATED)) {
                    return erqt.h(fednVar);
                }
                if (Log.isLoggable("AuthRetryingCustardStub", 4)) {
                    Log.i("AuthRetryingCustardStub", "Refreshing expired auth token", fednVar);
                }
                egck egckVar2 = egckVar;
                egcl egclVar = egcl.this;
                egclVar.a.b();
                return egclVar.a(egckVar2);
            }
        }, this.b);
    }

    public final erqc a(final egck egckVar) {
        return (erqc) erny.g(erqc.o(this.a.a()), new eroh() { // from class: egbz
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return egck.this.a((ewji) obj);
            }
        }, this.b);
    }

    @Override // defpackage.egcn
    public final ListenableFuture b(final ewjp ewjpVar) {
        return l(new egck() { // from class: egcf
            @Override // defpackage.egck
            public final ListenableFuture a(ewji ewjiVar) {
                febs febsVar = ewjj.c;
                if (febsVar == null) {
                    synchronized (ewjj.class) {
                        febsVar = ewjj.c;
                        if (febsVar == null) {
                            febp a = febs.a();
                            a.c = febr.UNARY;
                            a.d = febs.c("google.internal.contactsui.v1.CustardService", "GetProfilePhotoArtCollectionImages");
                            a.b();
                            ewjp ewjpVar2 = ewjp.a;
                            eyfc eyfcVar = ffag.a;
                            a.a = new ffae(ewjpVar2);
                            a.b = new ffae(ewjr.a);
                            febsVar = a.a();
                            ewjj.c = febsVar;
                        }
                    }
                }
                return ffat.a(ewjiVar.a.a(febsVar, ewjiVar.b), ewjp.this);
            }
        });
    }

    @Override // defpackage.egcn
    public final ListenableFuture c(final ewjt ewjtVar) {
        return l(new egck() { // from class: egcd
            @Override // defpackage.egck
            public final ListenableFuture a(ewji ewjiVar) {
                febs febsVar = ewjj.d;
                if (febsVar == null) {
                    synchronized (ewjj.class) {
                        febsVar = ewjj.d;
                        if (febsVar == null) {
                            febp a = febs.a();
                            a.c = febr.UNARY;
                            a.d = febs.c("google.internal.contactsui.v1.CustardService", "GetProfilePhotoArtFullImage");
                            a.b();
                            ewjt ewjtVar2 = ewjt.a;
                            eyfc eyfcVar = ffag.a;
                            a.a = new ffae(ewjtVar2);
                            a.b = new ffae(ewjv.a);
                            febsVar = a.a();
                            ewjj.d = febsVar;
                        }
                    }
                }
                return ffat.a(ewjiVar.a.a(febsVar, ewjiVar.b), ewjt.this);
            }
        });
    }

    @Override // defpackage.egcn
    public final ListenableFuture d(final ewjx ewjxVar) {
        return l(new egck() { // from class: egce
            @Override // defpackage.egck
            public final ListenableFuture a(ewji ewjiVar) {
                febs febsVar = ewjj.e;
                if (febsVar == null) {
                    synchronized (ewjj.class) {
                        febsVar = ewjj.e;
                        if (febsVar == null) {
                            febp a = febs.a();
                            a.c = febr.UNARY;
                            a.d = febs.c("google.internal.contactsui.v1.CustardService", "GetProfilePhotoArtHomeSuggestions");
                            a.b();
                            ewjx ewjxVar2 = ewjx.a;
                            eyfc eyfcVar = ffag.a;
                            a.a = new ffae(ewjxVar2);
                            a.b = new ffae(ewjz.a);
                            febsVar = a.a();
                            ewjj.e = febsVar;
                        }
                    }
                }
                return ffat.a(ewjiVar.a.a(febsVar, ewjiVar.b), ewjx.this);
            }
        });
    }

    @Override // defpackage.egcn
    public final ListenableFuture e(final ewkb ewkbVar) {
        return l(new egck() { // from class: egcb
            @Override // defpackage.egck
            public final ListenableFuture a(ewji ewjiVar) {
                return ffat.a(ewjiVar.a.a(ewjj.b(), ewjiVar.b), ewkb.this);
            }
        });
    }

    @Override // defpackage.egcn
    public final ListenableFuture f(final ewkj ewkjVar) {
        return l(new egck() { // from class: egcj
            @Override // defpackage.egck
            public final ListenableFuture a(ewji ewjiVar) {
                febs febsVar = ewjj.f;
                if (febsVar == null) {
                    synchronized (ewjj.class) {
                        febsVar = ewjj.f;
                        if (febsVar == null) {
                            febp a = febs.a();
                            a.c = febr.UNARY;
                            a.d = febs.c("google.internal.contactsui.v1.CustardService", "GetSearchInterests");
                            a.b();
                            ewkj ewkjVar2 = ewkj.a;
                            eyfc eyfcVar = ffag.a;
                            a.a = new ffae(ewkjVar2);
                            a.b = new ffae(ewkl.a);
                            febsVar = a.a();
                            ewjj.f = febsVar;
                        }
                    }
                }
                return ffat.a(ewjiVar.a.a(febsVar, ewjiVar.b), ewkj.this);
            }
        });
    }

    @Override // defpackage.egcn
    public final ListenableFuture g(final ewkx ewkxVar) {
        return l(new egck() { // from class: egcg
            @Override // defpackage.egck
            public final ListenableFuture a(ewji ewjiVar) {
                febs febsVar = ewjj.i;
                if (febsVar == null) {
                    synchronized (ewjj.class) {
                        febsVar = ewjj.i;
                        if (febsVar == null) {
                            febp a = febs.a();
                            a.c = febr.UNARY;
                            a.d = febs.c("google.internal.contactsui.v1.CustardService", "ListProfilePhotoArtCollectionsByCategory");
                            a.b();
                            ewkx ewkxVar2 = ewkx.a;
                            eyfc eyfcVar = ffag.a;
                            a.a = new ffae(ewkxVar2);
                            a.b = new ffae(ewkz.a);
                            febsVar = a.a();
                            ewjj.i = febsVar;
                        }
                    }
                }
                return ffat.a(ewjiVar.a.a(febsVar, ewjiVar.b), ewkx.this);
            }
        });
    }

    @Override // defpackage.egcn
    public final ListenableFuture h(final ewlb ewlbVar) {
        return l(new egck() { // from class: egca
            @Override // defpackage.egck
            public final ListenableFuture a(ewji ewjiVar) {
                febs febsVar = ewjj.h;
                if (febsVar == null) {
                    synchronized (ewjj.class) {
                        febsVar = ewjj.h;
                        if (febsVar == null) {
                            febp a = febs.a();
                            a.c = febr.UNARY;
                            a.d = febs.c("google.internal.contactsui.v1.CustardService", "ListProfilePhotoArtSearchSuggestions");
                            a.b();
                            ewlb ewlbVar2 = ewlb.a;
                            eyfc eyfcVar = ffag.a;
                            a.a = new ffae(ewlbVar2);
                            a.b = new ffae(ewld.a);
                            febsVar = a.a();
                            ewjj.h = febsVar;
                        }
                    }
                }
                return ffat.a(ewjiVar.a.a(febsVar, ewjiVar.b), ewlb.this);
            }
        });
    }

    @Override // defpackage.egcn
    public final ListenableFuture i(final ewlf ewlfVar) {
        return l(new egck() { // from class: egby
            @Override // defpackage.egck
            public final ListenableFuture a(ewji ewjiVar) {
                febs febsVar = ewjj.b;
                if (febsVar == null) {
                    synchronized (ewjj.class) {
                        febsVar = ewjj.b;
                        if (febsVar == null) {
                            febp a = febs.a();
                            a.c = febr.UNARY;
                            a.d = febs.c("google.internal.contactsui.v1.CustardService", "ListProfilePhotosClusterSuggestions");
                            a.b();
                            ewlf ewlfVar2 = ewlf.a;
                            eyfc eyfcVar = ffag.a;
                            a.a = new ffae(ewlfVar2);
                            a.b = new ffae(ewlh.a);
                            febsVar = a.a();
                            ewjj.b = febsVar;
                        }
                    }
                }
                return ffat.a(ewjiVar.a.a(febsVar, ewjiVar.b), ewlf.this);
            }
        });
    }

    @Override // defpackage.egcn
    public final ListenableFuture j(final ewlj ewljVar) {
        return l(new egck() { // from class: egch
            @Override // defpackage.egck
            public final ListenableFuture a(ewji ewjiVar) {
                febs febsVar = ewjj.a;
                if (febsVar == null) {
                    synchronized (ewjj.class) {
                        febsVar = ewjj.a;
                        if (febsVar == null) {
                            febp a = febs.a();
                            a.c = febr.UNARY;
                            a.d = febs.c("google.internal.contactsui.v1.CustardService", "ListProfilePhotosPhotoSuggestions");
                            a.b();
                            ewlj ewljVar2 = ewlj.a;
                            eyfc eyfcVar = ffag.a;
                            a.a = new ffae(ewljVar2);
                            a.b = new ffae(ewll.a);
                            febsVar = a.a();
                            ewjj.a = febsVar;
                        }
                    }
                }
                return ffat.a(ewjiVar.a.a(febsVar, ewjiVar.b), ewlj.this);
            }
        });
    }

    @Override // defpackage.egcn
    public final ListenableFuture k(final ewlx ewlxVar) {
        return l(new egck() { // from class: egci
            @Override // defpackage.egck
            public final ListenableFuture a(ewji ewjiVar) {
                febs febsVar = ewjj.g;
                if (febsVar == null) {
                    synchronized (ewjj.class) {
                        febsVar = ewjj.g;
                        if (febsVar == null) {
                            febp a = febs.a();
                            a.c = febr.UNARY;
                            a.d = febs.c("google.internal.contactsui.v1.CustardService", "SearchProfilePhotoArt");
                            a.b();
                            ewlx ewlxVar2 = ewlx.a;
                            eyfc eyfcVar = ffag.a;
                            a.a = new ffae(ewlxVar2);
                            a.b = new ffae(ewlz.a);
                            febsVar = a.a();
                            ewjj.g = febsVar;
                        }
                    }
                }
                return ffat.a(ewjiVar.a.a(febsVar, ewjiVar.b), ewlx.this);
            }
        });
    }
}
