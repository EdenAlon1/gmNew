package j$.nio.file;

import j$.lang.Iterable$EL;
import j$.util.Spliterator;
import j$.util.e0;
import java.io.File;
import java.net.URI;
import java.nio.file.WatchEvent;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;
import java.util.Iterator;
import java.util.function.Consumer;

/* loaded from: classes9.dex */
public final /* synthetic */ class s implements Path, j$.lang.a {
    public final /* synthetic */ java.nio.file.Path a;

    private /* synthetic */ s(java.nio.file.Path path) {
        this.a = path;
    }

    public static /* synthetic */ Path o(java.nio.file.Path path) {
        if (path == null) {
            return null;
        }
        return path instanceof t ? ((t) path).a : new s(path);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean E(Path path) {
        boolean endsWith;
        endsWith = this.a.endsWith(t.o(path));
        return endsWith;
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path I(Path path) {
        java.nio.file.Path resolveSibling;
        resolveSibling = this.a.resolveSibling(t.o(path));
        return o(resolveSibling);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ I J(J j, G[] gArr) {
        WatchKey register;
        register = this.a.register(j == null ? null : j.a, o.m(gArr));
        return I.a(register);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path X(Path path) {
        java.nio.file.Path relativize;
        relativize = this.a.relativize(t.o(path));
        return o(relativize);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Path path) {
        int compareTo;
        compareTo = this.a.compareTo((java.nio.file.Path) o.c(path));
        return compareTo;
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean endsWith(String str) {
        boolean endsWith;
        endsWith = this.a.endsWith(str);
        return endsWith;
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.Path path = this.a;
        if (obj instanceof s) {
            obj = ((s) obj).a;
        }
        return path.equals(obj);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final /* synthetic */ void forEach(Consumer consumer) {
        Iterable$EL.forEach(this.a, consumer);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getFileName() {
        java.nio.file.Path fileName;
        fileName = this.a.getFileName();
        return o(fileName);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ FileSystem getFileSystem() {
        java.nio.file.FileSystem fileSystem;
        fileSystem = this.a.getFileSystem();
        return C0018g.D(fileSystem);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getName(int i) {
        java.nio.file.Path name;
        name = this.a.getName(i);
        return o(name);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ int getNameCount() {
        int nameCount;
        nameCount = this.a.getNameCount();
        return nameCount;
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getParent() {
        java.nio.file.Path parent;
        parent = this.a.getParent();
        return o(parent);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path getRoot() {
        java.nio.file.Path root;
        root = this.a.getRoot();
        return o(root);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean isAbsolute() {
        boolean isAbsolute;
        isAbsolute = this.a.isAbsolute();
        return isAbsolute;
    }

    @Override // j$.nio.file.Path, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it;
        it = this.a.iterator();
        return new y(it);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path normalize() {
        java.nio.file.Path normalize;
        normalize = this.a.normalize();
        return o(normalize);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ I p(J j, G[] gArr, H[] hArr) {
        WatchKey register;
        java.nio.file.Path path = this.a;
        WatchEvent.Modifier[] modifierArr = null;
        WatchService watchService = j == null ? null : j.a;
        WatchEvent.Kind[] m = o.m(gArr);
        if (hArr != null) {
            int length = hArr.length;
            WatchEvent.Modifier[] modifierArr2 = new WatchEvent.Modifier[length];
            for (int i = 0; i < length; i++) {
                H h = hArr[i];
                modifierArr2[i] = h == null ? null : h.a;
            }
            modifierArr = modifierArr2;
        }
        register = path.register(watchService, m, modifierArr);
        return I.a(register);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolve(String str) {
        java.nio.file.Path resolve;
        resolve = this.a.resolve(str);
        return o(resolve);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path resolveSibling(String str) {
        java.nio.file.Path resolveSibling;
        resolveSibling = this.a.resolveSibling(str);
        return o(resolveSibling);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path s(Path path) {
        java.nio.file.Path resolve;
        resolve = this.a.resolve(t.o(path));
        return o(resolve);
    }

    @Override // java.lang.Iterable, j$.lang.a, j$.util.Collection
    public final /* synthetic */ Spliterator spliterator() {
        java.util.Spliterator spliterator;
        spliterator = this.a.spliterator();
        return e0.a(spliterator);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean startsWith(String str) {
        boolean startsWith;
        startsWith = this.a.startsWith(str);
        return startsWith;
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path subpath(int i, int i2) {
        java.nio.file.Path subpath;
        subpath = this.a.subpath(i, i2);
        return o(subpath);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path t(k[] kVarArr) {
        java.nio.file.Path realPath;
        realPath = this.a.toRealPath(o.l(kVarArr));
        return o(realPath);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ Path toAbsolutePath() {
        java.nio.file.Path absolutePath;
        absolutePath = this.a.toAbsolutePath();
        return o(absolutePath);
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ File toFile() {
        File file;
        file = this.a.toFile();
        return file;
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ String toString() {
        String path;
        path = this.a.toString();
        return path;
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ URI toUri() {
        URI uri;
        uri = this.a.toUri();
        return uri;
    }

    @Override // j$.nio.file.Path
    /* renamed from: w */
    public final /* synthetic */ int compareTo(Path path) {
        int compareTo;
        compareTo = this.a.compareTo(t.o(path));
        return compareTo;
    }

    @Override // j$.nio.file.Path
    public final /* synthetic */ boolean z(Path path) {
        boolean startsWith;
        startsWith = this.a.startsWith(t.o(path));
        return startsWith;
    }
}
