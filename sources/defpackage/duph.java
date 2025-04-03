package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duph extends qmx {
    public final String a;
    public final engw b;

    public duph(String str, engw engwVar) {
        this.a = str;
        this.b = engwVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof duph)) {
            return false;
        }
        duph duphVar = (duph) obj;
        return Objects.equals(this.a, duphVar.a) && Objects.equals(this.b, duphVar.b);
    }

    public final int hashCode() {
        return (Objects.hashCode(this.a) * 31) + Objects.hashCode(this.b);
    }

    public final String toString() {
        int i = 0;
        Object[] objArr = {this.a, this.b};
        String[] split = "primary;secondaries".split(";");
        StringBuilder sb = new StringBuilder("duph[");
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
