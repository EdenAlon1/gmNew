package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class ckvk extends ckvl {
    private final Map a;

    public ckvk() {
        this(ffem.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ckvk) && ffkj.e(this.a, ((ckvk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(repairResults=" + this.a + ")";
    }

    public ckvk(Map map) {
        map.getClass();
        this.a = map;
    }
}
