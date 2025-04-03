package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egjy extends egkg {
    public dwcu ag;
    public dwcr ah;

    @Override // defpackage.egkg, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (((egkg) this).ai) {
            return;
        }
        fazg.a(this);
    }

    @Override // defpackage.dn, defpackage.ea
    public final void h(Bundle bundle) {
        super.h(bundle);
        this.ah = this.ag.a(this);
    }

    @Override // defpackage.dn
    public final Dialog hf(Bundle bundle) {
        ehft ehftVar = new ehft(z(), R.style.ThemeOverlay_PhotoPicker_MaterialAlertDialog);
        fdrm.a.get().I();
        ehftVar.m(R.string.op3_edit_shape_message);
        ehftVar.t(R.string.op3_update_got_it, null);
        iv create = ehftVar.create();
        create.setOnShowListener(new dwcs(this, new DialogInterface.OnShowListener() { // from class: egjx
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                egjy egjyVar = egjy.this;
                egjyVar.ah.b(89739).a();
                dwct.c(egjyVar);
            }
        }));
        return create;
    }
}
