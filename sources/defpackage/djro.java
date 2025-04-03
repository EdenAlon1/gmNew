package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djro implements djrm {
    public final String a;

    public djro(String str) {
        str.getClass();
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djro) && ffkj.e(this.a, ((djro) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SimId(idValue=" + this.a + ")";
    }
}
