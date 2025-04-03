package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Debug;
import android.os.PowerManager;
import android.os.Process;
import android.os.StrictMode;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ecoo {
    public static final /* synthetic */ int b = 0;
    public final Context a;
    private final echj c;
    private final ffbr d;
    private final ffbr e;

    static {
        emys.a(new emyl() { // from class: ecol
            @Override // defpackage.emyl
            public final Object get() {
                return ecoo.a();
            }
        });
    }

    public ecoo(final ffbr ffbrVar, Context context, ffbr ffbrVar2, final ffbr ffbrVar3, echj echjVar) {
        this.c = echjVar;
        ffbrVar.getClass();
        final emyl a = emys.a(new emyl() { // from class: ecoj
            @Override // defpackage.emyl
            public final Object get() {
                return (ecnn) ffbr.this.b();
            }
        });
        this.d = new ffbr() { // from class: ecok
            @Override // defpackage.ffbr, defpackage.ffbq
            public final Object b() {
                int i = ecoo.b;
                return (ecnn) (((Boolean) ffbr.this.b()).booleanValue() ? a.get() : ffbrVar.b());
            }
        };
        this.a = context;
        this.e = ffbrVar2;
    }

    static /* synthetic */ emxc a() {
        try {
            try {
                try {
                    return emxc.j(Debug.MemoryInfo.class.getDeclaredMethod("getOtherPss", Integer.TYPE));
                } catch (Error | Exception e) {
                    e = e;
                    ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 'h', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) failure");
                    return emux.a;
                }
            } catch (NoSuchMethodException e2) {
                ((enrr) ((enrr) ((enrr) ecdj.a.e()).g(e2)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 'f', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) not found");
                return emux.a;
            }
        } catch (Error e3) {
            e = e3;
            ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "<init>", 'h', "MemoryUsageCapture.java")).q("MemoryInfo.getOtherPss(which) failure");
            return emux.a;
        }
    }

    private static Long d(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        try {
            if (matcher.find()) {
                String group = matcher.group(1);
                emyw.e(group);
                return Long.valueOf(Long.parseLong(group));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final fgmq b(int i, int i2, String str, String str2, emyl emylVar) {
        ActivityManager.MemoryInfo memoryInfo;
        Object b2 = this.d.b();
        efbd.b();
        ecnn ecnnVar = (ecnn) b2;
        ecnnVar.k();
        econ econVar = null;
        if (ecnnVar.e()) {
            ActivityManager.MemoryInfo memoryInfo2 = new ActivityManager.MemoryInfo();
            Context context = this.a;
            if (echh.a == null) {
                synchronized (echh.class) {
                    if (echh.a == null) {
                        Object systemService = context.getSystemService("activity");
                        systemService.getClass();
                        echh.a = (ActivityManager) systemService;
                    }
                }
            }
            echh.a.getMemoryInfo(memoryInfo2);
            memoryInfo = memoryInfo2;
        } else {
            memoryInfo = null;
        }
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                File file = ((Boolean) this.e.b()).booleanValue() ? new File(a.f(i2, "/proc/", "/status")) : new File("/proc/self/status");
                Charset defaultCharset = Charset.defaultCharset();
                defaultCharset.getClass();
                String str3 = new String(eoen.a(file), defaultCharset);
                if (str3.isEmpty()) {
                    ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "procStatusFromString", 252, "MemoryUsageCapture.java")).q("Null or empty proc status");
                } else {
                    econ econVar2 = new econ();
                    econVar2.f = d(econ.a, str3);
                    econVar2.g = d(econ.b, str3);
                    econVar2.h = d(econ.c, str3);
                    econVar2.i = d(econ.d, str3);
                    econVar2.j = d(econ.e, str3);
                    econVar = econVar2;
                }
            } catch (IOException e) {
                ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/memory/MemoryUsageCapture", "getProcStatus", (char) 289, "MemoryUsageCapture.java")).q("Error reading proc status");
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            fgmo fgmoVar = (fgmo) fgmq.a.createBuilder();
            fgmm fgmmVar = (fgmm) fgmn.a.createBuilder();
            fgmi fgmiVar = (fgmi) fgmj.a.createBuilder();
            if (memoryInfo != null) {
                long j = memoryInfo.availMem >> 10;
                fgmiVar.copyOnWrite();
                fgmj fgmjVar = (fgmj) fgmiVar.instance;
                fgmjVar.b |= 131072;
                fgmjVar.s = (int) j;
                long j2 = memoryInfo.totalMem >> 20;
                fgmiVar.copyOnWrite();
                fgmj fgmjVar2 = (fgmj) fgmiVar.instance;
                fgmjVar2.b |= 262144;
                fgmjVar2.t = (int) j2;
            }
            if (econVar != null) {
                Long l = econVar.f;
                if (l != null) {
                    long longValue = l.longValue();
                    fgmiVar.copyOnWrite();
                    fgmj fgmjVar3 = (fgmj) fgmiVar.instance;
                    fgmjVar3.b |= 524288;
                    fgmjVar3.u = longValue;
                }
                Long l2 = econVar.g;
                if (l2 != null) {
                    long longValue2 = l2.longValue();
                    fgmiVar.copyOnWrite();
                    fgmj fgmjVar4 = (fgmj) fgmiVar.instance;
                    fgmjVar4.b |= 1048576;
                    fgmjVar4.v = longValue2;
                }
                Long l3 = econVar.h;
                if (l3 != null) {
                    long longValue3 = l3.longValue();
                    fgmiVar.copyOnWrite();
                    fgmj fgmjVar5 = (fgmj) fgmiVar.instance;
                    fgmjVar5.b |= 2097152;
                    fgmjVar5.w = longValue3;
                }
                Long l4 = econVar.i;
                if (l4 != null) {
                    long longValue4 = l4.longValue();
                    fgmiVar.copyOnWrite();
                    fgmj fgmjVar6 = (fgmj) fgmiVar.instance;
                    fgmjVar6.b |= 4194304;
                    fgmjVar6.x = longValue4;
                }
                Long l5 = econVar.j;
                if (l5 != null) {
                    long longValue5 = l5.longValue();
                    fgmiVar.copyOnWrite();
                    fgmj fgmjVar7 = (fgmj) fgmiVar.instance;
                    fgmjVar7.b |= VCardConfig.FLAG_REFRAIN_IMAGE_EXPORT;
                    fgmjVar7.y = longValue5;
                }
            }
            fgmj fgmjVar8 = (fgmj) fgmiVar.build();
            fgmmVar.copyOnWrite();
            fgmn fgmnVar = (fgmn) fgmmVar.instance;
            fgmjVar8.getClass();
            fgmnVar.c = fgmjVar8;
            fgmnVar.b |= 1;
            fgmoVar.copyOnWrite();
            fgmq fgmqVar = (fgmq) fgmoVar.instance;
            fgmn fgmnVar2 = (fgmn) fgmmVar.build();
            fgmnVar2.getClass();
            fgmqVar.c = fgmnVar2;
            fgmqVar.b |= 1;
            fgpa fgpaVar = (fgpa) fgpb.a.createBuilder();
            fgoz b3 = echj.b(str, this.c.a.a(emylVar), (echk) emylVar.get());
            fgpaVar.copyOnWrite();
            fgpb fgpbVar = (fgpb) fgpaVar.instance;
            b3.getClass();
            fgpbVar.c = b3;
            fgpbVar.b |= 1;
            fgmoVar.copyOnWrite();
            fgmq fgmqVar2 = (fgmq) fgmoVar.instance;
            fgpb fgpbVar2 = (fgpb) fgpaVar.build();
            fgpbVar2.getClass();
            fgmqVar2.d = fgpbVar2;
            fgmqVar2.b |= 2;
            fgmk fgmkVar = (fgmk) fgml.a.createBuilder();
            Context context2 = this.a;
            ActivityManager activityManager = echh.a;
            Object systemService2 = context2.getSystemService("power");
            systemService2.getClass();
            boolean isInteractive = ((PowerManager) systemService2).isInteractive();
            fgmkVar.copyOnWrite();
            fgml fgmlVar = (fgml) fgmkVar.instance;
            fgmlVar.b |= 1;
            fgmlVar.c = isInteractive;
            fgmoVar.copyOnWrite();
            fgmq fgmqVar3 = (fgmq) fgmoVar.instance;
            fgml fgmlVar2 = (fgml) fgmkVar.build();
            fgmlVar2.getClass();
            fgmqVar3.f = fgmlVar2;
            fgmqVar3.b |= 8;
            fgmoVar.copyOnWrite();
            fgmq fgmqVar4 = (fgmq) fgmoVar.instance;
            fgmqVar4.e = i - 1;
            fgmqVar4.b |= 4;
            if (str2 != null) {
                fgmoVar.copyOnWrite();
                fgmq fgmqVar5 = (fgmq) fgmoVar.instance;
                fgmqVar5.b |= 16;
                fgmqVar5.g = str2;
            }
            return (fgmq) fgmoVar.build();
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th;
        }
    }

    final fgmq c(int i, String str) {
        return b(i, Process.myPid(), null, str, emys.a(new emyl() { // from class: ecom
            @Override // defpackage.emyl
            public final Object get() {
                return echh.a(ecoo.this.a, "getMemoryUsageMetric");
            }
        }));
    }
}
