package defpackage;

import android.R;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/* compiled from: PG */
/* loaded from: classes.dex */
class kun extends kuq {
    private final View a;

    public kun(View view) {
        this.a = view;
    }

    @Override // defpackage.kuq
    public void a() {
        View view = this.a;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.a.getWindowToken(), 0);
        }
    }

    @Override // defpackage.kuq
    public void b() {
        final View view = this.a;
        if (view == null) {
            return;
        }
        if (view.isInEditMode() || view.onCheckIsTextEditor()) {
            view.requestFocus();
        } else {
            view = view.getRootView().findFocus();
        }
        if (view == null) {
            view = this.a.getRootView().findViewById(R.id.content);
        }
        if (view == null || !view.hasWindowFocus()) {
            return;
        }
        view.post(new Runnable() { // from class: kum
            @Override // java.lang.Runnable
            public final void run() {
                View view2 = view;
                ((InputMethodManager) view2.getContext().getSystemService("input_method")).showSoftInput(view2, 0);
            }
        });
    }
}
