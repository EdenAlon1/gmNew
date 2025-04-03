package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emvx extends emvz {
    final emvz a;
    final emvz b;

    public emvx(emvz emvzVar, emvz emvzVar2) {
        this.a = emvzVar;
        emvzVar2.getClass();
        this.b = emvzVar2;
    }

    @Override // defpackage.emvz
    public final void b(BitSet bitSet) {
        this.a.b(bitSet);
        this.b.b(bitSet);
    }

    @Override // defpackage.emvz
    public final boolean c(char c) {
        return this.a.c(c) || this.b.c(c);
    }

    public final String toString() {
        emvz emvzVar = this.b;
        return "CharMatcher.or(" + this.a.toString() + ", " + emvzVar.toString() + ")";
    }
}
