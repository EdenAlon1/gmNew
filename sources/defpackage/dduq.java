package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ScrollView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class dduq extends ScrollView implements fbat {
    private ekkz a;
    private boolean b;

    public dduq(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ekkz aW() {
        if (this.a == null) {
            this.a = new ekkz(this);
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
        ((ddvh) aX()).aL();
    }

    public dduq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public dduq(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        b();
    }

    public dduq(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        b();
    }
}
