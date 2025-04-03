package defpackage;

import java.io.Closeable;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaua implements Closeable, alxx {
    private static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler");
    private final aatz b;
    private final aauo c;
    private final AtomicBoolean d = new AtomicBoolean(false);
    private final ctbx e;

    public aaua(aatz aatzVar, aauo aauoVar, alxy alxyVar) {
        this.b = aatzVar;
        this.c = aauoVar;
        this.e = alxyVar.c(this);
    }

    @Override // defpackage.alxx
    public final void a() {
        if (this.d.get()) {
            ((enrr) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "invalidate", 36, "MessageListPagingSourceChangeHandler.kt")).q("Skipping invalidate since the source is already closed");
        } else {
            if (this.b.h()) {
                ((enrr) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "invalidate", 40, "MessageListPagingSourceChangeHandler.kt")).q("Skipping invalidate since the source is already invalid");
                return;
            }
            ((enrr) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "invalidate", 43, "MessageListPagingSourceChangeHandler.kt")).q("Invalidating pagingSource due to data change");
            this.b.e();
            this.c.a = null;
        }
    }

    @Override // defpackage.alxx
    public final void b(alxd alxdVar, alxw alxwVar) {
        alxdVar.getClass();
        if (this.d.get()) {
            ((enrr) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "onChanged", 23, "MessageListPagingSourceChangeHandler.kt")).q("Skipping invalidate since the source is already closed");
        } else if (this.b.h()) {
            ((enrr) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "onChanged", 27, "MessageListPagingSourceChangeHandler.kt")).q("Skipping onChanged since the source is already invalid");
        } else {
            ((enrr) a.h().h("com/google/android/apps/messaging/conversation2/messagelist/paging/MessageListPagingSourceChangeHandler", "onChanged", 30, "MessageListPagingSourceChangeHandler.kt")).D("Invalidating pagingSource,operation %s on %s", alxdVar, alxwVar);
            this.b.e();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.d.set(true);
        this.e.close();
    }
}
