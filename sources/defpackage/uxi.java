package defpackage;

import android.content.Context;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uxi extends alhh {
    private static final cfup c = cfvl.i(cfvl.b, "disable_logging_selected_messages_event_logger", true);
    public final ffbr a;
    public final Context b;
    private final ffsk d;
    private final ffhd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uxi(ffbr ffbrVar, Executor executor, ffbr ffbrVar2, ffsk ffskVar, ffhd ffhdVar, Context context) {
        super(ffbrVar, new uxd(), executor);
        ffbrVar.getClass();
        executor.getClass();
        ffbrVar2.getClass();
        ffskVar.getClass();
        ffhdVar.getClass();
        context.getClass();
        this.a = ffbrVar2;
        this.d = ffskVar;
        this.e = ffhdVar;
        this.b = context;
    }

    @Override // defpackage.alhh
    public final BiConsumer a() {
        return new uxh(uxe.a);
    }

    public final void b(Collection collection, eonx eonxVar) {
        collection.getClass();
        eonxVar.getClass();
        if (((Boolean) c.e()).booleanValue() || collection.isEmpty()) {
            return;
        }
        axol.k(this.d, this.e, new uxg(collection, this, eonxVar, null), 2);
    }
}
