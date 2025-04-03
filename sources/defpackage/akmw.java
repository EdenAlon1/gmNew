package defpackage;

import android.content.Context;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class akmw extends egzt implements fbat {
    private ekkz g;
    private boolean h;

    public akmw(Context context) {
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
        if (this.g == null) {
            this.g = new ekkz(this);
        }
        return this.g;
    }

    protected final void c() {
        if (this.h) {
            return;
        }
        this.h = true;
        ((akmp) aX()).av();
    }

    public akmw(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        c();
    }

    public akmw(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        c();
    }
}
