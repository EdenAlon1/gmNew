package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nta {
    public final List a = new ArrayList();
    public final SparseArray b;
    public final SparseArray c;
    private final SparseArray d;

    public nta(npq npqVar) {
        for (int i = 0; i < npqVar.a.size(); i++) {
            this.a.add(new nsz());
        }
        this.d = new SparseArray();
        this.b = new SparseArray();
        this.c = new SparseArray();
    }

    public final lqc a(int i, int i2) {
        SparseArray sparseArray = ((nsz) this.a.get(i)).a;
        lti.c(lvf.T(sparseArray, i2));
        return (lqc) sparseArray.get(i2);
    }

    public final nsc b(int i) {
        return (nsc) this.d.get(i);
    }

    public final void c(int i, nsc nscVar) {
        lti.d(!lvf.T(this.d, i), "Exactly one SampleExporter can be added for each track type.");
        this.d.put(i, nscVar);
    }

    public final boolean d() {
        for (int i = 0; i < this.a.size(); i++) {
            if (((nsz) this.a.get(i)).b == -1) {
                return false;
            }
        }
        for (int i2 = 0; i2 < this.a.size(); i2++) {
            nsz nszVar = (nsz) this.a.get(i2);
            if (nszVar.b != nszVar.a.size()) {
                return false;
            }
        }
        return true;
    }
}
