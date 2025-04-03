package defpackage;

import android.content.Context;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class elix extends AppCompatTextView implements fbat {
    private fbal a;
    private boolean b;

    public elix(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.a == null) {
            this.a = new fbal(this, true);
        }
        return this.a;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    protected final void b() {
        if (this.b) {
            return;
        }
        this.b = true;
        ((elju) aX()).aW();
    }

    public elix(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public elix(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
