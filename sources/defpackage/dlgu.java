package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlgu {
    public final String a;
    public final dlfs b;
    private final Map c;

    /* JADX WARN: Multi-variable type inference failed */
    public dlgu() {
        this((String) null, (dlfs) (0 == true ? 1 : 0), 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlgu)) {
            return false;
        }
        dlgu dlguVar = (dlgu) obj;
        return ffkj.e(this.a, dlguVar.a) && this.b == dlguVar.b && ffkj.e(this.c, dlguVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Verdict(pv=" + this.a + ", action=" + this.b + ")";
    }

    public dlgu(String str, dlfs dlfsVar, Map map) {
        str.getClass();
        dlfsVar.getClass();
        this.a = str;
        this.b = dlfsVar;
        this.c = map;
    }

    public /* synthetic */ dlgu(String str, dlfs dlfsVar, int i) {
        this(1 == (i & 1) ? "UNKNOWN" : str, (i & 2) != 0 ? dlfs.d : dlfsVar, ffem.a);
    }
}
