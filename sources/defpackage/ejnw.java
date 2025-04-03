package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejnw extends ejog {
    public final long a;
    public final TimeUnit b;

    public ejnw(long j, TimeUnit timeUnit) {
        this.a = j;
        if (timeUnit == null) {
            throw new NullPointerException("Null timeUnit");
        }
        this.b = timeUnit;
    }

    @Override // defpackage.ejog
    public final long a() {
        return this.a;
    }

    @Override // defpackage.ejog
    public final TimeUnit b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejog) {
            ejog ejogVar = (ejog) obj;
            if (this.a == ejogVar.a() && this.b.equals(ejogVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "TimeUnitPair{duration=" + this.a + ", timeUnit=" + this.b.toString() + "}";
    }
}
