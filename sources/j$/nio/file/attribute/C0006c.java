package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;

/* renamed from: j$.nio.file.attribute.c, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0006c implements InterfaceC0008e {
    public final /* synthetic */ BasicFileAttributeView a;

    private /* synthetic */ C0006c(BasicFileAttributeView basicFileAttributeView) {
        this.a = basicFileAttributeView;
    }

    public static /* synthetic */ InterfaceC0008e c(BasicFileAttributeView basicFileAttributeView) {
        if (basicFileAttributeView == null) {
            return null;
        }
        return basicFileAttributeView instanceof C0007d ? ((C0007d) basicFileAttributeView).a : j$.nio.file.r.r(basicFileAttributeView) ? C0012i.c(j$.nio.file.r.i(basicFileAttributeView)) : j$.nio.file.r.v(basicFileAttributeView) ? A.c(AbstractC0005b.p(basicFileAttributeView)) : new C0006c(basicFileAttributeView);
    }

    @Override // j$.nio.file.attribute.InterfaceC0008e
    public final /* synthetic */ void a(y yVar, y yVar2, y yVar3) {
        this.a.setTimes(p.d(yVar), p.d(yVar2), p.d(yVar3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        BasicFileAttributeView basicFileAttributeView = this.a;
        if (obj instanceof C0006c) {
            obj = ((C0006c) obj).a;
        }
        return basicFileAttributeView.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.nio.file.attribute.s
    public final /* synthetic */ String name() {
        String name;
        name = this.a.name();
        return name;
    }

    @Override // j$.nio.file.attribute.InterfaceC0008e
    public final /* synthetic */ InterfaceC0011h readAttributes() {
        BasicFileAttributes readAttributes;
        readAttributes = this.a.readAttributes();
        return C0009f.a(readAttributes);
    }
}
