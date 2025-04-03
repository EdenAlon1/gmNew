package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssi implements ssk {
    public final dmzz a;

    public ssi(dmzz dmzzVar) {
        dmzzVar.getClass();
        this.a = dmzzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ssi) && this.a == ((ssi) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ")";
    }
}
