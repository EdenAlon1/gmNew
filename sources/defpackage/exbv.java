package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.Property;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.util.Comparator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class exbv implements exbz {
    public final exbu a;
    public final View b;
    public engw c;
    boolean d;
    public final View.OnLayoutChangeListener e;
    public final Comparator f;
    private final Rect g = new Rect();
    private final Rect h = new Rect();
    private engw i;

    public exbv(View view) {
        int i = engw.d;
        engw engwVar = enou.a;
        this.c = engwVar;
        this.i = engwVar;
        this.d = true;
        this.e = new exax(this);
        this.f = new exay();
        Context context = view.getContext();
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, (context.getResources().getConfiguration().uiMode & 48) == 16 ? R.style.Theme_TextClassifier_FloatingToolbar_Light : R.style.Theme_TextClassifier_FloatingToolbar);
        View rootView = view.getRootView();
        this.b = rootView;
        this.a = new exbu(contextThemeWrapper, rootView, new exaz(this));
    }

    static AnimatorSet a(View view, int i, Animator.AnimatorListener animatorListener) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f, 0.0f).setDuration(100L));
        animatorSet.setStartDelay(i);
        animatorSet.addListener(animatorListener);
        return animatorSet;
    }

    static View b(Context context, exby exbyVar, int i, boolean z) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.floating_popup_menu_button, (ViewGroup) null);
        if (exbyVar != null) {
            h(inflate, exbyVar, i, z);
        }
        return inflate;
    }

    static void h(View view, exby exbyVar, int i, boolean z) {
        TextView textView = (TextView) view.findViewById(R.id.floating_toolbar_menu_item_text);
        textView.setEllipsize(null);
        if (TextUtils.isEmpty(exbyVar.h())) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(exbyVar.h());
        }
        ImageView imageView = (ImageView) view.findViewById(R.id.floating_toolbar_menu_item_image);
        if (exbyVar.e() == null || !z) {
            imageView.setVisibility(8);
            if (textView != null) {
                textView.setPaddingRelative(0, 0, 0, 0);
            }
        } else {
            imageView.setVisibility(0);
            imageView.setImageDrawable(exbyVar.e());
            if (textView != null) {
                textView.setPaddingRelative(i, 0, 0, 0);
            }
        }
        CharSequence g = exbyVar.g();
        if (TextUtils.isEmpty(g)) {
            view.setContentDescription(exbyVar.h());
        } else {
            view.setContentDescription(g);
        }
    }

    @Override // defpackage.exbz
    public final void c() {
        f();
        this.a.d();
        this.d = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0060, code lost:
    
        if (r16.d != false) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 765
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.exbv.d():void");
    }

    @Override // defpackage.exbz
    public final void e(Rect rect) {
        this.g.set(rect);
    }

    public final void f() {
        this.b.removeOnLayoutChangeListener(this.e);
    }

    @Override // defpackage.exbz
    public final void g() {
        if (this.a.s()) {
            d();
        }
    }

    @Override // defpackage.exbz
    public final boolean i() {
        return this.a.s();
    }
}
