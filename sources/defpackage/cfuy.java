package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cfuy extends cfun {
    private final AtomicReference e;

    public cfuy(ecwj ecwjVar, Object obj) {
        super(ecwjVar, obj);
        this.e = new AtomicReference();
    }

    @Override // defpackage.cfun, defpackage.ejuh
    public final /* bridge */ /* synthetic */ Object c() {
        return c();
    }

    @Override // defpackage.cfun
    protected final Object h() {
        Object obj;
        synchronized (this.b) {
            Object g = g();
            cfux.a(this.e, g);
            cfux.a(this.d, g);
            obj = this.d.get();
            obj.getClass();
        }
        return obj;
    }

    @Override // defpackage.cfun
    /* renamed from: i */
    public final String c() {
        return this.b.d();
    }

    @Override // defpackage.cfun, defpackage.cfva
    public final String j() {
        return this.b.d();
    }

    @Override // defpackage.cfun, defpackage.cfva
    public final void k(Object obj) {
        this.d.set(obj);
    }

    @Override // defpackage.cfun, defpackage.cfva
    public final void l() {
    }
}
