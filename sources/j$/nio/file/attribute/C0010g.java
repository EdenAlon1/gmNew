package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0010g implements BasicFileAttributes {
    public final /* synthetic */ InterfaceC0011h a;

    private /* synthetic */ C0010g(InterfaceC0011h interfaceC0011h) {
        this.a = interfaceC0011h;
    }

    public static /* synthetic */ BasicFileAttributes a(InterfaceC0011h interfaceC0011h) {
        if (interfaceC0011h == null) {
            return null;
        }
        return interfaceC0011h instanceof C0009f ? ((C0009f) interfaceC0011h).a : interfaceC0011h instanceof j ? ((j) interfaceC0011h).a : interfaceC0011h instanceof B ? ((B) interfaceC0011h).a : new C0010g(interfaceC0011h);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime creationTime() {
        return p.d(this.a.creationTime());
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0011h interfaceC0011h = this.a;
        if (obj instanceof C0010g) {
            obj = ((C0010g) obj).a;
        }
        return interfaceC0011h.equals(obj);
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ Object fileKey() {
        return this.a.fileKey();
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isDirectory() {
        return this.a.isDirectory();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isOther() {
        return this.a.isOther();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isRegularFile() {
        return this.a.isRegularFile();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ boolean isSymbolicLink() {
        return this.a.isSymbolicLink();
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastAccessTime() {
        return p.d(this.a.lastAccessTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ FileTime lastModifiedTime() {
        return p.d(this.a.lastModifiedTime());
    }

    @Override // java.nio.file.attribute.BasicFileAttributes
    public final /* synthetic */ long size() {
        return this.a.size();
    }
}
