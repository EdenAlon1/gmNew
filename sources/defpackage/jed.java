package defpackage;

import android.view.View;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jed implements Comparator {
    public final cop a;
    public final coq b;
    public final cop c;
    public final cog d;

    public jed() {
        long[] jArr = cpg.a;
        this.a = new cop((byte[]) null);
        int i = cpj.a;
        this.b = new coq((byte[]) null);
        this.c = new cop((byte[]) null);
        int i2 = cow.a;
        this.d = new cog((byte[]) null);
    }

    public final void a() {
        this.c.d();
        this.b.a();
        this.d.a();
        this.a.d();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        View view = (View) obj;
        View view2 = (View) obj2;
        if (view == view2) {
            return 0;
        }
        if (view == null) {
            return -1;
        }
        if (view2 == null) {
            return 1;
        }
        View view3 = (View) this.c.f(view);
        View view4 = (View) this.c.f(view2);
        if (view3 == view4 && view3 != null) {
            if (view == view3) {
                return -1;
            }
            return (view2 == view3 || this.a.f(view) == null) ? 1 : -1;
        }
        if (view3 != null) {
            view = view3;
        }
        if (view4 != null) {
            view2 = view4;
        }
        if (view3 == null && view4 == null) {
            return 0;
        }
        return this.d.f(view) < this.d.f(view2) ? -1 : 1;
    }
}
