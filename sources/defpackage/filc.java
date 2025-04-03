package defpackage;

import android.os.SystemClock;
import java.util.Date;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.ICronetEngineBuilder;
import org.chromium.net.impl.CronetUrlRequestContext;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class filc extends fihq {
    private static final AtomicLong q = new AtomicLong(0);

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public filc(android.content.Context r4) {
        /*
            r3 = this;
            java.lang.Class<fihq> r0 = defpackage.fihq.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.lang.String r1 = r0.toString()
            java.lang.String r2 = "java.lang.BootClassLoader"
            boolean r1 = r1.startsWith(r2)
            if (r1 == 0) goto L15
            fihz r0 = defpackage.fihz.CRONET_SOURCE_PLATFORM
            goto L26
        L15:
            java.lang.Class<org.chromium.net.ExperimentalCronetEngine> r1 = org.chromium.net.ExperimentalCronetEngine.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L24
            fihz r0 = defpackage.fihz.CRONET_SOURCE_PLAY_SERVICES
            goto L26
        L24:
            fihz r0 = defpackage.fihz.CRONET_SOURCE_STATICALLY_LINKED
        L26:
            r3.<init>(r4, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.filc.<init>(android.content.Context):void");
    }

    @Override // defpackage.fihq, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addPublicKeyPins(String str, Set set, boolean z, Date date) {
        super.f(str, set, z, date);
        return this;
    }

    @Override // defpackage.fihq, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder addQuicHint(String str, int i, int i2) {
        super.g(str, i, i2);
        return this;
    }

    @Override // org.chromium.net.ICronetEngineBuilder
    public final ExperimentalCronetEngine build() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.h == null) {
            this.h = getDefaultUserAgent();
        }
        return new CronetUrlRequestContext(this, uptimeMillis);
    }

    @Override // defpackage.fihq, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableBrotli(boolean z) {
        this.l = z;
        return this;
    }

    @Override // defpackage.fihq, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableHttp2(boolean z) {
        this.k = z;
        return this;
    }

    @Override // defpackage.fihq, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableHttpCache(int i, long j) {
        super.h(i, j);
        return this;
    }

    @Override // defpackage.fihq, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableNetworkQualityEstimator(boolean z) {
        this.p = z;
        return this;
    }

    @Override // defpackage.fihq, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enablePublicKeyPinningBypassForLocalTrustAnchors(boolean z) {
        this.g = z;
        return this;
    }

    @Override // defpackage.fihq, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder enableQuic(boolean z) {
        this.j = z;
        return this;
    }

    @Override // defpackage.fihq, org.chromium.net.ICronetEngineBuilder
    protected final long getLogCronetInitializationRef() {
        AtomicLong atomicLong = q;
        atomicLong.compareAndSet(0L, this.b.a());
        return atomicLong.get();
    }

    @Override // defpackage.fihq, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder setExperimentalOptions(String str) {
        this.o = str;
        return this;
    }

    @Override // defpackage.fihq, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setStoragePath(String str) {
        super.j(str);
        return this;
    }

    @Override // defpackage.fihq, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder setThreadPriority(int i) {
        super.k(i);
        return this;
    }

    @Override // defpackage.fihq, org.chromium.net.ICronetEngineBuilder
    public final /* synthetic */ ICronetEngineBuilder setUserAgent(String str) {
        this.h = str;
        return this;
    }

    @Override // defpackage.fihq, org.chromium.net.ICronetEngineBuilder
    public final /* bridge */ /* synthetic */ ICronetEngineBuilder enableSdch(boolean z) {
        return this;
    }

    @Override // defpackage.fihq, org.chromium.net.ICronetEngineBuilder
    public /* bridge */ /* synthetic */ ICronetEngineBuilder setLibraryLoader(CronetEngine.Builder.LibraryLoader libraryLoader) {
        return this;
    }
}
