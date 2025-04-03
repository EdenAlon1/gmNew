package defpackage;

import android.content.Context;
import java.io.Closeable;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class csjx implements Closeable {
    protected csjx() {
    }

    public static csjx c(Context context, csxu csxuVar, String str, String str2) {
        return new csjw(context, csxuVar.b("bugle_persistent_logsaver_rotation_set_size", 8), csxuVar.b("bugle_persistent_logsaver_file_limit", 262144), str, str2);
    }

    public abstract void a(PrintWriter printWriter, csjz csjzVar);

    public abstract void b(int i, String str, String str2);
}
