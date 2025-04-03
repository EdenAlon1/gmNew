package defpackage;

import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;

/* compiled from: PG */
/* loaded from: classes8.dex */
class cjjh extends ConstraintLayout implements fbat {
    private ekkz i;
    private boolean j;

    public cjjh(Context context) {
        super(context);
        if (isInEditMode() || this.j) {
            return;
        }
        this.j = true;
        ((cjjf) aX()).aw();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final ekkz aW() {
        if (this.i == null) {
            this.i = new ekkz(this);
        }
        return this.i;
    }
}
