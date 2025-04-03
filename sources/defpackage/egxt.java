package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egxt {
    public final Map a;

    public egxt(Map map) {
        map.getClass();
        this.a = map;
    }

    public final egxt a(egxt egxtVar) {
        return new egxt(ffew.j(this.a, egxtVar.a));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof egxt) && ffkj.e(this.a, ((egxt) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SwatchiePalette(data=" + this.a + ")";
    }
}
