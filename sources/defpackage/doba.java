package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class doba {
    public final dlss a;
    public final String b;
    public final String c;
    public final List d;
    public final ffix e;
    public final doaz f;

    public doba(dlss dlssVar, doaz doazVar, String str, String str2, List list, ffix ffixVar) {
        str.getClass();
        list.getClass();
        this.a = dlssVar;
        this.f = doazVar;
        this.b = str;
        this.c = str2;
        this.d = list;
        this.e = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof doba)) {
            return false;
        }
        doba dobaVar = (doba) obj;
        return ffkj.e(this.a, dobaVar.a) && ffkj.e(this.f, dobaVar.f) && ffkj.e(this.b, dobaVar.b) && ffkj.e(this.c, dobaVar.c) && ffkj.e(this.d, dobaVar.d) && ffkj.e(this.e, dobaVar.e);
    }

    public final int hashCode() {
        dlss dlssVar = this.a;
        int hashCode = ((((dlssVar == null ? 0 : dlssVar.hashCode()) * 31) + this.f.hashCode()) * 31) + this.b.hashCode();
        String str = this.c;
        return (((((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "AppBarUiData(navigationAction=" + this.a + ", logo=" + this.f + ", title=" + this.b + ", description=" + this.c + ", actions=" + this.d + ", onClick=" + this.e + ")";
    }
}
