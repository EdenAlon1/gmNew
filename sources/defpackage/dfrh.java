package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfrh extends BasePendingResult {
    private final dfrl a;

    public dfrh(dfrl dfrlVar) {
        super(null);
        this.a = dfrlVar;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final dfrl a(Status status) {
        return this.a;
    }
}
