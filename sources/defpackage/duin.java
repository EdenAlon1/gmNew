package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class duin {
    public static ListenableFuture a(dhre dhreVar) {
        final duim duimVar = new duim(dhreVar);
        dhreVar.o(erpp.a, new dhqs() { // from class: duil
            @Override // defpackage.dhqs
            public final void a(dhre dhreVar2) {
                boolean z = ((dhrm) dhreVar2).d;
                duim duimVar2 = duim.this;
                if (z) {
                    duimVar2.cancel(false);
                    return;
                }
                if (dhreVar2.m()) {
                    duimVar2.set(dhreVar2.i());
                    return;
                }
                Exception h = dhreVar2.h();
                if (h == null) {
                    throw new IllegalStateException();
                }
                duimVar2.setException(h);
            }
        });
        return duimVar;
    }
}
