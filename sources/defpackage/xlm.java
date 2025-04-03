package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xlm implements xlo {
    private final xlu a;

    public xlm() {
        this((byte[]) null);
    }

    @Override // defpackage.xlo
    public final xlu a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xlm) && ffkj.e(this.a, ((xlm) obj).a);
    }

    public final int hashCode() {
        xlu xluVar = this.a;
        if (xluVar == null) {
            return 0;
        }
        return xluVar.hashCode();
    }

    public final String toString() {
        return "MASS_SMS(textCounterData=" + this.a + ")";
    }

    public xlm(xlu xluVar) {
        this.a = xluVar;
    }

    public /* synthetic */ xlm(byte[] bArr) {
        this((xlu) null);
    }
}
