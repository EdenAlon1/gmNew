package defpackage;

import android.os.Process;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejkg {
    public static final boolean a(ffbr ffbrVar) {
        boolean isIsolated;
        ffbrVar.getClass();
        isIsolated = Process.isIsolated();
        return !isIsolated && ((Boolean) ffbrVar.b()).booleanValue();
    }
}
