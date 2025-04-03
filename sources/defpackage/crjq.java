package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crjq extends crjo {
    private final String c;

    public crjq(Context context, crjp crjpVar, aoku aokuVar, String str) {
        super(context, crjpVar, aokuVar);
        this.c = str;
    }

    @Override // defpackage.crjo
    public final int a() {
        return R.string.business_info_phone_default_sub_header;
    }

    @Override // defpackage.crjo
    public final int b() {
        return R.drawable.tinted_ic_phone_24;
    }

    @Override // defpackage.crjo
    public final int c() {
        return R.string.business_action_call_short_content_description;
    }

    @Override // defpackage.crjo
    public final int d() {
        return R.string.business_action_call_short_text_m2;
    }

    @Override // defpackage.crjo
    public final Intent e() {
        return this.b.a(this.c);
    }

    @Override // defpackage.crjo
    public final String g(String str) {
        return this.a.getResources().getString(R.string.business_action_call_full_content_description, this.c, str);
    }

    @Override // defpackage.crjo
    public final int j() {
        return 2;
    }
}
