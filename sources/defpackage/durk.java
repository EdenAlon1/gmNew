package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class durk extends qmx {
    public final int a;
    public final we b;
    public final dusz c;

    public durk(int i, we weVar, dusz duszVar) {
        this.a = i;
        this.b = weVar;
        this.c = duszVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof durk)) {
            return false;
        }
        durk durkVar = (durk) obj;
        return this.a == durkVar.a && Objects.equals(this.b, durkVar.b) && Objects.equals(this.c, durkVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + Objects.hashCode(this.b)) * 31) + Objects.hashCode(this.c);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {Integer.valueOf(this.a), this.b, this.c};
        String[] split = "spanCount;recycledViewPool;delegate".split(";");
        StringBuilder sb = new StringBuilder("durk[");
        while (true) {
            int length = split.length;
            if (i >= length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(split[i]);
            sb.append("=");
            sb.append(objArr[i]);
            if (i != length - 1) {
                sb.append(", ");
            }
            i++;
        }
    }
}
