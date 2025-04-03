package defpackage;

import android.os.Handler;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atw implements bli {
    public static final bdn a = new bbf("camerax.core.appConfig.cameraFactoryProvider", bco.class, null);
    public static final bdn b = new bbf("camerax.core.appConfig.deviceSurfaceManagerProvider", bcn.class, null);
    public static final bdn c = new bbf("camerax.core.appConfig.useCaseConfigFactoryProvider", bhk.class, null);
    static final bdn d = new bbf("camerax.core.appConfig.cameraExecutor", Executor.class, null);
    static final bdn e = new bbf("camerax.core.appConfig.schedulerHandler", Handler.class, null);
    static final bdn f = new bbf("camerax.core.appConfig.minimumLoggingLevel", Integer.TYPE, null);
    static final bdn g = new bbf("camerax.core.appConfig.availableCamerasLimiter", atl.class, null);
    static final bdn h = new bbf("camerax.core.appConfig.cameraOpenRetryMaxTimeoutInMillisWhileResuming", Long.TYPE, null);
    static final bdn i = new bbf("camerax.core.appConfig.cameraProviderInitRetryPolicy", awq.class, null);
    static final bdn j = new bbf("camerax.core.appConfig.quirksSettings", bfs.class, null);
    public final bfn k;

    public atw(bfn bfnVar) {
        this.k = bfnVar;
    }

    @Override // defpackage.bdp
    public final /* synthetic */ bdo h(bdn bdnVar) {
        return bfy.a(this, bdnVar);
    }

    @Override // defpackage.bfz
    public final bdp i() {
        return this.k;
    }

    @Override // defpackage.bfz, defpackage.bdp
    public final /* synthetic */ Object l(bdn bdnVar) {
        return bfy.b(this, bdnVar);
    }

    @Override // defpackage.bfz, defpackage.bdp
    public final /* synthetic */ Object m(bdn bdnVar, Object obj) {
        return bfy.c(this, bdnVar, obj);
    }

    @Override // defpackage.bdp
    public final /* synthetic */ Object n(bdn bdnVar, bdo bdoVar) {
        return bfy.d(this, bdnVar, bdoVar);
    }

    @Override // defpackage.bli
    public final /* synthetic */ String o() {
        throw null;
    }

    @Override // defpackage.bli
    public final /* synthetic */ String p(String str) {
        throw null;
    }

    @Override // defpackage.bdp
    public final /* synthetic */ Set q(bdn bdnVar) {
        return bfy.e(this, bdnVar);
    }

    @Override // defpackage.bfz, defpackage.bdp
    public final /* synthetic */ Set r() {
        return bfy.f(this);
    }

    @Override // defpackage.bfz, defpackage.bdp
    public final /* synthetic */ boolean s(bdn bdnVar) {
        return bfy.g(this, bdnVar);
    }

    @Override // defpackage.bdp
    public final /* synthetic */ void u(ask askVar) {
        bfy.h(this, askVar);
    }
}
