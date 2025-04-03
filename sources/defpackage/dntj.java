package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dntj {
    public final ffjn a;
    public final ffjm b;
    public final ffjn c;

    public dntj() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dntj)) {
            return false;
        }
        dntj dntjVar = (dntj) obj;
        return ffkj.e(this.a, dntjVar.a) && ffkj.e(this.b, dntjVar.b) && ffkj.e(this.c, dntjVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        ffjn ffjnVar = this.c;
        return (hashCode * 31) + (ffjnVar == null ? 0 : ffjnVar.hashCode());
    }

    public final String toString() {
        return "MetatextStyleData(getColor=" + this.a + ", getReadIconTint=" + this.b + ", textTruncator=" + this.c + ")";
    }

    public dntj(ffjn ffjnVar, ffjm ffjmVar, ffjn ffjnVar2) {
        this.a = ffjnVar;
        this.b = ffjmVar;
        this.c = ffjnVar2;
    }

    public /* synthetic */ dntj(byte[] bArr) {
        this(dnth.a, dnti.a, null);
    }
}
