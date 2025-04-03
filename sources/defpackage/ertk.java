package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ertk {
    public final int a;
    public final int b;
    private final String c;

    public ertk(String str, int i, int i2) {
        this.c = str;
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ertk ertkVar = (ertk) obj;
            if (this.a == ertkVar.a && Objects.equals(this.c, ertkVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.c, Integer.valueOf(this.a));
    }

    public final String toString() {
        return "UrlAndRange{url='" + this.c + "', start=" + this.a + "}";
    }
}
