package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class esrb {
    public final String a;
    public final esrd b;
    public final Map c;
    public final esqs d;

    public esrb(String str, esrd esrdVar, Map map, esqs esqsVar) {
        str.getClass();
        esrdVar.getClass();
        map.getClass();
        esqsVar.getClass();
        this.a = str;
        this.b = esrdVar;
        this.c = map;
        this.d = esqsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esrb)) {
            return false;
        }
        esrb esrbVar = (esrb) obj;
        return ffkj.e(this.a, esrbVar.a) && this.b == esrbVar.b && ffkj.e(this.c, esrbVar.c) && ffkj.e(this.d, esrbVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "GroupProperties(name=" + this.a + ", type=" + this.b + ", metadata=" + this.c + ", icon=" + this.d + ")";
    }
}
