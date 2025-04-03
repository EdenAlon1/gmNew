package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edln extends edpn {
    public edpu a;
    public edpu b;
    public edpu c;
    public edpu d;

    @Override // defpackage.edpn
    public final void a(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null acceptsCashOnly");
        }
        this.c = edpuVar;
    }

    @Override // defpackage.edpn
    public final void b(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null acceptsCreditCards");
        }
        this.a = edpuVar;
    }

    @Override // defpackage.edpn
    public final void c(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null acceptsDebitCards");
        }
        this.b = edpuVar;
    }

    @Override // defpackage.edpn
    public final void d(edpu edpuVar) {
        if (edpuVar == null) {
            throw new NullPointerException("Null acceptsNfc");
        }
        this.d = edpuVar;
    }
}
