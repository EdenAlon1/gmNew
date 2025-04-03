package defpackage;

import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class som {
    public final int a;
    public final String b;
    public final Instant c;
    public final int d;
    public final int e;

    public som(int i, String str, Instant instant, int i2, int i3) {
        this.a = i;
        this.b = str;
        this.c = instant;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof som)) {
            return false;
        }
        som somVar = (som) obj;
        return this.a == somVar.a && ffkj.e(this.b, somVar.b) && ffkj.e(this.c, somVar.c) && this.d == somVar.d && this.e == somVar.e;
    }

    public final int hashCode() {
        return (((((((this.a * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d) * 31) + this.e;
    }

    public final String toString() {
        return "BugleBackupDatabaseMetadata(schemaVersion=" + this.a + ", backupId=" + this.b + ", backupTimestamp=" + this.c + ", minSchemaVersion=" + this.d + ", restoreWorkflowVersion=" + this.e + ")";
    }
}
