package defpackage;

import android.content.Context;
import com.google.android.gms.auth.folsom.internal.IKeyRetrievalService;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.ComplianceOptions;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfhb implements dfuf {
    final /* synthetic */ String a;
    final /* synthetic */ boolean b;

    public dfhb(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    @Override // defpackage.dfuf
    public final /* synthetic */ void a(Object obj, Object obj2) {
        dfhn dfhnVar = (dfhn) obj;
        dfha dfhaVar = new dfha((dhri) obj2);
        Context context = dfhnVar.c;
        ComplianceOptions complianceOptions = new ComplianceOptions(-1, -1, 0, true);
        ((IKeyRetrievalService) dfhnVar.w()).setConsent(dfhaVar, this.a, this.b, new ApiMetadata(complianceOptions));
    }
}
