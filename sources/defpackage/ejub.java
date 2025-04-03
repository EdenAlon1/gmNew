package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejub extends ejwc {
    public final ejuh a;
    public final long b;
    public final ejvd c;
    public final ejvh d;
    public final int e;
    public final Instant f;

    public ejub(ejuh ejuhVar, long j, ejvd ejvdVar, ejvh ejvhVar, int i, Instant instant) {
        this.a = ejuhVar;
        this.b = j;
        this.c = ejvdVar;
        this.d = ejvhVar;
        this.e = i;
        if (instant == null) {
            throw new NullPointerException("Null epochTimeAtStart");
        }
        this.f = instant;
    }

    @Override // defpackage.ejwc
    public final int a() {
        return this.e;
    }

    @Override // defpackage.ejwc
    public final long b() {
        return this.b;
    }

    @Override // defpackage.ejwc
    public final ejuh c() {
        return this.a;
    }

    @Override // defpackage.ejwc
    public final ejvd d() {
        return this.c;
    }

    @Override // defpackage.ejwc
    public final ejvh e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejwc) {
            ejwc ejwcVar = (ejwc) obj;
            if (this.a.equals(ejwcVar.c()) && this.b == ejwcVar.b() && this.c.equals(ejwcVar.d()) && this.d.equals(ejwcVar.e()) && this.e == ejwcVar.a() && this.f.equals(ejwcVar.f())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ejwc
    public final Instant f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((((((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        Instant instant = this.f;
        ejvh ejvhVar = this.d;
        ejvd ejvdVar = this.c;
        return "SubscribeSequenceState{dataSource=" + this.a.toString() + ", index=" + this.b + ", fetchTaskIdentifier=" + ejvdVar.toString() + ", loadTaskIdentifier=" + ejvhVar.toString() + ", loadAttempts=" + this.e + ", epochTimeAtStart=" + instant.toString() + "}";
    }
}
