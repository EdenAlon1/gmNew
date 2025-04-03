package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class scq extends scv {
    private final String a;
    private final int b;

    public scq(String str, int i) {
        this.a = str;
        this.b = i;
    }

    @Override // defpackage.scv
    public final int a() {
        return this.b;
    }

    @Override // defpackage.scv
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof scv) {
            scv scvVar = (scv) obj;
            if (this.a.equals(scvVar.b()) && this.b == scvVar.a()) {
                scvVar.c();
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003;
    }

    public final String toString() {
        return "MagicRewriteRequest{message=" + this.a + ", tone=" + this.b + ", streamingCallback=null}";
    }

    @Override // defpackage.scv
    public final void c() {
    }
}
