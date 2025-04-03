package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dche {
    public final int c;

    public dche(int i) {
        this.c = i;
    }

    public abstract int a();

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof dche) && this.c == ((dche) obj).c;
    }

    public int hashCode() {
        throw null;
    }
}
