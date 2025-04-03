package defpackage;

import com.google.android.gms.wearable.internal.PutDataResponse;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.FutureTask;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class difl extends diff {
    private final List a;

    public difl(dfse dfseVar, List list) {
        super(dfseVar);
        this.a = list;
    }

    @Override // com.google.android.gms.wearable.internal.AbstractWearableCallbacks, com.google.android.gms.wearable.internal.IWearableCallbacks
    public final void onPutData(PutDataResponse putDataResponse) {
        a(new dick(difd.a(putDataResponse.a), putDataResponse.b));
        if (putDataResponse.a != 0) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((FutureTask) it.next()).cancel(true);
            }
        }
    }
}
