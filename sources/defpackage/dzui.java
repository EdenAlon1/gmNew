package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzui extends dzve {
    private engw a;

    @Override // defpackage.dzve
    public final dzvh a() {
        engw engwVar = this.a;
        if (engwVar != null) {
            return new dzuj(engwVar);
        }
        throw new IllegalStateException("Missing required properties: verticalLayoutButtons");
    }

    @Override // defpackage.dzve
    public final void b(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null verticalLayoutButtons");
        }
        this.a = engwVar;
    }
}
