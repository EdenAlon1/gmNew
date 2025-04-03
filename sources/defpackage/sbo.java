package defpackage;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.aicore.aidl.IAICoreService;
import com.google.android.apps.aicore.aidl.ICancellationCallback;
import com.google.android.apps.aicore.aidl.ITokenizationCallback;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class sbo implements sap {
    public static final String a = "sbo";
    public final sak b;
    protected final saq c;
    protected final errl d;
    public final Executor e;
    public final Object f = new Object();
    public ListenableFuture g;
    private ListenableFuture h;
    private final emdl i;

    protected sbo(sak sakVar, saq saqVar, emdl emdlVar) {
        this.b = sakVar;
        this.c = saqVar;
        this.i = emdlVar;
        this.d = sakVar.e();
        this.e = sakVar.f();
    }

    private final ListenableFuture f() {
        ListenableFuture listenableFuture;
        synchronized (this.f) {
            if (this.h == this.b.d() && (listenableFuture = this.g) != null) {
                return listenableFuture;
            }
            final emdl emdlVar = this.i;
            ListenableFuture g = erny.g(erny.g(erqc.o(erny.g(erqc.o(this.b.c(this.c)), new eroh() { // from class: sbb
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    Integer num = (Integer) obj;
                    int intValue = num.intValue();
                    final sbo sboVar = sbo.this;
                    final emdl emdlVar2 = emdlVar;
                    if (intValue == 0) {
                        final sao saoVar = new sao(1, 0, "Feature is unavailable.", null);
                        sboVar.e.execute(new Runnable() { // from class: sbh
                            @Override // java.lang.Runnable
                            public final void run() {
                                emdl emdlVar3 = emdlVar2;
                                ((enrr) ((enrr) emdlVar3.a.d.i()).g(saoVar).h("com/google/chat/smartmessaging/penpal/server/v3/PenpalOnDeviceClientImpl$downloadCallback$1", "onDownloadDidNotStart", 503, "PenpalOnDeviceClientImpl.kt")).r("Feature %d download did not start", sbo.this.c.a());
                                ((emdj) emdlVar3.a.e.get()).a();
                            }
                        });
                        return erqt.h(saoVar);
                    }
                    if (intValue == 1 || intValue == 2) {
                        return sboVar.b.g(sboVar.c, emdlVar2);
                    }
                    if (intValue != 3) {
                        Objects.toString(num);
                        return erqt.h(new sao(1, 0, "Unexpected feature status: ".concat(String.valueOf(num)), null));
                    }
                    saq saqVar = sboVar.c;
                    Log.i(sbo.a, "Feature " + saqVar.h() + " is downloaded and ready.");
                    sboVar.e.execute(new Runnable() { // from class: sbg
                        @Override // java.lang.Runnable
                        public final void run() {
                            emdlVar2.a(sbo.this.c);
                        }
                    });
                    return erre.a;
                }
            }, this.d)), new eroh() { // from class: sbc
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    return sbo.this.b.d();
                }
            }, this.d), new eroh() { // from class: sbd
                @Override // defpackage.eroh
                public final ListenableFuture a(Object obj) {
                    saj sajVar = (saj) obj;
                    try {
                        return erqt.i(new scj(sbo.this.c(sajVar.a()), sajVar.b()));
                    } catch (RemoteException e) {
                        return erqt.h(new sao(2, 6, "Failed to initialize service.", e));
                    } catch (RuntimeException e2) {
                        return erqt.h(new sao(2, 0, "Failed to initialize service.", e2));
                    }
                }
            }, this.d);
            this.g = g;
            this.h = this.b.d();
            erqt.r(g, new sbl(this), erpp.a);
            return g;
        }
    }

    @Override // defpackage.sap
    public final ListenableFuture a(final Object obj) {
        return erny.g(f(), new eroh() { // from class: sbf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                final sbn sbnVar = (sbn) obj2;
                final sbo sboVar = sbo.this;
                final Object obj3 = obj;
                return sbnVar.a().a(kfg.a(new kfd() { // from class: saz
                    @Override // defpackage.kfd
                    public final Object a(kfb kfbVar) {
                        sbo sboVar2 = sbo.this;
                        sbn sbnVar2 = sbnVar;
                        try {
                            final ICancellationCallback d = sboVar2.d(sbnVar2.b(), obj3, new sbm(kfbVar));
                            kfbVar.a(new Runnable() { // from class: sbi
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str = sbo.a;
                                    try {
                                        ICancellationCallback.this.cancel();
                                    } catch (RemoteException e) {
                                        Log.w(sbo.a, "Failed to cancel inference", e);
                                    }
                                }
                            }, sboVar2.d);
                            return "runInferenceFuture";
                        } catch (RemoteException e) {
                            kfbVar.c(new sao(2, 6, "Failed to run inference", e));
                            return null;
                        } catch (RuntimeException e2) {
                            kfbVar.c(new sao(2, 0, "Failed to run inference", e2));
                            return null;
                        }
                    }
                }), new emyl() { // from class: sba
                    @Override // defpackage.emyl
                    public final Object get() {
                        String str = sbo.a;
                        return new sao(3, 6, "AICore service disconnected", null);
                    }
                });
            }
        }, this.d);
    }

    @Override // defpackage.sap
    public final ListenableFuture b(final Object obj) {
        return erny.g(f(), new eroh() { // from class: sbe
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj2) {
                final sbn sbnVar = (sbn) obj2;
                final sbo sboVar = sbo.this;
                final Object obj3 = obj;
                return sbnVar.a().a(kfg.a(new kfd() { // from class: sax
                    @Override // defpackage.kfd
                    public final Object a(kfb kfbVar) {
                        sbk sbkVar = new sbk(kfbVar);
                        sbo sboVar2 = sbo.this;
                        try {
                            final ICancellationCallback e = sboVar2.e(obj3, sbnVar.b(), sbkVar);
                            kfbVar.a(new Runnable() { // from class: sbj
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str = sbo.a;
                                    try {
                                        ICancellationCallback.this.cancel();
                                    } catch (RemoteException e2) {
                                        Log.w(sbo.a, "Failed to cancel tokenization request", e2);
                                    }
                                }
                            }, sboVar2.d);
                            return "getTokenInfoFuture";
                        } catch (RemoteException e2) {
                            kfbVar.c(new sao(5, 6, "Failed to tokenize the input query", e2));
                            return null;
                        } catch (RuntimeException e3) {
                            kfbVar.c(new sao(5, 0, "Failed to tokenize the input query", e3));
                            return null;
                        }
                    }
                }), new emyl() { // from class: say
                    @Override // defpackage.emyl
                    public final Object get() {
                        String str = sbo.a;
                        return new sao(5, 6, "AICore service disconnected", null);
                    }
                });
            }
        }, this.d);
    }

    protected abstract Object c(IAICoreService iAICoreService);

    protected abstract ICancellationCallback d(Object obj, Object obj2, sbm sbmVar);

    protected ICancellationCallback e(Object obj, Object obj2, ITokenizationCallback iTokenizationCallback) {
        throw null;
    }
}
