package defpackage;

import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eedo extends eees {
    public final eeer a;
    public final eyzy b;
    public final List c;
    public final Optional d;
    public final Optional e;
    public final long f;

    public eedo(eeer eeerVar, eyzy eyzyVar, List list, Optional optional, Optional optional2, long j) {
        this.a = eeerVar;
        if (eyzyVar == null) {
            throw new NullPointerException("Null result");
        }
        this.b = eyzyVar;
        if (list == null) {
            throw new NullPointerException("Null resolvedTargets");
        }
        this.c = list;
        this.d = optional;
        this.e = optional2;
        this.f = j;
    }

    @Override // defpackage.eees
    public final long a() {
        return this.f;
    }

    @Override // defpackage.eees
    public final eeer b() {
        return this.a;
    }

    @Override // defpackage.eees
    public final eyzy c() {
        return this.b;
    }

    @Override // defpackage.eees
    public final Optional d() {
        return this.e;
    }

    @Override // defpackage.eees
    public final Optional e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eees) {
            eees eeesVar = (eees) obj;
            if (this.a.equals(eeesVar.b()) && this.b.equals(eeesVar.c()) && this.c.equals(eeesVar.f()) && this.d.equals(eeesVar.e()) && this.e.equals(eeesVar.d()) && this.f == eeesVar.a()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.eees
    public final List f() {
        return this.c;
    }

    public final int hashCode() {
        int hashCode = ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        long j = this.f;
        return (hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        Optional optional = this.e;
        Optional optional2 = this.d;
        List list = this.c;
        eyzy eyzyVar = this.b;
        return "LoggableResponse{query=" + this.a.toString() + ", result=" + eyzyVar.toString() + ", resolvedTargets=" + list.toString() + ", failureType=" + optional2.toString() + ", clientExceptionType=" + optional.toString() + ", responseTimeMillis=" + this.f + "}";
    }
}
