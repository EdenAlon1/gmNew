package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eaxz {
    public final emxc a;
    public final eavl b;

    public eaxz(emxc emxcVar, eavl eavlVar) {
        emxcVar.getClass();
        this.a = emxcVar;
        this.b = eavlVar;
    }

    public static final eaya a() {
        eaya eayaVar = new eaya();
        eayaVar.a = new eavl();
        return eayaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eaxz)) {
            return false;
        }
        eaxz eaxzVar = (eaxz) obj;
        return ffkj.e(this.a, eaxzVar.a) && ffkj.e(this.b, eaxzVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AdditionalAccountInformation(observableAccountInformation=" + this.a + ", accountCapabilitiesRetriever=" + this.b + ")";
    }
}
