package defpackage;

import android.util.SparseBooleanArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class lpy {
    private final SparseBooleanArray a = new SparseBooleanArray();
    private boolean b;

    public final lpz a() {
        lti.c(!this.b);
        this.b = true;
        return new lpz(this.a);
    }

    public final void b(int i) {
        lti.c(!this.b);
        this.a.append(i, true);
    }
}
