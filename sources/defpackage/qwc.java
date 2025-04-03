package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qwc {
    private volatile qxv a;
    private final qya b;

    public qwc(qya qyaVar) {
        this.b = qyaVar;
    }

    public final qxv a() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    qyc qycVar = this.b.a;
                    File cacheDir = qycVar.a.getCacheDir();
                    qyb qybVar = null;
                    File file = cacheDir == null ? null : new File(cacheDir, qycVar.b);
                    if (file != null && (file.isDirectory() || file.mkdirs())) {
                        qybVar = new qyb(file);
                    }
                    this.a = qybVar;
                }
                if (this.a == null) {
                    this.a = new qxw();
                }
            }
        }
        return this.a;
    }
}
