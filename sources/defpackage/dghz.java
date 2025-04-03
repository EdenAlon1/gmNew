package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.android.gms.feedback.FileTeleporter;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dghz implements Runnable {
    private final Context a;
    private final dghd b;
    private final long c;

    public dghz(Context context, dghd dghdVar, long j) {
        this.a = context;
        this.b = dghdVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        final Bundle bundle = new Bundle(1);
        try {
            dgic dgicVar = new dgic();
            dgicVar.c();
            list = this.b.a();
            File cacheDir = this.a.getCacheDir();
            if (list != null && !list.isEmpty() && cacheDir != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((FileTeleporter) it.next()).e = cacheDir;
                }
            }
            bundle.putString("gms:feedback:async_feedback_psbd_collection_time_ms", String.valueOf(dgicVar.a()));
        } catch (Exception e) {
            Log.w("gF_GetAsyncFeedbackPsbd", "Failed to get async Feedback psbd.", e);
            bundle.putString("gms:feedback:async_feedback_psbd_failure", "exception");
            list = null;
        }
        final long j = this.c;
        Context context = this.a;
        final FeedbackOptions a = FeedbackOptions.a(list);
        Status status = dghl.a;
        dgho dghoVar = new dgho(context);
        if (dgho.d(a)) {
            dfun dfunVar = new dfun();
            dfunVar.a = new dfuf() { // from class: dghm
                @Override // defpackage.dfuf
                public final void a(Object obj, Object obj2) {
                    try {
                        ((dghy) obj).M(FeedbackOptions.this, bundle, j);
                    } catch (Exception e2) {
                        Log.e("gF_FeedbackClient", "Requesting to save the async feedback psbd failed!", e2);
                    }
                }
            };
            dfunVar.c = 6011;
            dghoVar.l(dfunVar.a());
            return;
        }
        dfre dfreVar = dghoVar.k;
        dghj dghjVar = new dghj(dfreVar, a, bundle, j);
        dfreVar.b(dghjVar);
        dfwu.b(dghjVar);
    }
}
