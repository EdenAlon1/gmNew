package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dsjh extends lfj implements fbat {
    private fbal a;
    private boolean b;

    public dsjh(Context context) {
        super(context);
        if (isInEditMode() || this.b) {
            return;
        }
        this.b = true;
        ((dsjg) aX()).H((dsjf) this);
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbat
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.a == null) {
            this.a = new fbal(this, false);
        }
        return this.a;
    }
}
