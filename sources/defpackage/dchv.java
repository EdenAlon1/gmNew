package defpackage;

import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dchv extends ContentObserver {
    final /* synthetic */ dchw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dchv(dchw dchwVar) {
        super(null);
        this.a = dchwVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.a.i.compareAndSet(false, true)) {
            cslq.c(this.a.n(), 150L);
        }
    }
}
