package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejuc extends ejwe {
    public final long a;
    public final ejwd b;
    public final boolean c;
    public final emxc d;
    public final emxc e;

    public ejuc(long j, ejwd ejwdVar, boolean z, emxc emxcVar, emxc emxcVar2) {
        this.a = j;
        if (ejwdVar == null) {
            throw new NullPointerException("Null callbacks");
        }
        this.b = ejwdVar;
        this.c = z;
        this.d = emxcVar;
        this.e = emxcVar2;
    }

    @Override // defpackage.ejwe
    public final long a() {
        return this.a;
    }

    @Override // defpackage.ejwe
    public final ejwd b() {
        return this.b;
    }

    @Override // defpackage.ejwe
    public final emxc c() {
        return this.e;
    }

    @Override // defpackage.ejwe
    public final emxc d() {
        return this.d;
    }

    @Override // defpackage.ejwe
    public final boolean e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejwe) {
            ejwe ejweVar = (ejwe) obj;
            if (this.a == ejweVar.a() && this.b.equals(ejweVar.b()) && this.c == ejweVar.e() && this.d.equals(ejweVar.d()) && this.e.equals(ejweVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.e;
        emxc emxcVar2 = this.d;
        return "SubscriptionCallbacksState{index=" + this.a + ", callbacks=" + this.b.toString() + ", openBackgroundFetch=" + this.c + ", maybeTopicData=" + emxcVar2.toString() + ", maybeInstanceData=" + emxcVar.toString() + "}";
    }
}
