package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emvo extends emvn {
    private final char a;
    private final char b;

    public emvo(char c, char c2) {
        emxf.a(c2 >= c);
        this.a = c;
        this.b = c2;
    }

    @Override // defpackage.emvz
    public final void b(BitSet bitSet) {
        bitSet.set(this.a, this.b + 1);
    }

    @Override // defpackage.emvz
    public final boolean c(char c) {
        return this.a <= c && c <= this.b;
    }

    public final String toString() {
        return "CharMatcher.inRange('" + emvz.o(this.a) + "', '" + emvz.o(this.b) + "')";
    }
}
