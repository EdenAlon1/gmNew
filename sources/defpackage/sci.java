package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.aicore.aidl.IAICoreService;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.Locale;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sci implements sak {
    public static final String a = "sci";
    public static final ComponentName b;
    public static final ComponentName c;
    protected final Context d;
    public final Executor e;
    public final boolean f;
    private final errl g;
    private final Object h = new Object();
    private sch i;

    static {
        ComponentName componentName = new ComponentName("com.google.android.aicore", "com.google.android.apps.aicore.service.multiuser.AiCoreMultiUserService");
        b = componentName;
        c = new ComponentName(componentName.getPackageName(), "com.google.android.apps.aicore.service.AiCoreService");
    }

    public sci(san sanVar) {
        sas sasVar = (sas) sanVar;
        this.d = sasVar.a;
        this.g = errs.a(sasVar.b);
        this.e = sasVar.c;
        this.f = sasVar.d;
    }

    @Override // defpackage.sak
    public final ListenableFuture a(final int i) {
        return erny.g(h(), new eroh() { // from class: sbp
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                IAICoreService iAICoreService = (IAICoreService) obj;
                String str = sci.a;
                try {
                    rvg feature = iAICoreService.getFeature(i);
                    return erqt.i(feature == null ? null : saq.f(feature));
                } catch (RemoteException e) {
                    Log.e(sci.a, "AiCore service failed to get feature.", e);
                    return erqt.h(new sao(3, 6, "AiCore service failed to get feature.", e));
                }
            }
        }, this.g);
    }

    @Override // defpackage.sak
    public final ListenableFuture b(final int i, final int i2) {
        return erny.g(h(), new eroh() { // from class: sbq
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                IAICoreService iAICoreService = (IAICoreService) obj;
                String str = sci.a;
                int i3 = i;
                int i4 = i2;
                try {
                    if (iAICoreService.getApiVersion() < 6) {
                        return erqt.h(new sao(3, 8, "getFeatureOrControl is not supported before AICoreVersion V7", null));
                    }
                    rvg featureOrControl = iAICoreService.getFeatureOrControl(i3, i4);
                    return featureOrControl == null ? erqt.h(new sao(3, 606, String.format(Locale.ENGLISH, "Feature %d is not available.", Integer.valueOf(i3)), null)) : erqt.i(saq.f(featureOrControl));
                } catch (RemoteException e) {
                    Log.e(sci.a, "AiCore service failed to get feature.", e);
                    return erqt.h(new sao(3, 6, "AiCore service failed to get feature.", e));
                }
            }
        }, this.g);
    }

    @Override // defpackage.sak
    public final ListenableFuture c(final saq saqVar) {
        return erny.g(h(), new eroh() { // from class: sbs
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                IAICoreService iAICoreService = (IAICoreService) obj;
                String str = sci.a;
                saq saqVar2 = saq.this;
                try {
                    return erqt.i(Integer.valueOf(iAICoreService.getFeatureStatus(saqVar2.e())));
                } catch (RemoteException e) {
                    Log.e(sci.a, "AiCore service failed to get feature status for ".concat(saqVar2.h()), e);
                    return erqt.h(new sao(3, 6, "AiCore service failed to get feature status for ".concat(saqVar2.h()), e));
                }
            }
        }, this.g);
    }

    @Override // defpackage.sak, java.lang.AutoCloseable
    public final void close() {
        i();
    }

    @Override // defpackage.sak
    public final ListenableFuture d() {
        sch schVar;
        SettableFuture settableFuture;
        synchronized (this.h) {
            schVar = this.i;
            if (schVar == null) {
                schVar = new sch(this);
                this.i = schVar;
                Intent intent = new Intent();
                intent.setComponent(b);
                try {
                    if (!schVar.d(intent)) {
                        schVar.d.d.unbindService(schVar);
                        Intent intent2 = new Intent();
                        intent2.setComponent(c);
                        if (!schVar.d(intent2)) {
                            schVar.b(new sao(4, 601, "AiCore service failed to bind.", null));
                        }
                    }
                } catch (SecurityException e) {
                    schVar.b(new sao(4, 601, "AiCore service failed to bind.", e));
                }
            }
        }
        synchronized (schVar.a) {
            if (schVar.b.isCancelled()) {
                schVar.c();
            }
            settableFuture = schVar.b;
        }
        return settableFuture;
    }

    @Override // defpackage.sak
    public final errl e() {
        return this.g;
    }

    @Override // defpackage.sak
    public final Executor f() {
        return this.e;
    }

    @Override // defpackage.sak
    public final ListenableFuture g(final saq saqVar, final emdl emdlVar) {
        return erny.g(d(), new eroh() { // from class: sbv
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final saj sajVar = (saj) obj;
                final saq saqVar2 = saqVar;
                final sci sciVar = sci.this;
                final emdl emdlVar2 = emdlVar;
                return sajVar.b().a(kfg.a(new kfd() { // from class: sbt
                    @Override // defpackage.kfd
                    public final Object a(kfb kfbVar) {
                        saj sajVar2 = sajVar;
                        saq saqVar3 = saqVar2;
                        try {
                            int apiVersion = sajVar2.a().getApiVersion();
                            emdl emdlVar3 = emdlVar2;
                            sci sciVar2 = sci.this;
                            if (apiVersion > 0) {
                                sajVar2.a().requestDownloadableFeatureWithDownloadListener2(saqVar3.e(), new sca(sciVar2, emdlVar3, saqVar3, kfbVar));
                            } else {
                                sajVar2.a().requestDownloadableFeatureWithDownloadListener(saqVar3.e(), new scf(sciVar2, emdlVar3, saqVar3, kfbVar));
                            }
                            return "requestDownloadableFeatureFuture";
                        } catch (RemoteException e) {
                            Log.e(sci.a, "AiCore service failed to download feature ".concat(saqVar3.h()), e);
                            kfbVar.c(new sao(1, 6, "AICore service failed to download feature ".concat(saqVar3.h()), e));
                            return "requestDownloadableFeatureFuture";
                        }
                    }
                }), new emyl() { // from class: sbu
                    @Override // defpackage.emyl
                    public final Object get() {
                        String str = sci.a;
                        return new sao(1, 6, "AICore service disconnected", null);
                    }
                });
            }
        }, this.g);
    }

    public final ListenableFuture h() {
        return erny.f(erqc.o(d()), new emwl() { // from class: sbr
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((saj) obj).a();
            }
        }, erpp.a);
    }

    public final void i() {
        synchronized (this.h) {
            sch schVar = this.i;
            if (schVar != null) {
                synchronized (schVar.a) {
                    schVar.d.d.unbindService(schVar);
                    schVar.c.c();
                }
                this.i = null;
            }
        }
    }
}
