package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfqh extends dn {
    public Dialog ag;
    public DialogInterface.OnCancelListener ah;
    private Dialog ai;

    @Override // defpackage.dn
    public final Dialog hf(Bundle bundle) {
        Dialog dialog = this.ag;
        if (dialog != null) {
            return dialog;
        }
        this.c = false;
        if (this.ai == null) {
            Context z = z();
            dfwv.n(z);
            this.ai = new AlertDialog.Builder(z).create();
        }
        return this.ai;
    }

    @Override // defpackage.dn, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.ah;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
