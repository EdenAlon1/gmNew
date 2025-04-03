package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bbiq {
    public final bbin a;
    public final String b;

    public bbiq(bbin bbinVar, String str) {
        this.a = bbinVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bbiq)) {
            return false;
        }
        bbiq bbiqVar = (bbiq) obj;
        return ffkj.e(this.a, bbiqVar.a) && ffkj.e(this.b, bbiqVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "BackupTableWriterWithLogTag(backupTableWriter=" + this.a + ", logTag=" + this.b + ")";
    }
}
