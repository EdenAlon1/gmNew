package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cqua extends cqum {
    private final String a;

    public cqua(String str) {
        this.a = str;
    }

    @Override // defpackage.cqum
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cqum) {
            return this.a.equals(((cqum) obj).a());
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "DownloadResult{downloadId=" + this.a + "}";
    }
}
