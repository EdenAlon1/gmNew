package defpackage;

import android.graphics.drawable.Drawable;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czmz {
    public final String a;
    public final Drawable b;
    public final czmy c;
    private final int d = R.drawable.ic_cancel_small_light;

    public czmz(String str, Drawable drawable, czmy czmyVar) {
        this.a = str;
        this.b = drawable;
        this.c = czmyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof czmz)) {
            return false;
        }
        czmz czmzVar = (czmz) obj;
        int i = czmzVar.d;
        return ffkj.e(this.a, czmzVar.a) && ffkj.e(this.b, czmzVar.b) && ffkj.e(this.c, czmzVar.c);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 1643677321) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "TransferViewParams(iconResource=2131231831, contentDescription=" + this.a + ", background=" + this.b + ", clickEvent=" + this.c + ")";
    }
}
