package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dobk implements dobm {
    public final dmzz a;
    private final boolean b = true;

    public dobk(dmzz dmzzVar) {
        this.a = dmzzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dobk)) {
            return false;
        }
        dobk dobkVar = (dobk) obj;
        if (this.a != dobkVar.a) {
            return false;
        }
        boolean z = dobkVar.b;
        return true;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + 1231;
    }

    public final String toString() {
        return "RichCardActionIconUiData(uiData=" + this.a + ", tint=true)";
    }
}
