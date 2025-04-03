package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deaj {
    private static final cskc d = cskc.g("Bugle", "ChangeDefaultSmsAppHelper");
    public final Context a;
    public final ctvs b;
    public final ctwb c;
    private final ddzb e;

    public deaj(Context context, ctvs ctvsVar, ctwb ctwbVar, ddzb ddzbVar) {
        this.a = context;
        this.b = ctvsVar;
        this.c = ctwbVar;
        this.e = ddzbVar;
    }

    public final void a() {
        ctvs ctvsVar = this.b;
        Context context = this.a;
        boolean e = ctvsVar.e();
        boolean i = ctid.i(context);
        boolean d2 = ctvsVar.d();
        if (!e) {
            this.e.h(R.string.sms_disabled);
        } else if (!i) {
            this.e.h(R.string.sms_disallowed_message);
        } else if (!d2) {
            this.e.h(R.string.requires_default_sms_app);
        }
        csjb e2 = d.e();
        e2.I("Unsatisfied action condition.");
        e2.B("isSmsCapable", e);
        e2.B("isSmsAllowedForUser", i);
        e2.B("isDefaultSmsApp", d2);
        e2.r();
    }
}
