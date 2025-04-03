package j$.nio.file.attribute;

import java.nio.file.attribute.AclFileAttributeView;
import java.nio.file.attribute.UserPrincipal;

/* renamed from: j$.nio.file.attribute.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0004a implements w {
    public final /* synthetic */ AclFileAttributeView a;

    private /* synthetic */ C0004a(AclFileAttributeView aclFileAttributeView) {
        this.a = aclFileAttributeView;
    }

    public static /* synthetic */ C0004a c(AclFileAttributeView aclFileAttributeView) {
        if (aclFileAttributeView == null) {
            return null;
        }
        return new C0004a(aclFileAttributeView);
    }

    @Override // j$.nio.file.attribute.w
    public final /* synthetic */ void b(G g) {
        this.a.setOwner(F.a(g));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        AclFileAttributeView aclFileAttributeView = this.a;
        if (obj instanceof C0004a) {
            obj = ((C0004a) obj).a;
        }
        return aclFileAttributeView.equals(obj);
    }

    @Override // j$.nio.file.attribute.w
    public final /* synthetic */ G getOwner() {
        UserPrincipal owner;
        owner = this.a.getOwner();
        return E.a(owner);
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
