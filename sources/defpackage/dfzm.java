package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.constellation.internal.IConstellationApiService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfzm implements dfuf {
    final /* synthetic */ Bundle a;

    public dfzm(Bundle bundle) {
        this.a = bundle;
    }

    @Override // defpackage.dfuf
    public final /* synthetic */ void a(Object obj, Object obj2) {
        dgae dgaeVar = (dgae) obj;
        dfzl dfzlVar = new dfzl((dhri) obj2);
        Context context = dgaeVar.c;
        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
        ((IConstellationApiService) dgaeVar.w()).verifyPhoneNumberV1(dfzlVar, this.a, new ApiMetadata(complianceOptions));
    }
}
