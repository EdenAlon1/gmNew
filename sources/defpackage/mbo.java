package defpackage;

import android.content.Context;
import android.util.SparseArray;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mbo {
    public final Context a;
    public final lpo b;
    public final lqg c;
    public final mdt d;
    public final mbg e;
    public final Executor f;
    public final SparseArray g;
    public mbj h;
    public mdj i;

    public mbo(Context context, lpo lpoVar, lqg lqgVar, mdt mdtVar, Executor executor, mbg mbgVar, boolean z) {
        this.a = context;
        this.b = lpoVar;
        this.c = lqgVar;
        this.d = mdtVar;
        this.f = executor;
        this.e = mbgVar;
        SparseArray sparseArray = new SparseArray();
        this.g = sparseArray;
        mbn mbnVar = new mbn(new mao(lqgVar, mdtVar, z));
        sparseArray.put(1, mbnVar);
        sparseArray.put(4, mbnVar);
        sparseArray.put(2, new mbn(new lyo(lqgVar, mdtVar)));
        sparseArray.put(3, new mbn(new mdh(lqgVar, mdtVar)));
    }

    public final mdj a() {
        mdj mdjVar = this.i;
        lti.g(mdjVar);
        return mdjVar;
    }

    public final void b() {
        mdj mdjVar = this.i;
        lti.f(mdjVar);
        mdjVar.i();
    }

    public final boolean c() {
        return this.i != null;
    }
}
