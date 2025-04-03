package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* renamed from: j$.nio.file.attribute.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0007d implements BasicFileAttributeView {
    public final /* synthetic */ InterfaceC0008e a;

    private /* synthetic */ C0007d(InterfaceC0008e interfaceC0008e) {
        this.a = interfaceC0008e;
    }

    public static /* synthetic */ BasicFileAttributeView a(InterfaceC0008e interfaceC0008e) {
        if (interfaceC0008e == null) {
            return null;
        }
        return interfaceC0008e instanceof C0006c ? ((C0006c) interfaceC0008e).a : interfaceC0008e instanceof C0012i ? ((C0012i) interfaceC0008e).a : interfaceC0008e instanceof A ? ((A) interfaceC0008e).a : new C0007d(interfaceC0008e);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        InterfaceC0008e interfaceC0008e = this.a;
        if (obj instanceof C0007d) {
            obj = ((C0007d) obj).a;
        }
        return interfaceC0008e.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView, java.nio.file.attribute.AttributeView
    public final /* synthetic */ String name() {
        return this.a.name();
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ BasicFileAttributes readAttributes() {
        return C0010g.a(this.a.readAttributes());
    }

    @Override // java.nio.file.attribute.BasicFileAttributeView
    public final /* synthetic */ void setTimes(FileTime fileTime, FileTime fileTime2, FileTime fileTime3) {
        this.a.a(p.b(fileTime), p.b(fileTime2), p.b(fileTime3));
    }
}
