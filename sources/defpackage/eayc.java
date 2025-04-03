package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eayc extends eayf {
    private final String a;
    private final dgqp b;
    private final String c;
    private final String d;
    private final String e;

    public eayc(String str, dgqp dgqpVar, String str2, String str3, String str4) {
        if (str == null) {
            throw new NullPointerException("Null accountId");
        }
        this.a = str;
        if (dgqpVar == null) {
            throw new NullPointerException("Null criticalAlertData");
        }
        this.b = dgqpVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // defpackage.eayf
    public final dgqp a() {
        return this.b;
    }

    @Override // defpackage.eayf
    public final String b() {
        return this.a;
    }

    @Override // defpackage.eayf
    public final String c() {
        return this.c;
    }

    @Override // defpackage.eayf
    public final String d() {
        return this.d;
    }

    @Override // defpackage.eayf
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eayf) {
            eayf eayfVar = (eayf) obj;
            if (this.a.equals(eayfVar.b()) && this.b.equals(eayfVar.a()) && this.c.equals(eayfVar.c()) && this.d.equals(eayfVar.d()) && this.e.equals(eayfVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        return "ValidCriticalAlertData{accountId=" + this.a + ", criticalAlertData=" + this.b.toString() + ", rfn=" + this.c + ", rfnc=" + this.d + ", securityEventId=" + this.e + "}";
    }
}
