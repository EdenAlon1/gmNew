package defpackage;

import com.google.android.gms.auth.account.data.IGetStringValueCallback;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfar extends IGetStringValueCallback.Stub {
    final /* synthetic */ dhri a;

    public dfar(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.auth.account.data.IGetStringValueCallback
    public final void onResponse(Status status, String str) {
        dfup.b(status, str, this.a);
    }
}
