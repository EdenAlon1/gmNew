package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.auth.UserRecoverableAuthException;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import io.grpc.Status;
import io.grpc.StatusException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzci {
    public final Context a;
    public final dyxi b;
    public final dyyt c;
    public final dzdb d;
    public dypv e;
    public final Map f;
    public cgjh g;

    public dzci(Context context, cgjf cgjfVar, dyxi dyxiVar) {
        dzdb dzdbVar = new dzdb(context);
        this.f = new HashMap();
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.d = dzdbVar;
        this.b = dyxiVar;
        this.c = dyyt.a(applicationContext);
    }

    public static final ListenableFuture g(eroh erohVar) {
        try {
            return erohVar.a(null);
        } catch (Exception e) {
            return erqt.h(e);
        }
    }

    private final ListenableFuture i(final UUID uuid, final int i, final dzgg dzggVar, final ListenableFuture listenableFuture, final dzpg dzpgVar, dyxb dyxbVar, final boolean z, final dzja dzjaVar, final dzjq dzjqVar) {
        dyhw.b();
        return c(dzjaVar, dzpgVar, new eroh() { // from class: dzbv
            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                dzjq dzjqVar2;
                ListenableFuture listenableFuture2;
                final dzci dzciVar = dzci.this;
                final ListenableFuture listenableFuture3 = listenableFuture;
                if (z) {
                    listenableFuture3 = dzciVar.a(listenableFuture3, dzpgVar);
                }
                final dzgg dzggVar2 = dzggVar;
                int i2 = i;
                final UUID uuid2 = uuid;
                if (i2 == 1) {
                    listenableFuture2 = new emwl() { // from class: dzbn
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return dzgg.this.a((fcfo) obj2);
                        }
                    }.apply((fcfo) dzcu.a(dzciVar.a, uuid2).build());
                } else {
                    dzja dzjaVar2 = dzjaVar;
                    if (i2 == 0 && dzjaVar2 != null) {
                        listenableFuture2 = dzciVar.e(uuid2, new emwl() { // from class: dzbn
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return dzgg.this.a((fcfo) obj2);
                            }
                        }, dzjaVar2);
                    } else {
                        if (i2 != 2 || dzjaVar2 == null || (dzjqVar2 = dzjqVar) == null) {
                            return erqt.h(new RuntimeException(a.h(i2, "Invalid RequestType: ")));
                        }
                        emwl emwlVar = new emwl() { // from class: dzbn
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                return dzgg.this.a((fcfo) obj2);
                            }
                        };
                        fcfn b = dzcu.b(dzciVar.a, erme.c(dzjqVar2.c()), uuid2);
                        fcek c = dzdx.c(dzjaVar2.c().f());
                        b.copyOnWrite();
                        fcfo fcfoVar = (fcfo) b.instance;
                        fcfo fcfoVar2 = fcfo.a;
                        c.getClass();
                        fcfoVar.h = c;
                        fcfoVar.b |= 2;
                        listenableFuture2 = emwlVar.apply((fcfo) b.build());
                    }
                }
                final SettableFuture create = SettableFuture.create();
                final ListenableFuture f = erny.f(erny.g(listenableFuture2, new eroh() { // from class: dzbo
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj2) {
                        UUID uuid3 = uuid2;
                        dyhr.e("Backend", "request(requestId=" + String.valueOf(uuid3) + "): " + obj2.getClass().getSimpleName());
                        dyhr.a("Backend", a.E(obj2, uuid3, "request(requestId=", "): "));
                        create.set(Long.valueOf(SystemClock.elapsedRealtime()));
                        return dzggVar2.b(erny.f(listenableFuture3, new emwl() { // from class: dzca
                            @Override // defpackage.emwl
                            public final Object apply(Object obj3) {
                                return ((dzcj) obj3).a;
                            }
                        }, erpp.a), obj2);
                    }
                }, erpp.a), new emwl() { // from class: dzbp
                    @Override // defpackage.emwl
                    public final Object apply(Object obj2) {
                        UUID uuid3 = uuid2;
                        dyhr.e("Backend", "response(requestId=" + String.valueOf(uuid3) + "): " + obj2.getClass().getSimpleName());
                        dyhr.a("Backend", a.E(obj2, uuid3, "response(requestId=", "): "));
                        return dzggVar2.c(obj2);
                    }
                }, erpp.a);
                return erqt.b(f).b(new erog() { // from class: dzbq
                    @Override // defpackage.erog
                    public final ListenableFuture a() {
                        dzgg dzggVar3 = dzggVar2;
                        dzci dzciVar2 = dzci.this;
                        ListenableFuture listenableFuture4 = f;
                        UUID uuid3 = uuid2;
                        SettableFuture settableFuture = create;
                        long micros = settableFuture.isDone() ? TimeUnit.MILLISECONDS.toMicros(SystemClock.elapsedRealtime() - ((Long) settableFuture.get()).longValue()) : 0L;
                        try {
                            dzggVar3.e(uuid3, erqt.q(listenableFuture4), dzciVar2.c, micros);
                            return listenableFuture4;
                        } catch (Exception e) {
                            dzggVar3.d(uuid3, dzcw.b().a(dzciVar2.a, e.getCause()), Status.c(e.getCause()), dzciVar2.c, micros);
                            return listenableFuture4;
                        }
                    }
                }, erpp.a);
            }
        }, i, dyxbVar, z);
    }

    public final ListenableFuture a(final ListenableFuture listenableFuture, final dzpg dzpgVar) {
        return erqt.n(new erog() { // from class: dzbx
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final String str;
                dzci dzciVar = dzci.this;
                ListenableFuture listenableFuture2 = listenableFuture;
                dzpg dzpgVar2 = dzpgVar;
                if (dzpgVar2.b() != dzpf.EMAIL) {
                    return listenableFuture2;
                }
                try {
                    cgjh cgjhVar = dzciVar.g;
                    Account account = new Account(dzpgVar2.d(), "com.google");
                    try {
                        Context context = cgjhVar.a;
                        Bundle bundle = new Bundle();
                        int i = dezv.a;
                        str = dfac.e(context, account, "oauth2:https://www.googleapis.com/auth/tachyon", bundle);
                    } catch (UserRecoverableAuthException e) {
                        cgjk.a.n("UserRecoverableAuthException in getOAuthToken.".concat(e.toString()));
                        str = null;
                    }
                    if (TextUtils.isEmpty(str)) {
                        throw new fedn(Status.j.withDescription("Failed to generate OAuthToken"));
                    }
                    dzciVar.f.put(dzpgVar2.d(), str);
                    return erny.f(listenableFuture2, new emwl() { // from class: dzbt
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            dzck.a();
                            embm embmVar = new embm(str, null);
                            int i2 = embp.b;
                            embo emboVar = new embo();
                            emboVar.a = embmVar;
                            return new dzcj(((dzcj) obj).a.i(new feee(new embp(emboVar))));
                        }
                    }, erpp.a);
                } catch (Exception e2) {
                    dezu dezuVar = new dezu(e2);
                    if (e2 instanceof IOException) {
                        throw new fedn(Status.o.d(dezuVar));
                    }
                    throw new fedn(Status.j.d(dezuVar));
                }
            }
        }, erpp.a);
    }

    public final ListenableFuture b(UUID uuid, dzgg dzggVar, ListenableFuture listenableFuture, dzja dzjaVar, dyxb dyxbVar, boolean z) {
        return i(uuid, 0, dzggVar, listenableFuture, dzjaVar.c().f(), dyxbVar, z, dzjaVar, null);
    }

    public final ListenableFuture c(final dzja dzjaVar, final dzpg dzpgVar, final eroh erohVar, int i, dyxb dyxbVar, boolean z) {
        if (this.e == null) {
            return erqt.h(new RuntimeException("tachyonRegistrationHandler is null"));
        }
        if (this.g == null) {
            return erqt.h(new RuntimeException("oAuthTokenProvider is null"));
        }
        final ListenableFuture f = f(g(erohVar), dzpgVar, fgtr.REGISTRATION_NOT_FOUND);
        if (z) {
            final ListenableFuture b = erqt.b(f).b(new erog() { // from class: dzbw
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    dzci dzciVar = dzci.this;
                    try {
                        erqt.q(f);
                    } catch (Throwable th) {
                        if (Status.c(th).getCode() == Status.j.getCode()) {
                            dzpg dzpgVar2 = dzpgVar;
                            if (dzpgVar2.b() == dzpf.EMAIL) {
                                try {
                                    String str = (String) dzciVar.f.remove(dzpgVar2.d());
                                    if (!TextUtils.isEmpty(str)) {
                                        try {
                                            Context context = dzciVar.g.a;
                                            int i2 = dezv.a;
                                            dfac.f(context, str);
                                        } catch (Exception e) {
                                            cgjk.a.o("Exception in clearOAuthToken.", e);
                                        }
                                        return erqt.i(true);
                                    }
                                } catch (Exception e2) {
                                    dzja dzjaVar2 = dzjaVar;
                                    dyhr.c("Backend", "Failed to clear OAuth token with Exception: ".concat(e2.toString()));
                                    dzhl r = dzhm.r();
                                    r.g(10024);
                                    r.n(dzpgVar2);
                                    if (dzjaVar2 != null) {
                                        r.o(dzjaVar2.d().E());
                                    }
                                    dzciVar.c.b(r.a());
                                }
                            }
                        }
                    }
                    return erqt.i(false);
                }
            }, erpp.a);
            f = erqt.b(b).b(new erog() { // from class: dzbl
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    return ((Boolean) erqt.q(b)).booleanValue() ? dzci.g(erohVar) : f;
                }
            }, erpp.a);
        }
        if (i == 0 && dzjaVar != null) {
            final ListenableFuture b2 = erqt.b(f).b(new erog() { // from class: dzby
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    try {
                        erqt.q(f);
                    } catch (Throwable th) {
                        if (Status.c(th).getCode() == Status.j.getCode()) {
                            return dzci.this.e.c(dzjaVar, true);
                        }
                    }
                    return erqt.i(null);
                }
            }, erpp.a);
            final ListenableFuture a = erqt.b(b2).a(new Callable() { // from class: dzbz
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    try {
                        if (((dzjq) erqt.q(ListenableFuture.this)) != null) {
                            return true;
                        }
                    } catch (Exception unused) {
                        dyhr.c("Backend", "Consume exception thrown during register refresh");
                    }
                    return false;
                }
            }, erpp.a);
            f = erqt.b(a).b(new erog() { // from class: dzbm
                @Override // defpackage.erog
                public final ListenableFuture a() {
                    return ((Boolean) erqt.q(a)).booleanValue() ? dzci.g(erohVar) : f;
                }
            }, erpp.a);
        } else if (i != 1 && i != 2) {
            return erqt.h(new RuntimeException("Invalid RequestType: 0"));
        }
        if (((dywz) ((dywx) dyxbVar).a).a == 0) {
            return f;
        }
        final dzcf dzcfVar = new dzcf(this, dyxbVar, erohVar);
        return erqt.b(f).b(new erog() { // from class: dzbj
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ListenableFuture listenableFuture = f;
                try {
                    erqt.q(listenableFuture);
                    return listenableFuture;
                } catch (Throwable th) {
                    dzci dzciVar = dzci.this;
                    Status c = Status.c(th);
                    if (!dyxi.a(c)) {
                        dyhr.a("RetryManager", "Non retryable error, Retry Category:CLIENT_BLOCKING_RPC Status:".concat(String.valueOf(String.valueOf(c))));
                        return listenableFuture;
                    }
                    dyxi dyxiVar = dzciVar.b;
                    dzcf dzcfVar2 = dzcfVar;
                    SettableFuture create = SettableFuture.create();
                    erqt.r(listenableFuture, new dyxh(dyxiVar, dzcfVar2, create), erpp.a);
                    return create;
                }
            }
        }, erpp.a);
    }

    public final ListenableFuture d(UUID uuid, dzgg dzggVar, ListenableFuture listenableFuture, dzpg dzpgVar, dyxb dyxbVar, boolean z) {
        return i(uuid, 1, dzggVar, listenableFuture, dzpgVar, dyxbVar, z, null, null);
    }

    public final ListenableFuture e(final UUID uuid, final emwl emwlVar, final dzja dzjaVar) {
        final ListenableFuture n = erqt.n(new erog() { // from class: dzce
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return dzci.this.e.c(dzjaVar, false);
            }
        }, erpp.a);
        return erqt.d(n).b(new erog() { // from class: dzbk
            @Override // defpackage.erog
            public final ListenableFuture a() {
                dzjq dzjqVar = (dzjq) erqt.q(n);
                if (dzjqVar == null) {
                    return erqt.h(new StatusException(Status.j));
                }
                dzja dzjaVar2 = dzjaVar;
                UUID uuid2 = uuid;
                emwl emwlVar2 = emwlVar;
                fcfn b = dzcu.b(dzci.this.a, erme.c(dzjqVar.c()), uuid2);
                fcek c = dzdx.c(dzjaVar2.c().f());
                b.copyOnWrite();
                fcfo fcfoVar = (fcfo) b.instance;
                fcfo fcfoVar2 = fcfo.a;
                c.getClass();
                fcfoVar.h = c;
                fcfoVar.b |= 2;
                return (ListenableFuture) emwlVar2.apply((fcfo) b.build());
            }
        }, erpp.a);
    }

    public final ListenableFuture f(final ListenableFuture listenableFuture, final dzpg dzpgVar, final fgtr fgtrVar) {
        return erqt.b(listenableFuture).b(new erog() { // from class: dzbu
            @Override // defpackage.erog
            public final ListenableFuture a() {
                ListenableFuture listenableFuture2 = listenableFuture;
                try {
                    erqt.q(listenableFuture2);
                    return listenableFuture2;
                } catch (Throwable th) {
                    if (dzcw.b().c(th) == fgtrVar) {
                        dzpg dzpgVar2 = dzpgVar;
                        dzci dzciVar = dzci.this;
                        dyhr.f("Backend", "Registration was not found. This was likely deleted from a Tachyon Janitor job or Unregistered previously.");
                        dzciVar.e.d(dzpgVar2);
                    }
                    return listenableFuture2;
                }
            }
        }, erpp.a);
    }

    protected final void finalize() {
        dzdb dzdbVar = this.d;
        if (dzdbVar.c != null) {
            dzdbVar.a.unregisterReceiver(dzdbVar.b);
            try {
                fdxk fdxkVar = dzdbVar.c;
                if (fdxkVar instanceof feau) {
                    ((feau) fdxkVar).d();
                }
            } catch (Exception e) {
                dyhr.d("StubFactory", "Failed to shutdown", e);
            }
        }
    }

    public final ListenableFuture h(UUID uuid, dzgg dzggVar, ListenableFuture listenableFuture, dzja dzjaVar, dzjq dzjqVar, dyxb dyxbVar) {
        return i(uuid, 2, dzggVar, listenableFuture, dzjaVar.c().f(), dyxbVar, true, dzjaVar, dzjqVar);
    }
}
