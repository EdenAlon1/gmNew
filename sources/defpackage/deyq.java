package defpackage;

import android.content.Context;
import com.google.android.gms.asterism.SetAsterismConsentRequest;
import com.google.android.gms.asterism.internal.IAsterismApiService;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class deyq implements dfuf {
    final /* synthetic */ SetAsterismConsentRequest a;

    public deyq(SetAsterismConsentRequest setAsterismConsentRequest) {
        this.a = setAsterismConsentRequest;
    }

    @Override // defpackage.dfuf
    public final /* synthetic */ void a(Object obj, Object obj2) {
        deyy deyyVar = (deyy) obj;
        deyp deypVar = new deyp((dhri) obj2);
        Context context = deyyVar.c;
        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
        ((IAsterismApiService) deyyVar.w()).setAsterismConsent(deypVar, this.a, new ApiMetadata(complianceOptions));
    }
}
