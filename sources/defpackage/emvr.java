package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emvr extends emvn {
    private final char a;

    public emvr(char c) {
        this.a = c;
    }

    @Override // defpackage.emvz
    public final void b(BitSet bitSet) {
        bitSet.set(0, this.a);
        bitSet.set(this.a + 1, 65536);
    }

    @Override // defpackage.emvz
    public final boolean c(char c) {
        return c != this.a;
    }

    @Override // defpackage.emvn, defpackage.emvz
    public final emvz f() {
        return new emvp(this.a);
    }

    @Override // defpackage.emvz
    public final emvz g(emvz emvzVar) {
        return emvzVar.c(this.a) ? emvi.a : this;
    }

    public final String toString() {
        return "CharMatcher.isNot('" + emvz.o(this.a) + "')";
    }
}
