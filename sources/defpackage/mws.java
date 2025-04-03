package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import j$.util.Objects;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mws extends lrz {
    public static final mws F = new mws(new mwr());
    public final boolean G;
    public final boolean H;
    public final boolean I;
    public final boolean J;
    public final boolean K;
    public final boolean L;
    public final boolean M;
    public final boolean N;
    public final boolean O;
    public final boolean P;
    public final boolean Q;
    public final boolean R;
    public final boolean S;
    public final boolean T;
    public final boolean U;
    public final SparseArray V;
    public final SparseBooleanArray W;

    static {
        lvf.N(1000);
        lvf.N(1001);
        lvf.N(1002);
        lvf.N(1003);
        lvf.N(1004);
        lvf.N(1005);
        lvf.N(1006);
        lvf.N(1007);
        lvf.N(1008);
        lvf.N(1009);
        lvf.N(1010);
        lvf.N(1011);
        lvf.N(1012);
        lvf.N(1013);
        lvf.N(1014);
        lvf.N(1015);
        lvf.N(1016);
        lvf.N(1017);
        lvf.N(1018);
    }

    public mws(mwr mwrVar) {
        super(mwrVar);
        this.G = mwrVar.v;
        this.H = false;
        this.I = mwrVar.w;
        this.J = false;
        this.K = mwrVar.x;
        this.L = false;
        this.M = false;
        this.N = false;
        this.O = false;
        this.P = mwrVar.y;
        this.Q = mwrVar.z;
        this.R = mwrVar.A;
        this.S = false;
        this.T = mwrVar.B;
        this.U = false;
        this.V = mwrVar.C;
        this.W = mwrVar.D;
    }

    public final boolean a(int i) {
        return this.W.get(i);
    }

    @Override // defpackage.lrz
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            mws mwsVar = (mws) obj;
            if (super.equals(mwsVar) && this.G == mwsVar.G && this.I == mwsVar.I && this.K == mwsVar.K && this.P == mwsVar.P && this.Q == mwsVar.Q && this.R == mwsVar.R && this.T == mwsVar.T) {
                SparseBooleanArray sparseBooleanArray = this.W;
                SparseBooleanArray sparseBooleanArray2 = mwsVar.W;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.V;
                            SparseArray sparseArray2 = mwsVar.V;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                for (int i2 = 0; i2 < size2; i2++) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                mvo mvoVar = (mvo) entry.getKey();
                                                if (map2.containsKey(mvoVar)) {
                                                    Object value = entry.getValue();
                                                    Object obj2 = map2.get(mvoVar);
                                                    int i3 = lvf.a;
                                                    if (!Objects.equals(value, obj2)) {
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return true;
                            }
                        } else {
                            if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // defpackage.lrz
    public final int hashCode() {
        return (((((((((((((((super.hashCode() + 31) * 31) + (this.G ? 1 : 0)) * 961) + (this.I ? 1 : 0)) * 961) + (this.K ? 1 : 0)) * 28629151) + (this.P ? 1 : 0)) * 31) + (this.Q ? 1 : 0)) * 31) + (this.R ? 1 : 0)) * 961) + (this.T ? 1 : 0)) * 31;
    }
}
