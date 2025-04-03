package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ainn implements aigt {
    private final Context a;

    public ainn(Context context) {
        this.a = context;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        CharSequence text = this.a.getText(R.string.action_share);
        text.getClass();
        this.a.startActivity(Intent.createChooser(((ainm) aihsVar).a, text));
        return ffcu.a;
    }
}
