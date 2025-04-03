package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rok {
    public static void a(Closeable closeable, boolean z) {
        if (!z) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            roi.b(e, "Hiding IOException because another is pending");
        }
    }

    public static void b(boolean z) {
        if (!z) {
            throw new IllegalStateException();
        }
    }

    public static void c(Object obj) {
        obj.getClass();
    }
}
