package defpackage;

import com.google.android.gms.auth.folsom.internal.IStringListCallback;
import com.google.android.gms.common.api.Status;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfhi extends IStringListCallback.Stub {
    final /* synthetic */ dhri a;

    public dfhi(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.auth.folsom.internal.IStringListCallback
    public final void onResult(Status status, String[] strArr) {
        if (status.d()) {
            this.a.b(Arrays.asList(strArr));
        } else {
            this.a.a(dfve.a(status));
        }
    }
}
