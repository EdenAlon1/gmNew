package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fdyo extends fdzg {
    private final fdyn b;

    public fdyo(fect fectVar, fdyn fdynVar) {
        super(fectVar);
        this.b = fdynVar;
    }

    @Override // defpackage.fect
    public final void a() {
        fdyn a = this.b.a();
        try {
            this.a.a();
        } finally {
            this.b.f(a);
        }
    }

    @Override // defpackage.fect
    public final void b() {
        fdyn a = this.b.a();
        try {
            this.a.b();
        } finally {
            this.b.f(a);
        }
    }

    @Override // defpackage.fect
    public final void c() {
        fdyn a = this.b.a();
        try {
            this.a.c();
        } finally {
            this.b.f(a);
        }
    }

    @Override // defpackage.fect
    public final void d(Object obj) {
        fdyn a = this.b.a();
        try {
            this.a.d(obj);
        } finally {
            this.b.f(a);
        }
    }

    @Override // defpackage.fect
    public final void e() {
        fdyn a = this.b.a();
        try {
            this.a.e();
        } finally {
            this.b.f(a);
        }
    }
}
