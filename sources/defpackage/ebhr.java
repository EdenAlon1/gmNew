package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebhr extends ebhu {
    public final emxc a;
    public engw b;
    public final emxc c;

    public ebhr() {
        emux emuxVar = emux.a;
        this.a = emuxVar;
        this.c = emuxVar;
    }

    @Override // defpackage.ebhu
    public final void a(engw engwVar) {
        if (engwVar == null) {
            throw new NullPointerException("Null flavorCustomActions");
        }
        this.b = engwVar;
    }
}
