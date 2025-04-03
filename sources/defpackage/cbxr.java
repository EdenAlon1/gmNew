package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.datamodel.verifiedsmsworkers.CleanupVerifiedSmsDataWork;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbxr {
    public static final cskc a = cskc.g("Bugle", "VerifiedSmsCleanupHelper");
    public final Context b;
    public final dtuu c;
    public final ffbr d;
    public final ffbr e;
    public final baam f;
    public final cvbr g;
    public final ctyz h;
    public final cbgf i;
    public final errl j;

    public cbxr(Context context, dtuu dtuuVar, ffbr ffbrVar, ffbr ffbrVar2, baam baamVar, cvbr cvbrVar, ctyz ctyzVar, cbgf cbgfVar, errl errlVar) {
        this.b = context;
        this.c = dtuuVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = baamVar;
        this.g = cvbrVar;
        this.h = ctyzVar;
        this.i = cbgfVar;
        this.j = errlVar;
    }

    public final void a() {
        csjb c = a.c();
        c.I("Requesting Verified SMS data cleanup.");
        c.r();
        pqs a2 = pqr.a(this.b);
        a2.a("verified_sms_work_manager_tag");
        a2.b("verified_sms_request_verified_senders_unique_work_name");
        a2.b("verified_sms_key_rotation_unique_work_name");
        ppv ppvVar = new ppv(CleanupVerifiedSmsDataWork.class);
        ppvVar.d("verified_sms_cleanup_work_tag");
        a2.g("verified_sms_cleanup_work_tag", ppa.REPLACE, (ppw) ppvVar.b());
    }
}
