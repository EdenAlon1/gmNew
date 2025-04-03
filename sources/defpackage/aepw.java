package defpackage;

import android.content.Context;
import android.widget.FrameLayout;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aepw extends FrameLayout implements fbat {
    private ekkz a;
    private boolean b;

    public aepw(Context context) {
        super(context);
        if (isInEditMode() || this.b) {
            return;
        }
        this.b = true;
        ((aepu) aX()).G();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ekkz aW() {
        if (this.a == null) {
            this.a = new ekkz(this);
        }
        return this.a;
    }
}
