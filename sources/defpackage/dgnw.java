package defpackage;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgnw implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final dghd c;
    private final long d;

    public dgnw(Context context, GoogleHelp googleHelp, dghd dghdVar, long j) {
        this.a = context;
        this.b = googleHelp;
        this.c = dghdVar;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List singletonList;
        try {
            dgic dgicVar = new dgic();
            dgicVar.c();
            singletonList = this.c.b();
            if (singletonList == null) {
                singletonList = new ArrayList(1);
            }
            try {
                singletonList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(dgicVar.a())));
            } catch (UnsupportedOperationException unused) {
                ArrayList arrayList = new ArrayList(singletonList);
                arrayList.add(Pair.create("gms:feedback:async_feedback_psd_collection_time_ms", String.valueOf(dgicVar.a())));
                singletonList = arrayList;
            }
        } catch (Exception e) {
            Log.w("gH_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
            singletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
        }
        Context context = this.a;
        dfqs dfqsVar = dgnq.a;
        dgop dgopVar = new dgop(context);
        GoogleHelp googleHelp = this.b;
        long j = this.d;
        dfre dfreVar = dgopVar.k;
        dgoa dgoaVar = new dgoa(dfreVar, dgib.a(singletonList), j, googleHelp);
        dfreVar.b(dgoaVar);
        dfwu.b(dgoaVar);
    }
}
