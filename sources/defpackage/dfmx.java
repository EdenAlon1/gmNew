package defpackage;

import com.google.android.gms.clearcut.internal.DefaultClearcutLoggerCallbacks;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dfmx extends DefaultClearcutLoggerCallbacks {
    final /* synthetic */ dfmy a;

    public dfmx(dfmy dfmyVar) {
        this.a = dfmyVar;
    }

    @Override // com.google.android.gms.clearcut.internal.DefaultClearcutLoggerCallbacks, com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks
    public final void onLogEvent(Status status) {
        this.a.l(status);
    }
}
