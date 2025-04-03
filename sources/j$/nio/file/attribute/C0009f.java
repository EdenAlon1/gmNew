package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0009f implements InterfaceC0011h {
    public final /* synthetic */ BasicFileAttributes a;

    private /* synthetic */ C0009f(BasicFileAttributes basicFileAttributes) {
        this.a = basicFileAttributes;
    }

    public static /* synthetic */ InterfaceC0011h a(BasicFileAttributes basicFileAttributes) {
        if (basicFileAttributes == null) {
            return null;
        }
        return basicFileAttributes instanceof C0010g ? ((C0010g) basicFileAttributes).a : AbstractC0005b.t(basicFileAttributes) ? j.a(AbstractC0005b.l(basicFileAttributes)) : AbstractC0005b.w(basicFileAttributes) ? B.a(AbstractC0005b.q(basicFileAttributes)) : new C0009f(basicFileAttributes);
    }

    @Override // j$.nio.file.attribute.InterfaceC0011h
    public final /* synthetic */ y creationTime() {
        FileTime creationTime;
        creationTime = this.a.creationTime();
        return p.b(creationTime);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributes basicFileAttributes = this.a;
        if (obj instanceof C0009f) {
            obj = ((C0009f) obj).a;
        }
        return basicFileAttributes.equals(obj);
    }

    @Override // j$.nio.file.attribute.InterfaceC0011h
    public final /* synthetic */ Object fileKey() {
        Object fileKey;
        fileKey = this.a.fileKey();
        return fileKey;
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.InterfaceC0011h
    public final /* synthetic */ boolean isDirectory() {
        boolean isDirectory;
        isDirectory = this.a.isDirectory();
        return isDirectory;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011h
    public final /* synthetic */ boolean isOther() {
        boolean isOther;
        isOther = this.a.isOther();
        return isOther;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011h
    public final /* synthetic */ boolean isRegularFile() {
        boolean isRegularFile;
        isRegularFile = this.a.isRegularFile();
        return isRegularFile;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011h
    public final /* synthetic */ boolean isSymbolicLink() {
        boolean isSymbolicLink;
        isSymbolicLink = this.a.isSymbolicLink();
        return isSymbolicLink;
    }

    @Override // j$.nio.file.attribute.InterfaceC0011h
    public final /* synthetic */ y lastAccessTime() {
        FileTime lastAccessTime;
        lastAccessTime = this.a.lastAccessTime();
        return p.b(lastAccessTime);
    }

    @Override // j$.nio.file.attribute.InterfaceC0011h
    public final /* synthetic */ y lastModifiedTime() {
        FileTime lastModifiedTime;
        lastModifiedTime = this.a.lastModifiedTime();
        return p.b(lastModifiedTime);
    }

    @Override // j$.nio.file.attribute.InterfaceC0011h
    public final /* synthetic */ long size() {
        long size;
        size = this.a.size();
        return size;
    }
}
