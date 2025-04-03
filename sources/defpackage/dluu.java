package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dluu implements dlut {
    public final String a;
    private final List b;
    private final String c;

    public dluu(String str, List list, String str2) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    @Override // defpackage.dlut
    public final String a() {
        return this.c;
    }

    @Override // defpackage.dlut
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dluu)) {
            return false;
        }
        dluu dluuVar = (dluu) obj;
        return ffkj.e(this.a, dluuVar.a) && ffkj.e(this.b, dluuVar.b) && ffkj.e(this.c, dluuVar.c);
    }

    @Override // defpackage.dlut
    public final List f() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (hashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "AnnotationUiDataImpl(text=" + this.a + ", annotations=" + this.b + ", contentDescription=" + this.c + ")";
    }

    public /* synthetic */ dluu(String str, List list, int i) {
        this(str, (i & 2) != 0 ? ffel.a : list, (String) null);
    }
}
