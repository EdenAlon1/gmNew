package j$.nio.file.spi;

import j$.nio.file.AbstractC0016e;
import j$.nio.file.C0013b;
import j$.nio.file.C0015d;
import j$.nio.file.C0019h;
import j$.nio.file.EnumC0003a;
import j$.nio.file.attribute.C0010g;
import j$.nio.file.attribute.r;
import j$.nio.file.l;
import j$.nio.file.n;
import j$.nio.file.o;
import j$.nio.file.s;
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
import java.nio.file.CopyOption;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.FileAttributeView;
import java.nio.file.spi.FileSystemProvider;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public final /* synthetic */ class c extends FileSystemProvider {
    public final /* synthetic */ d a;

    private /* synthetic */ c(d dVar) {
        this.a = dVar;
    }

    public static /* synthetic */ FileSystemProvider a(d dVar) {
        if (dVar == null) {
            return null;
        }
        return dVar instanceof b ? ((b) dVar).b : new c(dVar);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void checkAccess(Path path, AccessMode[] accessModeArr) {
        AccessMode accessMode;
        AccessMode accessMode2;
        EnumC0003a enumC0003a;
        d dVar = this.a;
        j$.nio.file.Path o = s.o(path);
        EnumC0003a[] enumC0003aArr = null;
        if (accessModeArr != null) {
            int length = accessModeArr.length;
            EnumC0003a[] enumC0003aArr2 = new EnumC0003a[length];
            for (int i = 0; i < length; i++) {
                AccessMode accessMode3 = accessModeArr[i];
                if (accessMode3 == null) {
                    enumC0003a = null;
                } else {
                    accessMode = AccessMode.READ;
                    if (accessMode3 == accessMode) {
                        enumC0003a = EnumC0003a.READ;
                    } else {
                        accessMode2 = AccessMode.WRITE;
                        enumC0003a = accessMode3 == accessMode2 ? EnumC0003a.WRITE : EnumC0003a.EXECUTE;
                    }
                }
                enumC0003aArr2[i] = enumC0003a;
            }
            enumC0003aArr = enumC0003aArr2;
        }
        dVar.a(o, enumC0003aArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void copy(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        d dVar = this.a;
        j$.nio.file.Path o = s.o(path);
        j$.nio.file.Path o2 = s.o(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0013b.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        dVar.b(o, o2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createDirectory(Path path, FileAttribute[] fileAttributeArr) {
        this.a.c(s.o(path), j$.nio.channels.c.d(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createLink(Path path, Path path2) {
        this.a.d(s.o(path), s.o(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void createSymbolicLink(Path path, Path path2, FileAttribute[] fileAttributeArr) {
        this.a.e(s.o(path), s.o(path2), j$.nio.channels.c.d(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void delete(Path path) {
        this.a.f(s.o(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean deleteIfExists(Path path) {
        return this.a.g(s.o(path));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        d dVar = this.a;
        if (obj instanceof c) {
            obj = ((c) obj).a;
        }
        return dVar.equals(obj);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileAttributeView getFileAttributeView(Path path, Class cls, LinkOption[] linkOptionArr) {
        return r.a(this.a.h(s.o(path), o.d(cls), o.j(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileStore getFileStore(Path path) {
        C0015d i = this.a.i(s.o(path));
        int i2 = AbstractC0016e.a;
        if (i == null) {
            return null;
        }
        return i.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem getFileSystem(URI uri) {
        return C0019h.i(this.a.j(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path getPath(URI uri) {
        return t.o(this.a.k(uri));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ String getScheme() {
        return this.a.l();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isHidden(Path path) {
        return this.a.m(s.o(path));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ boolean isSameFile(Path path, Path path2) {
        return this.a.n(s.o(path), s.o(path2));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void move(Path path, Path path2, CopyOption[] copyOptionArr) {
        j$.nio.file.CopyOption[] copyOptionArr2;
        d dVar = this.a;
        j$.nio.file.Path o = s.o(path);
        j$.nio.file.Path o2 = s.o(path2);
        if (copyOptionArr == null) {
            copyOptionArr2 = null;
        } else {
            int length = copyOptionArr.length;
            j$.nio.file.CopyOption[] copyOptionArr3 = new j$.nio.file.CopyOption[length];
            for (int i = 0; i < length; i++) {
                copyOptionArr3[i] = C0013b.a(copyOptionArr[i]);
            }
            copyOptionArr2 = copyOptionArr3;
        }
        dVar.o(o, o2, copyOptionArr2);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ AsynchronousFileChannel newAsynchronousFileChannel(Path path, Set set, ExecutorService executorService, FileAttribute[] fileAttributeArr) {
        j$.nio.channels.a p = this.a.p(s.o(path), o.h(set), executorService, j$.nio.channels.c.d(fileAttributeArr));
        int i = j$.nio.channels.b.a;
        if (p == null) {
            return null;
        }
        return p.a;
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ SeekableByteChannel newByteChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.q(s.o(path), o.h(set), j$.nio.channels.c.d(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final DirectoryStream newDirectoryStream(Path path, DirectoryStream.Filter filter) {
        return new w(this.a.r(s.o(path), new u(filter)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileChannel newFileChannel(Path path, Set set, FileAttribute[] fileAttributeArr) {
        return this.a.s(s.o(path), o.h(set), j$.nio.channels.c.d(fileAttributeArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(URI uri, Map map) {
        return C0019h.i(this.a.u(uri, map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ InputStream newInputStream(Path path, OpenOption[] openOptionArr) {
        n[] nVarArr;
        d dVar = this.a;
        j$.nio.file.Path o = s.o(path);
        if (openOptionArr == null) {
            nVarArr = null;
        } else {
            int length = openOptionArr.length;
            n[] nVarArr2 = new n[length];
            for (int i = 0; i < length; i++) {
                nVarArr2[i] = l.a(openOptionArr[i]);
            }
            nVarArr = nVarArr2;
        }
        return dVar.v(o, nVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ OutputStream newOutputStream(Path path, OpenOption[] openOptionArr) {
        n[] nVarArr;
        d dVar = this.a;
        j$.nio.file.Path o = s.o(path);
        if (openOptionArr == null) {
            nVarArr = null;
        } else {
            int length = openOptionArr.length;
            n[] nVarArr2 = new n[length];
            for (int i = 0; i < length; i++) {
                nVarArr2[i] = l.a(openOptionArr[i]);
            }
            nVarArr = nVarArr2;
        }
        return dVar.w(o, nVarArr);
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ BasicFileAttributes readAttributes(Path path, Class cls, LinkOption[] linkOptionArr) {
        return C0010g.a(this.a.x(s.o(path), o.e(cls), o.j(linkOptionArr)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Path readSymbolicLink(Path path) {
        return t.o(this.a.z(s.o(path)));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ void setAttribute(Path path, String str, Object obj, LinkOption[] linkOptionArr) {
        this.a.A(s.o(path), str, o.g(obj), o.j(linkOptionArr));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ FileSystem newFileSystem(Path path, Map map) {
        return C0019h.i(this.a.t(s.o(path), map));
    }

    @Override // java.nio.file.spi.FileSystemProvider
    public final /* synthetic */ Map readAttributes(Path path, String str, LinkOption[] linkOptionArr) {
        return o.f(this.a.y(s.o(path), str, o.j(linkOptionArr)));
    }
}
