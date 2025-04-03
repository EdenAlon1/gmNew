package j$.nio.file.attribute;

import java.nio.file.attribute.FileAttributeView;

/* loaded from: classes9.dex */
public final /* synthetic */ class q implements s {
    public final /* synthetic */ FileAttributeView a;

    private /* synthetic */ q(FileAttributeView fileAttributeView) {
        this.a = fileAttributeView;
    }

    public static /* synthetic */ s c(FileAttributeView fileAttributeView) {
        if (fileAttributeView == null) {
            return null;
        }
        return fileAttributeView instanceof r ? ((r) fileAttributeView).a : AbstractC0005b.z(fileAttributeView) ? C0006c.c(AbstractC0005b.i(fileAttributeView)) : AbstractC0005b.B(fileAttributeView) ? u.c(AbstractC0005b.m(fileAttributeView)) : AbstractC0005b.D(fileAttributeView) ? D.c(AbstractC0005b.r(fileAttributeView)) : new q(fileAttributeView);
    }

    public final /* synthetic */ boolean equals(Object obj) {
        FileAttributeView fileAttributeView = this.a;
        if (obj instanceof q) {
            obj = ((q) obj).a;
        }
        return fileAttributeView.equals(obj);
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
}
