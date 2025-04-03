package defpackage;

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dtrr {
    public Map aA;
    public final int aB;
    public boolean aC;
    public BitSet az;

    public dtrr(dtzf dtzfVar) {
        this.aB = dtzfVar.a();
    }

    public final BitSet aB() {
        BitSet bitSet = this.az;
        if (bitSet == null) {
            return null;
        }
        return (BitSet) bitSet.clone();
    }

    public final Map aC() {
        Map map = this.aA;
        if (map == null) {
            return null;
        }
        return new HashMap(map);
    }

    public final void aD() {
        this.aC = true;
    }

    public final void aE(int i) {
        BitSet bitSet = this.az;
        if (bitSet != null) {
            bitSet.set(i);
        }
    }

    public final void aF() {
        this.az = new BitSet();
    }
}
