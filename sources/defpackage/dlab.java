package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlab extends dlaf {
    public final String a;
    public final String b;

    public dlab(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlab)) {
            return false;
        }
        dlab dlabVar = (dlab) obj;
        return ffkj.e(this.a, dlabVar.a) && ffkj.e(this.b, dlabVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
