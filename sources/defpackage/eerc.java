package defpackage;

import java.util.HashSet;
import java.util.Set;

/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class eerc {
    @Deprecated
    public static String a(Throwable th) {
        StringBuilder sb = new StringBuilder();
        b(th, sb, new HashSet(), null);
        return sb.toString();
    }

    private static void b(Throwable th, StringBuilder sb, Set set, String str) {
        if (th == null || set.contains(th)) {
            return;
        }
        set.add(th);
        if (str != null) {
            sb.append(str);
        }
        sb.append(th.getClass().getName());
        sb.append(':');
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            sb.append("\n\tat ");
            sb.append(stackTraceElement);
        }
        for (Throwable th2 : th.getSuppressed()) {
            b(th2, sb, set, "\nSuppressed: ");
        }
        if (th.getCause() != null) {
            b(th.getCause(), sb, set, "\nCaused by: ");
        }
    }
}
