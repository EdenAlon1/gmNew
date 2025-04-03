package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;
import com.google.android.gms.constellation.GetIidTokenRequest;
import com.google.android.gms.constellation.internal.IConstellationApiService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfzq implements dfuf {
    final /* synthetic */ GetIidTokenRequest a;

    public dfzq(GetIidTokenRequest getIidTokenRequest) {
        this.a = getIidTokenRequest;
    }

    @Override // defpackage.dfuf
    public final /* synthetic */ void a(Object obj, Object obj2) {
        dgae dgaeVar = (dgae) obj;
        dfzp dfzpVar = new dfzp((dhri) obj2);
        Context context = dgaeVar.c;
        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
        ((IConstellationApiService) dgaeVar.w()).getIidToken(dfzpVar, this.a, new ApiMetadata(complianceOptions));
    }
}
