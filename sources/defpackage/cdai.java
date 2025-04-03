package defpackage;

import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cdai {
    public final String a;
    public final String b;
    public final Status c;
    private final Object d;

    public cdai(Object obj, String str, String str2, Status status) {
        str.getClass();
        this.d = obj;
        this.a = str;
        this.b = str2;
        this.c = status;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdai)) {
            return false;
        }
        cdai cdaiVar = (cdai) obj;
        return ffkj.e(this.d, cdaiVar.d) && ffkj.e(this.a, cdaiVar.a) && ffkj.e(this.b, cdaiVar.b) && ffkj.e(this.c, cdaiVar.c);
    }

    public final int hashCode() {
        Object obj = this.d;
        int hashCode = ((obj == null ? 0 : obj.hashCode()) * 31) + this.a.hashCode();
        String str = this.b;
        return (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CmsBatchResultRow(entity=" + this.d + ", associatedBugleId=" + this.a + ", cmsId=" + this.b + ", status=" + this.c + ")";
    }
}
