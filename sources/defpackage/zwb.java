package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zwb {
    public final boolean a;
    public final String b;
    private final boolean c = true;

    public zwb(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwb)) {
            return false;
        }
        zwb zwbVar = (zwb) obj;
        if (this.a != zwbVar.a) {
            return false;
        }
        boolean z = zwbVar.c;
        return ffkj.e(this.b, zwbVar.b);
    }

    public final int hashCode() {
        return (((zwa.a(this.a) * 31) + zwa.a(true)) * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SearchData(isCurrent=" + this.a + ", isMatched=true, query=" + this.b + ")";
    }
}
