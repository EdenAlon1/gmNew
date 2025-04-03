package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lvi extends lvk {
    public final long a;
    public final List b;
    public final List c;

    public lvi(int i, long j) {
        super(i);
        this.a = j;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public final lvi a(int i) {
        int size = this.c.size();
        for (int i2 = 0; i2 < size; i2++) {
            lvi lviVar = (lvi) this.c.get(i2);
            if (lviVar.d == i) {
                return lviVar;
            }
        }
        return null;
    }

    public final lvj b(int i) {
        int size = this.b.size();
        for (int i2 = 0; i2 < size; i2++) {
            lvj lvjVar = (lvj) this.b.get(i2);
            if (lvjVar.d == i) {
                return lvjVar;
            }
        }
        return null;
    }

    public final void c(lvi lviVar) {
        this.c.add(lviVar);
    }

    public final void d(lvj lvjVar) {
        this.b.add(lvjVar);
    }

    @Override // defpackage.lvk
    public final String toString() {
        List list = this.b;
        return e(this.d) + " leaves: " + Arrays.toString(list.toArray()) + " containers: " + Arrays.toString(this.c.toArray());
    }
}
