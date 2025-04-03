package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ailb implements aigt {
    private final Context a;
    private final ayfg b;

    public ailb(Context context, ayfg ayfgVar) {
        ayfgVar.getClass();
        this.a = context;
        this.b = ayfgVar;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        aikz aikzVar = (aikz) aihsVar;
        Activity a = ddxb.a(this.a);
        if (a == null) {
            throw new IllegalArgumentException("HomeNavigationHandler must be created with an activity context.");
        }
        ayfg ayfgVar = this.b;
        aila ailaVar = aikzVar.a;
        Bundle bundle = new Bundle();
        bundle.putBoolean("via_share_intent", true);
        ayfgVar.j(a, bundle);
        a.finish();
        return ffcu.a;
    }
}
