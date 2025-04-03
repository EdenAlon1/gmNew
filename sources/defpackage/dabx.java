package defpackage;

import j$.time.Instant;
import j$.time.ZoneId;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dabx {
    public final Instant a;
    private final String b;
    private final long c;
    private final dabz d;
    private final bdpy e;
    private final Map f;

    public dabx(String str, long j, Instant instant, dabz dabzVar, bdpy bdpyVar, Map map) {
        dabzVar.getClass();
        this.b = str;
        this.c = j;
        this.a = instant;
        this.d = dabzVar;
        this.e = bdpyVar;
        this.f = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dabx)) {
            return false;
        }
        dabx dabxVar = (dabx) obj;
        return ffkj.e(this.b, dabxVar.b) && this.c == dabxVar.c && ffkj.e(this.a, dabxVar.a) && this.d == dabxVar.d && ffkj.e(this.e, dabxVar.e) && ffkj.e(this.f, dabxVar.f);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        long j = this.c;
        return ((((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + this.a.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode();
    }

    public final String toString() {
        String str = this.b;
        Long valueOf = Long.valueOf(this.c);
        Instant instant = this.a;
        return ffdx.aA(ffdx.g(str, valueOf, instant, instant.atZone(ZoneId.systemDefault()), this.d.name(), this.e, this.f), ", ", null, null, new ffji() { // from class: dabv
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                return a.i(obj, "\"", "\"");
            }
        }, 30);
    }
}
