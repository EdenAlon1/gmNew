package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abhm extends ehbn {
    final /* synthetic */ abho a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abhm(abho abhoVar, Context context, int i) {
        super(context, i);
        this.a = abhoVar;
    }

    @Override // defpackage.ehbn, android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
        ffix ffixVar = this.a.k;
        if (ffixVar != null) {
            ffixVar.invoke();
            super.cancel();
        } else {
            enrr a = abho.b.a(Level.WARNING);
            a.Y(ente.a, "BugleReactions");
            ((enrr) a.h("com/google/android/apps/messaging/conversation2/screen/bottomsheets/reactionpicker/fragment/ReactionPickerFragmentPeer$onCreateDialog$1", "cancel", 110, "ReactionPickerFragmentPeer.kt")).q("cancelled before `onCancel` was initialized");
        }
    }

    @Override // defpackage.kb, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        if (isShowing()) {
            abho abhoVar = this.a;
            abhoVar.e.e(abhoVar.c.N(), false);
            ffix ffixVar = this.a.l;
            if (ffixVar != null) {
                ffixVar.invoke();
                super.dismiss();
            } else {
                enrr a = abho.b.a(Level.WARNING);
                a.Y(ente.a, "BugleReactions");
                ((enrr) a.h("com/google/android/apps/messaging/conversation2/screen/bottomsheets/reactionpicker/fragment/ReactionPickerFragmentPeer$onCreateDialog$1", "dismiss", 124, "ReactionPickerFragmentPeer.kt")).q("attempted dismiss before `onDismiss` was initialized");
            }
        }
    }

    @Override // defpackage.ehbn, defpackage.abg, android.app.Dialog
    protected final void onStart() {
        super.onStart();
        setOnShowListener(new DialogInterface.OnShowListener() { // from class: abhl
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                View findViewById = abhm.this.findViewById(R.id.design_bottom_sheet);
                if (findViewById != null) {
                    BottomSheetBehavior.v(findViewById).D(3);
                }
            }
        });
    }
}
