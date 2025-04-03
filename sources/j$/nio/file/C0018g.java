package j$.nio.file;

import java.nio.file.PathMatcher;
import java.nio.file.WatchService;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.spi.FileSystemProvider;
import java.util.Set;

/* renamed from: j$.nio.file.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0018g extends FileSystem {
    public final /* synthetic */ java.nio.file.FileSystem a;

    private C0018g(java.nio.file.FileSystem fileSystem) {
        this.a = fileSystem;
    }

    public static /* synthetic */ FileSystem D(java.nio.file.FileSystem fileSystem) {
        if (fileSystem == null) {
            return null;
        }
        return fileSystem instanceof C0019h ? ((C0019h) fileSystem).a : new C0018g(fileSystem);
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ J A() {
        WatchService newWatchService;
        newWatchService = this.a.newWatchService();
        return J.i(newWatchService);
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ j$.nio.file.spi.d B() {
        FileSystemProvider provider;
        provider = this.a.provider();
        return j$.nio.file.spi.b.B(provider);
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ Set C() {
        Set supportedFileAttributeViews;
        supportedFileAttributeViews = this.a.supportedFileAttributeViews();
        return supportedFileAttributeViews;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.FileSystem fileSystem = this.a;
        if (obj instanceof C0018g) {
            obj = ((C0018g) obj).a;
        }
        return fileSystem.equals(obj);
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ Path getPath(String str, String[] strArr) {
        java.nio.file.Path path;
        path = this.a.getPath(str, strArr);
        return s.o(path);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ Iterable i() {
        Iterable fileStores;
        fileStores = this.a.getFileStores();
        return fileStores;
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ boolean isOpen() {
        boolean isOpen;
        isOpen = this.a.isOpen();
        return isOpen;
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ B p(String str) {
        PathMatcher pathMatcher;
        pathMatcher = this.a.getPathMatcher(str);
        return z.b(pathMatcher);
    }

    @Override // j$.nio.file.FileSystem
    public final Iterable s() {
        Iterable rootDirectories;
        rootDirectories = this.a.getRootDirectories();
        return new x(rootDirectories);
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ String t() {
        String separator;
        separator = this.a.getSeparator();
        return separator;
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ j$.nio.file.attribute.H w() {
        UserPrincipalLookupService userPrincipalLookupService;
        userPrincipalLookupService = this.a.getUserPrincipalLookupService();
        return j$.nio.file.attribute.H.a(userPrincipalLookupService);
    }

    @Override // j$.nio.file.FileSystem
    public final /* synthetic */ boolean z() {
        boolean isReadOnly;
        isReadOnly = this.a.isReadOnly();
        return isReadOnly;
    }
}
