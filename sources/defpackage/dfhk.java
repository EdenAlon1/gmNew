package defpackage;

import com.google.android.gms.auth.folsom.internal.IByteArrayListCallback;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfhk extends IByteArrayListCallback.Stub {
    final /* synthetic */ dhri a;

    public dfhk(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.auth.folsom.internal.IByteArrayListCallback
    public final void onResult(Status status, List<byte[]> list) {
        if (status.d()) {
            this.a.b(list);
        } else {
            this.a.a(dfve.a(status));
        }
    }
}
