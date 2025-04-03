package androidx.emoji.widget;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.text.InputFilter;
import android.util.AttributeSet;
import defpackage.lfo;
import defpackage.lfq;
import defpackage.lfr;

/* compiled from: PG */
/* loaded from: classes.dex */
public class EmojiAppCompatTextView extends AppCompatTextView {
    private lfr a;
    private boolean b;

    public EmojiAppCompatTextView(Context context) {
        super(context);
        b();
    }

    private final lfr a() {
        if (this.a == null) {
            this.a = new lfr(this);
        }
        return this.a;
    }

    private final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        a().a.a();
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    public final void setAllCaps(boolean z) {
        super.setAllCaps(z);
        lfq lfqVar = a().a;
        if (z) {
            lfqVar.a();
        }
    }

    @Override // android.support.v7.widget.AppCompatTextView, android.widget.TextView
    public final void setFilters(InputFilter[] inputFilterArr) {
        lfq lfqVar = a().a;
        int length = inputFilterArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr2, 0, length);
                inputFilterArr2[length] = lfqVar.a;
                inputFilterArr = inputFilterArr2;
                break;
            }
            if (inputFilterArr[i] instanceof lfo) {
                break;
            } else {
                i++;
            }
        }
        super.setFilters(inputFilterArr);
    }

    public EmojiAppCompatTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public EmojiAppCompatTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }
}
