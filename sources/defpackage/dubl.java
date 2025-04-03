package defpackage;

import android.content.Context;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dubl {
    private final Context a;
    private final Object b = new Object();
    private File c;

    public dubl(Context context) {
        this.a = context.getApplicationContext();
    }

    public final File a() {
        File file;
        File dataDir;
        synchronized (this.b) {
            if (this.c == null) {
                dataDir = this.a.getDataDir();
                this.c = dataDir;
            }
            file = this.c;
        }
        return file;
    }
}
