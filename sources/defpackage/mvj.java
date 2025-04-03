package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mvj {
    public int a;
    public final SparseArray b;
    public final lts c;

    public mvj() {
        this(new lts() { // from class: mvi
            @Override // defpackage.lts
            public final void a(Object obj) {
            }
        });
    }

    public final Object a(int i) {
        if (this.a == -1) {
            this.a = 0;
        }
        while (true) {
            int i2 = this.a;
            if (i2 > 0 && i < this.b.keyAt(i2)) {
                this.a--;
            }
        }
        while (this.a < this.b.size() - 1 && i >= this.b.keyAt(this.a + 1)) {
            this.a++;
        }
        return this.b.valueAt(this.a);
    }

    public final Object b() {
        return this.b.valueAt(this.b.size() - 1);
    }

    public final boolean c() {
        return this.b.size() == 0;
    }

    public mvj(lts ltsVar) {
        this.b = new SparseArray();
        this.c = ltsVar;
        this.a = -1;
    }
}
