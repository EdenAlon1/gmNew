package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtpa extends dtpf {
    private final int a;
    private final long b;
    private final String c;
    private final String d;

    public dtpa(int i, long j, String str, String str2) {
        this.a = i;
        this.b = j;
        if (str == null) {
            throw new NullPointerException("Null name");
        }
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.dtpf
    public final int a() {
        return this.a;
    }

    @Override // defpackage.dtpf
    public final long b() {
        return this.b;
    }

    @Override // defpackage.dtpf
    public final String c() {
        return this.c;
    }

    @Override // defpackage.dtpf
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dtpf) {
            dtpf dtpfVar = (dtpf) obj;
            if (this.a == dtpfVar.a() && this.b == dtpfVar.b() && this.c.equals(dtpfVar.c()) && this.d.equals(dtpfVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        int i = (int) (j ^ (j >>> 32));
        return ((((i ^ ((this.a ^ 1000003) * 1000003)) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        return "ThreadIdentifier{tid=" + this.a + ", id=" + this.b + ", name=" + this.c + ", threadPoolName=" + this.d + "}";
    }
}
