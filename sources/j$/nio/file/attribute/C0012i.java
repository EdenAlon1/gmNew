package j$.nio.file.attribute;

import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributeView;

/* renamed from: j$.nio.file.attribute.i, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0012i implements InterfaceC0008e {
    public final /* synthetic */ DosFileAttributeView a;

    private /* synthetic */ C0012i(DosFileAttributeView dosFileAttributeView) {
        this.a = dosFileAttributeView;
    }

    public static /* synthetic */ C0012i c(DosFileAttributeView dosFileAttributeView) {
        if (dosFileAttributeView == null) {
            return null;
        }
        return new C0012i(dosFileAttributeView);
    }

    @Override // j$.nio.file.attribute.InterfaceC0008e
    public final /* synthetic */ void a(y yVar, y yVar2, y yVar3) {
        this.a.setTimes(p.d(yVar), p.d(yVar2), p.d(yVar3));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        DosFileAttributeView dosFileAttributeView = this.a;
        if (obj instanceof C0012i) {
            obj = ((C0012i) obj).a;
        }
        return dosFileAttributeView.equals(obj);
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
