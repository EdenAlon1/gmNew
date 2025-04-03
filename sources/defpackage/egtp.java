package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egtp extends egtq {
    public final String a;
    public final Object b;

    public egtp(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egtp)) {
            return false;
        }
        egtp egtpVar = (egtp) obj;
        return ffkj.e(this.a, egtpVar.a) && ffkj.e(this.b, egtpVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Uploading(name=" + this.a + ", avatarGlideModel=" + this.b + ")";
    }
}
