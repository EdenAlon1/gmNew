package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dorc {
    public final String a;
    public final List b;
    private final String c = null;
    private final boolean d = true;
    private final boolean e = true;

    public dorc(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dorc)) {
            return false;
        }
        dorc dorcVar = (dorc) obj;
        if (!ffkj.e(this.a, dorcVar.a)) {
            return false;
        }
        String str = dorcVar.c;
        if (!ffkj.e(null, null) || !ffkj.e(this.b, dorcVar.b)) {
            return false;
        }
        boolean z = dorcVar.d;
        boolean z2 = dorcVar.e;
        return true;
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 961) + this.b.hashCode()) * 31) + 1231) * 31) + 1231;
    }

    public final String toString() {
        return "TooltipUiData(body=" + this.a + ", title=null, actions=" + this.b + ", isPersistent=true, isVisible=true)";
    }
}
