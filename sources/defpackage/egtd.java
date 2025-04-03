package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egtd implements egte {
    public final String a;
    public final Object b;

    public egtd(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egtd)) {
            return false;
        }
        egtd egtdVar = (egtd) obj;
        return ffkj.e(this.a, egtdVar.a) && ffkj.e(this.b, egtdVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "UploadingPhoto(name=" + this.a + ", avatarGlideModel=" + this.b + ")";
    }
}
