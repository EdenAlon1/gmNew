package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duvj extends qmx {
    public static final duvj a = new duvj("", 0, 0);
    public final String b;
    public final int c;
    public final int d;

    public duvj(String str, int i, int i2) {
        this.b = str;
        this.c = i;
        this.d = i2;
    }

    public final duvj a(String str) {
        return this.b.equals(str) ? this : new duvj(str, this.c, this.d);
    }

    public final /* synthetic */ boolean b(Object obj) {
        if (!(obj instanceof duvj)) {
            return false;
        }
        duvj duvjVar = (duvj) obj;
        return this.c == duvjVar.c && this.d == duvjVar.d && Objects.equals(this.b, duvjVar.b);
    }

    public final boolean equals(Object obj) {
        return b(obj);
    }

    public final int hashCode() {
        return (((this.c * 31) + this.d) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.b, Integer.valueOf(this.c), Integer.valueOf(this.d)};
        String[] split = "text;width;height".split(";");
        StringBuilder sb = new StringBuilder("duvj[");
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
