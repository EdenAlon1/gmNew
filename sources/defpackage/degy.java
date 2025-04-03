package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class degy implements bqab {
    private final ffbr a;
    private final entd b = entd.c("BugleJobs");
    private final AtomicBoolean c = new AtomicBoolean(false);
    private final cbdt d;
    private buxm e;

    public degy(ffbr ffbrVar) {
        this.a = ffbrVar;
        this.d = new cbdt(((cbdu) ffbrVar.b()).a);
    }

    @Override // defpackage.bqab
    public final void a() {
        buxo d = MessagesTable.d();
        d.z("SyncDataToWearableMessageChangeObserver-messages");
        d.e(new Function() { // from class: degx
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                buum buumVar = (buum) obj;
                buumVar.getClass();
                return new buun[]{buumVar.a, buumVar.n, buumVar.k};
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        this.e = d.b();
    }

    @Override // defpackage.bqab
    public final void fF() {
        if (!this.c.compareAndSet(false, true)) {
            ((ensz) this.b.h()).q("Already started sync data to wearable message observer.");
            return;
        }
        ((ensz) this.b.h()).q("Starting sync data to wearable message observer.");
        buxm buxmVar = this.e;
        if (buxmVar == null) {
            ffkj.c("messageQuery");
            buxmVar = null;
        }
        buxmVar.L(this.d);
    }
}
