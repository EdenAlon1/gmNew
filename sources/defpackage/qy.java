package defpackage;

import android.content.res.TypedArray;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qy {
    public final lhv a;
    private final TextView b;

    public qy(TextView textView) {
        this.b = textView;
        this.a = new lhv(textView);
    }

    public final void a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.b.getContext().obtainStyledAttributes(attributeSet, kt.j, i, 0);
        try {
            boolean z = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            lht lhtVar = this.a.a;
            boolean a = lhu.a();
            lhs lhsVar = ((lhu) lhtVar).a;
            lhsVar.b = z;
            if (a) {
                return;
            }
            lhsVar.b();
            lhsVar.a.setFilters(lhsVar.c(lhsVar.a.getFilters()));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final void b(boolean z) {
        if (lhu.a()) {
            return;
        }
        lhv lhvVar = this.a;
        if (z) {
            ((lhu) lhvVar.a).a.b();
        }
    }

    public final InputFilter[] c(InputFilter[] inputFilterArr) {
        return lhu.a() ? inputFilterArr : ((lhu) this.a.a).a.c(inputFilterArr);
    }
}
