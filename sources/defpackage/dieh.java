package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.wearable.internal.IWearableService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dieh extends dibk {
    final /* synthetic */ String a;
    final /* synthetic */ String h;
    final /* synthetic */ byte[] i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dieh(dfre dfreVar, String str, String str2, byte[] bArr) {
        super(dfreVar);
        this.a = str;
        this.h = str2;
        this.i = bArr;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* synthetic */ dfrl a(Status status) {
        return new diei(status, -1);
    }

    @Override // defpackage.dfsd
    protected final /* bridge */ /* synthetic */ void b(dfqk dfqkVar) {
        ((IWearableService) ((difp) dfqkVar).w()).sendMessage(new difm(this), this.a, this.h, this.i);
    }
}
