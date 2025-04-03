package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cxsx implements decz {
    final /* synthetic */ cxsy a;

    public cxsx(cxsy cxsyVar) {
        this.a = cxsyVar;
    }

    @Override // defpackage.decz
    public final void a(boolean z) {
        cxsy cxsyVar = this.a;
        boolean z2 = false;
        boolean z3 = !TextUtils.isEmpty(cxsyVar.b.f()) || ((cxtc) cxsyVar.b).c.ab() || ((cxtc) cxsyVar.b).c.Z();
        cxtb cxtbVar = cxsyVar.b;
        if (z3 || (cxsyVar.a.b && ((cxtc) cxsyVar.b).c.i.hasFocus())) {
            z2 = true;
        }
        if (((Boolean) cful.X.e()).booleanValue()) {
            cxvv cxvvVar = ((cxtc) cxtbVar).c;
            Boolean bool = cxvvVar.I;
            if (bool == null || z2 != bool.booleanValue()) {
                ((GradientDrawable) ((LayerDrawable) cxvvVar.i.getBackground()).getDrawable(1)).setColor(cxvvVar.k.getColor(true != z2 ? R.color.compose_pill_inactive_background : R.color.compose_pill_active_background));
                cxvvVar.I = Boolean.valueOf(z2);
            }
        }
    }
}
