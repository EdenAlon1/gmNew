package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vih extends ehbn {
    final /* synthetic */ vij a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vih(vij vijVar, Context context, int i) {
        super(context, i);
        this.a = vijVar;
    }

    @Override // defpackage.ehbn, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        ekzm b = ((elbx) this.a.g.b()).b("CustomReactionSelectionDialogFragmentPeer#Cancel");
        try {
            super.cancel();
            ffig.a(b, null);
        } finally {
        }
    }

    @Override // defpackage.kb, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (isShowing()) {
            vij vijVar = this.a;
            vijVar.e.e(vijVar.b.N(), false);
        }
        this.a.m.b();
        super.dismiss();
    }

    @Override // defpackage.ehbn, defpackage.abg, android.app.Dialog
    protected final void onStart() {
        super.onStart();
        View findViewById = findViewById(R.id.design_bottom_sheet);
        if (findViewById != null) {
            BottomSheetBehavior.v(findViewById).D(3);
        }
    }
}
