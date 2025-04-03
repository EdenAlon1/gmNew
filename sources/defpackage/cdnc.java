package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdnc {
    public final ppq a;
    public final Throwable b;

    public cdnc(ppq ppqVar, Throwable th) {
        this.a = ppqVar;
        this.b = th;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdnc)) {
            return false;
        }
        cdnc cdncVar = (cdnc) obj;
        return ffkj.e(this.a, cdncVar.a) && ffkj.e(this.b, cdncVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Throwable th = this.b;
        return hashCode + (th == null ? 0 : th.hashCode());
    }

    public final String toString() {
        return "CmsMediaUploadResult(result=" + this.a + ", error=" + this.b + ")";
    }
}
