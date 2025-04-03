package defpackage;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class egyo implements Runnable {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;

    public egyo(View view, View view2, int i, int i2, int i3) {
        this.a = view;
        this.b = view2;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        egym egymVar;
        Rect rect = new Rect();
        this.a.getHitRect(egyp.a);
        rect.set(egyp.a);
        Object parent = this.a.getParent();
        while (parent != this.b) {
            if (!(parent instanceof View)) {
                return;
            }
            View view = (View) parent;
            view.getHitRect(egyp.a);
            rect.offset(egyp.a.left, egyp.a.top);
            parent = view.getParent();
        }
        rect.left -= this.c;
        rect.top = rect.top;
        rect.right += this.d;
        rect.bottom += this.e;
        TouchDelegate touchDelegate = new TouchDelegate(rect, this.a);
        View view2 = this.b;
        TouchDelegate touchDelegate2 = view2.getTouchDelegate();
        if (touchDelegate2 == null) {
            egymVar = new egym(view2);
        } else if (touchDelegate2 instanceof egym) {
            egymVar = (egym) touchDelegate2;
        } else {
            egym egymVar2 = new egym(view2);
            egymVar2.a(touchDelegate2);
            egymVar = egymVar2;
        }
        egymVar.a(touchDelegate);
        this.b.setTouchDelegate(egymVar);
        this.a.addOnAttachStateChangeListener(new egyn(egymVar, touchDelegate));
    }
}
