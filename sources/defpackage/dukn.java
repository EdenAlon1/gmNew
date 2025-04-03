package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dukn implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ View d;

    public dukn(View view, int i, int i2, View view2) {
        this.a = view;
        this.b = i;
        this.c = i2;
        this.d = view2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Rect rect = new Rect();
        this.a.getHitRect(rect);
        rect.top -= this.b;
        rect.left = rect.left;
        rect.right += this.c;
        rect.bottom = rect.bottom;
        this.d.setTouchDelegate(new TouchDelegate(rect, this.a));
    }
}
