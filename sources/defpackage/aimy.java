package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aimy implements ellf {
    private final String a;

    public aimy(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aimy) && ffkj.e(this.a, ((aimy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Renamed(newName=" + this.a + ")";
    }
}
