package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class emvu extends emvz {
    final emvz b;

    public emvu(emvz emvzVar) {
        this.b = emvzVar;
    }

    @Override // defpackage.emvz
    public final void b(BitSet bitSet) {
        BitSet bitSet2 = new BitSet();
        this.b.b(bitSet2);
        bitSet2.flip(0, 65536);
        bitSet.or(bitSet2);
    }

    @Override // defpackage.emvz
    public final boolean c(char c) {
        return !this.b.c(c);
    }

    @Override // defpackage.emvz
    public final emvz f() {
        return this.b;
    }

    @Override // defpackage.emvz
    public final boolean h(CharSequence charSequence) {
        return this.b.i(charSequence);
    }

    @Override // defpackage.emvz
    public final boolean i(CharSequence charSequence) {
        return this.b.h(charSequence);
    }

    public String toString() {
        return this.b.toString().concat(".negate()");
    }
}
