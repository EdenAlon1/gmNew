package defpackage;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Process;
import android.os.StrictMode;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class echj {
    public final ecgo a;
    private final Context b;

    public echj(ecgo ecgoVar, Context context) {
        this.a = ecgoVar;
        this.b = context;
    }

    public static final fgoz b(String str, boolean z, echk echkVar) {
        emxc emxcVar;
        fgoy fgoyVar = (fgoy) fgoz.a.createBuilder();
        long elapsedCpuTime = Process.getElapsedCpuTime();
        fgoyVar.copyOnWrite();
        fgoz fgozVar = (fgoz) fgoyVar.instance;
        fgozVar.b |= 1;
        fgozVar.c = elapsedCpuTime;
        fgoyVar.copyOnWrite();
        fgoz fgozVar2 = (fgoz) fgoyVar.instance;
        fgozVar2.b |= 2;
        fgozVar2.d = z;
        int activeCount = Thread.activeCount();
        fgoyVar.copyOnWrite();
        fgoz fgozVar3 = (fgoz) fgoyVar.instance;
        fgozVar3.b |= 4;
        fgozVar3.e = activeCount;
        if (str != null) {
            fgoyVar.copyOnWrite();
            fgoz fgozVar4 = (fgoz) fgoyVar.instance;
            fgozVar4.b |= 8;
            fgozVar4.f = str;
        }
        final int myPid = Process.myPid();
        String format = String.format(Locale.US, "/proc/%d/oom_score_adj", Integer.valueOf(myPid));
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(format, "r");
                try {
                    emxcVar = emxc.i(randomAccessFile.readLine()).b(new emwl() { // from class: ecop
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return Integer.valueOf(Integer.parseInt((String) obj));
                        }
                    });
                    randomAccessFile.close();
                } catch (Throwable th) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException unused) {
                emxcVar = emux.a;
            }
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            if (emxcVar.g()) {
                int intValue = ((Integer) emxcVar.c()).intValue();
                fgoyVar.copyOnWrite();
                fgoz fgozVar5 = (fgoz) fgoyVar.instance;
                fgozVar5.b |= 16;
                fgozVar5.g = intValue;
            }
            emxc emxcVar2 = !echkVar.b() ? emux.a : (emxc) enjk.c(echkVar.c(), new emxg() { // from class: echf
                @Override // defpackage.emxg
                public final boolean a(Object obj) {
                    return ((ActivityManager.RunningAppProcessInfo) obj).pid == myPid;
                }
            }).b(new emwl() { // from class: echg
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return emxc.i(((ActivityManager.RunningAppProcessInfo) obj).importanceReasonComponent);
                }
            }).e(emux.a);
            if (emxcVar2.g()) {
                String flattenToString = ((ComponentName) emxcVar2.c()).flattenToString();
                fgoyVar.copyOnWrite();
                fgoz fgozVar6 = (fgoz) fgoyVar.instance;
                flattenToString.getClass();
                fgozVar6.b |= 32;
                fgozVar6.h = flattenToString;
            }
            return (fgoz) fgoyVar.build();
        } catch (Throwable th3) {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            throw th3;
        }
    }

    public final fgoz a() {
        final echk a = echh.a(this.b, "getAndroidProcessStats");
        return b(null, this.a.a(new emyl() { // from class: echi
            @Override // defpackage.emyl
            public final Object get() {
                return echk.this;
            }
        }), a);
    }
}
