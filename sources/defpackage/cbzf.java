package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cbzf extends ccin {
    private final Optional a;
    private final boolean b;
    private final long c;
    private final int d;
    private final int e;

    public cbzf(Optional optional, boolean z, int i, int i2, long j) {
        this.a = optional;
        this.b = z;
        this.e = i;
        this.d = i2;
        this.c = j;
    }

    @Override // defpackage.ccin
    public final long a() {
        return this.c;
    }

    @Override // defpackage.ccin
    public final Optional b() {
        return this.a;
    }

    @Override // defpackage.ccin
    public final boolean c() {
        return this.b;
    }

    @Override // defpackage.ccin
    public final int d() {
        return this.d;
    }

    @Override // defpackage.ccin
    public final int e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ccin) {
            ccin ccinVar = (ccin) obj;
            if (this.a.equals(ccinVar.b()) && this.b == ccinVar.c() && this.e == ccinVar.e() && this.d == ccinVar.d() && this.c == ccinVar.a()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ this.e) * 1000003) ^ this.d) * 1000003;
        long j = this.c;
        return hashCode ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        int i = this.e;
        String obj = this.a.toString();
        String str = i != 4 ? i != 5 ? i != 6 ? "MERGED_BY_PERSISTENCE_ID" : "RESTORED_AS_NEW_ROW" : "MERGED_BY_CONTENT" : "MERGED_BY_CMS_ID";
        int i2 = this.d;
        String str2 = i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? "XMS" : "RCS" : "PERSISTENCE_ID" : "CMS_ID" : "TOMBSTONE" : "UNKNOWN";
        return "CmsDeduplicationResult{duplicateBindData=" + obj + ", foundDup=" + this.b + ", restoreOutcomeType=" + str + ", deduplicationType=" + str2 + ", deduplicateStartTimeMs=" + this.c + "}";
    }
}
