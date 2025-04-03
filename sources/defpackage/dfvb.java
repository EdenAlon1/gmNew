package defpackage;

import com.google.android.gms.common.data.DataHolder;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class dfvb extends dfut {
    private boolean b;
    private ArrayList c;

    protected dfvb(DataHolder dataHolder) {
        super(dataHolder);
        this.b = false;
    }

    private final void a() {
        synchronized (this) {
            if (!this.b) {
                DataHolder dataHolder = this.a;
                dfwv.n(dataHolder);
                int i = dataHolder.i;
                ArrayList arrayList = new ArrayList();
                this.c = arrayList;
                if (i > 0) {
                    arrayList.add(0);
                    String g = g();
                    String b = this.a.b(g, 0, this.a.a(0));
                    for (int i2 = 1; i2 < i; i2++) {
                        int a = this.a.a(i2);
                        String b2 = this.a.b(g, i2, a);
                        if (b2 == null) {
                            throw new NullPointerException("Missing value for markerColumn: " + g + ", at row: " + i2 + ", for window: " + a);
                        }
                        if (!b2.equals(b)) {
                            this.c.add(Integer.valueOf(i2));
                            b = b2;
                        }
                    }
                }
                this.b = true;
            }
        }
    }

    @Override // defpackage.dfut, defpackage.dfuv
    public final int c() {
        a();
        return this.c.size();
    }

    @Override // defpackage.dfuv
    public final Object d(int i) {
        int intValue;
        int intValue2;
        a();
        int e = e(i);
        int i2 = 0;
        if (i >= 0 && i != this.c.size()) {
            if (i == this.c.size() - 1) {
                DataHolder dataHolder = this.a;
                dfwv.n(dataHolder);
                intValue = dataHolder.i;
                intValue2 = ((Integer) this.c.get(i)).intValue();
            } else {
                intValue = ((Integer) this.c.get(i + 1)).intValue();
                intValue2 = ((Integer) this.c.get(i)).intValue();
            }
            i2 = intValue - intValue2;
            if (i2 == 1) {
                int e2 = e(i);
                DataHolder dataHolder2 = this.a;
                dfwv.n(dataHolder2);
                dataHolder2.a(e2);
                i2 = 1;
            }
        }
        return f(e, i2);
    }

    final int e(int i) {
        if (i < 0 || i >= this.c.size()) {
            throw new IllegalArgumentException(a.f(i, "Position ", " is out of bounds for this buffer"));
        }
        return ((Integer) this.c.get(i)).intValue();
    }

    protected abstract Object f(int i, int i2);

    protected abstract String g();
}
