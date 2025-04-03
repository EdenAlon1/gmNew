package j$.nio.file;

import java.io.Closeable;
import java.nio.file.WatchService;

/* loaded from: classes9.dex */
public final /* synthetic */ class J implements Closeable {
    public final /* synthetic */ WatchService a;

    private /* synthetic */ J(WatchService watchService) {
        this.a = watchService;
    }

    public static /* synthetic */ J i(WatchService watchService) {
        if (watchService == null) {
            return null;
        }
        return new J(watchService);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        WatchService watchService = this.a;
        if (obj instanceof J) {
            obj = ((J) obj).a;
        }
        return watchService.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
