package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class bxb extends bxh {
    public final String a;
    public final beh b;

    public bxb(String str, beh behVar) {
        this.a = str;
        this.b = behVar;
    }

    @Override // defpackage.bxh
    public final beh a() {
        return this.b;
    }

    @Override // defpackage.bxd
    public final int b() {
        return -1;
    }

    @Override // defpackage.bxd
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxh) {
            bxh bxhVar = (bxh) obj;
            if (this.a.equals(bxhVar.c())) {
                bxhVar.b();
                beh behVar = this.b;
                if (behVar != null ? behVar.equals(bxhVar.a()) : bxhVar.a() == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        beh behVar = this.b;
        return ((~(hashCode * 1000003)) * 1000003) ^ (behVar == null ? 0 : behVar.hashCode());
    }

    public final String toString() {
        return "VideoMimeInfo{mimeType=" + this.a + ", profile=-1, compatibleVideoProfile=" + this.b + "}";
    }
}
