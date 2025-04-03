package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dtrb extends dtvi {
    public String a;
    public dtui b;
    public String c;
    private boolean d;
    private byte e;

    @Override // defpackage.dtvi
    public final dtvj a() {
        String str;
        dtui dtuiVar;
        if (this.e == 1 && (str = this.a) != null && (dtuiVar = this.b) != null) {
            return new dtrc(str, this.d, dtuiVar, this.c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" tableName");
        }
        if (this.e == 0) {
            sb.append(" exemptFromQueryPlanChecking");
        }
        if (this.b == null) {
            sb.append(" loggingTag");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dtvi
    public final void b(boolean z) {
        this.d = z;
        this.e = (byte) 1;
    }
}
