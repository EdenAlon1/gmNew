package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public class vq {
    public int a;
    public int b;
    public int c;
    public int d;

    public final void a(wr wrVar) {
        View view = wrVar.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        this.c = view.getRight();
        this.d = view.getBottom();
    }
}
