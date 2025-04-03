package j$.nio.file;

import java.nio.file.FileStore;

/* renamed from: j$.nio.file.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0015d {
    public final /* synthetic */ FileStore a;

    private C0015d(FileStore fileStore) {
        this.a = fileStore;
    }

    public static /* synthetic */ C0015d a(FileStore fileStore) {
        if (fileStore == null) {
            return null;
        }
        return new C0015d(fileStore);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileStore fileStore = this.a;
        if (obj instanceof C0015d) {
            obj = ((C0015d) obj).a;
        }
        return fileStore.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
