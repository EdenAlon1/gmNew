package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zic {
    public final dntg a;
    public final List b;
    public final String c;
    public final List d;

    public zic(dntg dntgVar, List list, String str, List list2) {
        dntgVar.getClass();
        list.getClass();
        this.a = dntgVar;
        this.b = list;
        this.c = str;
        this.d = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zic)) {
            return false;
        }
        zic zicVar = (zic) obj;
        return ffkj.e(this.a, zicVar.a) && ffkj.e(this.b, zicVar.b) && ffkj.e(this.c, zicVar.c) && ffkj.e(this.d, zicVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ReplyMetatextUiData(monogram=" + this.a + ", name=" + this.b + ", timestamp=" + this.c + ", extraIcons=" + this.d + ")";
    }
}
