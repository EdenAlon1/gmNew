package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class duwf extends qmx {
    public final Object a;
    public final int b;

    public duwf(Object obj, int i) {
        this.a = obj;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof duwf)) {
            return false;
        }
        duwf duwfVar = (duwf) obj;
        return this.b == duwfVar.b && Objects.equals(this.a, duwfVar.a);
    }

    public final int hashCode() {
        return (this.b * 31) + Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, Integer.valueOf(this.b)};
        String[] split = "value;priority".split(";");
        StringBuilder sb = new StringBuilder("duwf[");
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
