package j$.nio.file;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;

/* loaded from: classes9.dex */
public final /* synthetic */ class m implements OpenOption {
    public final /* synthetic */ n a;

    private /* synthetic */ m(n nVar) {
        this.a = nVar;
    }

    public static /* synthetic */ OpenOption a(n nVar) {
        LinkOption linkOption;
        if (nVar == null) {
            return null;
        }
        if (nVar instanceof l) {
            return ((l) nVar).a;
        }
        if (!(nVar instanceof k)) {
            return nVar instanceof C ? o.b((C) nVar) : new m(nVar);
        }
        linkOption = LinkOption.NOFOLLOW_LINKS;
        return linkOption;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        n nVar = this.a;
        if (obj instanceof m) {
            obj = ((m) obj).a;
        }
        return nVar.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
