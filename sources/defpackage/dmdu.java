package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmdu implements dmdw {
    public final dmzz a;

    public dmdu(dmzz dmzzVar) {
        this.a = dmzzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmdu) && this.a == ((dmdu) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ")";
    }
}
