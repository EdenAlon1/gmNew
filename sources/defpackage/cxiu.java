package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.checkbox.MaterialCheckBox;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class cxiu extends MaterialCheckBox implements fbat {
    private ekkz a;
    private boolean f;

    public cxiu(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        e();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final ekkz aW() {
        if (this.a == null) {
            this.a = new ekkz(this);
        }
        return this.a;
    }

    protected final void e() {
        if (this.f) {
            return;
        }
        this.f = true;
        ((cxbd) aX()).aA();
    }

    public cxiu(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        e();
    }

    public cxiu(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        e();
    }
}
