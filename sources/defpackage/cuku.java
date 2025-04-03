package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cuku extends culb {
    public String a;
    public String b;
    private cula c;

    @Override // defpackage.culb
    public final culc a() {
        String str;
        String str2;
        cula culaVar = this.c;
        if (culaVar != null && (str = this.a) != null && (str2 = this.b) != null) {
            return new cukv(culaVar, str, str2);
        }
        StringBuilder sb = new StringBuilder();
        if (this.c == null) {
            sb.append(" messageSuspiciousnessScore");
        }
        if (this.a == null) {
            sb.append(" countryCode");
        }
        if (this.b == null) {
            sb.append(" locale");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.culb
    public final void b(cula culaVar) {
        if (culaVar == null) {
            throw new NullPointerException("Null messageSuspiciousnessScore");
        }
        this.c = culaVar;
    }
}
