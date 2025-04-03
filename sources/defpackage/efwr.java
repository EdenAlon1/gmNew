package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efwr extends efwz {
    public dwcq ag;
    public egjw ah;
    public dvxi ai;
    public dvxy aj;
    public dvyc ak;
    private iv am;

    @Override // defpackage.efwz, defpackage.dn, defpackage.ea
    public final void g(Context context) {
        super.g(context);
        if (((efwz) this).al) {
            return;
        }
        fazg.a(this);
    }

    @Override // defpackage.dn
    public final Dialog hf(Bundle bundle) {
        ehft ehftVar = new ehft(z(), R.style.ThemeOverlay_PhotoPicker_MaterialAlertDialog);
        ehftVar.x(R.string.op3_art_discard_dialog_title);
        ehftVar.m(R.string.op3_art_discard_dialog_body);
        ehftVar.t(R.string.op3_art_discard_dialog_discard_button, new DialogInterface.OnClickListener() { // from class: efwo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                efwr efwrVar = efwr.this;
                efwrVar.ai.a(dvxh.e(), ((iv) dialogInterface).b(i));
                efwrVar.ah.f(2);
                eg G = efwrVar.G();
                G.getClass();
                G.setResult(0);
                G.finish();
            }
        });
        ehftVar.o(R.string.op3_art_discard_dialog_keep_editing_button, new DialogInterface.OnClickListener() { // from class: efwp
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                efwr efwrVar = efwr.this;
                efwrVar.ai.a(dvxh.e(), ((iv) dialogInterface).b(i));
                efwrVar.hw();
            }
        });
        iv create = ehftVar.create();
        this.am = create;
        this.Z.c(new dwcp(this.ag, new efwq(this), create, this));
        return this.am;
    }
}
