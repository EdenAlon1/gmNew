package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mhw implements mhi {
    public final mtg a;
    public int d;
    public boolean e;
    public final List c = new ArrayList();
    public final Object b = new Object();

    public mhw(mtn mtnVar, boolean z) {
        this.a = new mtg(mtnVar, z);
    }

    @Override // defpackage.mhi
    public final lru a() {
        return this.a.d;
    }

    @Override // defpackage.mhi
    public final Object b() {
        return this.b;
    }

    public final void c(int i) {
        this.d = i;
        this.e = false;
        this.c.clear();
    }
}
