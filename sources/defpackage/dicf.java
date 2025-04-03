package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.PutDataRequest;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dicf extends dibk {
    final /* synthetic */ PutDataRequest a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dicf(dfre dfreVar, PutDataRequest putDataRequest) {
        super(dfreVar);
        this.a = putDataRequest;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ dfrl a(Status status) {
        return new dick(status, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01fa  */
    @Override // defpackage.dfsd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void b(defpackage.dfqk r17) {
        /*
            Method dump skipped, instructions count: 536
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dicf.b(dfqk):void");
    }
}
