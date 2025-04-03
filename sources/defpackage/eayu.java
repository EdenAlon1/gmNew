package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eayu extends eayv {
    public final String a;
    public final ksp b;

    public eayu(String str, ksp kspVar) {
        if (str == null) {
            throw new NullPointerException("Null actionText");
        }
        this.a = str;
        this.b = kspVar;
    }

    @Override // defpackage.eayv
    public final ksp a() {
        return this.b;
    }

    @Override // defpackage.eayv
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eayv) {
            eayv eayvVar = (eayv) obj;
            if (this.a.equals(eayvVar.b()) && this.b.equals(eayvVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "ActionButtonSpec{actionText=" + this.a + ", onButtonClicked=" + this.b.toString() + "}";
    }
}
