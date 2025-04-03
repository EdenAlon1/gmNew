package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dqyk<T> extends View {
    static final /* synthetic */ ffmx[] a;
    public static final TextPaint b;
    public static final dqla c;
    public static final dqla d;
    private static final enru j;
    private static final dqla k;
    public ffsk e;
    public volatile CharSequence f;
    public volatile lfb[] g;
    public final ffbz h;
    public final ffbz i;
    private ffud l;
    private int m;
    private final ffls n;

    static {
        ffko ffkoVar = new ffko(dqyk.class, "content", "getContent()Ljava/lang/Object;", 0);
        int i = fflc.a;
        a = new ffmx[]{ffkoVar};
        j = enru.c("com/google/android/libraries/compose/emoji/ui/views/EmojiView");
        TextPaint textPaint = new TextPaint();
        textPaint.setTextAlign(Paint.Align.CENTER);
        b = textPaint;
        c = new dqla(new ffjn() { // from class: dqyb
            @Override // defpackage.ffjn
            public final Object a(Object obj, Object obj2, Object obj3) {
                int intValue = (((Integer) obj).intValue() - ((Integer) obj2).intValue()) - ((Integer) obj3).intValue();
                TextPaint textPaint2 = dqyk.b;
                textPaint2.setTextSize(intValue);
                return textPaint2;
            }
        });
        k = new dqla(new ffjn() { // from class: dqyc
            @Override // defpackage.ffjn
            public final Object a(Object obj, Object obj2, Object obj3) {
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                Integer num2 = (Integer) obj2;
                num2.intValue();
                Integer num3 = (Integer) obj3;
                num3.intValue();
                TextPaint textPaint2 = (TextPaint) dqyk.c.a(num, num2, num3);
                return Float.valueOf((intValue / 2.0f) - ((textPaint2.descent() + textPaint2.ascent()) / 2.0f));
            }
        });
        d = new dqla(new ffjn() { // from class: dqyd
            @Override // defpackage.ffjn
            public final Object a(Object obj, Object obj2, Object obj3) {
                int intValue = ((Integer) obj).intValue();
                int intValue2 = ((Integer) obj2).intValue();
                int intValue3 = ((Integer) obj3).intValue();
                TextPaint textPaint2 = dqyk.b;
                Path path = new Path();
                float f = intValue2;
                float f2 = intValue3;
                float f3 = intValue;
                float f4 = f2 - f3;
                path.moveTo(f, f4);
                path.lineTo(f - f3, f2);
                path.lineTo(f, f2);
                path.lineTo(f, f4);
                path.close();
                return path;
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqyk(Context context) {
        super(context);
        context.getClass();
        this.m = -1;
        this.n = new dqyi(b(), this);
        this.h = ffca.a(new ffix() { // from class: dqye
            @Override // defpackage.ffix
            public final Object invoke() {
                Paint paint = new Paint();
                Context context2 = dqyk.this.getContext();
                context2.getClass();
                TypedValue typedValue = new TypedValue();
                context2.getTheme().resolveAttribute(R.attr.colorOnSurfaceVariant, typedValue, true);
                paint.setColor(typedValue.data);
                paint.setAlpha(168);
                return paint;
            }
        });
        this.i = ffca.a(new ffix() { // from class: dqyf
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(dqyk.this.getContext().getResources().getDimensionPixelSize(R.dimen.emoji_icon_variant_indicator_size));
            }
        });
    }

    public static /* synthetic */ void g(dqyk dqykVar, Canvas canvas, lfb lfbVar, CharSequence charSequence) {
        float width = dqykVar.getWidth();
        int floatValue = (int) ((Number) k.a(Integer.valueOf(dqykVar.getHeight()), Integer.valueOf(dqykVar.getPaddingLeft()), Integer.valueOf(dqykVar.getPaddingRight()))).floatValue();
        lfbVar.getClass();
        charSequence.getClass();
        lfbVar.draw(canvas, charSequence, 0, charSequence.length(), width / 2.0f, 0, floatValue, 0, (Paint) c.a(Integer.valueOf(dqykVar.getHeight()), Integer.valueOf(dqykVar.getPaddingLeft()), Integer.valueOf(dqykVar.getPaddingRight())));
    }

    private final lew h() {
        lew b2 = lew.b();
        if (b2 == null) {
            return null;
        }
        this.m = b2.a();
        if (b2.a() == 1) {
            return b2;
        }
        return null;
    }

    private final void i(lew lewVar, Object obj) {
        ffud ffudVar = this.l;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        ffsk ffskVar = this.e;
        if (ffskVar == null) {
            ffkj.c("cpuBoundScope");
            ffskVar = null;
        }
        this.l = ffqy.d(ffskVar, null, null, new dqyh(this, lewVar, obj, null), 3);
    }

    public abstract CharSequence a(Object obj);

    public abstract Object b();

    public final Object c() {
        return this.n.c(a[0]);
    }

    public abstract void d(Canvas canvas, lfb[] lfbVarArr);

    public final void e(Object obj) {
        setContentDescription(a(obj));
        CharSequence contentDescription = getContentDescription();
        contentDescription.getClass();
        if (ffpc.J(contentDescription)) {
            ffud ffudVar = this.l;
            if (ffudVar != null) {
                ffudVar.t(null);
            }
            this.f = null;
            this.g = null;
            return;
        }
        lew h = h();
        if (h != null) {
            i(h, obj);
        } else {
            ((enrr) j.j().h("com/google/android/libraries/compose/emoji/ui/views/EmojiView", "onContentChanged", 83, "EmojiView.kt")).r("EmojiCompat was not initialized (status %d)", this.m);
        }
    }

    public final void f(Object obj) {
        this.n.d(a[0], obj);
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ffud ffudVar = this.l;
        if (ffudVar != null) {
            ffudVar.t(null);
        }
        this.l = null;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        lew h;
        canvas.getClass();
        lfb[] lfbVarArr = this.g;
        if (lfbVarArr != null) {
            d(canvas, lfbVarArr);
            return;
        }
        CharSequence charSequence = this.f;
        if (charSequence != null) {
            canvas.drawText(charSequence, 0, charSequence.length(), getWidth() / 2.0f, ((Number) k.a(Integer.valueOf(getHeight()), Integer.valueOf(getPaddingLeft()), Integer.valueOf(getPaddingRight()))).floatValue(), (Paint) c.a(Integer.valueOf(getHeight()), Integer.valueOf(getPaddingLeft()), Integer.valueOf(getPaddingRight())));
        } else {
            ffud ffudVar = this.l;
            if ((ffudVar == null || !ffudVar.v()) && (h = h()) != null) {
                i(h, c());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dqyk(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        this.m = -1;
        this.n = new dqyj(b(), this);
        this.h = ffca.a(new ffix() { // from class: dqye
            @Override // defpackage.ffix
            public final Object invoke() {
                Paint paint = new Paint();
                Context context2 = dqyk.this.getContext();
                context2.getClass();
                TypedValue typedValue = new TypedValue();
                context2.getTheme().resolveAttribute(R.attr.colorOnSurfaceVariant, typedValue, true);
                paint.setColor(typedValue.data);
                paint.setAlpha(168);
                return paint;
            }
        });
        this.i = ffca.a(new ffix() { // from class: dqyf
            @Override // defpackage.ffix
            public final Object invoke() {
                return Integer.valueOf(dqyk.this.getContext().getResources().getDimensionPixelSize(R.dimen.emoji_icon_variant_indicator_size));
            }
        });
    }
}
