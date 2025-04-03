package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class espn extends esqe {
    private eyee a;
    private espr b;

    @Override // defpackage.esqe
    public final esqf a() {
        espr esprVar;
        eyee eyeeVar = this.a;
        if (eyeeVar != null && (esprVar = this.b) != null) {
            return new espo(eyeeVar, esprVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" content");
        }
        if (this.b == null) {
            sb.append(" contentType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.esqe
    public final void b(eyee eyeeVar) {
        if (eyeeVar == null) {
            throw new NullPointerException("Null content");
        }
        this.a = eyeeVar;
    }

    @Override // defpackage.esqe
    public final void c(espr esprVar) {
        if (esprVar == null) {
            throw new NullPointerException("Null contentType");
        }
        this.b = esprVar;
    }
}
