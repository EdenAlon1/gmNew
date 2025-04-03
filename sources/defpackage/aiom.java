package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aiom implements aigt {
    private final Context a;

    public aiom(Context context) {
        this.a = context;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        eldl.p(this.a, new Intent("android.settings.WIRELESS_SETTINGS"));
        return ffcu.a;
    }
}
