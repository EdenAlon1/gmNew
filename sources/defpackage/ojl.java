package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ojl extends ojo {
    public final int a;
    public final int b;
    public final int c;

    public ojl(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ojl)) {
            return false;
        }
        ojl ojlVar = (ojl) obj;
        return this.a == ojlVar.a && this.b == ojlVar.b && this.c == ojlVar.c;
    }

    public final int hashCode() {
        return this.a + this.b + this.c;
    }

    public final String toString() {
        String c;
        c = ffpc.c("PagingDataEvent.DropPrepend dropped " + this.a + " items (\n                    |   dropCount: " + this.a + "\n                    |   newPlaceholdersBefore: " + this.b + "\n                    |   oldPlaceholdersBefore: " + this.c + "\n                    |)\n                    |", "|");
        return c;
    }
}
