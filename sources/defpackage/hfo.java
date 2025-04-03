package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hfo implements hiq {
    final /* synthetic */ hgh a;
    final /* synthetic */ hhn b;

    public hfo(hgh hghVar, hhn hhnVar) {
        this.a = hghVar;
        this.b = hhnVar;
    }

    @Override // defpackage.hiq
    public final int c(hio hioVar, Object obj) {
        hgh hghVar = this.a;
        hiq hiqVar = hghVar instanceof hiq ? (hiq) hghVar : null;
        int c = hiqVar != null ? hiqVar.c(hioVar, obj) : 1;
        if (c != 1) {
            return c;
        }
        hhn hhnVar = this.b;
        hhnVar.f = ffdx.ae(hhnVar.f, new ffcf(hioVar, obj));
        return 2;
    }

    @Override // defpackage.hiq
    public final void b() {
    }

    @Override // defpackage.hiq
    public final void a(Object obj) {
    }
}
