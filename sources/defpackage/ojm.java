package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ojm extends ojo {
    public final List a;
    public final int b;
    public final int c;

    public ojm(List list, int i, int i2) {
        this.a = list;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ojm)) {
            return false;
        }
        ojm ojmVar = (ojm) obj;
        return ffkj.e(this.a, ojmVar.a) && this.b == ojmVar.b && this.c == ojmVar.c;
    }

    public final int hashCode() {
        return this.a.hashCode() + this.b + this.c;
    }

    public final String toString() {
        String c;
        c = ffpc.c("PagingDataEvent.Prepend loaded " + this.a.size() + " items (\n                    |   first item: " + ffdx.M(this.a) + "\n                    |   last item: " + ffdx.Q(this.a) + "\n                    |   newPlaceholdersBefore: " + this.b + "\n                    |   oldPlaceholdersBefore: " + this.c + "\n                    |)\n                    |", "|");
        return c;
    }
}
