package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emvh extends emvz {
    final emvz a;
    final emvz b;

    public emvh(emvz emvzVar, emvz emvzVar2) {
        this.a = emvzVar;
        this.b = emvzVar2;
    }

    @Override // defpackage.emvz
    public final void b(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.a.b(bitSet2);
        BitSet bitSet3 = new BitSet();
        this.b.b(bitSet3);
        bitSet2.and(bitSet3);
        bitSet.or(bitSet2);
    }

    @Override // defpackage.emvz
    public final boolean c(char c) {
        return this.a.c(c) && this.b.c(c);
    }

    public final String toString() {
        emvz emvzVar = this.b;
        return "CharMatcher.and(" + this.a.toString() + ", " + emvzVar.toString() + ")";
    }
}
