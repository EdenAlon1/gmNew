package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axon implements ejuh {
    private final cqoh a;
    private final Object b;
    private final Object c = "ImmediateDataSource";

    public axon(cqoh cqohVar, Object obj) {
        this.a = cqohVar;
        this.b = obj;
    }

    @Override // defpackage.ejuh
    public final erph a() {
        ekzz f = eleg.f("MessageDataSource#ImmediateDataSource#LoadData");
        try {
            erph erphVar = new erph(elfo.e(ejug.a(this.b, this.a.f())));
            ffig.a(f, null);
            return erphVar;
        } finally {
        }
    }

    @Override // defpackage.ejuh
    public final /* bridge */ /* synthetic */ ListenableFuture b() {
        return elfo.e(null);
    }

    @Override // defpackage.ejuh
    public final Object c() {
        return this.c;
    }
}
