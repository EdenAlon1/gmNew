package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eiyj implements ejuh {
    private final eiyk a;
    private final eiyx b;

    public eiyj(eiyk eiykVar, eiyx eiyxVar) {
        this.a = eiykVar;
        this.b = eiyxVar;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        final ListenableFuture e = this.b.e();
        final ListenableFuture e2 = this.a.e();
        return new erph(erqt.d(e, e2).a(eldl.m(new Callable() { // from class: eiyi
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eize eizeVar = (eize) erqt.q(ListenableFuture.this);
                return (eizeVar.b & 1) != 0 ? ejug.a((List) erqt.q(e2), Instant.ofEpochMilli(eizeVar.c)) : ejug.a;
            }
        }), erpp.a));
    }

    @Override // defpackage.ejuh
    public final ListenableFuture b() {
        return this.b.a();
    }

    @Override // defpackage.ejuh
    public final Object c() {
        return "com.google.apps.tiktok.account.data.AllAccounts";
    }
}
