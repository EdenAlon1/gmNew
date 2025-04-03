package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class ectb extends ecte {
    private final boolean b;

    public ectb(fgpf fgpfVar, boolean z) {
        super(fgpfVar);
        this.b = z;
    }

    private final fgpf f() {
        return this.b ? this.a : e();
    }

    @Override // defpackage.ecte
    public final long a(String str) {
        fgpf f = f();
        if (f.equals(fgpf.a)) {
            return 1000L;
        }
        return f.c;
    }

    @Override // defpackage.ecte
    public final fgpf b(Long l) {
        return this.a;
    }

    @Override // defpackage.ecte
    public final fgpf c(Long l) {
        return f();
    }

    @Override // defpackage.ecte
    public final boolean d() {
        return this.b;
    }
}
