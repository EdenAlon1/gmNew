package defpackage;

import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbpf implements cbpg {
    public static final entd a = entd.c("BugleSearch");
    public final Queue b = new ArrayDeque();
    public final Queue c = new ArrayDeque();
    public SettableFuture d;
    private final cbsf e;
    private final Executor f;

    public cbpf(cbsf cbsfVar, Executor executor) {
        this.e = cbsfVar;
        this.f = new ersb(executor);
    }

    @Override // defpackage.cbpg
    public final ListenableFuture a(final SearchQuery searchQuery) {
        final SettableFuture create = SettableFuture.create();
        axnw.h(elfo.f(new Runnable() { // from class: cbpe
            @Override // java.lang.Runnable
            public final void run() {
                cbpf cbpfVar = cbpf.this;
                cbpfVar.b.add(create);
                cbpfVar.c.add(searchQuery);
                cbpfVar.b();
            }
        }, this.f));
        return create;
    }

    public final void b() {
        if (!this.b.isEmpty() && this.d == null) {
            while (!this.b.isEmpty()) {
                SettableFuture settableFuture = (SettableFuture) this.b.remove();
                SearchQuery searchQuery = (SearchQuery) this.c.remove();
                if (!settableFuture.isDone() && !settableFuture.isCancelled()) {
                    this.d = settableFuture;
                    axnw.h(this.e.a(searchQuery).e(cbsr.class, new emwl() { // from class: cbpc
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            ((ensz) ((ensz) ((ensz) cbpf.a.j()).g((cbsr) obj)).h("com/google/android/apps/messaging/shared/datamodel/search/common/SequentialIcingSearchApiImpl", "startSearch", 88, "SequentialIcingSearchApiImpl.java")).q("ThrottleIcingSearchApiImpl: Couldn't fetch search results.");
                            return cbne.e();
                        }
                    }, this.f).h(new emwl() { // from class: cbpd
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            cbpf cbpfVar = cbpf.this;
                            cbne cbneVar = (cbne) obj;
                            SettableFuture settableFuture2 = cbpfVar.d;
                            if (settableFuture2 != null) {
                                settableFuture2.set(cbneVar);
                                cbpfVar.d = null;
                                cbpfVar.b();
                            }
                            return cbneVar;
                        }
                    }, this.f));
                    return;
                }
            }
        }
    }
}
