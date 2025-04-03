package defpackage;

import j$.util.Objects;
import java.io.Serializable;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class embu implements Serializable {
    public final embm a;
    public final Map b;

    private embu(embm embmVar, Map map) {
        this.a = embmVar;
        this.b = map;
    }

    static embu a(embm embmVar, Map map) {
        enhd enhdVar = new enhd();
        enhdVar.k("Authorization", engw.r("Bearer ".concat(String.valueOf(embmVar.a))));
        enhdVar.g(map);
        return new embu(embmVar, enhdVar.c());
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof embu)) {
            return false;
        }
        embu embuVar = (embu) obj;
        return Objects.equals(this.b, embuVar.b) && Objects.equals(this.a, embuVar.a);
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
