package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crjs extends crjo {
    private String c;

    public crjs(Context context, crjp crjpVar, aoku aokuVar, String str) {
        super(context, crjpVar, aokuVar);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.c = str.replaceFirst("mailto:", "");
    }

    @Override // defpackage.crjo
    public final int a() {
        return R.string.business_info_email_default_sub_header;
    }

    @Override // defpackage.crjo
    public final int b() {
        return R.drawable.quantum_gm_ic_email_black_24;
    }

    @Override // defpackage.crjo
    public final int c() {
        return R.string.business_action_email_short_content_description;
    }

    @Override // defpackage.crjo
    public final int d() {
        return R.string.business_action_email_short_text_m2;
    }

    @Override // defpackage.crjo
    public final Intent e() {
        String[] strArr = {this.c};
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:"));
        intent.putExtra("android.intent.extra.EMAIL", strArr);
        return intent;
    }

    @Override // defpackage.crjo
    public final String g(String str) {
        return this.a.getResources().getString(R.string.business_action_email_full_content_description, this.c, str);
    }

    @Override // defpackage.crjo
    public final int j() {
        return 4;
    }
}
