package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doun {
    public final List a;
    public final String b;
    public final ffix c;

    public doun(List list, String str, ffix ffixVar) {
        this.a = list;
        this.b = str;
        this.c = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doun)) {
            return false;
        }
        doun dounVar = (doun) obj;
        return ffkj.e(this.a, dounVar.a) && ffkj.e(this.b, dounVar.b) && ffkj.e(this.c, dounVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TypingIndicatorUiData(monogramItemList=" + this.a + ", contentDescription=" + this.b + ", onClick=" + this.c + ")";
    }
}
