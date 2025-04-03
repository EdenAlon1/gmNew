package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zql {
    public final fgdj a;
    public final fgdj b;
    public final fgdj c;
    public final int d;
    public final zqk e;

    public zql(fgdj fgdjVar, fgdj fgdjVar2, fgdj fgdjVar3, int i, zqk zqkVar) {
        fgdjVar.getClass();
        fgdjVar2.getClass();
        fgdjVar3.getClass();
        this.a = fgdjVar;
        this.b = fgdjVar2;
        this.c = fgdjVar3;
        this.d = i;
        this.e = zqkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zql)) {
            return false;
        }
        zql zqlVar = (zql) obj;
        return ffkj.e(this.a, zqlVar.a) && ffkj.e(this.b, zqlVar.b) && ffkj.e(this.c, zqlVar.c) && this.d == zqlVar.d && ffkj.e(this.e, zqlVar.e);
    }

    public final int hashCode() {
        return (((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "MessageListFooterUiData(typingIndicatorUiDataFlow=" + this.a + ", suggestionListUiDataFlow=" + this.b + ", sendingAsUiDataFlow=" + this.c + ", maximumSuggestionRows=" + this.d + ", flags=" + this.e + ")";
    }
}
