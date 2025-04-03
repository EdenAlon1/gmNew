package j$.nio.file;

import java.io.Closeable;
import java.util.Set;

/* loaded from: classes9.dex */
public abstract class FileSystem implements Closeable {
    public abstract J A();

    public abstract j$.nio.file.spi.d B();

    public abstract Set C();

    public abstract Path getPath(String str, String... strArr);

    public abstract Iterable i();

    public abstract boolean isOpen();

    public abstract B p(String str);

    public abstract Iterable s();

    public abstract String t();

    public abstract j$.nio.file.attribute.H w();

    public abstract boolean z();
}
