package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dmhd {
    public final dlsf a;

    public dmhd(dlsf dlsfVar) {
        this.a = dlsfVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dmhd) && ffkj.e(this.a, ((dmhd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RemoveButtonUiData(callback=" + this.a + ")";
    }
}
