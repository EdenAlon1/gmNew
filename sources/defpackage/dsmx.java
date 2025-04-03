package defpackage;

import android.R;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsmx implements dsmr {
    public static final enru a = enru.c("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardDetectorPopupWindowStrategy");
    private final ffbz b;
    private final ffbz c;
    private final ffbz d;
    private final ffbz e;
    private boolean f;

    public dsmx(final Activity activity, final dsob dsobVar) {
        activity.getClass();
        this.b = ffca.a(new ffix() { // from class: dsms
            @Override // defpackage.ffix
            public final Object invoke() {
                PopupWindow popupWindow = new PopupWindow(new View(activity), 0, -1);
                popupWindow.setSoftInputMode(16);
                popupWindow.setInputMethodMode(1);
                return popupWindow;
            }
        });
        this.c = ffca.a(new ffix() { // from class: dsmt
            @Override // defpackage.ffix
            public final Object invoke() {
                View contentView = this.d().getContentView();
                dsob dsobVar2 = dsob.this;
                Activity activity2 = (Activity) dsobVar2.a.b();
                activity2.getClass();
                dqkk dqkkVar = (dqkk) dsobVar2.b.b();
                dqkkVar.getClass();
                contentView.getClass();
                return new dsoa(activity2, dqkkVar, contentView);
            }
        });
        this.d = ffca.a(new ffix() { // from class: dsmu
            @Override // defpackage.ffix
            public final Object invoke() {
                return (ViewGroup) activity.findViewById(R.id.content);
            }
        });
        this.e = ffca.a(new ffix() { // from class: dsmv
            @Override // defpackage.ffix
            public final Object invoke() {
                View view = new View(activity);
                view.setTag("KEYBOARD_DETECTION");
                view.setLayoutParams(new ViewGroup.LayoutParams(0, 0));
                return view;
            }
        });
    }

    private final View e() {
        return (View) this.e.a();
    }

    private final ViewGroup f() {
        return (ViewGroup) this.d.a();
    }

    private final dsoa g() {
        return (dsoa) this.c.a();
    }

    @Override // defpackage.dsmr
    public final void a(dsmn dsmnVar) {
        if (this.f) {
            throw new IllegalStateException("Detector was already attached");
        }
        g().h = dsmnVar;
        d().getContentView().getViewTreeObserver().addOnGlobalLayoutListener(g());
        ViewGroup f = f();
        if (f.isAttachedToWindow()) {
            ((enrr) a.h().h("com/google/android/libraries/compose/ui/keyboard/detector/KeyboardDetectorPopupWindowStrategy", "attachPopupWindow", 64, "KeyboardDetectorPopupWindowStrategy.kt")).q("Starting keyboard detection");
            d().showAtLocation(f.getRootView(), 0, 0, 0);
        } else {
            f.addOnAttachStateChangeListener(new dsmw(f, this));
        }
        e().setOnApplyWindowInsetsListener(g());
        f().addView(e());
        this.f = true;
    }

    @Override // defpackage.dsmr
    public final void b() {
        if (!this.f) {
            throw new IllegalStateException("Detector wasn't attached");
        }
        e().getViewTreeObserver().removeOnGlobalLayoutListener(g());
        f().removeView(e());
        d().getContentView().getViewTreeObserver().removeOnGlobalLayoutListener(g());
        if (d().isShowing()) {
            d().dismiss();
        }
        this.f = false;
    }

    @Override // defpackage.dsmr
    public final /* synthetic */ boolean c() {
        return false;
    }

    public final PopupWindow d() {
        return (PopupWindow) this.b.a();
    }
}
