package defpackage;

import android.os.StrictMode;
import java.io.Closeable;
import org.chromium.base.TraceEvent;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fiem implements Closeable {
    public static fiem a() {
        TraceEvent a = TraceEvent.a("StrictModeContext.allowDiskReads");
        try {
            fiel fielVar = new fiel(StrictMode.allowThreadDiskReads());
            if (a != null) {
                a.close();
            }
            return fielVar;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    public static fiem b() {
        TraceEvent a = TraceEvent.a("StrictModeContext.allowDiskWrites");
        try {
            fiel fielVar = new fiel(StrictMode.allowThreadDiskWrites());
            if (a != null) {
                a.close();
            }
            return fielVar;
        } catch (Throwable th) {
            if (a != null) {
                try {
                    a.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
