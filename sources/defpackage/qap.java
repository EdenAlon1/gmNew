package defpackage;

import androidx.work.impl.WorkDatabase;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qap {
    public static final ListenableFuture a(WorkDatabase workDatabase, qbc qbcVar, ffji ffjiVar) {
        qak qakVar = qbcVar.a;
        qakVar.getClass();
        return ppl.a(qakVar, "loadStatusFuture", new qao(ffjiVar, workDatabase));
    }
}
