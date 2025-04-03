package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dupi extends qmx {
    public final enhk a;
    private final String b;

    public dupi(String str, enhk enhkVar) {
        this.b = str;
        this.a = enhkVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof dupi)) {
            return false;
        }
        dupi dupiVar = (dupi) obj;
        return Objects.equals(this.b, dupiVar.b) && Objects.equals(this.a, dupiVar.a);
    }

    public final int hashCode() {
        return (Objects.hashCode(this.b) * 31) + Objects.hashCode(this.a);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.b, this.a};
        String[] split = "base;variantModifierSetsToVariants".split(";");
        StringBuilder sb = new StringBuilder("dupi[");
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
