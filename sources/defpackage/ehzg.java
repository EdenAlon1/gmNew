package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ehzg extends eica {
    private final String a;
    private final int b;

    public ehzg(int i, String str) {
        this.b = i;
        this.a = str;
    }

    @Override // defpackage.eica
    public final String a() {
        return this.a;
    }

    @Override // defpackage.eica
    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eica) {
            eica eicaVar = (eica) obj;
            if (this.b == eicaVar.b() && this.a.equals(eicaVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b ^ 1000003) * 1000003) ^ this.a.hashCode();
    }
}
