package defpackage;

import com.google.android.gms.auth.folsom.SharedKey;
import com.google.android.gms.auth.folsom.internal.ISharedKeyCallback;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfhe extends ISharedKeyCallback.Stub {
    final /* synthetic */ dhri a;

    public dfhe(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.auth.folsom.internal.ISharedKeyCallback
    public final void onResult(Status status, SharedKey[] sharedKeyArr) {
        if (status.d()) {
            this.a.b(Arrays.asList(sharedKeyArr));
        } else {
            this.a.a(dfve.a(status));
        }
    }
}
