package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import com.google.android.apps.messaging.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cipe {
    public final Context a;
    public final ayfg b;
    private final cnmx c;

    public cipe(Context context, ayfg ayfgVar, cnmx cnmxVar) {
        this.a = context;
        this.b = ayfgVar;
        this.c = cnmxVar;
    }

    final kma a(ephv ephvVar) {
        Context context = this.a;
        PendingIntent d = this.c.d(ephvVar);
        String string = context.getString(R.string.report_issue_action_text);
        d.getClass();
        klz klzVar = new klz(R.drawable.ic_warning_light, string, d);
        klzVar.d = true;
        return klzVar.a();
    }
}
