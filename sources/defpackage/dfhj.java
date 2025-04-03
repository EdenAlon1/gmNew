package defpackage;

import android.content.Context;
import com.google.android.gms.auth.folsom.internal.IKeyRetrievalService;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfhj implements dfuf {
    final /* synthetic */ String a;

    public dfhj(String str) {
        this.a = str;
    }

    @Override // defpackage.dfuf
    public final /* synthetic */ void a(Object obj, Object obj2) {
        dfhn dfhnVar = (dfhn) obj;
        dfhi dfhiVar = new dfhi((dhri) obj2);
        Context context = dfhnVar.c;
        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
        ((IKeyRetrievalService) dfhnVar.w()).listRecoveredSecurityDomains(dfhiVar, this.a, new ApiMetadata(complianceOptions));
    }
}
