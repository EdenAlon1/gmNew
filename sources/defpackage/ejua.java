package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejua extends ejwb {
    public final ejuh a;
    public final Object b;
    public final ejxa c;
    public final long d;
    public final ejwc e;
    public final int f;

    public ejua(ejuh ejuhVar, Object obj, ejxa ejxaVar, long j, int i, ejwc ejwcVar) {
        this.a = ejuhVar;
        if (obj == null) {
            throw new NullPointerException("Null contentKey");
        }
        this.b = obj;
        this.c = ejxaVar;
        this.d = j;
        this.f = i;
        this.e = ejwcVar;
    }

    @Override // defpackage.ejwb
    public final long a() {
        return this.d;
    }

    @Override // defpackage.ejwb
    public final ejuh b() {
        return this.a;
    }

    @Override // defpackage.ejwb
    public final ejwc c() {
        return this.e;
    }

    @Override // defpackage.ejwb
    public final ejxa d() {
        return this.c;
    }

    @Override // defpackage.ejwb
    public final Object e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ejwb) {
            ejwb ejwbVar = (ejwb) obj;
            if (this.a.equals(ejwbVar.b()) && this.b.equals(ejwbVar.e()) && this.c.equals(ejwbVar.d()) && this.d == ejwbVar.a() && this.f == ejwbVar.f() && this.e.equals(ejwbVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ejwb
    public final int f() {
        return this.f;
    }

    public final int hashCode() {
        int hashCode = ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
        long j = this.d;
        return (((((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        int i = this.f;
        ejxa ejxaVar = this.c;
        Object obj = this.b;
        String obj2 = this.a.toString();
        String obj3 = obj.toString();
        String obj4 = ejxaVar.toString();
        String str = i != 1 ? i != 2 ? "SUBSCRIBE" : "FORCE_REFRESH" : "UNDEFINED";
        return "SubscribeCallState{dataSource=" + obj2 + ", contentKey=" + obj3 + ", tolerance=" + obj4 + ", index=" + this.d + ", subscribeCallType=" + str + ", subscribeSequenceState=" + this.e.toString() + "}";
    }
}
