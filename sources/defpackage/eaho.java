package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eaho extends eaia {
    public int a;
    private exwl b;

    @Override // defpackage.eaia
    public final eaib a() {
        int i;
        exwl exwlVar = this.b;
        if (exwlVar != null && (i = this.a) != 0) {
            return new eahp(exwlVar, i);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" androidPayload");
        }
        if (this.a == 0) {
            sb.append(" pushPayloadType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.eaia
    public final void b(exwl exwlVar) {
        if (exwlVar == null) {
            throw new NullPointerException("Null androidPayload");
        }
        this.b = exwlVar;
    }
}
