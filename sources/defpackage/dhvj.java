package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.usagereporting.internal.UsageReportingClientImpl;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dhvj extends dfqj {
    @Override // defpackage.dfqj
    public final /* synthetic */ dfqr b(Context context, Looper looper, dfvs dfvsVar, Object obj, dfrc dfrcVar, dfrd dfrdVar) {
        return new UsageReportingClientImpl(context, looper, dfvsVar, dfrcVar, dfrdVar);
    }
}
