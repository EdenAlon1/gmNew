package j$.nio.file;

import java.nio.file.LinkOption;
import java.nio.file.OpenOption;

/* loaded from: classes9.dex */
public final /* synthetic */ class l implements n {
    public final /* synthetic */ OpenOption a;

    private /* synthetic */ l(OpenOption openOption) {
        this.a = openOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.n, java.nio.file.StandardOpenOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.n, java.nio.file.LinkOption] */
    public static /* synthetic */ n a(OpenOption openOption) {
        ?? r1;
        if (openOption == 0) {
            return null;
        }
        if (openOption instanceof m) {
            return ((m) openOption).a;
        }
        if (!(openOption instanceof k)) {
            return openOption instanceof C ? o.b((C) openOption) : new l(openOption);
        }
        r1 = LinkOption.NOFOLLOW_LINKS;
        return r1;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        OpenOption openOption = this.a;
        if (obj instanceof l) {
            obj = ((l) obj).a;
        }
        return openOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
