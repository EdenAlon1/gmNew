package defpackage;

import android.content.Context;
import com.google.android.gms.auth.folsom.internal.IKeyRetrievalService;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfgw implements dfuf {
    final /* synthetic */ String a;

    public dfgw(String str) {
        this.a = str;
    }

    @Override // defpackage.dfuf
    public final /* synthetic */ void a(Object obj, Object obj2) {
        dfhn dfhnVar = (dfhn) obj;
        dfgv dfgvVar = new dfgv((dhri) obj2);
        Context context = dfhnVar.c;
        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
        ((IKeyRetrievalService) dfhnVar.w()).resetSecurityDomain(dfgvVar, this.a, new ApiMetadata(complianceOptions));
    }
}
