package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhlb extends IGetStorageInfoCallbacks.Stub {
    final /* synthetic */ dhri a;

    public dhlb(dhri dhriVar) {
        this.a = dhriVar;
    }

    @Override // com.google.android.gms.phenotype.internal.IGetStorageInfoCallbacks
    public final void onResult(Status status, byte[] bArr) {
        if (!status.d()) {
            dfup.b(status, null, this.a);
            return;
        }
        try {
            dfup.b(status, (ecye) eyfy.parseFrom(ecye.a, bArr, eyfc.a()), this.a);
        } catch (eygu e) {
            this.a.a(e);
        }
    }
}
