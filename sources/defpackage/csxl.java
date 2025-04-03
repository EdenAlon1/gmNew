package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csxl extends evlf {
    private volatile evlf a;
    private final evkn b;

    public csxl(evkn evknVar) {
        this.b = evknVar;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        List list = null;
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
                if ("results".equals(h)) {
                    evlf evlfVar = this.a;
                    if (evlfVar == null) {
                        evlfVar = this.b.a(evpj.a(List.class, csxn.class));
                        this.a = evlfVar;
                    }
                    list = (List) evlfVar.a(evplVar);
                } else {
                    evplVar.q();
                }
            }
        }
        evplVar.o();
        return new csxm(list);
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        csxr csxrVar = (csxr) obj;
        if (csxrVar == null) {
            evpnVar.j();
            return;
        }
        evpnVar.f();
        evpnVar.i("results");
        evlf evlfVar = this.a;
        if (evlfVar == null) {
            evlfVar = this.b.a(evpj.a(List.class, csxn.class));
            this.a = evlfVar;
        }
        evlfVar.b(evpnVar, csxrVar.a());
        evpnVar.h();
    }

    public final String toString() {
        return "TypeAdapter(TenorSearchResponse)";
    }
}
