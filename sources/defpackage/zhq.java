package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zhq {
    public final String a;
    public final String b;
    public final List c;
    public final ffix d;

    public zhq(String str, String str2, List list, ffix ffixVar) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhq)) {
            return false;
        }
        zhq zhqVar = (zhq) obj;
        return ffkj.e(this.a, zhqVar.a) && ffkj.e(this.b, zhqVar.b) && ffkj.e(this.c, zhqVar.c) && ffkj.e(this.d, zhqVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "MessageToolbarUiData(title=" + this.a + ", subtitle=" + this.b + ", actions=" + this.c + ", onClickCloseButton=" + this.d + ")";
    }
}
