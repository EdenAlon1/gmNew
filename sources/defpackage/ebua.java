package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ebua extends ebtz {
    private final ebuc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ebua(Context context, ScheduledExecutorService scheduledExecutorService) {
        super(context, scheduledExecutorService);
        context.getClass();
        scheduledExecutorService.getClass();
        this.b = new ebuc(scheduledExecutorService);
    }

    @Override // defpackage.ebun
    public final void a(Runnable runnable) {
        this.b.a(runnable);
    }
}
