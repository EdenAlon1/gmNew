package j$.nio.file.spi;

import j$.nio.file.C0014c;
import j$.nio.file.C0015d;
import j$.nio.file.C0018g;
import j$.nio.file.CopyOption;
import j$.nio.file.EnumC0003a;
import j$.nio.file.FileSystem;
import j$.nio.file.Path;
import j$.nio.file.attribute.C0009f;
import j$.nio.file.attribute.InterfaceC0011h;
import j$.nio.file.attribute.m;
import j$.nio.file.attribute.q;
import j$.nio.file.attribute.s;
import j$.nio.file.k;
import j$.nio.file.n;
import j$.nio.file.o;
import j$.nio.file.t;
import j$.nio.file.u;
import j$.nio.file.w;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.AsynchronousFileChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.AccessMode;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.OpenOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public final /* synthetic */ class b extends d {
    public final /* synthetic */ FileSystemProvider b;

    private /* synthetic */ b(FileSystemProvider fileSystemProvider) {
        this.b = fileSystemProvider;
    }

    public static /* synthetic */ d B(FileSystemProvider fileSystemProvider) {
        if (fileSystemProvider == null) {
            return null;
        }
        return fileSystemProvider instanceof c ? ((c) fileSystemProvider).a : new b(fileSystemProvider);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void A(Path path, String str, Object obj, k[] kVarArr) {
        this.b.setAttribute(t.o(path), str, o.g(obj), o.l(kVarArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void a(Path path, EnumC0003a[] enumC0003aArr) {
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path o = t.o(path);
        AccessMode[] accessModeArr = null;
        if (enumC0003aArr != null) {
            int length = enumC0003aArr.length;
            AccessMode[] accessModeArr2 = new AccessMode[length];
            for (int i = 0; i < length; i++) {
                EnumC0003a enumC0003a = enumC0003aArr[i];
                accessModeArr2[i] = enumC0003a == null ? null : enumC0003a == EnumC0003a.READ ? AccessMode.READ : enumC0003a == EnumC0003a.WRITE ? AccessMode.WRITE : AccessMode.EXECUTE;
            }
            accessModeArr = accessModeArr2;
        }
        fileSystemProvider.checkAccess(o, accessModeArr);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void b(Path path, Path path2, CopyOption[] copyOptionArr) {
        java.nio.file.CopyOption[] copyOptionArr2;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path o = t.o(path);
        java.nio.file.Path o2 = t.o(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            java.nio.file.CopyOption[] copyOptionArr3 = new java.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0014c.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        fileSystemProvider.copy(o, o2, copyOptionArr2);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void c(Path path, m[] mVarArr) {
        this.b.createDirectory(t.o(path), j$.nio.channels.c.e(mVarArr));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void d(Path path, Path path2) {
        this.b.createLink(t.o(path), t.o(path2));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void e(Path path, Path path2, m[] mVarArr) {
        this.b.createSymbolicLink(t.o(path), t.o(path2), j$.nio.channels.c.e(mVarArr));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileSystemProvider fileSystemProvider = this.b;
        if (obj instanceof b) {
            obj = ((b) obj).b;
        }
        return fileSystemProvider.equals(obj);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void f(Path path) {
        this.b.delete(t.o(path));
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean g(Path path) {
        boolean deleteIfExists;
        deleteIfExists = this.b.deleteIfExists(t.o(path));
        return deleteIfExists;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ s h(Path path, Class cls, k[] kVarArr) {
        FileAttributeView fileAttributeView;
        fileAttributeView = this.b.getFileAttributeView(t.o(path), o.d(cls), o.l(kVarArr));
        return q.c(fileAttributeView);
    }

    public final /* synthetic */ int hashCode() {
        return this.b.hashCode();
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ C0015d i(Path path) {
        FileStore fileStore;
        fileStore = this.b.getFileStore(t.o(path));
        return C0015d.a(fileStore);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ FileSystem j(URI uri) {
        java.nio.file.FileSystem fileSystem;
        fileSystem = this.b.getFileSystem(uri);
        return C0018g.D(fileSystem);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Path k(URI uri) {
        java.nio.file.Path path;
        path = this.b.getPath(uri);
        return j$.nio.file.s.o(path);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ String l() {
        String scheme;
        scheme = this.b.getScheme();
        return scheme;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean m(Path path) {
        boolean isHidden;
        isHidden = this.b.isHidden(t.o(path));
        return isHidden;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ boolean n(Path path, Path path2) {
        boolean isSameFile;
        isSameFile = this.b.isSameFile(t.o(path), t.o(path2));
        return isSameFile;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ void o(Path path, Path path2, CopyOption[] copyOptionArr) {
        java.nio.file.CopyOption[] copyOptionArr2;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path o = t.o(path);
        java.nio.file.Path o2 = t.o(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            java.nio.file.CopyOption[] copyOptionArr3 = new java.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0014c.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        fileSystemProvider.move(o, o2, copyOptionArr2);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, m[] mVarArr) {
        AsynchronousFileChannel newAsynchronousFileChannel;
        newAsynchronousFileChannel = this.b.newAsynchronousFileChannel(t.o(path), o.h(set), executorService, j$.nio.channels.c.e(mVarArr));
        return j$.nio.channels.a.i(newAsynchronousFileChannel);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ SeekableByteChannel q(Path path, Set set, m[] mVarArr) {
        SeekableByteChannel newByteChannel;
        newByteChannel = this.b.newByteChannel(t.o(path), o.h(set), j$.nio.channels.c.e(mVarArr));
        return newByteChannel;
    }

    @Override // j$.nio.file.spi.d
    public final DirectoryStream r(Path path, u uVar) {
        DirectoryStream newDirectoryStream;
        newDirectoryStream = this.b.newDirectoryStream(t.o(path), new u(uVar));
        return new w(newDirectoryStream);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ FileChannel s(Path path, Set set, m[] mVarArr) {
        FileChannel newFileChannel;
        newFileChannel = this.b.newFileChannel(t.o(path), o.h(set), j$.nio.channels.c.e(mVarArr));
        return newFileChannel;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ FileSystem t(Path path, Map map) {
        java.nio.file.FileSystem newFileSystem;
        newFileSystem = this.b.newFileSystem(t.o(path), (Map<String, ?>) map);
        return C0018g.D(newFileSystem);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ FileSystem u(URI uri, Map map) {
        java.nio.file.FileSystem newFileSystem;
        newFileSystem = this.b.newFileSystem(uri, (Map<String, ?>) map);
        return C0018g.D(newFileSystem);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ InputStream v(Path path, n[] nVarArr) {
        OpenOption[] openOptionArr;
        InputStream newInputStream;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path o = t.o(path);
        if (nVarArr == null) {
            openOptionArr = null;
        } else {
            int length = nVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = j$.nio.file.m.a(nVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        newInputStream = fileSystemProvider.newInputStream(o, openOptionArr);
        return newInputStream;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ OutputStream w(Path path, n[] nVarArr) {
        OpenOption[] openOptionArr;
        OutputStream newOutputStream;
        FileSystemProvider fileSystemProvider = this.b;
        java.nio.file.Path o = t.o(path);
        if (nVarArr == null) {
            openOptionArr = null;
        } else {
            int length = nVarArr.length;
            OpenOption[] openOptionArr2 = new OpenOption[length];
            for (int i = 0; i < length; i++) {
                openOptionArr2[i] = j$.nio.file.m.a(nVarArr[i]);
            }
            openOptionArr = openOptionArr2;
        }
        newOutputStream = fileSystemProvider.newOutputStream(o, openOptionArr);
        return newOutputStream;
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ InterfaceC0011h x(Path path, Class cls, k[] kVarArr) {
        BasicFileAttributes readAttributes;
        readAttributes = this.b.readAttributes(t.o(path), (Class<BasicFileAttributes>) o.e(cls), o.l(kVarArr));
        return C0009f.a(readAttributes);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Map y(Path path, String str, k[] kVarArr) {
        Map readAttributes;
        readAttributes = this.b.readAttributes(t.o(path), str, o.l(kVarArr));
        return o.f(readAttributes);
    }

    @Override // j$.nio.file.spi.d
    public final /* synthetic */ Path z(Path path) {
        java.nio.file.Path readSymbolicLink;
        readSymbolicLink = this.b.readSymbolicLink(t.o(path));
        return j$.nio.file.s.o(readSymbolicLink);
    }
}
