package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.PopupWindow;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.view.EmojiView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dutr implements duua {
    public static final enru a = enru.c("com/google/android/libraries/inputmethod/emoji/picker/EmojiPickerPopupViewController");
    public final Context b;
    public View.OnClickListener c;
    private PopupWindow d;
    private final boolean e;
    private final View.OnClickListener f = new dutq(this);

    public dutr(Context context, boolean z) {
        this.b = context;
        this.e = z;
    }

    @Override // defpackage.duua
    public final void a() {
        PopupWindow popupWindow = this.d;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
    }

    @Override // defpackage.duua
    public final void b() {
        PopupWindow popupWindow = this.d;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return;
        }
        this.d.dismiss();
    }

    @Override // defpackage.duua
    public final void c(final View view, View view2, engw engwVar, final PopupWindow.OnDismissListener onDismissListener, float f, int i, int i2, int i3, int i4, duvq duvqVar, CharSequence charSequence) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        final dutn dutnVar = new dutn(this.b, engwVar, this.f, (int) (i * f), (int) (i2 * f), f, duvqVar, charSequence);
        View b = kvo.b(dutnVar, R.id.emoji_picker_popup_view_holder);
        float f2 = iArr[0];
        float width = view.getWidth();
        float a2 = dutnVar.a();
        float elevation = b.getElevation();
        float max = Math.max((f2 + ((width * f) / 2.0f)) - (a2 / 2.0f), i3 + elevation);
        if (dutnVar.a() + max >= i4) {
            max = (i4 - dutnVar.a()) - elevation;
        }
        int i5 = iArr[1];
        int i6 = dutnVar.k;
        int max2 = Math.max(0, i5 - (((((((i6 == 3 || i6 == 4) ? dutnVar.f + 1 : dutnVar.f) * dutnVar.g) + dutnVar.c.getPaddingTop()) + dutnVar.c.getPaddingBottom()) + dutnVar.b.getPaddingTop()) + dutnVar.b.getPaddingBottom()));
        Drawable background = b.getBackground();
        if (background == null && (background = this.b.getDrawable(R.drawable.popup_view_rounded_background)) == null) {
            background = new ColorDrawable(-7829368);
        }
        b.setElevation(0.0f);
        b.setBackground(null);
        PopupWindow popupWindow = new PopupWindow(dutnVar, -2, -2, this.e);
        this.d = popupWindow;
        popupWindow.setTouchable(dutnVar.isEnabled());
        this.d.setOutsideTouchable(true);
        this.d.setSoftInputMode(32);
        this.d.setBackgroundDrawable(background);
        this.d.setElevation(elevation);
        this.d.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: dutp
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                onDismissListener.onDismiss();
                duma.a(dutr.this.b).d(view);
            }
        });
        this.d.setAnimationStyle(R.style.VariantSelectorPopupAnimation);
        if (this.d.isShowing()) {
            PopupWindow popupWindow2 = this.d;
            popupWindow2.update(iArr[0], iArr[1], popupWindow2.getWidth(), this.d.getHeight());
        } else {
            this.d.showAtLocation(view2, 0, (int) max, max2);
        }
        dutnVar.post(new Runnable() { // from class: duto
            @Override // java.lang.Runnable
            public final void run() {
                duma.a(dutr.this.b).d((EmojiView) dutnVar.a.get());
            }
        });
    }
}
