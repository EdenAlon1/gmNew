package defpackage;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.scrolltobottombutton.ConversationScrollToBottomButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vyp {
    public static final /* synthetic */ ffmx[] a;
    public final ConversationScrollToBottomButton b;
    public final ViewGroup c;
    public final TextView d;
    public final ffbz e;
    public final ffbz f;
    public final ffbz g;
    public Animator h;
    public final ffls i;
    private final Runnable j;

    static {
        ffko ffkoVar = new ffko(vyp.class, "textMode", "getTextMode()Lcom/google/android/apps/messaging/conversation/scrolltobottombutton/ConversationScrollToBottomButtonPeer$TextMode;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
    }

    public vyp(ffbr ffbrVar, ddwu ddwuVar) {
        ddwuVar.getClass();
        ConversationScrollToBottomButton conversationScrollToBottomButton = (ConversationScrollToBottomButton) ffbrVar.b();
        this.b = conversationScrollToBottomButton;
        View.inflate(conversationScrollToBottomButton.getContext(), R.layout.conversation_scroll_to_bottom_button, conversationScrollToBottomButton);
        this.c = (ViewGroup) conversationScrollToBottomButton.findViewById(R.id.inner_root);
        this.d = (TextView) conversationScrollToBottomButton.findViewById(R.id.text);
        conversationScrollToBottomButton.setClickable(true);
        this.j = new Runnable() { // from class: vyc
            @Override // java.lang.Runnable
            public final void run() {
                vyp vypVar = vyp.this;
                ConversationScrollToBottomButton conversationScrollToBottomButton2 = vypVar.b;
                conversationScrollToBottomButton2.setElevation(conversationScrollToBottomButton2.getContext().getResources().getDimension(R.dimen.conversation_scroll_to_bottom_button_elevation));
                float elevation = conversationScrollToBottomButton2.getElevation() * 0.8f;
                float elevation2 = conversationScrollToBottomButton2.getElevation() * 0.8f;
                Rect rect = new Rect();
                Drawable background = vypVar.c.getBackground();
                InsetDrawable insetDrawable = background instanceof InsetDrawable ? (InsetDrawable) background : null;
                if (insetDrawable != null) {
                    insetDrawable.getPadding(rect);
                }
                conversationScrollToBottomButton2.setOutlineProvider(new vyn(vypVar, rect, (int) elevation2, (int) elevation));
            }
        };
        f();
        this.e = ffca.a(new ffix() { // from class: vyd
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(vyp.this.b.getResources().getDimensionPixelSize(R.dimen.conversation_scroll_to_bottom_button_background_width_in_no_text_mode));
            }
        });
        this.f = ffca.a(new ffix() { // from class: vye
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(vyp.this.b.getResources().getDimensionPixelSize(R.dimen.conversation_scroll_to_bottom_button_minimum_clickable_width));
            }
        });
        this.g = ffca.a(new ffix() { // from class: vyf
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(vyp.this.b.getResources().getDimensionPixelSize(R.dimen.conversation_scroll_to_bottom_button_minimum_clickable_height));
            }
        });
        this.i = new vyo(vyl.a, this);
        e();
    }

    public final Animator a() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vxz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                vyp.this.b.setAlpha(valueAnimator.getAnimatedFraction());
            }
        });
        ofFloat.addListener(new vyj(this, new ffix() { // from class: vya
            @Override // defpackage.ffix
            public final Object invoke() {
                String d;
                int i;
                int dimension;
                vyp vypVar = vyp.this;
                vypVar.b.setAlpha(0.0f);
                int i2 = 0;
                vypVar.b.setVisibility(0);
                vym c = vypVar.c();
                vypVar.d.setVisibility(true != ffkj.e(c, vyl.a) ? 0 : 8);
                if (c instanceof vyl) {
                    d = null;
                } else {
                    if (!(c instanceof vyk)) {
                        throw new ffcd();
                    }
                    d = vypVar.d((vyk) c);
                }
                vypVar.d.setText(d);
                ViewGroup viewGroup = vypVar.c;
                ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                vym c2 = vypVar.c();
                if (c2 instanceof vyl) {
                    i = ((Number) vypVar.e.a()).intValue();
                } else {
                    if (!(c2 instanceof vyk)) {
                        throw new ffcd();
                    }
                    i = -2;
                }
                layoutParams.width = i;
                layoutParams.height = vypVar.b.getResources().getDimensionPixelSize(vypVar.c().a());
                int max = Math.max(0, (((Number) vypVar.f.a()).intValue() - layoutParams.width) / 2);
                int max2 = Math.max(0, (((Number) vypVar.g.a()).intValue() - layoutParams.height) / 2);
                vypVar.b.setPadding(max, max2, max, max2);
                viewGroup.setLayoutParams(layoutParams);
                vym c3 = vypVar.c();
                if (c3 instanceof vyl) {
                    dimension = 0;
                } else {
                    if (!(c3 instanceof vyk)) {
                        throw new ffcd();
                    }
                    dimension = (int) vypVar.b.getContext().getResources().getDimension(R.dimen.conversation_scroll_to_bottom_button_start_padding);
                }
                vym c4 = vypVar.c();
                if (!(c4 instanceof vyl)) {
                    if (!(c4 instanceof vyk)) {
                        throw new ffcd();
                    }
                    i2 = (int) vypVar.b.getContext().getResources().getDimension(R.dimen.conversation_scroll_to_bottom_button_end_padding);
                }
                ViewGroup viewGroup2 = vypVar.c;
                viewGroup2.setPadding(dimension, viewGroup2.getPaddingTop(), i2, viewGroup2.getPaddingBottom());
                vypVar.f();
                return ffcu.a;
            }
        }, new ffix() { // from class: vyb
            @Override // defpackage.ffix
            public final Object invoke() {
                vyp.this.b.setAlpha(1.0f);
                return ffcu.a;
            }
        }));
        ofFloat.getClass();
        return ofFloat;
    }

    public final Animator b() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: vyg
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                valueAnimator.getClass();
                vyp.this.b.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
            }
        });
        ofFloat.addListener(new vyj(this, new ffix() { // from class: vyh
            @Override // defpackage.ffix
            public final Object invoke() {
                vyp vypVar = vyp.this;
                vypVar.b.setAlpha(1.0f);
                vypVar.b.setVisibility(0);
                return ffcu.a;
            }
        }, new ffix() { // from class: vyi
            @Override // defpackage.ffix
            public final Object invoke() {
                vyp vypVar = vyp.this;
                vypVar.b.setAlpha(0.0f);
                vypVar.b.setVisibility(8);
                return ffcu.a;
            }
        }));
        ofFloat.getClass();
        return ofFloat;
    }

    public final vym c() {
        return (vym) this.i.c(a[0]);
    }

    public final String d(vyk vykVar) {
        return qmn.b(this.b.getContext(), R.string.new_message_label, "count", Integer.valueOf(Math.min(vykVar.a, 99)));
    }

    public final void e() {
        int i;
        vym c = c();
        if (c instanceof vyl) {
            i = 0;
        } else {
            if (!(c instanceof vyk)) {
                throw new ffcd();
            }
            i = ((vyk) c).a;
        }
        this.b.setContentDescription(qmn.b(this.b.getContext(), R.string.conversation_scroll_to_bottom_button_content_description, "count", Integer.valueOf(i)));
    }

    public final void f() {
        ddwu.b(this.c, this.j);
    }
}
