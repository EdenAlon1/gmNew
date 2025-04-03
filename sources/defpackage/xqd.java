package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xqd {
    public final dmnh a = null;
    public final dsho b;

    public xqd(dsho dshoVar) {
        this.b = dshoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xqd)) {
            return false;
        }
        xqd xqdVar = (xqd) obj;
        dmnh dmnhVar = xqdVar.a;
        return ffkj.e(null, null) && ffkj.e(this.b, xqdVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "InputsData(inputsUiData=null, hugoUiData=" + this.b + ")";
    }
}
