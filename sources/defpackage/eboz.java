package defpackage;

import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class eboz {
    private final TextView a;
    private emxc b = emux.a;
    private Iterable c;

    public eboz(TextView textView) {
        int i = engw.d;
        this.c = enou.a;
        this.a = textView;
    }

    private final void c(final float f) {
        String str;
        Iterable iterable = this.c;
        Object obj = null;
        if (iterable instanceof Collection) {
            if (!((Collection) iterable).isEmpty()) {
                if (iterable instanceof List) {
                    obj = enjk.k((List) iterable);
                }
            }
            str = (String) obj;
            if (f > 0.0f && enjk.b(this.c) > 1) {
                final TextPaint paint = this.a.getPaint();
                str = (String) enjk.c(this.c, new emxg() { // from class: eboy
                    @Override // defpackage.emxg
                    public final boolean a(Object obj2) {
                        return paint.measureText((String) obj2) <= f;
                    }
                }).a(emxc.i(str)).f();
            }
            if (str == null && str.contentEquals(this.a.getText())) {
                return;
            }
            this.a.setText(str);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            obj = enju.f(it);
        }
        str = (String) obj;
        if (f > 0.0f) {
            final TextPaint paint2 = this.a.getPaint();
            str = (String) enjk.c(this.c, new emxg() { // from class: eboy
                @Override // defpackage.emxg
                public final boolean a(Object obj2) {
                    return paint2.measureText((String) obj2) <= f;
                }
            }).a(emxc.i(str)).f();
        }
        if (str == null) {
        }
        this.a.setText(str);
    }

    public final void a(engw engwVar) {
        this.c = enjk.d(engwVar, new emxg() { // from class: ebox
            @Override // defpackage.emxg
            public final boolean a(Object obj) {
                return !TextUtils.isEmpty((String) obj);
            }
        });
        if (this.b.g()) {
            c(((Float) this.b.c()).floatValue());
        }
    }

    public final void b(int i) {
        TextView textView = this.a;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        View view = (View) textView.getParent();
        float paddingLeft = view.getPaddingLeft() + view.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + textView.getPaddingLeft() + textView.getPaddingRight();
        if (textView instanceof Chip) {
            ehdh ehdhVar = ((Chip) textView).e;
            paddingLeft += (ehdhVar != null ? ehdhVar.j : 0.0f) + (ehdhVar != null ? ehdhVar.k : 0.0f);
        }
        float f = i - paddingLeft;
        if (this.b.g() && f == ((Float) this.b.c()).floatValue()) {
            return;
        }
        this.b = emxc.j(Float.valueOf(f));
        c(f);
    }
}
