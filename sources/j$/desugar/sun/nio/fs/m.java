package j$.desugar.sun.nio.fs;

import j$.nio.channels.DesugarChannels;
import j$.nio.file.C;
import j$.nio.file.C0015d;
import j$.nio.file.CopyOption;
import j$.nio.file.EnumC0003a;
import j$.nio.file.FileSystem;
import j$.nio.file.Files;
import j$.nio.file.Path;
import j$.nio.file.StandardCopyOption;
import j$.nio.file.attribute.InterfaceC0008e;
import j$.nio.file.attribute.InterfaceC0011h;
import j$.nio.file.attribute.s;
import j$.nio.file.attribute.y;
import j$.nio.file.u;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URI;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.NoSuchFileException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public final class m extends j$.nio.file.spi.d {
    private final String b;
    private final String c = "/";
    private volatile i d;

    m(String str) {
        this.b = str;
    }

    private static void E(URI uri) {
        if (!uri.getScheme().equalsIgnoreCase("file")) {
            throw new IllegalArgumentException("URI does not match this provider");
        }
        if (uri.getRawAuthority() != null) {
            throw new IllegalArgumentException("Authority component present");
        }
        String path = uri.getPath();
        if (path == null) {
            throw new IllegalArgumentException("Path component is undefined");
        }
        if (!path.equals("/")) {
            throw new IllegalArgumentException("Path component should be '/'");
        }
        if (uri.getRawQuery() != null) {
            throw new IllegalArgumentException("Query component present");
        }
        if (uri.getRawFragment() != null) {
            throw new IllegalArgumentException("Fragment component present");
        }
    }

    private static boolean F(CopyOption[] copyOptionArr, StandardCopyOption standardCopyOption) {
        for (CopyOption copyOption : copyOptionArr) {
            if (copyOption == standardCopyOption) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.nio.file.spi.d
    public final void A(Path path, String str, Object obj, j$.nio.file.k... kVarArr) {
        int indexOf = str.indexOf(":");
        if (indexOf != -1) {
            String substring = str.substring(0, indexOf);
            if (!"basic".equals(substring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + substring + " is not available.");
            }
            str = str.substring(indexOf + 1);
        }
        b bVar = new b(path);
        if (str.equals("lastModifiedTime")) {
            bVar.a((y) obj, null, null);
            return;
        }
        if (str.equals("lastAccessTime")) {
            bVar.a(null, (y) obj, null);
        } else {
            if (str.equals("creationTime")) {
                return;
            }
            throw new IllegalArgumentException("'basic:" + str + "' not recognized");
        }
    }

    @Override // j$.nio.file.spi.d
    public final void a(Path path, EnumC0003a... enumC0003aArr) {
        boolean canRead;
        File file = path.toFile();
        if (!file.exists()) {
            throw new NoSuchFileException(path.toString());
        }
        boolean z = true;
        for (EnumC0003a enumC0003a : enumC0003aArr) {
            int i = j.a[enumC0003a.ordinal()];
            if (i == 1) {
                canRead = file.canRead();
            } else if (i == 2) {
                canRead = file.canWrite();
            } else if (i == 3) {
                canRead = file.canExecute();
            }
            z &= canRead;
        }
        if (!z) {
            throw new IOException(String.format("Unable to access file %s", path));
        }
    }

    @Override // j$.nio.file.spi.d
    public final void b(Path path, Path path2, CopyOption... copyOptionArr) {
        if (!F(copyOptionArr, StandardCopyOption.REPLACE_EXISTING) && Files.b(path2, new j$.nio.file.k[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (F(copyOptionArr, StandardCopyOption.ATOMIC_MOVE)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        FileInputStream fileInputStream = new FileInputStream(path.toFile());
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path2.toFile());
            try {
                byte[] bArr = new byte[8192];
                while (true) {
                    int read = fileInputStream.read(bArr, 0, 8192);
                    if (read < 0) {
                        fileOutputStream.close();
                        fileInputStream.close();
                        return;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
            } finally {
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // j$.nio.file.spi.d
    public final void c(Path path, j$.nio.file.attribute.m... mVarArr) {
        if (path.getParent() != null && !Files.b(path.getParent(), new j$.nio.file.k[0])) {
            throw new NoSuchFileException(path.toString());
        }
        if (!path.toFile().mkdirs()) {
            throw new FileAlreadyExistsException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.d
    public final void d(Path path, Path path2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.d
    public final void e(Path path, Path path2, j$.nio.file.attribute.m... mVarArr) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.d
    public final void f(Path path) {
        try {
            a(path, new EnumC0003a[0]);
            path.toFile().delete();
        } catch (IOException unused) {
            throw new NoSuchFileException(path.toString());
        }
    }

    @Override // j$.nio.file.spi.d
    public final boolean g(Path path) {
        return path.toFile().delete();
    }

    @Override // j$.nio.file.spi.d
    public final s h(Path path, Class cls, j$.nio.file.k... kVarArr) {
        cls.getClass();
        if (cls == InterfaceC0008e.class) {
            return (s) cls.cast(new b(path));
        }
        return null;
    }

    @Override // j$.nio.file.spi.d
    public final C0015d i(Path path) {
        throw new SecurityException("getFileStore");
    }

    @Override // j$.nio.file.spi.d
    public final FileSystem j(URI uri) {
        i iVar;
        E(uri);
        i iVar2 = this.d;
        if (iVar2 != null) {
            return iVar2;
        }
        synchronized (this) {
            try {
                iVar = this.d;
                if (iVar == null) {
                    iVar = new i(this, this.b, this.c);
                    this.d = iVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return iVar;
    }

    @Override // j$.nio.file.spi.d
    public final Path k(URI uri) {
        return p.b(this.d, uri, this.b, this.c);
    }

    @Override // j$.nio.file.spi.d
    public final String l() {
        return "file";
    }

    @Override // j$.nio.file.spi.d
    public final boolean m(Path path) {
        return path.toFile().isHidden();
    }

    @Override // j$.nio.file.spi.d
    public final boolean n(Path path, Path path2) {
        if (path.equals(path2)) {
            return true;
        }
        a(path, new EnumC0003a[0]);
        a(path2, new EnumC0003a[0]);
        return path.toFile().equals(path2.toFile());
    }

    @Override // j$.nio.file.spi.d
    public final void o(Path path, Path path2, CopyOption... copyOptionArr) {
        if (!F(copyOptionArr, StandardCopyOption.REPLACE_EXISTING) && Files.b(path2, new j$.nio.file.k[0])) {
            throw new FileAlreadyExistsException(path2.toString());
        }
        if (F(copyOptionArr, StandardCopyOption.COPY_ATTRIBUTES)) {
            throw new UnsupportedOperationException("Unsupported copy option");
        }
        path.toFile().renameTo(path2.toFile());
    }

    @Override // j$.nio.file.spi.d
    public final j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, j$.nio.file.attribute.m... mVarArr) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.d
    public final SeekableByteChannel q(Path path, Set set, j$.nio.file.attribute.m... mVarArr) {
        return s(path, set, mVarArr);
    }

    @Override // j$.nio.file.spi.d
    public final DirectoryStream r(Path path, u uVar) {
        k kVar = new k();
        kVar.a = new l(this, path, uVar);
        return kVar;
    }

    @Override // j$.nio.file.spi.d
    public final FileChannel s(Path path, Set set, j$.nio.file.attribute.m... mVarArr) {
        if (path.toFile().isDirectory()) {
            throw new UnsupportedOperationException("The desugar library does not support creating a file channel on a directory: ".concat(String.valueOf(path)));
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((j$.nio.file.n) it.next()).getClass();
        }
        if (path.toFile().exists()) {
            if (set.contains(C.CREATE_NEW) && set.contains(C.WRITE)) {
                throw new FileAlreadyExistsException(path.toString());
            }
        } else if (!set.contains(C.CREATE) && !set.contains(C.CREATE_NEW)) {
            throw new NoSuchFileException(path.toString());
        }
        if (set.contains(C.READ) && set.contains(C.APPEND)) {
            throw new IllegalArgumentException("READ + APPEND not allowed");
        }
        C c = C.APPEND;
        if (set.contains(c) && set.contains(C.TRUNCATE_EXISTING)) {
            throw new IllegalArgumentException("APPEND + TRUNCATE_EXISTING not allowed");
        }
        File file = path.toFile();
        C c2 = C.WRITE;
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, (set.contains(c2) || set.contains(c)) ? set.contains(C.SYNC) ? "rws" : set.contains(C.DSYNC) ? "rwd" : "rw" : "r");
        if (set.contains(C.TRUNCATE_EXISTING) && set.contains(c2)) {
            randomAccessFile.setLength(0L);
        }
        return (set.contains(c) || set.contains(C.DELETE_ON_CLOSE)) ? e.i(DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel()), set, path) : DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(randomAccessFile.getChannel());
    }

    @Override // j$.nio.file.spi.d
    public final FileSystem u(URI uri, Map map) {
        E(uri);
        throw new FileSystemAlreadyExistsException();
    }

    @Override // j$.nio.file.spi.d
    public final InterfaceC0011h x(Path path, Class cls, j$.nio.file.k... kVarArr) {
        if (cls == InterfaceC0011h.class) {
            return (InterfaceC0011h) cls.cast(((InterfaceC0008e) h(path, InterfaceC0008e.class, kVarArr)).readAttributes());
        }
        throw new UnsupportedOperationException();
    }

    @Override // j$.nio.file.spi.d
    public final Map y(Path path, String str, j$.nio.file.k... kVarArr) {
        String[] split;
        int indexOf = str.indexOf(":");
        if (indexOf == -1) {
            split = str.split(",");
        } else {
            String substring = str.substring(0, indexOf);
            if (!"basic".equals(substring)) {
                throw new UnsupportedOperationException("Requested attribute type for: " + substring + " is not available.");
            }
            split = str.substring(indexOf + 1).split(",");
        }
        b bVar = new b(path);
        a b = a.b(b.b, split);
        InterfaceC0011h readAttributes = bVar.readAttributes();
        if (b.c("size")) {
            b.a(Long.valueOf(((c) readAttributes).size()), "size");
        }
        if (b.c("creationTime")) {
            b.a(((c) readAttributes).creationTime(), "creationTime");
        }
        if (b.c("lastAccessTime")) {
            b.a(((c) readAttributes).lastAccessTime(), "lastAccessTime");
        }
        if (b.c("lastModifiedTime")) {
            b.a(((c) readAttributes).lastModifiedTime(), "lastModifiedTime");
        }
        if (b.c("fileKey")) {
            b.a(((c) readAttributes).fileKey(), "fileKey");
        }
        if (b.c("isDirectory")) {
            b.a(Boolean.valueOf(((c) readAttributes).isDirectory()), "isDirectory");
        }
        if (b.c("isRegularFile")) {
            b.a(Boolean.valueOf(((c) readAttributes).isRegularFile()), "isRegularFile");
        }
        if (b.c("isSymbolicLink")) {
            b.a(Boolean.valueOf(((c) readAttributes).isSymbolicLink()), "isSymbolicLink");
        }
        if (b.c("isOther")) {
            b.a(Boolean.valueOf(((c) readAttributes).isOther()), "isOther");
        }
        return b.d();
    }

    @Override // j$.nio.file.spi.d
    public final Path z(Path path) {
        return new o(this.d, path.toFile().getCanonicalPath(), this.b, this.c);
    }
}
