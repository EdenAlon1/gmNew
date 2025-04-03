package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adza implements adyz {
    private final Context a;
    private final crjx b;
    private final fazb c;
    private final ffbr d;

    public adza(Context context, crjx crjxVar, fazb fazbVar, ffbr ffbrVar) {
        this.a = context;
        this.b = crjxVar;
        this.c = fazbVar;
        this.d = ffbrVar;
    }

    @Override // defpackage.adyz
    public final ListenableFuture a(ephv ephvVar, Throwable th, enhk enhkVar) {
        dghp dghpVar;
        dgho dghoVar = (dgho) this.d.b();
        if (dghoVar == null) {
            return erqt.i(null);
        }
        if (th != null) {
            String a = eerc.a(th);
            String string = th.getCause() instanceof cirb ? this.a.getString(R.string.report_invalid_thread_id_issue_description) : th.getCause() instanceof circ ? this.a.getString(R.string.report_thread_id_not_found_description) : this.a.getString(R.string.report_issue_description);
            dghpVar = new dghq(th);
            dghpVar.c = string;
            dghpVar.e(a);
        } else {
            dghpVar = new dghp(this.a);
        }
        HashMap hashMap = new HashMap();
        hashMap.put("IssueTypeName", ephvVar.name());
        if (enhkVar != null) {
            hashMap.putAll(enhkVar);
        }
        ((cgag) this.c.b()).c(enhk.l("EXTRA", new cgas(hashMap)));
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = true != this.b.g() ? 0 : 2;
        dghpVar.e = themeSettings;
        dght dghtVar = new dght();
        dghtVar.b();
        dghpVar.f = dghtVar.a();
        dghpVar.d((dghd) this.c.b(), false);
        dghpVar.d = (String) cful.m.e();
        return duin.a(dghoVar.c(dghpVar.a()));
    }
}
