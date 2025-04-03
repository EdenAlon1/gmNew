package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.ims.util.common.RcsIntents;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diyp extends dkpc<Void> {
    public final List a = new CopyOnWriteArrayList();
    private final Context b;
    private boolean c;
    private final diku d;

    public diyp(Context context, diku dikuVar) {
        this.b = context;
        this.d = dikuVar;
    }

    public final synchronized void a() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(RcsIntents.ACTION_CSLIB_FLAGS_UPDATED);
        koa.g(this.b, this, intentFilter);
        this.c = true;
    }

    public final synchronized void b() {
        if (this.c) {
            this.b.unregisterReceiver(this);
            this.c = false;
        }
    }

    @Override // defpackage.dkpc
    protected final /* bridge */ /* synthetic */ void c(Context context, Intent intent) {
        if (intent == null) {
            dkty.c("Intent is null", new Object[0]);
            return;
        }
        String action = intent.getAction();
        dkty.c("Received: %s", action);
        if (RcsIntents.ACTION_CSLIB_FLAGS_UPDATED.equals(action)) {
            dizc.m();
            dimn.J(context);
            this.d.d(context, dimn.E().F());
            dkty.c("Notify carrierservices_library phenotype update listeners", new Object[0]);
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((diyo) it.next()).onCsLibPhenotypeUpdated();
            }
        }
    }
}
