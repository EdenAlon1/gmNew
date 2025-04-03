package defpackage;

import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
abstract class dgol extends dgok {
    public dgol(dfre dfreVar) {
        super(dfreVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ dfrl a(Status status) {
        return status == null ? Status.c : status;
    }
}
