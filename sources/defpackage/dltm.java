package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dltm implements dltq {
    public final int a;
    public final int b;
    private final String c = null;
    private final ffji d = null;

    public dltm(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.dltq
    public final int a() {
        return this.b;
    }

    @Override // defpackage.dltq
    public final int b() {
        return this.a;
    }

    @Override // defpackage.dltq
    public final /* bridge */ /* synthetic */ dltq c(int i, int i2) {
        return new dltm(i, i2);
    }

    @Override // defpackage.dltq
    public final String d() {
        return null;
    }

    @Override // defpackage.dltq
    public final ffji e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dltm)) {
            return false;
        }
        dltm dltmVar = (dltm) obj;
        if (this.a != dltmVar.a || this.b != dltmVar.b) {
            return false;
        }
        String str = dltmVar.c;
        if (!ffkj.e(null, null)) {
            return false;
        }
        ffji ffjiVar = dltmVar.d;
        return ffkj.e(null, null);
    }

    public final int hashCode() {
        return ((this.a * 31) + this.b) * 961;
    }

    public final String toString() {
        return "CodeBlock(start=" + this.a + ", end=" + this.b + ", onClickLabel=null, onClick=null)";
    }
}
