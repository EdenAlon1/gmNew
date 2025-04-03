package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ojj extends ojo {
    public final int a;
    public final List b;
    public final int c;
    public final int d;

    public ojj(int i, List list, int i2, int i3) {
        this.a = i;
        this.b = list;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ojj)) {
            return false;
        }
        ojj ojjVar = (ojj) obj;
        return this.a == ojjVar.a && ffkj.e(this.b, ojjVar.b) && this.c == ojjVar.c && this.d == ojjVar.d;
    }

    public final int hashCode() {
        return this.a + this.b.hashCode() + this.c + this.d;
    }

    public final String toString() {
        String c;
        c = ffpc.c("PagingDataEvent.Append loaded " + this.b.size() + " items (\n                    |   startIndex: " + this.a + "\n                    |   first item: " + ffdx.M(this.b) + "\n                    |   last item: " + ffdx.Q(this.b) + "\n                    |   newPlaceholdersBefore: " + this.c + "\n                    |   oldPlaceholdersBefore: " + this.d + "\n                    |)\n                    |", "|");
        return c;
    }
}
