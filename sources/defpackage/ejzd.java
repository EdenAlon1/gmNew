package defpackage;

import android.util.SparseArray;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejzd {
    private final Map a = new cmh();
    private final SparseArray b = new SparseArray();
    private int c = 0;

    public final int a(ejzn ejznVar) {
        Integer num = (Integer) this.a.get(ejznVar);
        if (num == null) {
            int i = this.c;
            this.c = i + 1;
            Integer valueOf = Integer.valueOf(i);
            this.a.put(ejznVar, valueOf);
            SparseArray sparseArray = this.b;
            valueOf.getClass();
            sparseArray.put(i, ejznVar);
            num = valueOf;
        }
        return num.intValue();
    }

    public final ejzn b(int i) {
        ejzn ejznVar = (ejzn) this.b.get(i);
        ejznVar.getClass();
        return ejznVar;
    }
}
