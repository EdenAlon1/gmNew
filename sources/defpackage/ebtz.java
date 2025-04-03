package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class ebtz extends ebun {
    public ebtz(final Context context, final ScheduledExecutorService scheduledExecutorService) {
        super(new emyl() { // from class: ebty
            @Override // defpackage.emyl
            public final Object get() {
                Context context2 = context;
                return new ebvd(scheduledExecutorService, new efkv(context2, "STREAMZ_ONEGOOGLE_ANDROID"), context2 instanceof Application ? (Application) context2 : null);
            }
        });
    }
}
