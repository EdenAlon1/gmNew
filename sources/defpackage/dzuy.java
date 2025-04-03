package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzuy extends dzwb {
    private engw a;

    @Override // defpackage.dzwb
    public final dzwc a() {
        engw engwVar = this.a;
        if (engwVar != null) {
            return new dzuz(engwVar);
        }
        throw new IllegalStateException("Missing required properties: elements");
    }

    @Override // defpackage.dzwb
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null elements");
        }
        this.a = engwVar;
    }
}
