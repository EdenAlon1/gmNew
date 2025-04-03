package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dznd extends dzpx {
    private engw a;
    private engw b;

    @Override // defpackage.dzpx
    public final dzpy a() {
        if (this.a != null && this.b != null) {
            return new dzne(this.a, this.b);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" decorationIdsToAdd");
        }
        if (this.b == null) {
            sb.append(" decorationIdsToRemove");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.dzpx
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null decorationIdsToAdd");
        }
        this.a = engwVar;
    }

    @Override // defpackage.dzpx
    public final void c(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null decorationIdsToRemove");
        }
        this.b = engwVar;
    }
}
