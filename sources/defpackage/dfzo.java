package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.constellation.VerifyPhoneNumberRequest;
import com.google.android.gms.constellation.internal.IConstellationApiService;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfzo implements dfuf {
    final /* synthetic */ VerifyPhoneNumberRequest a;

    public dfzo(VerifyPhoneNumberRequest verifyPhoneNumberRequest) {
        this.a = verifyPhoneNumberRequest;
    }

    @Override // defpackage.dfuf
    public final /* synthetic */ void a(Object obj, Object obj2) {
        dgae dgaeVar = (dgae) obj;
        dfzn dfznVar = new dfzn((dhri) obj2);
        Context context = dgaeVar.c;
        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
        ((IConstellationApiService) dgaeVar.w()).verifyPhoneNumber(dfznVar, this.a, new ApiMetadata(complianceOptions));
    }
}
