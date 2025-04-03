package defpackage;

import android.text.TextUtils;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djwr extends djxb {
    final /* synthetic */ djxs a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public djwr(djxs djxsVar) {
        super(djxsVar);
        this.a = djxsVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0164 A[Catch: MalformedURLException -> 0x0281, TryCatch #0 {MalformedURLException -> 0x0281, blocks: (B:3:0x0014, B:5:0x0090, B:6:0x0093, B:8:0x00ae, B:10:0x0260, B:14:0x00b8, B:16:0x00e7, B:20:0x0116, B:22:0x0164, B:23:0x0178, B:25:0x0183, B:26:0x0197, B:28:0x01a2, B:29:0x01b6, B:31:0x01c1, B:32:0x01d5, B:34:0x01e0, B:35:0x01f4, B:37:0x01ff, B:38:0x0213, B:40:0x021e, B:41:0x0237, B:44:0x0247, B:46:0x0255), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0183 A[Catch: MalformedURLException -> 0x0281, TryCatch #0 {MalformedURLException -> 0x0281, blocks: (B:3:0x0014, B:5:0x0090, B:6:0x0093, B:8:0x00ae, B:10:0x0260, B:14:0x00b8, B:16:0x00e7, B:20:0x0116, B:22:0x0164, B:23:0x0178, B:25:0x0183, B:26:0x0197, B:28:0x01a2, B:29:0x01b6, B:31:0x01c1, B:32:0x01d5, B:34:0x01e0, B:35:0x01f4, B:37:0x01ff, B:38:0x0213, B:40:0x021e, B:41:0x0237, B:44:0x0247, B:46:0x0255), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a2 A[Catch: MalformedURLException -> 0x0281, TryCatch #0 {MalformedURLException -> 0x0281, blocks: (B:3:0x0014, B:5:0x0090, B:6:0x0093, B:8:0x00ae, B:10:0x0260, B:14:0x00b8, B:16:0x00e7, B:20:0x0116, B:22:0x0164, B:23:0x0178, B:25:0x0183, B:26:0x0197, B:28:0x01a2, B:29:0x01b6, B:31:0x01c1, B:32:0x01d5, B:34:0x01e0, B:35:0x01f4, B:37:0x01ff, B:38:0x0213, B:40:0x021e, B:41:0x0237, B:44:0x0247, B:46:0x0255), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c1 A[Catch: MalformedURLException -> 0x0281, TryCatch #0 {MalformedURLException -> 0x0281, blocks: (B:3:0x0014, B:5:0x0090, B:6:0x0093, B:8:0x00ae, B:10:0x0260, B:14:0x00b8, B:16:0x00e7, B:20:0x0116, B:22:0x0164, B:23:0x0178, B:25:0x0183, B:26:0x0197, B:28:0x01a2, B:29:0x01b6, B:31:0x01c1, B:32:0x01d5, B:34:0x01e0, B:35:0x01f4, B:37:0x01ff, B:38:0x0213, B:40:0x021e, B:41:0x0237, B:44:0x0247, B:46:0x0255), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01e0 A[Catch: MalformedURLException -> 0x0281, TryCatch #0 {MalformedURLException -> 0x0281, blocks: (B:3:0x0014, B:5:0x0090, B:6:0x0093, B:8:0x00ae, B:10:0x0260, B:14:0x00b8, B:16:0x00e7, B:20:0x0116, B:22:0x0164, B:23:0x0178, B:25:0x0183, B:26:0x0197, B:28:0x01a2, B:29:0x01b6, B:31:0x01c1, B:32:0x01d5, B:34:0x01e0, B:35:0x01f4, B:37:0x01ff, B:38:0x0213, B:40:0x021e, B:41:0x0237, B:44:0x0247, B:46:0x0255), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ff A[Catch: MalformedURLException -> 0x0281, TryCatch #0 {MalformedURLException -> 0x0281, blocks: (B:3:0x0014, B:5:0x0090, B:6:0x0093, B:8:0x00ae, B:10:0x0260, B:14:0x00b8, B:16:0x00e7, B:20:0x0116, B:22:0x0164, B:23:0x0178, B:25:0x0183, B:26:0x0197, B:28:0x01a2, B:29:0x01b6, B:31:0x01c1, B:32:0x01d5, B:34:0x01e0, B:35:0x01f4, B:37:0x01ff, B:38:0x0213, B:40:0x021e, B:41:0x0237, B:44:0x0247, B:46:0x0255), top: B:2:0x0014 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x021e A[Catch: MalformedURLException -> 0x0281, TryCatch #0 {MalformedURLException -> 0x0281, blocks: (B:3:0x0014, B:5:0x0090, B:6:0x0093, B:8:0x00ae, B:10:0x0260, B:14:0x00b8, B:16:0x00e7, B:20:0x0116, B:22:0x0164, B:23:0x0178, B:25:0x0183, B:26:0x0197, B:28:0x01a2, B:29:0x01b6, B:31:0x01c1, B:32:0x01d5, B:34:0x01e0, B:35:0x01f4, B:37:0x01ff, B:38:0x0213, B:40:0x021e, B:41:0x0237, B:44:0x0247, B:46:0x0255), top: B:2:0x0014 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djwr.q(java.lang.String):void");
    }

    @Override // defpackage.djyw, defpackage.dixy
    public final String a() {
        return "RequestWithMsisdnTokenState";
    }

    @Override // defpackage.djxb, defpackage.dixy
    public final void b() {
        super.b();
        this.a.y(ezdc.REQUEST_WITH_MSISDN_TOKEN_STAGE);
        this.a.z.a("Waiting for message with msisdn token", new Object[0]);
    }

    @Override // defpackage.djxb
    public final djta f() {
        return djta.MSG_TRANSITION_TO_REQUEST_WITH_MSISDN_TOKEN;
    }

    @Override // defpackage.djxb
    public final ezez g() {
        return ezez.RCS_PROVISIONING_REQUEST_WITH_MSISDN_TOKEN_STATE;
    }

    @Override // defpackage.djxb
    public final boolean h() {
        return true;
    }

    @Override // defpackage.djxb
    public final boolean i() {
        return false;
    }

    @Override // defpackage.djxb
    public final boolean j() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x01cf, code lost:
    
        if (r0 != 5) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01d1, code lost:
    
        if (r10 == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01d8, code lost:
    
        q("UpiIneligibleMsisdnToken");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01d6, code lost:
    
        if (r10 != false) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017d  */
    @Override // defpackage.djyw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean k(android.os.Message r9, defpackage.djta r10) {
        /*
            Method dump skipped, instructions count: 510
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.djwr.k(android.os.Message, djta):boolean");
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.djxb
    public final boolean m() {
        Optional empty;
        djxs djxsVar = this.a;
        try {
            empty = Optional.of(djxsVar.u.b.h("msisdn_token_for_sim_".concat(String.valueOf(djxsVar.h)), "", "bugle"));
        } catch (dksb e) {
            dkty.j(e, dkcp.a, "Error while retrieving MSISDN token from bugle storage", new Object[0]);
            empty = Optional.empty();
        }
        if (!empty.isPresent()) {
            this.a.z.a("Not replaying UPI request. Token not set", new Object[0]);
            return false;
        }
        if (TextUtils.isEmpty(empty.get())) {
            this.a.z.e("Not replaying UPI request. Token exists, but is empty", new Object[0]);
            return false;
        }
        this.a.z.d("Replaying UPI request with existing token", new Object[0]);
        this.a.w(djta.MSG_VERIFY_NUMBER_SUCCESS, empty.get());
        return true;
    }
}
