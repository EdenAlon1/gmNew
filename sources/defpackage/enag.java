package defpackage;

import com.google.common.util.concurrent.SettableFuture;
import java.lang.ref.ReferenceQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enag implements enau {
    volatile enau a;
    final SettableFuture b;
    final emyg c;

    public enag() {
        enau enauVar = enbf.b;
        this.b = SettableFuture.create();
        this.c = new emyg();
        this.a = enauVar;
    }

    @Override // defpackage.enau
    public final int a() {
        return 0;
    }

    @Override // defpackage.enau
    public final enbg c() {
        return null;
    }

    @Override // defpackage.enau
    public final Object d() {
        return ersn.a(this.b);
    }

    @Override // defpackage.enau
    public final void e(Object obj) {
        if (obj != null) {
            h(obj);
        } else {
            this.a = enbf.b;
        }
    }

    @Override // defpackage.enau
    public final boolean f() {
        return false;
    }

    @Override // defpackage.enau
    public final boolean g() {
        return true;
    }

    @Override // defpackage.enau
    public final Object get() {
        return null;
    }

    public final boolean h(Object obj) {
        return this.b.set(obj);
    }

    public final void i() {
        this.c.a(TimeUnit.NANOSECONDS);
    }

    @Override // defpackage.enau
    public final enau b(ReferenceQueue referenceQueue, Object obj, enbg enbgVar) {
        return this;
    }
}
