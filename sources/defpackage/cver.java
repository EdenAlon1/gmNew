package defpackage;

import android.net.Uri;
import android.provider.CallLog;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cver extends ffhv implements ffjm {
    int a;
    final /* synthetic */ cves b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cver(cves cvesVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.b = cvesVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cver) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ejmh ejmhVar = this.b.b;
                Uri uri = CallLog.Calls.CONTENT_URI;
                uri.getClass();
                ffxx d = ejmhVar.d(uri);
                cveq cveqVar = new cveq(this.b);
                this.a = 1;
                if (d.a(cveqVar, this) == ffhhVar) {
                    return ffhhVar;
                }
            }
        } catch (SecurityException e) {
            ensk j = cves.a.j();
            j.Y(ente.a, "Bugle");
            ((enrr) j.h("com/google/android/apps/messaging/shared/video/MissedVideoCallObserver$register$1", "invokeSuspend", 78, "MissedVideoCallObserver.kt")).t("MissedVideoCallObserver failed, likely due to lack of READ_CALL_LOG permission: %s", e.getMessage());
        }
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new cver(this.b, ffguVar);
    }
}
