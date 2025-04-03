package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejip extends ejis {
    public final eyhs a;
    public final int b;
    public final long c;
    public final int d;

    public ejip(eyhs eyhsVar, int i, long j, int i2) {
        this.a = eyhsVar;
        this.b = i;
        this.c = j;
        this.d = i2;
    }

    @Override // defpackage.ejis
    public final int a() {
        return this.b;
    }

    @Override // defpackage.ejis
    public final long b() {
        return this.c;
    }

    @Override // defpackage.ejis
    public final eyhs c() {
        return this.a;
    }

    @Override // defpackage.ejis
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejis) {
            ejis ejisVar = (ejis) obj;
            if (this.a.equals(ejisVar.c()) && this.b == ejisVar.a()) {
                ejisVar.e();
                if (this.c == ejisVar.b() && this.d == ejisVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.c;
        return (((((hashCode * 1000003) ^ this.b) * (-721379959)) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.d;
    }

    public final String toString() {
        return "KeyValueCacheConfig{valueDefaultInstance=" + this.a.toString() + ", maxSizeBytes=" + this.b + ", maxEntryCount=0, filterAfterWriteMs=" + this.c + ", storage=" + ekqo.a(this.d) + "}";
    }

    @Override // defpackage.ejis
    public final void e() {
    }
}
