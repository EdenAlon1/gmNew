package defpackage;

import android.app.Activity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ainl implements aigt {
    private final Activity a;
    private final ffbr b;
    private final ffbr c;

    public ainl(Activity activity, ffbr ffbrVar, ffbr ffbrVar2) {
        this.a = activity;
        this.b = ffbrVar;
        this.c = ffbrVar2;
    }

    @Override // defpackage.aigt
    public final /* bridge */ /* synthetic */ Object a(aihs aihsVar, ffgu ffguVar) {
        if (((Boolean) adwg.a.e()).booleanValue()) {
            adtn adtnVar = (adtn) this.b.b();
            Activity activity = this.a;
            adtt adttVar = new adtt();
            adttVar.b(eoio.BUGLE_ADVANCED_FEEDBACK_SOURCE_OPTIONS_MENU);
            adtnVar.b(activity, adttVar.a());
        } else {
            ((adtc) this.c.b()).g(this.a);
        }
        return ffcu.a;
    }
}
