package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.zip.GZIPOutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eclt extends eclm implements ecje {
    public final ecjc a;
    public final Context b;
    public final Executor c;
    public final ffbr d;
    public final eceu e;
    public final fazb f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ecfd j;
    public final ecll k;

    public eclt(ecjd ecjdVar, Context context, Executor executor, ecll ecllVar, ffbr ffbrVar, fazb fazbVar, eceu eceuVar, ecfd ecfdVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = ecjdVar.a(executor, fazbVar, null);
        this.b = context;
        this.c = executor;
        this.k = ecllVar;
        this.d = ffbrVar;
        this.e = eceuVar;
        this.j = ecfdVar;
        this.f = fazbVar;
        this.g = ffbrVar2;
        this.h = ffbrVar3;
        this.i = ffbrVar4;
    }

    @Override // defpackage.ecje
    public final void n() {
        erqt.n(new erog() { // from class: eclp
            @Override // defpackage.erog
            public final ListenableFuture a() {
                final eclt ecltVar = eclt.this;
                return dubc.b(ecltVar.b, new Runnable() { // from class: eclq
                    @Override // java.lang.Runnable
                    public final void run() {
                        final eclt ecltVar2 = eclt.this;
                        erqt.n(new erog() { // from class: ecls
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                String processName;
                                List historicalProcessExitReasons;
                                String processName2;
                                String processName3;
                                int status;
                                long timestamp;
                                long pss;
                                long rss;
                                boolean isLowMemoryKillReportSupported;
                                int reason;
                                int i;
                                int i2;
                                int i3;
                                int importance;
                                final int pid;
                                long timestamp2;
                                String str;
                                long j;
                                ListenableFuture i4;
                                int i5;
                                long parseLong;
                                long j2;
                                Long valueOf;
                                InputStream traceInputStream;
                                String description;
                                long timestamp3;
                                final eclt ecltVar3 = eclt.this;
                                String concat = String.valueOf(ecltVar3.b.getPackageName()).concat(((ecli) ecltVar3.f.b()).d());
                                processName = Application.getProcessName();
                                if (!processName.equals(concat)) {
                                    return erre.a;
                                }
                                if (!((Boolean) ecltVar3.g.b()).booleanValue()) {
                                    return erre.a;
                                }
                                final ecll ecllVar = ecltVar3.k;
                                String string = ((SharedPreferences) ecltVar3.d.b()).getString("lastExitProcessName", null);
                                long j3 = ((SharedPreferences) ecltVar3.d.b()).getLong("lastExitTimestamp", -1L);
                                ActivityManager activityManager = (ActivityManager) ecllVar.a.getSystemService("activity");
                                activityManager.getClass();
                                historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(ecllVar.a.getPackageName(), 0, 0);
                                int i6 = engw.d;
                                engr engrVar = new engr();
                                Iterator it = historicalProcessExitReasons.iterator();
                                while (it.hasNext()) {
                                    ApplicationExitInfo m = aeb$$ExternalSyntheticApiModelOutline0.m(it.next());
                                    processName2 = m.getProcessName();
                                    if (processName2.equals(string)) {
                                        timestamp3 = m.getTimestamp();
                                        if (timestamp3 == j3) {
                                            return erny.g(erny.f(erqt.e(engrVar.g()), new emwl() { // from class: eclk
                                                @Override // defpackage.emwl
                                                public final Object apply(Object obj) {
                                                    return engw.n((List) obj);
                                                }
                                            }, erpp.a), new eroh() { // from class: ecln
                                                /* JADX WARN: Multi-variable type inference failed */
                                                @Override // defpackage.eroh
                                                public final ListenableFuture a(Object obj) {
                                                    final engw engwVar = (engw) obj;
                                                    if (engwVar.isEmpty()) {
                                                        return erre.a;
                                                    }
                                                    final eclt ecltVar4 = eclt.this;
                                                    fgku fgkuVar = (fgku) ecltVar4.h.b();
                                                    fgkr fgkrVar = (fgkr) fgks.a.createBuilder();
                                                    int size = engwVar.size();
                                                    fgkrVar.copyOnWrite();
                                                    fgks fgksVar = (fgks) fgkrVar.instance;
                                                    fgksVar.b |= 2;
                                                    fgksVar.e = size;
                                                    fgkrVar.copyOnWrite();
                                                    fgks fgksVar2 = (fgks) fgkrVar.instance;
                                                    fgkuVar.getClass();
                                                    fgksVar2.d = fgkuVar;
                                                    fgksVar2.b |= 1;
                                                    HashSet hashSet = new HashSet();
                                                    for (int i7 = 0; i7 < fgkuVar.b.size(); i7++) {
                                                        int a = fgkp.a(fgkuVar.b.d(i7));
                                                        if (a == 0) {
                                                            a = 1;
                                                        }
                                                        hashSet.add(Integer.valueOf(a - 1));
                                                    }
                                                    int size2 = engwVar.size();
                                                    for (int i8 = 0; i8 < size2; i8++) {
                                                        fgkq fgkqVar = (fgkq) engwVar.get(i8);
                                                        int a2 = fgkp.a(fgkqVar.d);
                                                        if (a2 == 0) {
                                                            a2 = 1;
                                                        }
                                                        if (hashSet.contains(Integer.valueOf(a2 - 1))) {
                                                            fgkrVar.copyOnWrite();
                                                            fgks fgksVar3 = (fgks) fgkrVar.instance;
                                                            fgkqVar.getClass();
                                                            eygr eygrVar = fgksVar3.c;
                                                            if (!eygrVar.c()) {
                                                                fgksVar3.c = eyfy.mutableCopy(eygrVar);
                                                            }
                                                            fgksVar3.c.add(fgkqVar);
                                                        }
                                                    }
                                                    fgks fgksVar4 = (fgks) fgkrVar.build();
                                                    ecjc ecjcVar = ecltVar4.a;
                                                    eciu m2 = eciv.m();
                                                    fgqw fgqwVar = (fgqw) fgqx.a.createBuilder();
                                                    fgqwVar.copyOnWrite();
                                                    fgqx fgqxVar = (fgqx) fgqwVar.instance;
                                                    fgksVar4.getClass();
                                                    fgqxVar.r = fgksVar4;
                                                    fgqxVar.b |= 131072;
                                                    m2.f((fgqx) fgqwVar.build());
                                                    return erny.f(ecjcVar.b(m2.a()), new emwl() { // from class: eclr
                                                        /* JADX WARN: Incorrect condition in loop: B:3:0x002d */
                                                        /* JADX WARN: Multi-variable type inference failed */
                                                        @Override // defpackage.emwl
                                                        /*
                                                            Code decompiled incorrectly, please refer to instructions dump.
                                                            To view partially-correct add '--show-bad-code' argument
                                                        */
                                                        public final java.lang.Object apply(java.lang.Object r7) {
                                                            /*
                                                                r6 = this;
                                                                java.lang.Void r7 = (java.lang.Void) r7
                                                                engw r7 = r2
                                                                r0 = 0
                                                                java.lang.Object r7 = r7.get(r0)
                                                                fgkq r7 = (defpackage.fgkq) r7
                                                            Lb:
                                                                eclt r1 = defpackage.eclt.this
                                                                java.lang.String r2 = r7.c
                                                                long r3 = r7.g
                                                                ffbr r1 = r1.d
                                                                java.lang.Object r1 = r1.b()
                                                                android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
                                                                android.content.SharedPreferences$Editor r1 = r1.edit()
                                                                java.lang.String r5 = "lastExitProcessName"
                                                                android.content.SharedPreferences$Editor r1 = r1.putString(r5, r2)
                                                                java.lang.String r2 = "lastExitTimestamp"
                                                                android.content.SharedPreferences$Editor r1 = r1.putLong(r2, r3)
                                                                boolean r1 = r1.commit()
                                                                if (r1 != 0) goto L4f
                                                                int r0 = r0 + 1
                                                                r1 = 3
                                                                if (r0 < r1) goto Lb
                                                                enru r7 = defpackage.ecdj.a
                                                                ensk r7 = r7.j()
                                                                enrr r7 = (defpackage.enrr) r7
                                                                java.lang.String r0 = "updateLastRecordedAppExit"
                                                                r1 = 220(0xdc, float:3.08E-43)
                                                                java.lang.String r2 = "com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl"
                                                                java.lang.String r3 = "ApplicationExitMetricServiceImpl.java"
                                                                ensk r7 = r7.h(r2, r0, r1, r3)
                                                                enrr r7 = (defpackage.enrr) r7
                                                                java.lang.String r0 = "Failed to persist most recent App Exit"
                                                                r7.q(r0)
                                                            L4f:
                                                                r7 = 0
                                                                return r7
                                                            */
                                                            throw new UnsupportedOperationException("Method not decompiled: defpackage.eclr.apply(java.lang.Object):java.lang.Object");
                                                        }
                                                    }, ecltVar4.c);
                                                }
                                            }, erpp.a);
                                        }
                                    }
                                    final fgkm fgkmVar = (fgkm) fgkq.a.createBuilder();
                                    processName3 = m.getProcessName();
                                    fgkmVar.copyOnWrite();
                                    fgkq fgkqVar = (fgkq) fgkmVar.instance;
                                    processName3.getClass();
                                    fgkqVar.b |= 1;
                                    fgkqVar.c = processName3;
                                    status = m.getStatus();
                                    fgkmVar.copyOnWrite();
                                    fgkq fgkqVar2 = (fgkq) fgkmVar.instance;
                                    int i7 = 4;
                                    fgkqVar2.b |= 4;
                                    fgkqVar2.e = status;
                                    timestamp = m.getTimestamp();
                                    fgkmVar.copyOnWrite();
                                    fgkq fgkqVar3 = (fgkq) fgkmVar.instance;
                                    fgkqVar3.b |= 16;
                                    fgkqVar3.g = timestamp;
                                    pss = m.getPss();
                                    fgkmVar.copyOnWrite();
                                    fgkq fgkqVar4 = (fgkq) fgkmVar.instance;
                                    fgkqVar4.b |= 64;
                                    fgkqVar4.i = pss;
                                    rss = m.getRss();
                                    fgkmVar.copyOnWrite();
                                    fgkq fgkqVar5 = (fgkq) fgkmVar.instance;
                                    fgkqVar5.b |= 128;
                                    fgkqVar5.j = rss;
                                    isLowMemoryKillReportSupported = ActivityManager.isLowMemoryKillReportSupported();
                                    fgkmVar.copyOnWrite();
                                    fgkq fgkqVar6 = (fgkq) fgkmVar.instance;
                                    fgkqVar6.b |= 256;
                                    fgkqVar6.k = isLowMemoryKillReportSupported;
                                    reason = m.getReason();
                                    switch (reason) {
                                        case 0:
                                            i = 15;
                                            break;
                                        case 1:
                                            i = 2;
                                            break;
                                        case 2:
                                            i = 3;
                                            break;
                                        case 3:
                                            i = 4;
                                            break;
                                        case 4:
                                            i = 5;
                                            break;
                                        case 5:
                                            i = 6;
                                            break;
                                        case 6:
                                            i = 7;
                                            break;
                                        case 7:
                                            i = 8;
                                            break;
                                        case 8:
                                            i = 9;
                                            break;
                                        case 9:
                                            i = 10;
                                            break;
                                        case 10:
                                            i = 11;
                                            break;
                                        case 11:
                                            i = 12;
                                            break;
                                        case 12:
                                            i = 13;
                                            break;
                                        case 13:
                                            i = 14;
                                            break;
                                        case 14:
                                            i = 100;
                                            break;
                                        default:
                                            i = 0;
                                            break;
                                    }
                                    if (i != 0) {
                                        fgkmVar.copyOnWrite();
                                        i2 = 1;
                                        fgkq fgkqVar7 = (fgkq) fgkmVar.instance;
                                        i3 = 2;
                                        fgkqVar7.d = i - 1;
                                        fgkqVar7.b |= 2;
                                    } else {
                                        i2 = 1;
                                        i3 = 2;
                                        i = 0;
                                    }
                                    importance = m.getImportance();
                                    if (importance == 100) {
                                        i7 = i3;
                                    } else if (importance == 125) {
                                        i7 = 3;
                                    } else if (importance == 200) {
                                        i7 = 5;
                                    } else if (importance == 230) {
                                        i7 = 6;
                                    } else if (importance == 300) {
                                        i7 = 8;
                                    } else if (importance != 325) {
                                        i7 = importance != 350 ? importance != 400 ? importance != 1000 ? 0 : 10 : 9 : 7;
                                    }
                                    if (i7 != 0) {
                                        fgkmVar.copyOnWrite();
                                        fgkq fgkqVar8 = (fgkq) fgkmVar.instance;
                                        fgkqVar8.f = i7 - 1;
                                        fgkqVar8.b |= 8;
                                    }
                                    if (i == 7 && Build.VERSION.SDK_INT >= 33 && ((Boolean) ecllVar.e.b()).booleanValue()) {
                                        try {
                                            traceInputStream = m.getTraceInputStream();
                                            try {
                                                description = m.getDescription();
                                                if (traceInputStream != null && !emxe.c(description)) {
                                                    eyee B = eyee.B(traceInputStream);
                                                    if (((Long) ecllVar.g.b()).longValue() < 0 || B.d() <= ((Long) ecllVar.g.b()).longValue()) {
                                                        fgkk fgkkVar = (fgkk) fgkl.a.createBuilder();
                                                        fgkkVar.copyOnWrite();
                                                        fgkl fgklVar = (fgkl) fgkkVar.instance;
                                                        description.getClass();
                                                        fgklVar.b |= 1;
                                                        fgklVar.e = description;
                                                        if (((Boolean) ecllVar.f.b()).booleanValue()) {
                                                            eyed eyedVar = new eyed();
                                                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(eyedVar);
                                                            try {
                                                                B.q(gZIPOutputStream);
                                                                gZIPOutputStream.close();
                                                                eyee b = eyedVar.b();
                                                                if (((Long) ecllVar.h.b()).longValue() < 0 || b.d() <= ((Long) ecllVar.h.b()).longValue()) {
                                                                    fgkkVar.copyOnWrite();
                                                                    fgkl fgklVar2 = (fgkl) fgkkVar.instance;
                                                                    b.getClass();
                                                                    fgklVar2.c = 5;
                                                                    fgklVar2.d = b;
                                                                }
                                                            } finally {
                                                            }
                                                        } else {
                                                            fgkkVar.copyOnWrite();
                                                            fgkl fgklVar3 = (fgkl) fgkkVar.instance;
                                                            B.getClass();
                                                            fgklVar3.c = i3;
                                                            fgklVar3.d = B;
                                                        }
                                                        fgkl fgklVar4 = (fgkl) fgkkVar.build();
                                                        fgkmVar.copyOnWrite();
                                                        fgkq fgkqVar9 = (fgkq) fgkmVar.instance;
                                                        fgklVar4.getClass();
                                                        fgkqVar9.l = fgklVar4;
                                                        fgkqVar9.b |= 512;
                                                    }
                                                    traceInputStream.close();
                                                }
                                            } finally {
                                            }
                                        } catch (IOException e) {
                                            ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(e)).h("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "maybeSetAnrDiagnostic", (char) 276, "ApplicationExitInfoCaptureImpl.java")).q("Failed to read ANR trace");
                                        }
                                    }
                                    ecen ecenVar = ecllVar.m;
                                    pid = m.getPid();
                                    timestamp2 = m.getTimestamp();
                                    eyja d = eykm.d(timestamp2);
                                    if (((Boolean) ecenVar.b.b()).booleanValue()) {
                                        File file = new File(ecenVar.a.getFilesDir(), "flight_records");
                                        if (file.exists()) {
                                            File[] listFiles = file.listFiles(new FilenameFilter() { // from class: ecem
                                                @Override // java.io.FilenameFilter
                                                public final boolean accept(File file2, String str2) {
                                                    return str2.startsWith(pid + "_");
                                                }
                                            });
                                            if (listFiles == null) {
                                                ((enrr) ((enrr) ecdj.a.h()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 54, "FlightRecordReaderImpl.java")).r("Failed to find any valid flight records for process id %d", pid);
                                                i4 = erqt.i(emux.a);
                                            } else {
                                                str = string;
                                                j = j3;
                                                int i8 = 0;
                                                File file2 = null;
                                                Long l = null;
                                                while (i8 < listFiles.length) {
                                                    File file3 = listFiles[i8];
                                                    int i9 = i8;
                                                    List i10 = emye.b('_').i(file3.getName());
                                                    Long l2 = l;
                                                    if (i10.size() != 2) {
                                                        ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 63, "FlightRecordReaderImpl.java")).t("Invalid flight record file name: %s", file3.getName());
                                                        i5 = pid;
                                                    } else {
                                                        try {
                                                            parseLong = Long.parseLong((String) i10.get(i2));
                                                            i5 = pid;
                                                            j2 = d.b;
                                                        } catch (NumberFormatException e2) {
                                                            i5 = pid;
                                                            ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(e2)).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 70, "FlightRecordReaderImpl.java")).t("Invalid timestamp in flight record file name: %s", file3.getName());
                                                        }
                                                        if (parseLong <= j2 && (l2 == null || j2 - parseLong < l2.longValue())) {
                                                            valueOf = Long.valueOf(d.b - parseLong);
                                                            file2 = file3;
                                                            i8 = i9 + 1;
                                                            pid = i5;
                                                            i2 = 1;
                                                            l = valueOf;
                                                        }
                                                    }
                                                    valueOf = l2;
                                                    i8 = i9 + 1;
                                                    pid = i5;
                                                    i2 = 1;
                                                    l = valueOf;
                                                }
                                                int i11 = pid;
                                                if (file2 == null) {
                                                    ((enrr) ((enrr) ecdj.a.h()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 87, "FlightRecordReaderImpl.java")).r("Failed to find any valid flight records for process id %d", i11);
                                                    i4 = erqt.i(emux.a);
                                                } else {
                                                    try {
                                                        FileInputStream fileInputStream = new FileInputStream(file2);
                                                        try {
                                                            ecel ecelVar = (ecel) eyfy.parseFrom(ecel.a, fileInputStream, eyfc.a());
                                                            ((enrr) ((enrr) ecdj.a.e()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 93, "FlightRecordReaderImpl.java")).q("Read and serialization successful");
                                                            i4 = erqt.i(emxc.j(ecelVar));
                                                            fileInputStream.close();
                                                        } finally {
                                                        }
                                                    } catch (IOException e3) {
                                                        ((enrr) ((enrr) ((enrr) ecdj.a.j()).g(e3)).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", '`', "FlightRecordReaderImpl.java")).q("Failed to read FlightRecord from file");
                                                        i4 = erqt.i(emux.a);
                                                    }
                                                }
                                                engrVar.h(erny.f(i4, new emwl() { // from class: eclj
                                                    @Override // defpackage.emwl
                                                    public final Object apply(Object obj) {
                                                        emxc emxcVar = (emxc) obj;
                                                        boolean g = emxcVar.g();
                                                        fgkm fgkmVar2 = fgkmVar;
                                                        if (!g) {
                                                            return (fgkq) fgkmVar2.build();
                                                        }
                                                        for (ecec ececVar : ((ecel) emxcVar.c()).e) {
                                                            int i12 = ececVar.b;
                                                            boolean z = false;
                                                            int i13 = 3;
                                                            boolean z2 = true;
                                                            int i14 = i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? 0 : 4 : 3 : 2 : 1 : 5;
                                                            if (i14 == 0) {
                                                                throw null;
                                                            }
                                                            int i15 = i14 - 1;
                                                            ecll ecllVar2 = ecll.this;
                                                            if (i15 != 0) {
                                                                if (i15 == 1) {
                                                                    eyja eyjaVar = (i12 == 2 ? (ecee) ececVar.c : ecee.a).c;
                                                                    if (eyjaVar == null) {
                                                                        eyjaVar = eyja.a;
                                                                    }
                                                                    long b2 = eykm.b(eyjaVar);
                                                                    fgkmVar2.copyOnWrite();
                                                                    fgkq fgkqVar10 = (fgkq) fgkmVar2.instance;
                                                                    fgkq fgkqVar11 = fgkq.a;
                                                                    fgkqVar10.b |= 32;
                                                                    fgkqVar10.h = b2;
                                                                } else if (i15 != 2) {
                                                                    if (i15 == 3) {
                                                                        ecek ecekVar = i12 == 4 ? (ecek) ececVar.c : ecek.a;
                                                                        if (((Boolean) ecllVar2.i.b()).booleanValue()) {
                                                                            fgrj fgrjVar = (fgrj) fgrk.a.createBuilder();
                                                                            if (!ecekVar.c.equals(ecllVar2.b.b())) {
                                                                                String str2 = ecekVar.c;
                                                                                fgrjVar.copyOnWrite();
                                                                                fgrk fgrkVar = (fgrk) fgrjVar.instance;
                                                                                str2.getClass();
                                                                                fgrkVar.b |= 1;
                                                                                fgrkVar.c = str2;
                                                                                z = true;
                                                                            }
                                                                            if (ecekVar.d != ((Integer) ecllVar2.c.b()).intValue()) {
                                                                                int i16 = ecekVar.d;
                                                                                fgrjVar.copyOnWrite();
                                                                                fgrk fgrkVar2 = (fgrk) fgrjVar.instance;
                                                                                fgrkVar2.b = 2 | fgrkVar2.b;
                                                                                fgrkVar2.d = i16;
                                                                                z = true;
                                                                            }
                                                                            if (ecekVar.e != ((Integer) ecllVar2.d.b()).intValue()) {
                                                                                int i17 = ecekVar.e;
                                                                                fgrjVar.copyOnWrite();
                                                                                fgrk fgrkVar3 = (fgrk) fgrjVar.instance;
                                                                                fgrkVar3.b = 4 | fgrkVar3.b;
                                                                                fgrkVar3.e = i17;
                                                                            } else {
                                                                                z2 = z;
                                                                            }
                                                                            if (ecekVar.f != Build.VERSION.SDK_INT) {
                                                                                int i18 = ecekVar.f;
                                                                                fgrjVar.copyOnWrite();
                                                                                fgrk fgrkVar4 = (fgrk) fgrjVar.instance;
                                                                                fgrkVar4.b |= 8;
                                                                                fgrkVar4.f = i18;
                                                                            } else if (z2) {
                                                                            }
                                                                            fgrk fgrkVar5 = (fgrk) fgrjVar.build();
                                                                            fgkmVar2.copyOnWrite();
                                                                            fgkq fgkqVar12 = (fgkq) fgkmVar2.instance;
                                                                            fgkq fgkqVar13 = fgkq.a;
                                                                            fgrkVar5.getClass();
                                                                            fgkqVar12.o = fgrkVar5;
                                                                            fgkqVar12.b |= 4096;
                                                                        }
                                                                    }
                                                                } else if ((((fgkq) fgkmVar2.instance).b & 512) != 0 && ((Boolean) ecllVar2.j.b()).booleanValue()) {
                                                                    ecei eceiVar = ececVar.b == 3 ? (ecei) ececVar.c : ecei.a;
                                                                    ffbr ffbrVar = ecllVar2.k;
                                                                    eygr eygrVar = eceiVar.c;
                                                                    long longValue = ((Long) ffbrVar.b()).longValue();
                                                                    long longValue2 = ((Long) ecllVar2.l.b()).longValue();
                                                                    Stream map = Collection.EL.stream(eygrVar).map(new Function() { // from class: ecfj
                                                                        @Override // java.util.function.Function
                                                                        /* renamed from: andThen */
                                                                        public final /* synthetic */ Function mo448andThen(Function function) {
                                                                            return Function$CC.$default$andThen(this, function);
                                                                        }

                                                                        @Override // java.util.function.Function
                                                                        public final Object apply(Object obj2) {
                                                                            fgri fgriVar = (fgri) obj2;
                                                                            return new ecfl(fgriVar, ecfk.c(fgriVar.c == 1 ? (fgom) fgriVar.d : fgom.a));
                                                                        }

                                                                        public final /* synthetic */ Function compose(Function function) {
                                                                            return Function$CC.$default$compose(this, function);
                                                                        }
                                                                    });
                                                                    int i19 = engw.d;
                                                                    engw a = ecfn.a((List) map.collect(endq.a), longValue, longValue2);
                                                                    if (!a.isEmpty()) {
                                                                        fgra fgraVar = (fgra) fgrc.a.createBuilder();
                                                                        fgraVar.copyOnWrite();
                                                                        fgrc fgrcVar = (fgrc) fgraVar.instance;
                                                                        eygr eygrVar2 = fgrcVar.c;
                                                                        if (!eygrVar2.c()) {
                                                                            fgrcVar.c = eyfy.mutableCopy(eygrVar2);
                                                                        }
                                                                        eydl.addAll(a, fgrcVar.c);
                                                                        eyja eyjaVar2 = (ececVar.b == 3 ? (ecei) ececVar.c : ecei.a).d;
                                                                        if (eyjaVar2 == null) {
                                                                            eyjaVar2 = eyja.a;
                                                                        }
                                                                        fgraVar.copyOnWrite();
                                                                        fgrc fgrcVar2 = (fgrc) fgraVar.instance;
                                                                        eyjaVar2.getClass();
                                                                        fgrcVar2.d = eyjaVar2;
                                                                        fgrcVar2.b |= 1;
                                                                        eceh b3 = eceh.b((ececVar.b == 3 ? (ecei) ececVar.c : ecei.a).e);
                                                                        if (b3 == null) {
                                                                            b3 = eceh.UNSET;
                                                                        }
                                                                        int ordinal = b3.ordinal();
                                                                        if (ordinal != 0) {
                                                                            if (ordinal == 1) {
                                                                                i13 = 2;
                                                                            } else if (ordinal != 2) {
                                                                                ((enrr) ((enrr) ecdj.a.i()).h("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "convertCollectionTrigger", 389, "ApplicationExitInfoCaptureImpl.java")).t("Unknown collection trigger: %s", new ecgk(b3));
                                                                            }
                                                                            fgraVar.copyOnWrite();
                                                                            fgrc fgrcVar3 = (fgrc) fgraVar.instance;
                                                                            fgrcVar3.e = i13 - 1;
                                                                            fgrcVar3.b |= 2;
                                                                            fgrc fgrcVar4 = (fgrc) fgraVar.build();
                                                                            fgkmVar2.copyOnWrite();
                                                                            fgkq fgkqVar14 = (fgkq) fgkmVar2.instance;
                                                                            fgrcVar4.getClass();
                                                                            fgkqVar14.n = fgrcVar4;
                                                                            fgkqVar14.b |= 2048;
                                                                        }
                                                                        i13 = 1;
                                                                        fgraVar.copyOnWrite();
                                                                        fgrc fgrcVar32 = (fgrc) fgraVar.instance;
                                                                        fgrcVar32.e = i13 - 1;
                                                                        fgrcVar32.b |= 2;
                                                                        fgrc fgrcVar42 = (fgrc) fgraVar.build();
                                                                        fgkmVar2.copyOnWrite();
                                                                        fgkq fgkqVar142 = (fgkq) fgkmVar2.instance;
                                                                        fgrcVar42.getClass();
                                                                        fgkqVar142.n = fgrcVar42;
                                                                        fgkqVar142.b |= 2048;
                                                                    }
                                                                }
                                                            } else if ((((fgkq) fgkmVar2.instance).b & 1024) != 0) {
                                                                ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "applyFlightRecord", 192, "ApplicationExitInfoCaptureImpl.java")).q("FlightRecord should not contain more than one MetricExtension. Only the first will be logged.");
                                                            } else {
                                                                fgmh fgmhVar = i12 == 1 ? (fgmh) ececVar.c : fgmh.a;
                                                                fgkmVar2.copyOnWrite();
                                                                fgkq fgkqVar15 = (fgkq) fgkmVar2.instance;
                                                                fgmhVar.getClass();
                                                                fgkqVar15.m = fgmhVar;
                                                                fgkqVar15.b |= 1024;
                                                            }
                                                        }
                                                        return (fgkq) fgkmVar2.build();
                                                    }
                                                }, erpp.a));
                                                string = str;
                                                j3 = j;
                                            }
                                        } else {
                                            ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/flightrecorder/FlightRecordReaderImpl", "getFlightRecord", 46, "FlightRecordReaderImpl.java")).q("Flight records directory does not exist");
                                            i4 = erqt.i(emux.a);
                                        }
                                    } else {
                                        i4 = erqt.i(emux.a);
                                    }
                                    str = string;
                                    j = j3;
                                    engrVar.h(erny.f(i4, new emwl() { // from class: eclj
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj) {
                                            emxc emxcVar = (emxc) obj;
                                            boolean g = emxcVar.g();
                                            fgkm fgkmVar2 = fgkmVar;
                                            if (!g) {
                                                return (fgkq) fgkmVar2.build();
                                            }
                                            for (ecec ececVar : ((ecel) emxcVar.c()).e) {
                                                int i12 = ececVar.b;
                                                boolean z = false;
                                                int i13 = 3;
                                                boolean z2 = true;
                                                int i14 = i12 != 0 ? i12 != 1 ? i12 != 2 ? i12 != 3 ? i12 != 4 ? 0 : 4 : 3 : 2 : 1 : 5;
                                                if (i14 == 0) {
                                                    throw null;
                                                }
                                                int i15 = i14 - 1;
                                                ecll ecllVar2 = ecll.this;
                                                if (i15 != 0) {
                                                    if (i15 == 1) {
                                                        eyja eyjaVar = (i12 == 2 ? (ecee) ececVar.c : ecee.a).c;
                                                        if (eyjaVar == null) {
                                                            eyjaVar = eyja.a;
                                                        }
                                                        long b2 = eykm.b(eyjaVar);
                                                        fgkmVar2.copyOnWrite();
                                                        fgkq fgkqVar10 = (fgkq) fgkmVar2.instance;
                                                        fgkq fgkqVar11 = fgkq.a;
                                                        fgkqVar10.b |= 32;
                                                        fgkqVar10.h = b2;
                                                    } else if (i15 != 2) {
                                                        if (i15 == 3) {
                                                            ecek ecekVar = i12 == 4 ? (ecek) ececVar.c : ecek.a;
                                                            if (((Boolean) ecllVar2.i.b()).booleanValue()) {
                                                                fgrj fgrjVar = (fgrj) fgrk.a.createBuilder();
                                                                if (!ecekVar.c.equals(ecllVar2.b.b())) {
                                                                    String str2 = ecekVar.c;
                                                                    fgrjVar.copyOnWrite();
                                                                    fgrk fgrkVar = (fgrk) fgrjVar.instance;
                                                                    str2.getClass();
                                                                    fgrkVar.b |= 1;
                                                                    fgrkVar.c = str2;
                                                                    z = true;
                                                                }
                                                                if (ecekVar.d != ((Integer) ecllVar2.c.b()).intValue()) {
                                                                    int i16 = ecekVar.d;
                                                                    fgrjVar.copyOnWrite();
                                                                    fgrk fgrkVar2 = (fgrk) fgrjVar.instance;
                                                                    fgrkVar2.b = 2 | fgrkVar2.b;
                                                                    fgrkVar2.d = i16;
                                                                    z = true;
                                                                }
                                                                if (ecekVar.e != ((Integer) ecllVar2.d.b()).intValue()) {
                                                                    int i17 = ecekVar.e;
                                                                    fgrjVar.copyOnWrite();
                                                                    fgrk fgrkVar3 = (fgrk) fgrjVar.instance;
                                                                    fgrkVar3.b = 4 | fgrkVar3.b;
                                                                    fgrkVar3.e = i17;
                                                                } else {
                                                                    z2 = z;
                                                                }
                                                                if (ecekVar.f != Build.VERSION.SDK_INT) {
                                                                    int i18 = ecekVar.f;
                                                                    fgrjVar.copyOnWrite();
                                                                    fgrk fgrkVar4 = (fgrk) fgrjVar.instance;
                                                                    fgrkVar4.b |= 8;
                                                                    fgrkVar4.f = i18;
                                                                } else if (z2) {
                                                                }
                                                                fgrk fgrkVar5 = (fgrk) fgrjVar.build();
                                                                fgkmVar2.copyOnWrite();
                                                                fgkq fgkqVar12 = (fgkq) fgkmVar2.instance;
                                                                fgkq fgkqVar13 = fgkq.a;
                                                                fgrkVar5.getClass();
                                                                fgkqVar12.o = fgrkVar5;
                                                                fgkqVar12.b |= 4096;
                                                            }
                                                        }
                                                    } else if ((((fgkq) fgkmVar2.instance).b & 512) != 0 && ((Boolean) ecllVar2.j.b()).booleanValue()) {
                                                        ecei eceiVar = ececVar.b == 3 ? (ecei) ececVar.c : ecei.a;
                                                        ffbr ffbrVar = ecllVar2.k;
                                                        eygr eygrVar = eceiVar.c;
                                                        long longValue = ((Long) ffbrVar.b()).longValue();
                                                        long longValue2 = ((Long) ecllVar2.l.b()).longValue();
                                                        Stream map = Collection.EL.stream(eygrVar).map(new Function() { // from class: ecfj
                                                            @Override // java.util.function.Function
                                                            /* renamed from: andThen */
                                                            public final /* synthetic */ Function mo448andThen(Function function) {
                                                                return Function$CC.$default$andThen(this, function);
                                                            }

                                                            @Override // java.util.function.Function
                                                            public final Object apply(Object obj2) {
                                                                fgri fgriVar = (fgri) obj2;
                                                                return new ecfl(fgriVar, ecfk.c(fgriVar.c == 1 ? (fgom) fgriVar.d : fgom.a));
                                                            }

                                                            public final /* synthetic */ Function compose(Function function) {
                                                                return Function$CC.$default$compose(this, function);
                                                            }
                                                        });
                                                        int i19 = engw.d;
                                                        engw a = ecfn.a((List) map.collect(endq.a), longValue, longValue2);
                                                        if (!a.isEmpty()) {
                                                            fgra fgraVar = (fgra) fgrc.a.createBuilder();
                                                            fgraVar.copyOnWrite();
                                                            fgrc fgrcVar = (fgrc) fgraVar.instance;
                                                            eygr eygrVar2 = fgrcVar.c;
                                                            if (!eygrVar2.c()) {
                                                                fgrcVar.c = eyfy.mutableCopy(eygrVar2);
                                                            }
                                                            eydl.addAll(a, fgrcVar.c);
                                                            eyja eyjaVar2 = (ececVar.b == 3 ? (ecei) ececVar.c : ecei.a).d;
                                                            if (eyjaVar2 == null) {
                                                                eyjaVar2 = eyja.a;
                                                            }
                                                            fgraVar.copyOnWrite();
                                                            fgrc fgrcVar2 = (fgrc) fgraVar.instance;
                                                            eyjaVar2.getClass();
                                                            fgrcVar2.d = eyjaVar2;
                                                            fgrcVar2.b |= 1;
                                                            eceh b3 = eceh.b((ececVar.b == 3 ? (ecei) ececVar.c : ecei.a).e);
                                                            if (b3 == null) {
                                                                b3 = eceh.UNSET;
                                                            }
                                                            int ordinal = b3.ordinal();
                                                            if (ordinal != 0) {
                                                                if (ordinal == 1) {
                                                                    i13 = 2;
                                                                } else if (ordinal != 2) {
                                                                    ((enrr) ((enrr) ecdj.a.i()).h("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "convertCollectionTrigger", 389, "ApplicationExitInfoCaptureImpl.java")).t("Unknown collection trigger: %s", new ecgk(b3));
                                                                }
                                                                fgraVar.copyOnWrite();
                                                                fgrc fgrcVar32 = (fgrc) fgraVar.instance;
                                                                fgrcVar32.e = i13 - 1;
                                                                fgrcVar32.b |= 2;
                                                                fgrc fgrcVar42 = (fgrc) fgraVar.build();
                                                                fgkmVar2.copyOnWrite();
                                                                fgkq fgkqVar142 = (fgkq) fgkmVar2.instance;
                                                                fgrcVar42.getClass();
                                                                fgkqVar142.n = fgrcVar42;
                                                                fgkqVar142.b |= 2048;
                                                            }
                                                            i13 = 1;
                                                            fgraVar.copyOnWrite();
                                                            fgrc fgrcVar322 = (fgrc) fgraVar.instance;
                                                            fgrcVar322.e = i13 - 1;
                                                            fgrcVar322.b |= 2;
                                                            fgrc fgrcVar422 = (fgrc) fgraVar.build();
                                                            fgkmVar2.copyOnWrite();
                                                            fgkq fgkqVar1422 = (fgkq) fgkmVar2.instance;
                                                            fgrcVar422.getClass();
                                                            fgkqVar1422.n = fgrcVar422;
                                                            fgkqVar1422.b |= 2048;
                                                        }
                                                    }
                                                } else if ((((fgkq) fgkmVar2.instance).b & 1024) != 0) {
                                                    ((enrr) ((enrr) ecdj.a.j()).h("com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitInfoCaptureImpl", "applyFlightRecord", 192, "ApplicationExitInfoCaptureImpl.java")).q("FlightRecord should not contain more than one MetricExtension. Only the first will be logged.");
                                                } else {
                                                    fgmh fgmhVar = i12 == 1 ? (fgmh) ececVar.c : fgmh.a;
                                                    fgkmVar2.copyOnWrite();
                                                    fgkq fgkqVar15 = (fgkq) fgkmVar2.instance;
                                                    fgmhVar.getClass();
                                                    fgkqVar15.m = fgmhVar;
                                                    fgkqVar15.b |= 1024;
                                                }
                                            }
                                            return (fgkq) fgkmVar2.build();
                                        }
                                    }, erpp.a));
                                    string = str;
                                    j3 = j;
                                }
                                return erny.g(erny.f(erqt.e(engrVar.g()), new emwl() { // from class: eclk
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj) {
                                        return engw.n((List) obj);
                                    }
                                }, erpp.a), new eroh() { // from class: ecln
                                    /* JADX WARN: Multi-variable type inference failed */
                                    @Override // defpackage.eroh
                                    public final ListenableFuture a(Object obj) {
                                        final engw engwVar = (engw) obj;
                                        if (engwVar.isEmpty()) {
                                            return erre.a;
                                        }
                                        final eclt ecltVar4 = eclt.this;
                                        fgku fgkuVar = (fgku) ecltVar4.h.b();
                                        fgkr fgkrVar = (fgkr) fgks.a.createBuilder();
                                        int size = engwVar.size();
                                        fgkrVar.copyOnWrite();
                                        fgks fgksVar = (fgks) fgkrVar.instance;
                                        fgksVar.b |= 2;
                                        fgksVar.e = size;
                                        fgkrVar.copyOnWrite();
                                        fgks fgksVar2 = (fgks) fgkrVar.instance;
                                        fgkuVar.getClass();
                                        fgksVar2.d = fgkuVar;
                                        fgksVar2.b |= 1;
                                        HashSet hashSet = new HashSet();
                                        for (int i72 = 0; i72 < fgkuVar.b.size(); i72++) {
                                            int a = fgkp.a(fgkuVar.b.d(i72));
                                            if (a == 0) {
                                                a = 1;
                                            }
                                            hashSet.add(Integer.valueOf(a - 1));
                                        }
                                        int size2 = engwVar.size();
                                        for (int i82 = 0; i82 < size2; i82++) {
                                            fgkq fgkqVar10 = (fgkq) engwVar.get(i82);
                                            int a2 = fgkp.a(fgkqVar10.d);
                                            if (a2 == 0) {
                                                a2 = 1;
                                            }
                                            if (hashSet.contains(Integer.valueOf(a2 - 1))) {
                                                fgkrVar.copyOnWrite();
                                                fgks fgksVar3 = (fgks) fgkrVar.instance;
                                                fgkqVar10.getClass();
                                                eygr eygrVar = fgksVar3.c;
                                                if (!eygrVar.c()) {
                                                    fgksVar3.c = eyfy.mutableCopy(eygrVar);
                                                }
                                                fgksVar3.c.add(fgkqVar10);
                                            }
                                        }
                                        fgks fgksVar4 = (fgks) fgkrVar.build();
                                        ecjc ecjcVar = ecltVar4.a;
                                        eciu m2 = eciv.m();
                                        fgqw fgqwVar = (fgqw) fgqx.a.createBuilder();
                                        fgqwVar.copyOnWrite();
                                        fgqx fgqxVar = (fgqx) fgqwVar.instance;
                                        fgksVar4.getClass();
                                        fgqxVar.r = fgksVar4;
                                        fgqxVar.b |= 131072;
                                        m2.f((fgqx) fgqwVar.build());
                                        return erny.f(ecjcVar.b(m2.a()), new emwl() { // from class: eclr
                                            @Override // defpackage.emwl
                                            public final Object apply(Object obj2) {
                                                /*
                                                    this = this;
                                                    java.lang.Void r7 = (java.lang.Void) r7
                                                    engw r7 = r2
                                                    r0 = 0
                                                    java.lang.Object r7 = r7.get(r0)
                                                    fgkq r7 = (defpackage.fgkq) r7
                                                Lb:
                                                    eclt r1 = defpackage.eclt.this
                                                    java.lang.String r2 = r7.c
                                                    long r3 = r7.g
                                                    ffbr r1 = r1.d
                                                    java.lang.Object r1 = r1.b()
                                                    android.content.SharedPreferences r1 = (android.content.SharedPreferences) r1
                                                    android.content.SharedPreferences$Editor r1 = r1.edit()
                                                    java.lang.String r5 = "lastExitProcessName"
                                                    android.content.SharedPreferences$Editor r1 = r1.putString(r5, r2)
                                                    java.lang.String r2 = "lastExitTimestamp"
                                                    android.content.SharedPreferences$Editor r1 = r1.putLong(r2, r3)
                                                    boolean r1 = r1.commit()
                                                    if (r1 != 0) goto L4f
                                                    int r0 = r0 + 1
                                                    r1 = 3
                                                    if (r0 < r1) goto Lb
                                                    enru r7 = defpackage.ecdj.a
                                                    ensk r7 = r7.j()
                                                    enrr r7 = (defpackage.enrr) r7
                                                    java.lang.String r0 = "updateLastRecordedAppExit"
                                                    r1 = 220(0xdc, float:3.08E-43)
                                                    java.lang.String r2 = "com/google/android/libraries/performance/primes/metrics/crash/applicationexit/ApplicationExitMetricServiceImpl"
                                                    java.lang.String r3 = "ApplicationExitMetricServiceImpl.java"
                                                    ensk r7 = r7.h(r2, r0, r1, r3)
                                                    enrr r7 = (defpackage.enrr) r7
                                                    java.lang.String r0 = "Failed to persist most recent App Exit"
                                                    r7.q(r0)
                                                L4f:
                                                    r7 = 0
                                                    return r7
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: defpackage.eclr.apply(java.lang.Object):java.lang.Object");
                                            }
                                        }, ecltVar4.c);
                                    }
                                }, erpp.a);
                            }
                        }, ecltVar2.c);
                    }
                });
            }
        }, this.c);
        erqt.l(new Runnable() { // from class: eclo
            @Override // java.lang.Runnable
            public final void run() {
                eclt ecltVar = eclt.this;
                if (((Boolean) ecltVar.i.b()).booleanValue()) {
                    ecltVar.e.b();
                }
                final ecfd ecfdVar = ecltVar.j;
                if (((Boolean) ecfdVar.c.b()).booleanValue()) {
                    ecfdVar.a.scheduleWithFixedDelay(new Runnable() { // from class: ecfc
                        @Override // java.lang.Runnable
                        public final void run() {
                            ecfd.this.f.a(eceh.PERIODIC);
                        }
                    }, Math.round(((Long) ecfdVar.d.b()).longValue() + (ecfdVar.b.nextDouble() * ((Long) ecfdVar.e.b()).longValue())), ((Long) ecfdVar.e.b()).longValue(), TimeUnit.MILLISECONDS);
                }
            }
        }, this.c);
    }
}
