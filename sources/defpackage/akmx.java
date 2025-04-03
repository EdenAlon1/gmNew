package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.appbar.AppBarLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class akmx extends AppBarLayout implements fbat {
    private ekkz i;
    private boolean j;

    public akmx(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ekkz aW() {
        if (this.i == null) {
            this.i = new ekkz(this);
        }
        return this.i;
    }

    protected final void c() {
        if (this.j) {
            return;
        }
        this.j = true;
        ((akmt) aX()).az();
    }

    public akmx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    public akmx(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}
