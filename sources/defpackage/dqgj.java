package defpackage;

import android.app.Activity;
import android.net.Uri;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqgj {
    private adg a;

    public static /* synthetic */ void c(dqgj dqgjVar, Activity activity, dqgf dqgfVar, final adf adfVar) {
        activity.getClass();
        dqgfVar.getClass();
        if (!(activity instanceof eg)) {
            throw new IllegalStateException("Check failed.");
        }
        eg egVar = (eg) activity;
        String aA = ffdx.aA(dqgfVar.a, "_", null, null, null, 62);
        StringBuilder sb = new StringBuilder("compose_system_content_picker_");
        sb.append(aA);
        sb.append("_");
        sb.append(true != dqgfVar.b ? "single" : "multiple");
        String sb2 = sb.toString();
        dqgjVar.a = dqgfVar.b ? egVar.h.b(sb2, new dqgh(egVar, dqgfVar), adfVar) : egVar.h.b(sb2, new dqgi(egVar, dqgfVar), new adf() { // from class: dqgg
            @Override // defpackage.adf
            public final void a(Object obj) {
                Uri uri = (Uri) obj;
                adf.this.a(uri != null ? ffdx.b(uri) : ffel.a);
            }
        });
    }

    public final void a() {
        adg adgVar = this.a;
        if (adgVar == null) {
            ffkj.c("launcher");
            adgVar = null;
        }
        adgVar.c("*/*");
    }
}
