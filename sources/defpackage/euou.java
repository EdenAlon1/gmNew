package defpackage;

import com.google.android.gms.appdatasearch.internal.ILightweightAppDataSearch;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes5.dex */
abstract class euou extends dfuo implements dfse {
    protected dhri e;

    public euou() {
        super(null, false, 9004);
    }

    @Override // defpackage.dfuo
    protected final /* bridge */ /* synthetic */ void a(dfqk dfqkVar, dhri dhriVar) {
        this.e = dhriVar;
        b((ILightweightAppDataSearch) ((dexa) dfqkVar).w());
    }

    protected abstract void b(ILightweightAppDataSearch iLightweightAppDataSearch);

    @Override // defpackage.dfse
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        Status status = (Status) obj;
        if (status.d()) {
            this.e.b(null);
        } else {
            this.e.a(eupi.a(status, "User Action indexing error, please try again."));
        }
    }
}
