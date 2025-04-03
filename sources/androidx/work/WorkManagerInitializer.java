package androidx.work;

import android.content.Context;
import defpackage.oyi;
import defpackage.pob;
import defpackage.pod;
import defpackage.ppt;
import defpackage.pqr;
import defpackage.pqs;
import defpackage.pte;
import java.util.Collections;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements oyi<pqs> {
    private static final String a = ppt.d("WrkMgrInitializer");

    @Override // defpackage.oyi
    public final /* synthetic */ Object a(Context context) {
        ppt.c().a(a, "Initializing WorkManager with default configuration.");
        pod podVar = new pod(new pob());
        context.getClass();
        pte.n(context, podVar);
        return pqr.a(context);
    }

    @Override // defpackage.oyi
    public final List b() {
        return Collections.EMPTY_LIST;
    }
}
