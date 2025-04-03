package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebco extends ebee {
    private final String a;
    private final emxc b;

    public ebco(String str, emxc emxcVar) {
        if (str == null) {
            throw new NullPointerException("Null title");
        }
        this.a = str;
        if (emxcVar == null) {
            throw new NullPointerException("Null titleContentDescription");
        }
        this.b = emxcVar;
    }

    @Override // defpackage.ebee
    public final emxc a() {
        return this.b;
    }

    @Override // defpackage.ebee
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ebee) {
            ebee ebeeVar = (ebee) obj;
            if (this.a.equals(ebeeVar.b()) && this.b.equals(ebeeVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "TextViewData{title=" + this.a + ", titleContentDescription=" + this.b.toString() + "}";
    }
}
