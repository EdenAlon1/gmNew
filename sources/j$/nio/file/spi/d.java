package j$.nio.file.spi;

import j$.desugar.sun.nio.fs.g;
import j$.nio.file.C;
import j$.nio.file.C0015d;
import j$.nio.file.CopyOption;
import j$.nio.file.EnumC0003a;
import j$.nio.file.FileSystem;
import j$.nio.file.Files;
import j$.nio.file.Path;
import j$.nio.file.attribute.InterfaceC0011h;
import j$.nio.file.attribute.m;
import j$.nio.file.attribute.s;
import j$.nio.file.k;
import j$.nio.file.n;
import j$.nio.file.u;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.DirectoryStream;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* loaded from: classes9.dex */
public abstract class d {
    private static final Set a = g.c(new Object[]{C.CREATE, C.TRUNCATE_EXISTING, C.WRITE});

    protected d() {
        SecurityManager securityManager = System.getSecurityManager();
        if (securityManager != null) {
            securityManager.checkPermission(new RuntimePermission("fileSystemProvider"));
        }
    }

    public abstract void A(Path path, String str, Object obj, k... kVarArr);

    public abstract void a(Path path, EnumC0003a... enumC0003aArr);

    public abstract void b(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract void c(Path path, m... mVarArr);

    public abstract void d(Path path, Path path2);

    public abstract void e(Path path, Path path2, m... mVarArr);

    public abstract void f(Path path);

    public abstract boolean g(Path path);

    public abstract s h(Path path, Class cls, k... kVarArr);

    public abstract C0015d i(Path path);

    public abstract FileSystem j(URI uri);

    public abstract Path k(URI uri);

    public abstract String l();

    public abstract boolean m(Path path);

    public abstract boolean n(Path path, Path path2);

    public abstract void o(Path path, Path path2, CopyOption... copyOptionArr);

    public abstract j$.nio.channels.a p(Path path, Set set, ExecutorService executorService, m... mVarArr);

    public abstract SeekableByteChannel q(Path path, Set set, m... mVarArr);

    public abstract DirectoryStream r(Path path, u uVar);

    public abstract FileChannel s(Path path, Set set, m... mVarArr);

    public FileSystem t(Path path, Map map) {
        throw new UnsupportedOperationException();
    }

    public abstract FileSystem u(URI uri, Map map);

    public InputStream v(Path path, n... nVarArr) {
        if (nVarArr.length > 0) {
            for (n nVar : nVarArr) {
                if (nVar == C.APPEND || nVar == C.WRITE) {
                    throw new UnsupportedOperationException("'" + String.valueOf(nVar) + "' not allowed");
                }
            }
        }
        return Channels.newInputStream(Files.c(path, nVarArr));
    }

    public OutputStream w(Path path, n... nVarArr) {
        Set set;
        if (nVarArr.length == 0) {
            set = a;
        } else {
            HashSet hashSet = new HashSet();
            for (n nVar : nVarArr) {
                if (nVar == C.READ) {
                    throw new IllegalArgumentException("READ not allowed");
                }
                hashSet.add(nVar);
            }
            hashSet.add(C.WRITE);
            set = hashSet;
        }
        return Channels.newOutputStream(q(path, set, new m[0]));
    }

    public abstract InterfaceC0011h x(Path path, Class cls, k... kVarArr);

    public abstract Map y(Path path, String str, k... kVarArr);

    public abstract Path z(Path path);
}
