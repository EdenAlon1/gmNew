package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmiq {
    public final String a;
    public final ffix b;
    private final dmzz c = null;

    public dmiq(String str, ffix ffixVar) {
        this.a = str;
        this.b = ffixVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmiq)) {
            return false;
        }
        dmiq dmiqVar = (dmiq) obj;
        if (!ffkj.e(this.a, dmiqVar.a)) {
            return false;
        }
        dmzz dmzzVar = dmiqVar.c;
        return ffkj.e(this.b, dmiqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 961) + this.b.hashCode();
    }

    public final String toString() {
        return "CardstoneButtonUiData(text=" + this.a + ", icon=null, onClick=" + this.b + ")";
    }
}
