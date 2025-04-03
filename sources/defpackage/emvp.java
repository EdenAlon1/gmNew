package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emvp extends emvn {
    public final char a;

    public emvp(char c) {
        this.a = c;
    }

    @Override // defpackage.emvz
    public final void b(BitSet bitSet) {
        bitSet.set(this.a);
    }

    @Override // defpackage.emvz
    public final boolean c(char c) {
        return c == this.a;
    }

    @Override // defpackage.emvn, defpackage.emvz
    public final emvz f() {
        return new emvr(this.a);
    }

    @Override // defpackage.emvz
    public final emvz g(emvz emvzVar) {
        return emvzVar.c(this.a) ? emvzVar : new emvx(this, emvzVar);
    }

    public final String toString() {
        return "CharMatcher.is('" + emvz.o(this.a) + "')";
    }
}
