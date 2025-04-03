package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dofu implements dofy {
    public final dmzz a;

    public dofu(dmzz dmzzVar) {
        dmzzVar.getClass();
        this.a = dmzzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dofu) && this.a == ((dofu) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Icon(icon=" + this.a + ")";
    }
}
