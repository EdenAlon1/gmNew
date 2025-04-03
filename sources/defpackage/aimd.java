package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aimd implements aigt {
    private final Context a;

    public aimd(Context context) {
        this.a = context;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        Intent intent = new Intent();
        intent.setAction("com.google.chat.smartmessaging.penpal.PHOTOBOOTH");
        intent.putExtra("imageUri", ((aimc) aihsVar).a);
        this.a.startActivity(intent);
        return ffcu.a;
    }
}
