package defpackage;

import java.util.BitSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class emvz implements emxg {
    protected emvz() {
    }

    public static emvz l(CharSequence charSequence) {
        int length = charSequence.length();
        return length != 0 ? length != 1 ? length != 2 ? new emvj(charSequence) : new emvq(charSequence.charAt(0), charSequence.charAt(1)) : new emvp(charSequence.charAt(0)) : emvw.a;
    }

    public static emvz m(CharSequence charSequence) {
        return l(charSequence).f();
    }

    public static String o(char c) {
        char[] cArr = new char[6];
        int i = 0;
        cArr[0] = '\\';
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        int i2 = c;
        while (i < 4) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(i2 & 15);
            i++;
            i2 >>= 4;
        }
        return String.copyValueOf(cArr);
    }

    private static emvz p(int i, BitSet bitSet, String str) {
        int i2;
        if (i == 0) {
            return emvw.a;
        }
        if (i == 1) {
            return new emvp((char) bitSet.nextSetBit(0));
        }
        int i3 = 2;
        if (i == 2) {
            char nextSetBit = (char) bitSet.nextSetBit(0);
            return new emvq(nextSetBit, (char) bitSet.nextSetBit(nextSetBit + 1));
        }
        int length = bitSet.length();
        if (i > 1023 || length <= i * 64) {
            return new emvl(bitSet, str);
        }
        int cardinality = bitSet.cardinality();
        boolean z = bitSet.get(0);
        if (cardinality != 1) {
            int highestOneBit = Integer.highestOneBit(cardinality - 1);
            i3 = highestOneBit + highestOneBit;
            while (i3 * 0.5d < cardinality) {
                i3 += i3;
            }
        }
        char[] cArr = new char[i3];
        int i4 = i3 - 1;
        int nextSetBit2 = bitSet.nextSetBit(0);
        long j = 0;
        while (nextSetBit2 != -1) {
            long j2 = (1 << nextSetBit2) | j;
            int p = emxt.p(nextSetBit2);
            while (true) {
                i2 = p & i4;
                if (cArr[i2] == 0) {
                    break;
                }
                p = i2 + 1;
            }
            cArr[i2] = (char) nextSetBit2;
            nextSetBit2 = bitSet.nextSetBit(nextSetBit2 + 1);
            j = j2;
        }
        return new emxt(cArr, j, z, str);
    }

    @Override // defpackage.emxg
    @Deprecated
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        return c(((Character) obj).charValue());
    }

    public void b(BitSet bitSet) {
        for (int i = 65535; i >= 0; i--) {
            if (c((char) i)) {
                bitSet.set(i);
            }
        }
    }

    public abstract boolean c(char c);

    public int d(CharSequence charSequence) {
        return e(charSequence, 0);
    }

    public int e(CharSequence charSequence, int i) {
        int length = charSequence.length();
        emxf.x(i, length);
        while (i < length) {
            if (c(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public emvz f() {
        return new emvu(this);
    }

    public emvz g(emvz emvzVar) {
        return new emvx(this, emvzVar);
    }

    public boolean h(CharSequence charSequence) {
        int length = charSequence.length();
        do {
            length--;
            if (length < 0) {
                return true;
            }
        } while (c(charSequence.charAt(length)));
        return false;
    }

    public boolean i(CharSequence charSequence) {
        return d(charSequence) == -1;
    }

    public emvz j() {
        return n();
    }

    public final int k(CharSequence charSequence) {
        int i = 0;
        for (int i2 = 0; i2 < charSequence.length(); i2++) {
            if (c(charSequence.charAt(i2))) {
                i++;
            }
        }
        return i;
    }

    public final emvz n() {
        BitSet bitSet = new BitSet();
        b(bitSet);
        int cardinality = bitSet.cardinality();
        if (cardinality + cardinality <= 65536) {
            return p(cardinality, bitSet, toString());
        }
        bitSet.flip(0, 65536);
        int i = 65536 - cardinality;
        String emvzVar = toString();
        return new emvg(p(i, bitSet, emvzVar.endsWith(".negate()") ? emvzVar.substring(0, emvzVar.length() - 9) : String.valueOf(emvzVar).concat(".negate()")), emvzVar);
    }
}
