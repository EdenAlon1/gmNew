package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xic implements xid {
    public final yrz a;

    public xic() {
        this((byte[]) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xic) && ffkj.e(this.a, ((xic) obj).a);
    }

    public final int hashCode() {
        return this.a == null ? 0 : -1654225729;
    }

    public final String toString() {
        return "Shortcuts(selected=" + this.a + ")";
    }

    public xic(yrz yrzVar) {
        this.a = yrzVar;
    }

    public /* synthetic */ xic(byte[] bArr) {
        this((yrz) null);
    }
}
