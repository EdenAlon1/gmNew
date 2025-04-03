package defpackage;

import java.io.Closeable;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cslm {
    private static final enru a = enru.c("com/google/android/apps/messaging/shared/util/common/StreamUtil");

    public static void a(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (IOException e) {
            ensk i = a.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/util/common/StreamUtil", "safeClose", 28, "StreamUtil.java")).t("Unable to close resource %s", cskt.b(closeable.toString()));
        }
    }

    public static void b(AutoCloseable autoCloseable) {
        if (autoCloseable == null) {
            return;
        }
        try {
            autoCloseable.close();
        } catch (Exception e) {
            ensk i = a.i();
            i.Y(ente.a, "Bugle");
            ((enrr) ((enrr) ((enrr) i).g(e)).h("com/google/android/apps/messaging/shared/util/common/StreamUtil", "safeClose", 42, "StreamUtil.java")).t("Unable to close resource %s", cskt.b(autoCloseable.toString()));
        }
    }
}
