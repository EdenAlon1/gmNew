package defpackage;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.ThemeSettings;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.InProductHelp;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egcw {
    private final Activity a;
    private final emxc b;

    public egcw(Activity activity, emxc emxcVar) {
        this.a = activity;
        this.b = emxcVar;
    }

    private final FeedbackOptions c() {
        dghp dghpVar = new dghp(this.a.getApplicationContext());
        dghpVar.d = "com.google.android.libraries.user.profile.photopicker.USER_INITIATED_FEEDBACK_REPORT";
        dghpVar.a = dgho.a(this.a);
        return dghpVar.a();
    }

    public final void a() {
        Context applicationContext = this.a.getApplicationContext();
        Status status = dghl.a;
        new dgho(applicationContext).c(c());
    }

    public final void b(String str) {
        GoogleHelp googleHelp = new GoogleHelp(str);
        ThemeSettings themeSettings = new ThemeSettings();
        themeSettings.a = 3;
        googleHelp.s = themeSettings;
        googleHelp.c(c(), this.a.getCacheDir());
        emxc emxcVar = this.b;
        if (!emxcVar.g()) {
            new dgno(this.a).c(googleHelp.a());
        } else {
            InProductHelp inProductHelp = new InProductHelp(googleHelp, null, null, 0, null, 0, null);
            inProductHelp.c = (String) emxcVar.c();
            new dgno(this.a).d(inProductHelp);
        }
    }
}
