package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dena {
    private final ada a;

    public dena(ada adaVar) {
        adaVar.getClass();
        this.a = adaVar;
    }

    public final void a(demz demzVar, eixz eixzVar) {
        demzVar.getClass();
        Intent putExtra = new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.screenId", demzVar.d).putExtra("extra.accountName", eixzVar.g);
        putExtra.getClass();
        int ordinal = demzVar.ordinal();
        if (ordinal == 0) {
            putExtra.putExtra("extra.screen.cau", "true");
            putExtra.putExtra("extra.screen.hostId", "amo").getClass();
        } else if (ordinal == 1) {
            putExtra.putExtra("extra.screen.cau", "true");
            putExtra.putExtra("extra.screen.hostId", "am").getClass();
        } else if (ordinal == 2) {
            putExtra.putExtra("extra.screen.source", "messages_onboarding").getClass();
        }
        this.a.c(putExtra);
    }
}
