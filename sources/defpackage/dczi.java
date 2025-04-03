package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dczi implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        View findViewById = ((Dialog) dialogInterface).findViewById(R.id.design_bottom_sheet);
        BottomSheetBehavior v = BottomSheetBehavior.v(findViewById);
        v.D(3);
        v.B(false);
        if (findViewById != null) {
            findViewById.setBackground(findViewById.getContext().getDrawable(R.drawable.fasttrack_bottom_sheet_background));
        }
    }
}
