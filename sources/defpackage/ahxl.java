package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahxl implements ahxn {
    public final String a;

    public ahxl(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ahxl) && ffkj.e(this.a, ((ahxl) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Disabled(reason=" + this.a + ")";
    }
}
