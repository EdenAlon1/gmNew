package defpackage;

import j$.util.Optional;
import j$.util.OptionalInt;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class edub extends edtz {
    public final edvk a;
    public final OptionalInt b;
    public final OptionalInt c;
    private final long d;
    private final emto e;
    private final Optional f;

    public edub(edvk edvkVar, long j, emto emtoVar, OptionalInt optionalInt, OptionalInt optionalInt2, Optional optional) {
        this.a = edvkVar;
        this.d = j;
        this.e = emtoVar;
        this.b = optionalInt;
        this.c = optionalInt2;
        this.f = optional;
    }

    @Override // defpackage.edtz
    public final long a() {
        return this.d;
    }

    @Override // defpackage.edtz
    public final edvk b() {
        return this.a;
    }

    @Override // defpackage.edtz
    public final emto c() {
        return this.e;
    }

    @Override // defpackage.edtz
    public final Optional d() {
        return this.f;
    }

    @Override // defpackage.edtz
    public final OptionalInt e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof edtz) {
            edtz edtzVar = (edtz) obj;
            if (this.a.equals(edtzVar.b()) && this.d == edtzVar.a() && this.e.equals(edtzVar.c()) && this.b.equals(edtzVar.f()) && this.c.equals(edtzVar.e()) && this.f.equals(edtzVar.d())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.edtz
    public final OptionalInt f() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.d;
        return (((((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Optional optional = this.f;
        OptionalInt optionalInt = this.c;
        OptionalInt optionalInt2 = this.b;
        emto emtoVar = this.e;
        return "AggregateData{eventVector=" + this.a.toString() + ", systemProfileHash=" + this.d + ", systemProfile=" + emtoVar.toString() + ", minDayIndex=" + String.valueOf(optionalInt2) + ", maxDayIndex=" + String.valueOf(optionalInt) + ", aggregateValue=" + optional.toString() + "}";
    }
}
