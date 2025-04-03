package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ojk extends ojo {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public ojk(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ojk)) {
            return false;
        }
        ojk ojkVar = (ojk) obj;
        return this.a == ojkVar.a && this.b == ojkVar.b && this.c == ojkVar.c && this.d == ojkVar.d;
    }

    public final int hashCode() {
        return this.a + this.b + this.c + this.d;
    }

    public final String toString() {
        String c;
        c = ffpc.c("PagingDataEvent.DropAppend dropped " + this.b + " items (\n                    |   startIndex: " + this.a + "\n                    |   dropCount: " + this.b + "\n                    |   newPlaceholdersBefore: " + this.c + "\n                    |   oldPlaceholdersBefore: " + this.d + "\n                    |)\n                    |", "|");
        return c;
    }
}
