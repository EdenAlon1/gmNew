package com.google.android.libraries.performance.primes.metrics.crash;

import android.os.StrictMode;
import android.util.Pair;
import com.google.android.libraries.performance.primes.metrics.crash.NativeCrashHandlerImpl;
import defpackage.ecdj;
import defpackage.eckt;
import defpackage.ecky;
import defpackage.eclf;
import defpackage.emxc;
import defpackage.emxn;
import defpackage.enrr;
import defpackage.eyel;
import defpackage.eyfc;
import defpackage.eyfy;
import defpackage.eygr;
import defpackage.eyib;
import defpackage.ezod;
import defpackage.ezoe;
import defpackage.ezof;
import defpackage.ezog;
import defpackage.ffbr;
import defpackage.fgpo;
import defpackage.fgpu;
import java.nio.ByteBuffer;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class NativeCrashHandlerImpl implements eclf {
    final CountDownLatch a = new CountDownLatch(1);
    final CountDownLatch b = new CountDownLatch(1);
    private boolean c;
    private final emxc d;
    private final ffbr e;

    public NativeCrashHandlerImpl(emxc emxcVar, ffbr ffbrVar) {
        this.d = emxcVar;
        this.e = ffbrVar;
    }

    private static native Pair<ByteBuffer, Thread> awaitSignal();

    private static native boolean initializeSignalHandler(boolean z);

    private static native void unblockSignalHandler();

    @Override // defpackage.eclf
    public final synchronized void a(final eckt ecktVar) {
        if (this.c) {
            return;
        }
        this.c = true;
        Thread thread = new Thread(new Runnable() { // from class: eclg
            @Override // java.lang.Runnable
            public final void run() {
                NativeCrashHandlerImpl.this.b(ecktVar);
            }
        }, "Primes-nativecrash-sidecar");
        thread.setDaemon(true);
        thread.setPriority(10);
        thread.start();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ffbr, java.lang.Object] */
    public final /* synthetic */ void b(eckt ecktVar) {
        ezod ezodVar;
        if (!((Boolean) ((emxn) this.d).a.b()).booleanValue()) {
            this.b.countDown();
            return;
        }
        try {
            System.loadLibrary("native_crash_handler_jni");
            if (!initializeSignalHandler(false)) {
                ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "initialize", 76, "NativeCrashHandlerImpl.java")).q("unable to initialize signal handler");
                return;
            }
            try {
                this.a.countDown();
                Pair<ByteBuffer, Thread> awaitSignal = awaitSignal();
                if (awaitSignal != null) {
                    try {
                        ezodVar = (ezod) ezog.a.createBuilder();
                        eyel L = eyel.L((ByteBuffer) awaitSignal.first);
                        eyfc eyfcVar = eyfc.a;
                        eyib eyibVar = eyib.a;
                        ezodVar.mergeFrom(L, eyfc.a);
                    } catch (Throwable unused) {
                        ezodVar = null;
                    }
                    try {
                        Thread thread = (Thread) awaitSignal.second;
                        if (ezodVar != null && thread != null) {
                            String name = thread.getName();
                            ezodVar.copyOnWrite();
                            ezog ezogVar = (ezog) ezodVar.instance;
                            ezog ezogVar2 = ezog.a;
                            name.getClass();
                            ezogVar.b |= 32;
                            ezogVar.d = name;
                            long id = thread.getId();
                            ezodVar.copyOnWrite();
                            ezog ezogVar3 = (ezog) ezodVar.instance;
                            ezogVar3.b |= 16;
                            ezogVar3.c = id;
                            for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                                ezoe ezoeVar = (ezoe) ezof.a.createBuilder();
                                String className = stackTraceElement.getClassName();
                                ezoeVar.copyOnWrite();
                                ezof ezofVar = (ezof) ezoeVar.instance;
                                className.getClass();
                                ezofVar.b |= 1;
                                ezofVar.c = className;
                                String methodName = stackTraceElement.getMethodName();
                                ezoeVar.copyOnWrite();
                                ezof ezofVar2 = (ezof) ezoeVar.instance;
                                methodName.getClass();
                                ezofVar2.b |= 2;
                                ezofVar2.d = methodName;
                                int lineNumber = stackTraceElement.getLineNumber();
                                ezoeVar.copyOnWrite();
                                ezof ezofVar3 = (ezof) ezoeVar.instance;
                                ezofVar3.b |= 8;
                                ezofVar3.f = lineNumber;
                                String fileName = stackTraceElement.getFileName();
                                if (fileName != null) {
                                    ezoeVar.copyOnWrite();
                                    ezof ezofVar4 = (ezof) ezoeVar.instance;
                                    ezofVar4.b |= 4;
                                    ezofVar4.e = fileName;
                                }
                                ezodVar.copyOnWrite();
                                ezog ezogVar4 = (ezog) ezodVar.instance;
                                ezof ezofVar5 = (ezof) ezoeVar.build();
                                ezofVar5.getClass();
                                eygr eygrVar = ezogVar4.e;
                                if (!eygrVar.c()) {
                                    ezogVar4.e = eyfy.mutableCopy(eygrVar);
                                }
                                ezogVar4.e.add(ezofVar5);
                            }
                        }
                    } catch (Throwable th) {
                        ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(th)).h("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "initialize", 'o', "NativeCrashHandlerImpl.java")).q("unable to populate java stack frames");
                    }
                } else {
                    ezodVar = null;
                }
                if (((Boolean) this.e.b()).booleanValue()) {
                    Thread.getAllStackTraces();
                }
                ezog ezogVar5 = ezodVar != null ? (ezog) ezodVar.build() : null;
                StrictMode.setThreadPolicy(StrictMode.ThreadPolicy.LAX);
                StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                fgpo a = ((ecky) ecktVar).g.a(((ecky) ecktVar).a);
                a.copyOnWrite();
                fgpu fgpuVar = (fgpu) a.instance;
                fgpu fgpuVar2 = fgpu.a;
                fgpuVar.g = 5;
                fgpuVar.b |= 16;
                if (ezogVar5 != null) {
                    a.copyOnWrite();
                    fgpu fgpuVar3 = (fgpu) a.instance;
                    fgpuVar3.j = ezogVar5;
                    fgpuVar3.b |= 512;
                }
                ((ecky) ecktVar).l((fgpu) a.build());
            } finally {
                unblockSignalHandler();
            }
        } catch (UnsatisfiedLinkError e) {
            ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/crash/NativeCrashHandlerImpl", "initialize", 'H', "NativeCrashHandlerImpl.java")).q("unable to load native_crash_handler_jni");
        }
    }
}
