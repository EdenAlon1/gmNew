package defpackage;

import android.content.Context;
import android.content.Intent;
import com.google.android.ims.util.common.RcsIntents;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkpe extends dkpc<Void> {
    private final AtomicReference a = new AtomicReference();

    @Override // defpackage.dkpc
    protected final /* bridge */ /* synthetic */ void c(Context context, Intent intent) {
        if (intent == null) {
            dkty.q("Empty message received", new Object[0]);
            return;
        }
        if (!dkqd.e(context, intent)) {
            dkty.q("Caller not trusted, dropping recurring-metrics-upload message: %s", intent);
            return;
        }
        String action = intent.getAction();
        if (action == null) {
            dkty.q("Empty action received", new Object[0]);
            return;
        }
        if (action.equals(RcsIntents.ACTION_RCS_RECURRING_METRICS_UPLOAD)) {
            dkty.c("Recurring Metrics Upload message received: %s", action);
            dkpd dkpdVar = (dkpd) this.a.get();
            if (dkpdVar != null) {
                try {
                    dkpdVar.a();
                } catch (Exception e) {
                    dkty.s(e, "Unhandled Exception Uploading Metrics.", new Object[0]);
                }
            }
        }
    }
}
