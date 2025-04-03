package defpackage;

import java.util.Arrays;
import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emvj extends emvz {
    private final char[] a;

    public emvj(CharSequence charSequence) {
        char[] charArray = charSequence.toString().toCharArray();
        this.a = charArray;
        Arrays.sort(charArray);
    }

    @Override // defpackage.emvz
    public final void b(BitSet bitSet) {
        for (char c : this.a) {
            bitSet.set(c);
        }
    }

    @Override // defpackage.emvz
    public final boolean c(char c) {
        return Arrays.binarySearch(this.a, c) >= 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CharMatcher.anyOf(\"");
        for (char c : this.a) {
            sb.append(emvz.o(c));
        }
        sb.append("\")");
        return sb.toString();
    }
}
