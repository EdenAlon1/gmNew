package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dj implements DialogInterface.OnCancelListener {
    final /* synthetic */ dn a;

    public dj(dn dnVar) {
        this.a = dnVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dn dnVar = this.a;
        Dialog dialog = dnVar.d;
        if (dialog != null) {
            dnVar.onCancel(dialog);
        }
    }
}
