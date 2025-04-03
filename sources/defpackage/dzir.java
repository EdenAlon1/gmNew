package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzir extends dzrf {
    private engw a;

    @Override // defpackage.dzrf
    public final dzrw a() {
        engw engwVar = this.a;
        if (engwVar != null) {
            return new dznz(engwVar);
        }
        throw new IllegalStateException("Missing required properties: lines");
    }

    @Override // defpackage.dzrf
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null lines");
        }
        this.a = engwVar;
    }
}
