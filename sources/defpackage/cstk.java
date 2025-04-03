package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cstk extends cstm {
    private final fcek a;
    private final esls b;
    private final bcyo c;

    public cstk(fcek fcekVar, esls eslsVar, bcyo bcyoVar) {
        if (fcekVar == null) {
            throw new NullPointerException("Null desktopId");
        }
        this.a = fcekVar;
        this.b = eslsVar;
        this.c = bcyoVar;
    }

    @Override // defpackage.cstm
    public final bcyo a() {
        return this.c;
    }

    @Override // defpackage.cstm
    public final esls b() {
        return this.b;
    }

    @Override // defpackage.cstm
    public final fcek c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        esls eslsVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cstm) {
            cstm cstmVar = (cstm) obj;
            if (this.a.equals(cstmVar.c()) && ((eslsVar = this.b) != null ? eslsVar.equals(cstmVar.b()) : cstmVar.b() == null) && this.c.equals(cstmVar.a())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() ^ 1000003;
        esls eslsVar = this.b;
        return (((hashCode * 1000003) ^ (eslsVar == null ? 0 : eslsVar.hashCode())) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        bcyo bcyoVar = this.c;
        esls eslsVar = this.b;
        return "DittoPairingResult{desktopId=" + this.a.toString() + ", pairingData=" + String.valueOf(eslsVar) + ", encryptionKeys=" + bcyoVar.toString() + "}";
    }
}
