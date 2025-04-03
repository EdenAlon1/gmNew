package defpackage;

import android.content.Context;
import android.os.StrictMode;
import java.util.Iterator;
import java.util.Set;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
import org.chromium.net.RequestFinishedInfo;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evdh implements fbba {
    public static CronetEngine a(Object obj, Set set) {
        evdi evdiVar = (evdi) obj;
        ekzz f = eleg.f("CronetConfigurationModule#getCachedCronetEngine");
        try {
            ExperimentalCronetEngine experimentalCronetEngine = evdiVar.j;
            if (experimentalCronetEngine == null) {
                synchronized (evdiVar.k) {
                    if (evdiVar.j == null) {
                        Context context = evdiVar.a;
                        Set<evdf> set2 = evdiVar.b;
                        Set set3 = evdiVar.c;
                        emxc emxcVar = evdiVar.d;
                        emxc emxcVar2 = evdiVar.e;
                        ffbr ffbrVar = evdiVar.f;
                        ffbr ffbrVar2 = evdiVar.g;
                        ffbr ffbrVar3 = evdiVar.h;
                        emxc emxcVar3 = evdiVar.i;
                        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                        try {
                            try {
                                Object obj2 = ((emxn) emxcVar).a;
                                ExperimentalCronetEngine.Builder b = ((evdc) obj2).c() != null ? ((evdc) obj2).c().b() : null;
                                if (b == null) {
                                    b = new ExperimentalCronetEngine.Builder(context);
                                }
                                for (evdf evdfVar : set2) {
                                    String a = evdfVar.a();
                                    evdfVar.c();
                                    evdfVar.b();
                                    b.addQuicHint(a, 443, 443);
                                }
                                emxc emxcVar4 = (emxc) ((fbbb) ffbrVar).a;
                                if (emxcVar4.g() && set3.isEmpty()) {
                                    throw new IllegalArgumentException("Google digests were provided, but no hostnames were pinned - this is either a security vulnerability or a waste of APK size. Add hostnames, or remove the dep on google digests.");
                                }
                                if (!set3.isEmpty() && !emxcVar4.g()) {
                                    throw new IllegalArgumentException("Pinning was requested, but digests weren't provided. Add a dependency on the google digests.");
                                }
                                enqu listIterator = ((enpd) set3).listIterator();
                                while (listIterator.hasNext()) {
                                    evde evdeVar = (evde) listIterator.next();
                                    b.addPublicKeyPins(evdeVar.a(), (Set<byte[]>) emxcVar4.c(), evdeVar.c(), evdeVar.b());
                                }
                                threadPolicy = StrictMode.getThreadPolicy();
                                try {
                                    StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                                    b.enableQuic(true);
                                    b.enableBrotli(false);
                                    StrictMode.setThreadPolicy(threadPolicy);
                                    StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                                    b.enableHttpCache(0, 0L);
                                    b.enableNetworkQualityEstimator(false);
                                    ExperimentalCronetEngine build = b.build();
                                    StrictMode.setThreadPolicy(threadPolicy);
                                    evdiVar.j = build;
                                } finally {
                                }
                            } catch (IllegalStateException e) {
                                throw e;
                            }
                        } finally {
                        }
                    }
                }
                experimentalCronetEngine = evdiVar.j;
            }
            f.close();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                experimentalCronetEngine.addRequestFinishedListener((RequestFinishedInfo.Listener) it.next());
            }
            experimentalCronetEngine.getClass();
            return experimentalCronetEngine;
        } catch (Throwable th) {
            try {
                f.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
