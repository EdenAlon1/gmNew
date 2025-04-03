package defpackage;

import com.google.android.gms.auth.api.signin.internal.ISignInService;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfef extends dfei {
    public dfef(dfre dfreVar) {
        super(dfreVar);
    }

    @Override // defpackage.dfsd
    protected final /* bridge */ /* synthetic */ void b(dfqk dfqkVar) {
        dfed dfedVar = (dfed) dfqkVar;
        ((ISignInService) dfedVar.w()).signOutFromGoogle(new dfee(this), dfedVar.a);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ dfrl a(Status status) {
        return status;
    }
}
