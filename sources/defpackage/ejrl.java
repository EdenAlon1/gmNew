package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejrl extends ffsd implements ffsu {
    private final ffsd a;
    private final ffsd b;
    private final fazb c;

    public ejrl(ffsd ffsdVar, ffsd ffsdVar2, fazb fazbVar) {
        this.a = ffsdVar;
        this.b = ffsdVar2;
        this.c = fazbVar;
    }

    @Override // defpackage.ffsd
    public final void a(ffhd ffhdVar, Runnable runnable) {
        ffhdVar.getClass();
        runnable.getClass();
        if (((Boolean) this.c.b()).booleanValue()) {
            this.b.a(ffhdVar, runnable);
        } else {
            this.a.a(ffhdVar, runnable);
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ffsd, ffsu] */
    @Override // defpackage.ffsu
    public final ffte c(long j, Runnable runnable, ffhd ffhdVar) {
        ffhdVar.getClass();
        return ((Boolean) this.c.b()).booleanValue() ? this.b.c(j, runnable, ffhdVar) : ((ffsu) this.a).c(j, runnable, ffhdVar);
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [ffsd, ffsu] */
    @Override // defpackage.ffsu
    public final void d(long j, ffrf ffrfVar) {
        if (((Boolean) this.c.b()).booleanValue()) {
            this.b.d(j, ffrfVar);
        } else {
            ((ffsu) this.a).d(j, ffrfVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ejrl)) {
            return false;
        }
        ejrl ejrlVar = (ejrl) obj;
        if (ffkj.e(this.c.b(), ejrlVar.c.b())) {
            return ((Boolean) this.c.b()).booleanValue() ? ffkj.e(this.b, ejrlVar.b) : ffkj.e(this.a, ejrlVar.a);
        }
        return false;
    }

    @Override // defpackage.ffsd
    public final boolean ex(ffhd ffhdVar) {
        ffhdVar.getClass();
        return ((Boolean) this.c.b()).booleanValue() ? this.b.ex(ffhdVar) : this.a.ex(ffhdVar);
    }

    public final int hashCode() {
        return ((Boolean) this.c.b()).booleanValue() ? this.b.hashCode() : this.a.hashCode();
    }
}
