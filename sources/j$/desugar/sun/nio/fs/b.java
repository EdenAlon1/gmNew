package j$.desugar.sun.nio.fs;

import j$.nio.file.EnumC0003a;
import j$.nio.file.Path;
import j$.nio.file.attribute.InterfaceC0008e;
import j$.nio.file.attribute.InterfaceC0011h;
import j$.nio.file.attribute.y;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
final class b implements InterfaceC0008e {
    static final HashSet b;
    private final Path a;

    static {
        String[] strArr = {"size", "creationTime", "lastAccessTime", "lastModifiedTime", "fileKey", "isDirectory", "isRegularFile", "isSymbolicLink", "isOther"};
        int i = q.b;
        HashSet hashSet = new HashSet();
        for (int i2 = 0; i2 < 9; i2++) {
            hashSet.add(strArr[i2]);
        }
        b = hashSet;
    }

    public b(Path path) {
        this.a = path;
    }

    @Override // j$.nio.file.attribute.InterfaceC0008e
    public final void a(y yVar, y yVar2, y yVar3) {
        if (yVar == null && yVar2 == null) {
            return;
        }
        Path path = this.a;
        path.getFileSystem().B().a(path, EnumC0003a.WRITE);
        File file = path.toFile();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (!file.setLastModified(yVar.G())) {
            throw new IOException("File.setLastModified did not succeed on ".concat(String.valueOf(path)));
        }
    }

    @Override // j$.nio.file.attribute.s
    public final String name() {
        return "basic";
    }

    @Override // j$.nio.file.attribute.InterfaceC0008e
    public final InterfaceC0011h readAttributes() {
        boolean z;
        Path path = this.a;
        path.getFileSystem().B().a(path, new EnumC0003a[0]);
        File file = path.toFile();
        long lastModified = file.lastModified();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        y v = y.v(lastModified);
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        try {
            File file2 = file.getParent() == null ? file : new File(file.getParentFile().getCanonicalFile(), file.getName());
            z = !file2.getCanonicalFile().equals(file2.getAbsoluteFile());
        } catch (IOException unused) {
            z = false;
        }
        return new c(v, v, v, isFile, isDirectory, z, (isFile || isDirectory || z) ? false : true, file.length(), Integer.valueOf(file.hashCode()));
    }
}
