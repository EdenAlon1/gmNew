package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdau extends cday {
    public cfkl a;
    private ccce b;

    @Override // defpackage.cday
    public final cdaz a() {
        cfkl cfklVar;
        ccce ccceVar = this.b;
        if (ccceVar != null && (cfklVar = this.a) != null) {
            return new cdav(ccceVar, cfklVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.b == null) {
            sb.append(" scheduledItem");
        }
        if (this.a == null) {
            sb.append(" requestExtras");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.cday
    public final void b(ccce ccceVar) {
        if (ccceVar == null) {
            throw new NullPointerException("Null scheduledItem");
        }
        this.b = ccceVar;
    }
}
