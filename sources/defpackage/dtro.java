package defpackage;

import android.content.ContentValues;
import android.os.Parcel;
import android.text.TextUtils;
import defpackage.dtro;
import defpackage.dtry;
import defpackage.dtsu;
import defpackage.dtyq;
import defpackage.dtyx;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dtro<C extends dtsu<C, Q, B, D, R>, Q extends dtyq<C, Q, B, D, R>, B extends dtyx<C, Q, B, D, R>, D extends dtro<C, Q, B, D, R>, R extends dtry<R>> {
    public BitSet cJ;
    public Map cK;
    protected dtsq cL;
    public final Map cM = new HashMap();
    public final Map cN = new HashMap();
    public boolean cO;

    /* compiled from: PG */
    public interface a {
        azwl iB();
    }

    protected static final boolean aH(dtsr dtsrVar, int i) {
        return dtsrVar.di(i);
    }

    protected static final String aI(int[] iArr) {
        StringBuilder sb = new StringBuilder();
        for (int i : iArr) {
            sb.append(i);
            sb.append(";");
        }
        return sb.toString();
    }

    protected static final String aJ(long[] jArr) {
        StringBuilder sb = new StringBuilder();
        for (long j : jArr) {
            sb.append(j);
            sb.append(";");
        }
        return sb.toString();
    }

    protected static final String aK(Object[] objArr) {
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            sb.append(obj);
            sb.append(";");
        }
        return sb.toString();
    }

    protected static final String aL(String[] strArr) {
        return TextUtils.join(";", strArr);
    }

    protected static final String aM(boolean[] zArr) {
        StringBuilder sb = new StringBuilder();
        for (boolean z : zArr) {
            sb.append(z);
            sb.append(";");
        }
        return sb.toString();
    }

    private final dtro fZ(String str, Class cls) {
        if (((dtvn) this.cN.get(str)) != null) {
            engw engwVar = (engw) this.cM.get(str);
            if (engwVar.size() > 1) {
                return (dtro) cls.cast(engwVar.get(1));
            }
            emxf.l(cls.cast(engwVar.get(0)) != null);
            return null;
        }
        throw new IllegalArgumentException("invalid join tag: " + str + ", valid joins=" + Arrays.toString(this.cN.keySet().toArray()));
    }

    public abstract String a();

    protected final void aA(Parcel parcel) {
        dtsq dtsqVar = new dtsq(engw.n(Arrays.asList(parcel.createStringArray())), new HashMap());
        this.cL = dtsqVar;
        parcel.readMap(dtsqVar.b, null);
        fG(parcel);
        int readInt = parcel.readInt();
        if (readInt == -1) {
            this.cJ = null;
            return;
        }
        this.cJ = new BitSet();
        for (int i = 0; i < readInt; i++) {
            this.cJ.set(parcel.readInt());
        }
    }

    protected final void aB() {
        if (this.cJ != null) {
            return;
        }
        this.cJ = new BitSet();
    }

    public final void aC(BitSet bitSet) {
        this.cJ = bitSet != null ? (BitSet) bitSet.clone() : null;
    }

    protected final boolean aD(dtsq dtsqVar) {
        dtsq dtsqVar2 = this.cL;
        int size = dtsqVar2 == null ? 0 : dtsqVar2.a.size();
        if (size != (dtsqVar == null ? 0 : dtsqVar.a.size())) {
            return false;
        }
        if (size == 0) {
            return true;
        }
        return this.cL.equals(dtsqVar);
    }

    public final boolean aE(String str) {
        return this.cN.containsKey(str);
    }

    public final boolean aF(String str) {
        dtsq dtsqVar = this.cL;
        return dtsqVar != null && dtsqVar.b.containsKey(str);
    }

    public final dtro[] aG(String str, dtro[] dtroVarArr) {
        if (this.cN.containsKey(str)) {
            engw engwVar = (engw) this.cM.get(str);
            if (engwVar.size() > 0) {
                dtroVarArr = (dtro[]) Array.newInstance(dtroVarArr.getClass().getComponentType(), engwVar.size() - 1);
            }
            System.arraycopy(engwVar.toArray(), 1, dtroVarArr, 0, engwVar.size() - 1);
            return dtroVarArr;
        }
        throw new IllegalArgumentException("invalid join tag: " + str + ", valid joins=" + Arrays.toString(this.cN.keySet().toArray()));
    }

    public final dtro av(String str, Class cls) {
        if (!this.cO) {
            return fZ(str, cls);
        }
        throw new IllegalArgumentException("invalid join tag (found aggregating query): " + str + "; join " + String.valueOf(this.cN.get(str)));
    }

    public final dtro aw(String str, Class cls) {
        dtvn dtvnVar = (dtvn) this.cN.get(str);
        if (dtvnVar == null || !dtvnVar.f) {
            return fZ(str, cls);
        }
        throw new IllegalArgumentException("invalid join tag (found multi row join): " + str + "; join " + dtvnVar.toString());
    }

    public final Object ax(String str) {
        Map map = this.cK;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public final String ay(String str) {
        Integer num = (Integer) this.cL.b.get(str);
        if (num == null) {
            throw new IllegalArgumentException("unknown as expression: ".concat(String.valueOf(str)));
        }
        int intValue = num.intValue();
        if (intValue >= this.cL.a() || intValue < 0) {
            throw new IndexOutOfBoundsException();
        }
        return (String) this.cL.a.get(intValue);
    }

    public final void az(int i, String str) {
        Object obj;
        BitSet bitSet;
        obj = ((dtqv) dtub.c).a.get();
        if (((Boolean) obj).booleanValue() && (bitSet = this.cJ) != null && !bitSet.get(i)) {
            throw new IllegalStateException(defpackage.a.a(str, "sql column ", " is not part of the projection or was not initialized in the builder"));
        }
    }

    public abstract void b(ContentValues contentValues);

    protected abstract void c(dtsu dtsuVar);

    public void fY(int i) {
        BitSet bitSet = this.cJ;
        if (bitSet != null) {
            bitSet.set(i);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        dtsq dtsqVar = this.cL;
        if (dtsqVar == null) {
            parcel.writeStringArray(new String[0]);
            parcel.writeMap(new HashMap());
        } else {
            parcel.writeStringArray((String[]) dtsqVar.a.toArray(new String[0]));
            parcel.writeMap(this.cL.b);
        }
        fH(parcel);
        BitSet bitSet = this.cJ;
        if (bitSet == null) {
            parcel.writeInt(-1);
            return;
        }
        parcel.writeInt(bitSet.cardinality());
        int nextSetBit = this.cJ.nextSetBit(0);
        while (nextSetBit != -1) {
            parcel.writeInt(nextSetBit);
            nextSetBit = this.cJ.nextSetBit(nextSetBit + 1);
        }
    }

    protected void fG(Parcel parcel) {
    }

    protected void fH(Parcel parcel) {
    }
}
