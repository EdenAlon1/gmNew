package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ainf implements aigt {
    private final Context a;

    public ainf(Context context) {
        this.a = context;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        Intent putExtra = new Intent().setComponent(new ComponentName(this.a, "com.google.android.apps.messaging.ui.appsettings.RichCardsSettingsActivity")).putExtra("sub_id", -1);
        putExtra.getClass();
        eldl.p(this.a, putExtra);
        return ffcu.a;
    }
}
