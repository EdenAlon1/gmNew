package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.libraries.user.profile.photopicker.art.edit.EditableArtView;

/* compiled from: PG */
/* loaded from: classes5.dex */
public class efxa extends View implements fbat, fbam {
    private fbal a;
    public boolean z;

    public efxa(Context context) {
        super(context);
        if (isInEditMode()) {
            return;
        }
        u();
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.fbam
    public final boolean e() {
        return this.z;
    }

    @Override // defpackage.fbat
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public final fbal aW() {
        if (this.a == null) {
            this.a = new fbal(this, false);
        }
        return this.a;
    }

    protected final void u() {
        fbas a = aW().a();
        if (a instanceof fbas) {
            if ((!(a instanceof fbam) || ((fbam) a).e()) && !this.z) {
                this.z = true;
                ((efww) aX()).E((EditableArtView) this);
            }
        }
    }

    public efxa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (isInEditMode()) {
            return;
        }
        u();
    }

    public efxa(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (isInEditMode()) {
            return;
        }
        u();
    }

    efxa(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (isInEditMode()) {
            return;
        }
        u();
    }
}
