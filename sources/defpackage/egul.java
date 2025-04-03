package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class egul extends iya implements fbat {
    private fbal a;
    private boolean b;

    public egul(Context context) {
        super(context);
        if (isInEditMode() || this.b) {
            return;
        }
        this.b = true;
        ((egxk) aX()).U((egvy) this);
    }

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.a == null) {
            this.a = new fbal(this, false);
        }
        return this.a;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }
}
