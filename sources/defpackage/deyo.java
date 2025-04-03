package defpackage;

import android.content.Context;
import com.google.android.gms.asterism.GetAsterismConsentRequest;
import com.google.android.gms.asterism.internal.IAsterismApiService;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class deyo implements dfuf {
    final /* synthetic */ GetAsterismConsentRequest a;

    public deyo(GetAsterismConsentRequest getAsterismConsentRequest) {
        this.a = getAsterismConsentRequest;
    }

    @Override // defpackage.dfuf
    public final /* synthetic */ void a(Object obj, Object obj2) {
        deyy deyyVar = (deyy) obj;
        deyn deynVar = new deyn((dhri) obj2);
        Context context = deyyVar.c;
        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
        ((IAsterismApiService) deyyVar.w()).getAsterismConsent(deynVar, this.a, new ApiMetadata(complianceOptions));
    }
}
