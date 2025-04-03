package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejzc extends ejxn {
    public ejxn a = null;
    private final ea b;
    private final ejvw c;
    private final Executor d;

    public ejzc(ea eaVar, ejvw ejvwVar, Executor executor) {
        this.b = eaVar;
        this.c = ejvwVar;
        this.d = executor;
    }

    private final ejxn a() {
        efbd.c();
        try {
            emxf.m(((lkv) this.b.Q().P()).c == lkj.INITIALIZED, "A @ViewLifecycle LocalSubscriptionMixin may only register callbacks in `onCreateView()`. Please refer to the LocalSubscriptionMixin's Javadoc for a full description of how to use this LocalSubscriptionMixin correctly.");
            if (this.a == null) {
                try {
                    eklq a = eklq.a(this.b.Q(), this.b);
                    this.a = new ejxz(new ejyd(new ejxw(this.b.Q(), a, this.d), a, this.c, this.d, this.b.Q()));
                    this.b.Q().P().c(new eleu(new ejzb(this)));
                } catch (IllegalStateException e) {
                    throw new IllegalStateException("Currently a Fragment cannot inject both `@ViewLifecycle StreamMixin` and `@ViewLifecycle LocalSubscriptionMixin` at the same time. Please file go/tiktok-bug if you need it.\n\nIf this Fragment injects both unqualified and `@ViewLifecycle` qualified Mixins it's likely a bug. Only one the two Mixins may be used in a given Fragment - either the unqualified or `@ViewLifecycle` Mixin exclusively.", e);
                }
            }
            return this.a;
        } catch (IllegalStateException e2) {
            throw new IllegalStateException("A @ViewLifecycle LocalSubscriptionMixin may only register callbacks in `onCreateView()`. Please refer to the LocalSubscriptionMixin's Javadoc for a full description of how to use this LocalSubscriptionMixin correctly.", e2);
        }
    }

    @Override // defpackage.ejxn
    public final ejxm g(int i, ejxi ejxiVar, ejxk ejxkVar) {
        return a().g(i, ejxiVar, ejxkVar);
    }

    @Override // defpackage.ejxn
    public final ejxm h(ejxk ejxkVar) {
        return a().h(ejxkVar);
    }
}
