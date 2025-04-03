package org.chromium.net.impl;

import android.content.Context;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.Trace;
import android.util.Log;
import defpackage.a;
import defpackage.eyee;
import defpackage.eyhm;
import defpackage.fidy;
import defpackage.fief;
import defpackage.fiev;
import defpackage.figj;
import defpackage.figk;
import defpackage.figl;
import defpackage.fign;
import defpackage.figp;
import defpackage.figx;
import defpackage.figy;
import defpackage.figz;
import defpackage.fihq;
import defpackage.fihu;
import defpackage.fihv;
import defpackage.filn;
import internal.J.N;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class CronetLibraryLoader {
    public static figz d;
    public static fihu e;
    private static boolean g;
    private static final Object f = new Object();
    private static final String h = "cronet.".concat(ImplVersion.getCronetVersion());
    public static final String a = "CronetLibraryLoader";
    private static final HandlerThread i = new HandlerThread("CronetInit");
    public static final ConditionVariable b = new ConditionVariable();
    public static final ConditionVariable c = new ConditionVariable();

    public static figz a() {
        if (d == null) {
            new fiev("CronetLibraryLoader#getHttpFlags waiting for HTTP flags load");
            try {
                c.block();
                Trace.endSection();
            } catch (Throwable th) {
                try {
                    Trace.endSection();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } else {
            c.block();
        }
        return d;
    }

    public static void b(Runnable runnable) {
        HandlerThread handlerThread = i;
        if (handlerThread.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            new Handler(handlerThread.getLooper()).post(runnable);
        }
    }

    public static boolean c(Context context, fihq fihqVar, boolean z) {
        int i2;
        new fiev("CronetLibraryLoader#ensureInitialized");
        try {
            synchronized (f) {
                if (g) {
                    Trace.endSection();
                    return false;
                }
                fidy.a = context;
                HandlerThread handlerThread = i;
                if (!handlerThread.isAlive()) {
                    new fiev("CronetLibraryLoader#ensureInitialized starting init thread");
                    try {
                        handlerThread.start();
                        b(new Runnable() { // from class: fihs
                            /* JADX WARN: Code restructure failed: missing block: B:128:0x029b, code lost:
                            
                                r17 = r8;
                                r0 = new defpackage.figz(r5);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:129:0x02a2, code lost:
                            
                                android.os.Trace.endSection();
                                org.chromium.net.impl.CronetLibraryLoader.d = r0;
                                org.chromium.net.impl.CronetLibraryLoader.e.a = (int) (android.os.SystemClock.uptimeMillis() - r3);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:130:0x02b1, code lost:
                            
                                android.os.Trace.endSection();
                                org.chromium.net.impl.CronetLibraryLoader.c.open();
                                r0 = (defpackage.figy) org.chromium.net.impl.CronetLibraryLoader.d.a().get("Cronet_log_me");
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:131:0x02c7, code lost:
                            
                                if (r0 == null) goto L168;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:132:0x02c9, code lost:
                            
                                r1 = org.chromium.net.impl.CronetLibraryLoader.a;
                                r0 = r0.d();
                                r1 = "cn_".concat(java.lang.String.valueOf(r1));
                                r3 = java.util.Locale.US;
                                r4 = new java.lang.Object[1];
                                r4[r17] = r0;
                                android.util.Log.i(r1, java.lang.String.format(r3, "HTTP flags log line: %s", r4));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:133:0x02e8, code lost:
                            
                                r0 = new java.util.ArrayList();
                                r1 = org.chromium.net.impl.CronetLibraryLoader.d.a().entrySet().iterator();
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:135:0x02ff, code lost:
                            
                                if (r1.hasNext() == false) goto L275;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:136:0x0301, code lost:
                            
                                r2 = (java.util.Map.Entry) r1.next();
                                r4 = java.lang.Long.valueOf(defpackage.filx.a((java.lang.String) r2.getKey()));
                                r2 = (defpackage.figy) r2.getValue();
                                r5 = r2.f() - 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:137:0x0323, code lost:
                            
                                if (r5 == 0) goto L181;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:138:0x0325, code lost:
                            
                                if (r5 == 1) goto L180;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:140:0x0328, code lost:
                            
                                if (r5 == 2) goto L179;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:141:0x032a, code lost:
                            
                                if (r5 == 3) goto L178;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:142:0x032c, code lost:
                            
                                r5 = defpackage.filx.b(r2.c().I());
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:144:0x0364, code lost:
                            
                                r0.add(new android.util.Pair(r4, java.lang.Long.valueOf(r5)));
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:145:0x0339, code lost:
                            
                                r5 = defpackage.filx.a(r2.d());
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:147:0x0342, code lost:
                            
                                r5 = java.lang.Math.round(r2.a() * 1.0E9d);
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:149:0x0352, code lost:
                            
                                r5 = r2.b();
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:152:0x035d, code lost:
                            
                                if (r2.e() == false) goto L184;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:153:0x035f, code lost:
                            
                                r5 = 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:155:0x0362, code lost:
                            
                                r5 = 0;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:158:0x036f, code lost:
                            
                                java.util.Collections.sort(r0, new defpackage.fiht());
                                org.chromium.net.impl.CronetLibraryLoader.e.c = new java.util.ArrayList();
                                org.chromium.net.impl.CronetLibraryLoader.e.d = new java.util.ArrayList();
                                r1 = r0.size();
                                r8 = r17;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:159:0x038f, code lost:
                            
                                if (r8 >= r1) goto L282;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:160:0x0391, code lost:
                            
                                r2 = (android.util.Pair) r0.get(r8);
                                org.chromium.net.impl.CronetLibraryLoader.e.c.add((java.lang.Long) r2.first);
                                org.chromium.net.impl.CronetLibraryLoader.e.d.add((java.lang.Long) r2.second);
                                r8 = r8 + 1;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:162:0x03b0, code lost:
                            
                                org.chromium.net.NetworkChangeNotifier.init();
                                org.chromium.net.NetworkChangeNotifier.registerToReceiveNotificationsAlways();
                                new defpackage.fiev("CronetLibraryLoader#initializeOnInitThread waiting on library load");
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:164:0x03bd, code lost:
                            
                                org.chromium.net.impl.CronetLibraryLoader.b.block();
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:165:0x03c2, code lost:
                            
                                android.os.Trace.endSection();
                                new defpackage.fiev("CronetLibraryLoader#ensureInitialized calling cronetInitOnInitThread");
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:167:0x03cc, code lost:
                            
                                internal.J.N.MROCxiBo();
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:168:0x03cf, code lost:
                            
                                android.os.Trace.endSection();
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:169:0x03d2, code lost:
                            
                                android.os.Trace.endSection();
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:170:0x03d5, code lost:
                            
                                return;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:172:0x03d6, code lost:
                            
                                r0 = move-exception;
                             */
                            /* JADX WARN: Code restructure failed: missing block: B:182:0x03e1, code lost:
                            
                                r0 = move-exception;
                             */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Removed duplicated region for block: B:213:0x010e  */
                            /* JADX WARN: Removed duplicated region for block: B:215:0x0110  */
                            /* JADX WARN: Removed duplicated region for block: B:63:0x026b A[Catch: RuntimeException -> 0x0278, all -> 0x03ec, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0278, blocks: (B:18:0x0159, B:19:0x0165, B:21:0x016b, B:23:0x0178, B:26:0x0180, B:28:0x0185, B:29:0x018d, B:32:0x0197, B:34:0x019e, B:37:0x01a8, B:44:0x01b2, B:52:0x01d2, B:68:0x01e3, B:75:0x0200, B:76:0x0209, B:63:0x026b, B:83:0x020a, B:85:0x020f, B:86:0x0216, B:87:0x0214, B:88:0x021a, B:90:0x0221, B:91:0x0226, B:92:0x022a, B:94:0x022e, B:95:0x0238, B:97:0x023c, B:99:0x0240, B:100:0x024b, B:102:0x024f, B:104:0x0253, B:105:0x025e, B:108:0x0262), top: B:17:0x0159, outer: #5 }] */
                            /* JADX WARN: Removed duplicated region for block: B:66:0x0274 A[SYNTHETIC] */
                            @Override // java.lang.Runnable
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final void run() {
                                /*
                                    Method dump skipped, instructions count: 1037
                                    To view this dump add '--comments-level debug' option
                                */
                                throw new UnsupportedOperationException("Method not decompiled: defpackage.fihs.run():void");
                            }
                        });
                        Trace.endSection();
                    } finally {
                    }
                }
                if (!z) {
                    new fiev("CronetLibraryLoader#ensureInitialized loading native library");
                    try {
                        if (fihqVar.e() != null) {
                            fihqVar.e().loadLibrary(h);
                        } else {
                            System.loadLibrary(h);
                        }
                        Trace.endSection();
                    } finally {
                    }
                }
                new fiev("CronetLibraryLoader#ensureInitialized calling nativeInit");
                try {
                    N.MAuYp$hS();
                    Trace.endSection();
                    String cronetVersion = ImplVersion.getCronetVersion();
                    if (!cronetVersion.equals(fihv.a())) {
                        throw new RuntimeException(String.format("Expected Cronet version number %s, actual version number %s.", cronetVersion, fihv.a()));
                    }
                    Log.i("cn_".concat(String.valueOf(a)), String.format(Locale.US, "Cronet version: %s, arch: %s", cronetVersion, System.getProperty("os.arch")));
                    if (!Log.isLoggable("chromium", 2)) {
                        i2 = Log.isLoggable("chromium", 3) ? -1 : -2;
                        b.open();
                        g = true;
                        Trace.endSection();
                        return true;
                    }
                    N.Mrxu2pQS(i2);
                    b.open();
                    g = true;
                    Trace.endSection();
                    return true;
                } finally {
                    try {
                        Trace.endSection();
                    } catch (Throwable th) {
                        th.addSuppressed(th);
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                Trace.endSection();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private static void ensureInitializedFromNative() {
        c(fidy.a, null, true);
    }

    private static byte[] getBaseFeatureOverrides() {
        figj figjVar;
        figz a2 = a();
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : a2.a().entrySet()) {
            try {
                String str = (String) entry.getKey();
                figy figyVar = (figy) entry.getValue();
                if (str.startsWith("ChromiumBaseFeature_")) {
                    String substring = str.substring(20);
                    figj figjVar2 = new figj();
                    int indexOf = substring.indexOf("_PARAM_");
                    if (indexOf < 0) {
                        figjVar2.a = substring;
                    } else {
                        figjVar2.a = substring.substring(0, indexOf);
                        figjVar2.b = substring.substring(indexOf + 7);
                    }
                    figjVar = figjVar2;
                } else {
                    figjVar = null;
                }
                if (figjVar != null) {
                    figl figlVar = (figl) hashMap.get(figjVar.a);
                    if (figlVar == null) {
                        figlVar = fign.DEFAULT_INSTANCE.createBuilder();
                        hashMap.put(figjVar.a, figlVar);
                    }
                    String str2 = figjVar.b;
                    if (str2 == null) {
                        int f2 = figyVar.f();
                        if (f2 != 1) {
                            throw new IllegalArgumentException("HTTP flag has type " + figx.a(f2) + ", but only boolean flags are supported as base::Feature overrides");
                        }
                        boolean e2 = figyVar.e();
                        figlVar.copyOnWrite();
                        fign fignVar = (fign) figlVar.instance;
                        int i2 = fign.ENABLED_FIELD_NUMBER;
                        fignVar.bitField0_ |= 1;
                        fignVar.enabled_ = e2;
                    } else {
                        int f3 = figyVar.f() - 1;
                        eyee c2 = f3 != 0 ? f3 != 1 ? f3 != 2 ? f3 != 3 ? figyVar.c() : eyee.y(figyVar.d(), StandardCharsets.UTF_8) : eyee.y(Float.toString(figyVar.a()), StandardCharsets.UTF_8) : eyee.y(Long.toString(figyVar.b(), 10), StandardCharsets.UTF_8) : eyee.y(true != figyVar.e() ? "false" : "true", StandardCharsets.UTF_8);
                        c2.getClass();
                        figlVar.copyOnWrite();
                        fign fignVar2 = (fign) figlVar.instance;
                        int i3 = fign.ENABLED_FIELD_NUMBER;
                        eyhm<String, eyee> eyhmVar = fignVar2.params_;
                        if (!eyhmVar.b) {
                            fignVar2.params_ = eyhmVar.a();
                        }
                        fignVar2.params_.put(str2, c2);
                    }
                }
            } catch (RuntimeException e3) {
                throw new IllegalArgumentException("Could not parse HTTP flag `" + ((String) entry.getKey()) + "` as a base::Feature override", e3);
            }
        }
        figk createBuilder = figp.DEFAULT_INSTANCE.createBuilder();
        for (Map.Entry entry2 : hashMap.entrySet()) {
            String str3 = (String) entry2.getKey();
            fign build = ((figl) entry2.getValue()).build();
            str3.getClass();
            build.getClass();
            createBuilder.copyOnWrite();
            figp figpVar = (figp) createBuilder.instance;
            eyhm<String, fign> eyhmVar2 = figpVar.featureStates_;
            if (!eyhmVar2.b) {
                figpVar.featureStates_ = eyhmVar2.a();
            }
            figpVar.featureStates_.put(str3, build);
        }
        return createBuilder.build().toByteArray();
    }

    private static String getDefaultUserAgent() {
        return filn.a(fidy.a);
    }

    private static void setNetworkThreadPriorityOnNetworkThread(int i2) {
        fief.a(a, a.h(i2, "Setting network thread priority to "), new Object[0]);
        Process.setThreadPriority(i2);
    }
}
