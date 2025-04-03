package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ctyt extends ctys {
    private final int b;
    private final ctyr c;
    private final ctwb d;
    private final cpbs e;
    private final ctyw f;

    public ctyt(Context context, ctyr ctyrVar, ctwb ctwbVar, cpbs cpbsVar, int i, ctyw ctywVar) {
        super(context);
        this.c = ctyrVar;
        this.d = ctwbVar;
        this.e = cpbsVar;
        this.b = i;
        this.f = ctywVar;
    }

    private final void t(ctyx ctyxVar, String str, int i, boolean z, ctyx ctyxVar2) {
        Resources resources = this.a.getResources();
        boolean q = ctyxVar.q(str, z);
        if (q != z) {
            ctyxVar2.h(resources.getString(i), q);
        }
    }

    private final void u(ctyx ctyxVar, String str, int i, String str2, ctyx ctyxVar2) {
        Resources resources = this.a.getResources();
        String f = ctyxVar.f(str, str2);
        if (TextUtils.equals(f, str2)) {
            return;
        }
        ctyxVar2.l(resources.getString(i), f);
    }

    @Override // defpackage.ctyx
    public final String a() {
        return "buglesub_" + this.b;
    }

    @Override // defpackage.ctys
    protected final void b(String str) {
        csix.k(str.startsWith("buglesub_"));
    }

    @Override // defpackage.ctyx
    public final void c(int i) {
        if (i == -1) {
            cpbs cpbsVar = this.e;
            int i2 = this.b;
            ctyr ctyrVar = this.c;
            cpbn a = cpbsVar.a(i2);
            t(ctyrVar, "delivery_reports", R.string.delivery_reports_pref_key, a.u(), this);
            t(this.c, "auto_retrieve_mms", R.string.auto_retrieve_mms_pref_key, a.p(), this);
            t(this.c, "auto_retrieve_mms_when_roaming", R.string.auto_retrieve_mms_when_roaming_pref_key, a.q(), this);
            t(this.c, "group_messaging", R.string.group_mms_pref_key, a.n(), this);
            if (this.d.a() == 1) {
                u(this.c, "mms_phone_number", R.string.mms_phone_number_pref_key, null, this);
                return;
            }
            return;
        }
        if (i != 1) {
            return;
        }
        Resources resources = this.a.getApplicationContext().getResources();
        t(this.f.a(this.b), "buglesub_enable_rcs", R.string.enable_rcs_pref_key, resources.getBoolean(R.bool.enable_rcs_pref_default), this.c);
        t(this.f.a(this.b), "buglesub_send_seen_report_rcs", R.string.send_seen_report_rcs_pref_key, resources.getBoolean(R.bool.send_seen_report_rcs_pref_default), this.c);
        t(this.f.a(this.b), "buglesub_share_typing_status_rcs", R.string.share_typing_status_rcs_pref_key, resources.getBoolean(R.bool.share_typing_status_rcs_pref_default), this.c);
        ctyw ctywVar = this.f;
        int i3 = this.b;
        ctyr ctyrVar2 = this.c;
        Context context = this.a;
        ctyx a2 = ctywVar.a(i3);
        Resources resources2 = context.getResources();
        if (a2.p("buglesub_rcs_fallback_type")) {
            ctyrVar2.j(resources2.getString(R.string.rcs_fallback_type_pref_key), a2.d("buglesub_rcs_fallback_type", 0));
        }
        ctyw ctywVar2 = this.f;
        int i4 = this.b;
        ctyr ctyrVar3 = this.c;
        Context context2 = this.a;
        ctyx a3 = ctywVar2.a(i4);
        Resources resources3 = context2.getResources();
        int d = a3.d("buglesub_rcs_default_sharing_method", -1);
        if (d != -1) {
            ctyrVar3.j(resources3.getString(R.string.rcs_default_sharing_method_key), d);
        }
        u(this.f.a(this.b), "buglesub_rcs_mobile_data_auto_download_limit", R.string.rcs_mobile_data_auto_download_limit_pref_key, resources.getString(R.string.rcs_mobile_data_auto_download_limit_default_entry), this.c);
    }
}
