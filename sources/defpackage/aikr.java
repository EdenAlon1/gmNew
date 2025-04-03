package defpackage;

import android.app.Activity;
import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aikr implements aigt {
    private final Context a;

    public aikr(Context context) {
        this.a = context;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        aikq aikqVar = (aikq) aihsVar;
        Activity a = ddxb.a(this.a);
        if (a == null) {
            throw new IllegalArgumentException("ExitRenameGroupNavigationHandler must be created with an activity context.");
        }
        if (aikqVar.b) {
            ellj.e(new aimy(aikqVar.a), a);
        } else {
            ellj.e(aimx.a, a);
        }
        return ffcu.a;
    }
}
