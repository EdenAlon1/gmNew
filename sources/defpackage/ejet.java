package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ejet {
    private final eiyk a;

    public ejet(eiyk eiykVar) {
        this.a = eiykVar;
    }

    public final ListenableFuture a(int i) {
        if (i == -1) {
            return erqt.h(new eizq());
        }
        eiyk eiykVar = this.a;
        final eisx b = eisx.b(i);
        return erny.f(eiykVar.h(b), eldl.a(new emwl() { // from class: ejes
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    return eisx.this;
                }
                throw new eizq("Stored account is disabled. Avoid this situation with an AccountDisabledInterceptor as described in go/tiktok-account/storage.md#storing-account-data-in-singleton-storage");
            }
        }), erpp.a);
    }
}
