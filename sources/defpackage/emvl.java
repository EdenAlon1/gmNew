package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class emvl extends emvt {
    private final BitSet a;

    public emvl(BitSet bitSet, String str) {
        super(str);
        this.a = bitSet.length() + 64 < bitSet.size() ? (BitSet) bitSet.clone() : bitSet;
    }

    @Override // defpackage.emvz
    public final void b(BitSet bitSet) {
        bitSet.or(this.a);
    }

    @Override // defpackage.emvz
    public final boolean c(char c) {
        return this.a.get(c);
    }
}
