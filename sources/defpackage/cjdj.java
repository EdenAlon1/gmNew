package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import j$.time.ZoneId;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cjdj {
    private final Context a;
    private final cqoh b;

    public cjdj(Context context, cqoh cqohVar) {
        context.getClass();
        cqohVar.getClass();
        this.a = context;
        this.b = cqohVar;
    }

    public final String a(long j, boolean z) {
        return qmn.b(this.a, true != z ? R.string.nudge_banner_sent_title : R.string.nudge_banner_received_title, "days_ago", Long.valueOf(csri.a(this.b.f().toEpochMilli(), j, ZoneId.systemDefault())));
    }
}
