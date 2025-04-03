package defpackage;

import android.os.DeadObjectException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axuv {
    public static final boolean a(Throwable th) {
        if (b(th)) {
            return true;
        }
        Throwable cause = th.getCause();
        return cause != null && b(cause);
    }

    private static final boolean b(Throwable th) {
        return (th instanceof DeadObjectException) || (th instanceof ejnj) || (th instanceof ejnh);
    }
}
