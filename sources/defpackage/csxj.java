package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csxj extends evlf {
    private volatile evlf a;
    private final evkn b;

    public csxj(evkn evknVar) {
        this.b = evknVar;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        String str = null;
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        evplVar.m();
        while (evplVar.r()) {
            String h = evplVar.h();
            if (evplVar.t() == 9) {
                evplVar.p();
            } else {
                h.hashCode();
                if ("status".equals(h)) {
                    evlf evlfVar = this.a;
                    if (evlfVar == null) {
                        evlfVar = this.b.b(String.class);
                        this.a = evlfVar;
                    }
                    str = (String) evlfVar.a(evplVar);
                } else {
                    evplVar.q();
                }
            }
        }
        evplVar.o();
        return new csxk(str);
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        csxq csxqVar = (csxq) obj;
        if (csxqVar == null) {
            evpnVar.j();
            return;
        }
        evpnVar.f();
        evpnVar.i("status");
        evlf evlfVar = this.a;
        if (evlfVar == null) {
            evlfVar = this.b.b(String.class);
            this.a = evlfVar;
        }
        evlfVar.b(evpnVar, csxqVar.a());
        evpnVar.h();
    }

    public final String toString() {
        return "TypeAdapter(TenorRegisterShareResponse)";
    }
}
