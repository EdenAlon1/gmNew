package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqwk extends cqxh {
    private final ceyt a;
    private final cqxf b;

    public cqwk(ceyt ceytVar, cqxf cqxfVar) {
        if (ceytVar == null) {
            throw new NullPointerException("Null workQueueResult");
        }
        this.a = ceytVar;
        if (cqxfVar == null) {
            throw new NullPointerException("Null fileDownloadUris");
        }
        this.b = cqxfVar;
    }

    @Override // defpackage.cqxh
    public final ceyt a() {
        return this.a;
    }

    @Override // defpackage.cqxh
    public final cqxf b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqxh) {
            cqxh cqxhVar = (cqxh) obj;
            if (this.a.equals(cqxhVar.a()) && this.b.equals(cqxhVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        cqxf cqxfVar = this.b;
        return "WorkQueueResultAndFileDownloadUris{workQueueResult=" + this.a.toString() + ", fileDownloadUris=" + cqxfVar.toString() + "}";
    }
}
