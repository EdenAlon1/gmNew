package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddym {
    public final ddyl a;
    public final View b;

    public ddym(View view, int i, View view2, int i2) {
        view.getClass();
        view2.getClass();
        this.b = view;
        ddyl ddylVar = new ddyl(view2.getContext());
        ddylVar.setWillNotDraw(false);
        ddylVar.setLayerType(1, ddylVar.a);
        ddylVar.setOnClickListener(new View.OnClickListener() { // from class: ddyk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                ((ddyl) view3).c();
            }
        });
        this.a = ddylVar;
        ddylVar.e = view;
        ddylVar.b = new PopupWindow(ddylVar);
        ddylVar.addView(view);
        ddylVar.g = view2;
        ddylVar.d();
        ddylVar.f = i;
        ddylVar.h = i2;
    }

    public final void a() {
        this.a.c();
    }

    public final void b(int i) {
        this.a.a.setColor(i);
    }

    public final void c() {
        final ddyl ddylVar = this.a;
        ddylVar.b.setClippingEnabled(true);
        ddylVar.b.setAnimationStyle(R.style.Animation.Dialog);
        ddylVar.b.setBackgroundDrawable(new ColorDrawable(0));
        ddylVar.b.setOutsideTouchable(ddylVar.c);
        ddylVar.b.setFocusable(ddylVar.d);
        ddylVar.g.post(new Runnable() { // from class: ddyj
            @Override // java.lang.Runnable
            public final void run() {
                ddyl ddylVar2 = ddyl.this;
                View view = ddylVar2.g;
                Activity activity = null;
                if (view != null) {
                    Context context = view.getContext();
                    while (true) {
                        if (!(context instanceof Activity)) {
                            if (!(context instanceof ContextWrapper)) {
                                break;
                            } else {
                                context = ((ContextWrapper) context).getBaseContext();
                            }
                        } else {
                            activity = (Activity) context;
                            break;
                        }
                    }
                }
                if (activity == null || activity.isFinishing()) {
                    return;
                }
                ddylVar2.d();
                ddylVar2.f();
                ddylVar2.b.showAtLocation(ddylVar2.g, 0, ddylVar2.a(), ddylVar2.b());
            }
        });
    }

    public final boolean d() {
        PopupWindow popupWindow = this.a.b;
        return popupWindow != null && popupWindow.isShowing();
    }
}
