package defpackage;

import android.content.Context;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgia implements Runnable {
    private final Context a;
    private final dghd b;
    private final long c;

    public dgia(Context context, dghd dghdVar, long j) {
        this.a = context;
        this.b = dghdVar;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List singletonList;
        try {
            dgic dgicVar = new dgic();
            dgicVar.c();
            singletonList = this.b.b();
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
            Log.w("gF_GetAsyncFeedbackPsd", "Failed to get async Feedback psd.", e);
            singletonList = Collections.singletonList(Pair.create("gms:feedback:async_feedback_psd_failure", "exception"));
        }
        Context context = this.a;
        Status status = dghl.a;
        dgho dghoVar = new dgho(context);
        long j = this.c;
        dfre dfreVar = dghoVar.k;
        dghi dghiVar = new dghi(dfreVar, dgib.a(singletonList), j);
        dfreVar.b(dghiVar);
        dfwu.b(dghiVar);
    }
}
