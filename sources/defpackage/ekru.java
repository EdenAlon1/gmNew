package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ekru extends ektw {
    private final Set a;
    private final long b;
    private final emxc c;

    public ekru(Set set, long j, emxc emxcVar) {
        this.a = set;
        this.b = j;
        this.c = emxcVar;
    }

    @Override // defpackage.ektw
    public final long a() {
        return this.b;
    }

    @Override // defpackage.ektw
    public final emxc b() {
        return this.c;
    }

    @Override // defpackage.ektw
    public final Set c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ektw) {
            ektw ektwVar = (ektw) obj;
            if (this.a.equals(ektwVar.c()) && this.b == ektwVar.a() && this.c.equals(ektwVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        long j = this.b;
        return (((hashCode * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        emxc emxcVar = this.c;
        return "SyncSchedule{constraints=" + this.a.toString() + ", nextSyncTime=" + this.b + ", ignoreFirstConstraintTime=" + emxcVar.toString() + "}";
    }
}
