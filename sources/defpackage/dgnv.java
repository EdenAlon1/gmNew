package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgnv implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final dghd c;
    private final long d;

    public dgnv(Context context, GoogleHelp googleHelp, dghd dghdVar, long j) {
        this.a = context;
        this.b = googleHelp;
        this.c = dghdVar;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        Bundle bundle = new Bundle(1);
        try {
            dgic dgicVar = new dgic();
            dgicVar.c();
            list = this.c.a();
            File cacheDir = this.a.getCacheDir();
            if (list != null && !list.isEmpty() && cacheDir != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((FileTeleporter) it.next()).e = cacheDir;
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(dgicVar.a()));
        } catch (Exception e) {
            Log.w("gH_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            list = null;
        }
        Context context = this.a;
        FeedbackOptions a = FeedbackOptions.a(list);
        dfqs dfqsVar = dgnq.a;
        dgop dgopVar = new dgop(context);
        GoogleHelp googleHelp = this.b;
        long j = this.d;
        dfre dfreVar = dgopVar.k;
        dgoc dgocVar = new dgoc(dfreVar, a, bundle, j, googleHelp);
        dfreVar.b(dgocVar);
        dfwu.b(dgocVar);
    }
}
