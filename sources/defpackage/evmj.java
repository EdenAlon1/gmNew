package defpackage;

import com.google.gson.internal.Excluder;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class evmj extends evlf {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ evkn c;
    final /* synthetic */ evpj d;
    final /* synthetic */ Excluder e;
    private volatile evlf f;

    public evmj(Excluder excluder, boolean z, boolean z2, evkn evknVar, evpj evpjVar) {
        this.a = z;
        this.b = z2;
        this.c = evknVar;
        this.d = evpjVar;
        this.e = excluder;
    }

    private final evlf c() {
        evlf evlfVar = this.f;
        if (evlfVar != null) {
            return evlfVar;
        }
        evlf c = this.c.c(this.e, this.d);
        this.f = c;
        return c;
    }

    @Override // defpackage.evlf
    public final Object a(evpl evplVar) {
        if (!this.a) {
            return c().a(evplVar);
        }
        evplVar.q();
        return null;
    }

    @Override // defpackage.evlf
    public final void b(evpn evpnVar, Object obj) {
        if (this.b) {
            evpnVar.j();
        } else {
            c().b(evpnVar, obj);
        }
    }
}
