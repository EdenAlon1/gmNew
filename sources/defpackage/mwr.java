package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mwr extends lry {
    public boolean A;
    public boolean B;
    public final SparseArray C;
    public final SparseBooleanArray D;
    public boolean v;
    public boolean w;
    public boolean x;
    public boolean y;
    public boolean z;

    public mwr() {
        this.C = new SparseArray();
        this.D = new SparseBooleanArray();
        this.v = true;
        this.w = true;
        this.x = true;
        this.y = true;
        this.z = true;
        this.A = true;
        this.B = true;
    }

    @Override // defpackage.lry
    public final /* bridge */ /* synthetic */ void c(int i) {
        this.u.remove(Integer.valueOf(i));
    }

    public final void d(int i) {
        super.b(i);
    }

    protected final void e(lrz lrzVar) {
        super.a(lrzVar);
    }

    public mwr(mws mwsVar) {
        super(mwsVar);
        this.v = mwsVar.G;
        boolean z = mwsVar.H;
        this.w = mwsVar.I;
        boolean z2 = mwsVar.J;
        this.x = mwsVar.K;
        boolean z3 = mwsVar.L;
        boolean z4 = mwsVar.M;
        boolean z5 = mwsVar.N;
        boolean z6 = mwsVar.O;
        this.y = mwsVar.P;
        this.z = mwsVar.Q;
        this.A = mwsVar.R;
        boolean z7 = mwsVar.S;
        this.B = mwsVar.T;
        boolean z8 = mwsVar.U;
        SparseArray sparseArray = mwsVar.V;
        SparseArray sparseArray2 = new SparseArray();
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), new HashMap((Map) sparseArray.valueAt(i)));
        }
        this.C = sparseArray2;
        this.D = mwsVar.W.clone();
    }
}
