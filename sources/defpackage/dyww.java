package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyww extends dyxa {
    public String a;
    private dyxf b;

    @Override // defpackage.dyxa
    public final dyxb a() {
        dyxf dyxfVar;
        String str = this.a;
        if (str != null && (dyxfVar = this.b) != null) {
            return new dywx(str, dyxfVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" tag");
        }
        if (this.b == null) {
            sb.append(" lighterRetryPolicy");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dyxa
    public final void b(dyxf dyxfVar) {
        if (dyxfVar == null) {
            throw new NullPointerException("Null lighterRetryPolicy");
        }
        this.b = dyxfVar;
    }
}
