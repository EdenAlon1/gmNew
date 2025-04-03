package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emvq extends emvn {
    private final char a;
    private final char b;

    public emvq(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.emvz
    public final void b(BitSet bitSet) {
        bitSet.set(this.a);
        bitSet.set(this.b);
    }

    @Override // defpackage.emvz
    public final boolean c(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + emvz.o(this.a) + emvz.o(this.b) + "\")";
    }
}
