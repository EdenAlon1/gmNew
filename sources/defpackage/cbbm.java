package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes7.dex */
public abstract class cbbm implements bcqf {
    protected final SparseArray a = new SparseArray();

    @Override // defpackage.bcqf
    public final synchronized void a() {
        int size = this.a.size();
        for (int i = 0; i < size; i++) {
            ((cbbl) this.a.valueAt(i)).c();
        }
        this.a.clear();
    }

    protected abstract cbbl b(int i);

    public final synchronized cbbl c(int i) {
        cbbl cbblVar = (cbbl) this.a.get(i);
        if (cbblVar != null) {
            return cbblVar;
        }
        cbbl b = b(i);
        this.a.put(i, b);
        return b;
    }
}
