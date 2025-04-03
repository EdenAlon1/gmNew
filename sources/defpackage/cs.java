package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cs {
    public final hi a;

    public cs(hi hiVar) {
        this.a = hiVar;
    }

    public final boolean b() {
        View view = this.a.a.Q;
        int b = view != null ? hg.b(view) : 0;
        int i = this.a.h;
        if (b != i) {
            return (b == 2 || i == 2) ? false : true;
        }
        return true;
    }
}
