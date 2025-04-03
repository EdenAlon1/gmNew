package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emlw implements emlu {
    private Object a;
    private int b = 0;
    private boolean c = false;
    private final emnl d;

    public emlw(emnl emnlVar, Object obj) {
        this.d = emnlVar;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [excx, java.lang.Object] */
    private final synchronized void e() {
        this.a.close();
        this.a = null;
    }

    private final synchronized boolean f() {
        return this.a == null;
    }

    @Override // defpackage.emlu
    public final synchronized void b() {
        if (f()) {
            return;
        }
        if (this.b == 0) {
            e();
        } else {
            this.c = true;
        }
    }

    @Override // defpackage.emlu
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final synchronized emlv a() {
        if (f()) {
            this.a = this.d.a();
        }
        this.b++;
        return new emlv(this.a, this);
    }

    public final synchronized void d() {
        int i = this.b - 1;
        this.b = i;
        if (i == 0 && this.c) {
            this.c = false;
            e();
        }
    }
}
