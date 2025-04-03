package defpackage;

import com.google.android.apps.messaging.shared.datamodel.search.common.SearchQuery;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbpk implements cbpg {
    public static final entd a = entd.c("BugleSearch");
    public SettableFuture b;
    private final cbsf c;
    private SettableFuture d;
    private SearchQuery e;
    private final Executor f = new Executor() { // from class: cbph
        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            efbd.e(runnable);
        }
    };

    public cbpk(cbsf cbsfVar) {
        this.c = cbsfVar;
    }

    private final void c(SearchQuery searchQuery, SettableFuture settableFuture) {
        this.b = settableFuture;
        this.c.a(searchQuery).e(cbsr.class, new emwl() { // from class: cbpi
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                ((ensz) ((ensz) ((ensz) cbpk.a.j()).g((cbsr) obj)).h("com/google/android/apps/messaging/shared/datamodel/search/common/ThrottleIcingSearchApiImpl", "startSearch", 71, "ThrottleIcingSearchApiImpl.java")).q("ThrottleIcingSearchApiImpl: Couldn't fetch search results.");
                return cbne.e();
            }
        }, erpp.a).k(axou.a(new cbpj(this, settableFuture)), this.f);
    }

    @Override // defpackage.cbpg
    public final ListenableFuture a(SearchQuery searchQuery) {
        efbd.c();
        SettableFuture settableFuture = this.b;
        if (settableFuture == null || settableFuture.isDone() || this.b.isCancelled()) {
            SettableFuture create = SettableFuture.create();
            c(searchQuery, create);
            return create;
        }
        this.e = searchQuery;
        SettableFuture settableFuture2 = this.d;
        if (settableFuture2 == null) {
            settableFuture2 = SettableFuture.create();
        }
        this.d = settableFuture2;
        return settableFuture2;
    }

    public final void b() {
        SearchQuery searchQuery;
        SettableFuture settableFuture = this.d;
        if (settableFuture == null || (searchQuery = this.e) == null) {
            return;
        }
        this.e = null;
        this.d = null;
        c(searchQuery, settableFuture);
    }
}
