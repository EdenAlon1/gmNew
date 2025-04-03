package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czbs {
    public final dndt a;
    public final dmjg b;

    public czbs(dndt dndtVar, dmjg dmjgVar) {
        this.a = dndtVar;
        this.b = dmjgVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czbs)) {
            return false;
        }
        czbs czbsVar = (czbs) obj;
        return ffkj.e(this.a, czbsVar.a) && ffkj.e(this.b, czbsVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        dmjg dmjgVar = this.b;
        return hashCode + (dmjgVar == null ? 0 : dmjgVar.hashCode());
    }

    public final String toString() {
        return "SearchActionItemUiData(listItemUiData=" + this.a + ", previewUiData=" + this.b + ")";
    }

    public /* synthetic */ czbs(dndt dndtVar) {
        this(dndtVar, null);
    }
}
