package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuja {

    @evlj(a = "p")
    private final String a;

    @evlj(a = "t")
    private final String b;

    @evlj(a = "c")
    private final String c;

    public cuja(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cuja)) {
            return false;
        }
        cuja cujaVar = (cuja) obj;
        return ffkj.e(this.a, cujaVar.a) && ffkj.e(this.b, cujaVar.b) && ffkj.e(this.c, cujaVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "CarrierSpamReportMessage(protocol=" + this.a + ", messageReceiptTimestampUtc=" + this.b + ", messageText=" + this.c + ")";
    }
}
