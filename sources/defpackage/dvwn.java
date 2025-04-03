package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvwn extends dvwp {
    public epme a;
    public Integer b;
    public int[] c;
    public int[] d;
    public dfli e;
    private String f;
    private eyhs g;
    private faxs h;

    @Override // defpackage.dvwp
    public final dvwq a() {
        eyhs eyhsVar;
        faxs faxsVar;
        String str = this.f;
        if (str != null && (eyhsVar = this.g) != null && (faxsVar = this.h) != null) {
            return new dvwo(str, eyhsVar, this.a, this.b, faxsVar, this.c, this.d, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" logSource");
        }
        if (this.g == null) {
            sb.append(" message");
        }
        if (this.h == null) {
            sb.append(" qosTier");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dvwp
    public final void b(String str) {
        if (str == null) {
            throw new NullPointerException("Null logSource");
        }
        this.f = str;
    }

    @Override // defpackage.dvwp
    public final void c(eyhs eyhsVar) {
        if (eyhsVar == null) {
            throw new NullPointerException("Null message");
        }
        this.g = eyhsVar;
    }

    @Override // defpackage.dvwp
    public final void d(faxs faxsVar) {
        if (faxsVar == null) {
            throw new NullPointerException("Null qosTier");
        }
        this.h = faxsVar;
    }
}
