package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ddak implements DialogInterface.OnShowListener {
    final /* synthetic */ ddae a;

    public ddak(ddae ddaeVar) {
        this.a = ddaeVar;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        Dialog dialog = (Dialog) dialogInterface;
        View findViewById = dialog.findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            findViewById.setBackground(findViewById.getContext().getDrawable(R.drawable.bottomsheet_background));
        }
        if (this.a.o()) {
            dialog.findViewById(R.id.scroll_view).setMinimumHeight(Resources.getSystem().getDisplayMetrics().heightPixels);
        }
        BottomSheetBehavior v = BottomSheetBehavior.v(findViewById);
        v.D(3);
        v.w = false;
        this.a.d.p(false);
    }
}
