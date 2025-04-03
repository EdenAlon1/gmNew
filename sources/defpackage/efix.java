package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efix {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;

    public efix(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
    }

    public final efiv a(erog erogVar, efkj efkjVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.b();
        scheduledExecutorService.getClass();
        efjx efjxVar = (efjx) this.c.b();
        efjxVar.getClass();
        efkjVar.getClass();
        return new efiv(new efjy(context, scheduledExecutorService, efjxVar, erogVar, efkjVar));
    }

    public final efiv b(final String str, efkj efkjVar) {
        Context context = (Context) this.a.b();
        context.getClass();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.b.b();
        scheduledExecutorService.getClass();
        efjx efjxVar = (efjx) this.c.b();
        efjxVar.getClass();
        erog erogVar = new erog() { // from class: efiw
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return erqt.i(str);
            }
        };
        efkjVar.getClass();
        return new efiv(new efjy(context, scheduledExecutorService, efjxVar, erogVar, efkjVar));
    }
}
