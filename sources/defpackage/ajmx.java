package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajmx {
    public final String a;
    public final dnwn b;

    public ajmx(String str, dnwn dnwnVar) {
        this.a = str;
        this.b = dnwnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajmx)) {
            return false;
        }
        ajmx ajmxVar = (ajmx) obj;
        return ffkj.e(this.a, ajmxVar.a) && ffkj.e(this.b, ajmxVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "SendingAsUiData(name=" + this.a + ", photoMonogram=" + this.b + ")";
    }
}
