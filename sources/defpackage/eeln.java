package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eeln extends eeiw implements Cloneable {
    protected String a;

    public eeln() {
    }

    @Override // defpackage.eeiw
    public final String c() {
        return this.a;
    }

    @Override // defpackage.eeiw
    public final Object clone() {
        eeln eelnVar = new eeln();
        eelnVar.a = this.a;
        return eelnVar;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            return obj.getClass().equals(getClass()) && this.a.compareTo(((eeln) obj).a) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public eeln(String str) {
        this.a = str;
    }
}
