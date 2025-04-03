package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csxd extends evlf {
    private volatile evlf a;
    private volatile evlf b;
    private final evkn c;

    public csxd(evkn evknVar) {
        this.c = evknVar;
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        String str = null;
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        evplVar.m();
        String str2 = null;
        List list = null;
        while (evplVar.r()) {
            String h = evplVar.h();
            if (evplVar.t() == 9) {
                evplVar.p();
            } else {
                h.hashCode();
                if ("id".equals(h)) {
                    evlf evlfVar = this.a;
                    if (evlfVar == null) {
                        evlfVar = this.c.b(String.class);
                        this.a = evlfVar;
                    }
                    str = (String) evlfVar.a(evplVar);
                } else if ("url".equals(h)) {
                    evlf evlfVar2 = this.a;
                    if (evlfVar2 == null) {
                        evlfVar2 = this.c.b(String.class);
                        this.a = evlfVar2;
                    }
                    str2 = (String) evlfVar2.a(evplVar);
                } else if ("media".equals(h)) {
                    evlf evlfVar3 = this.b;
                    if (evlfVar3 == null) {
                        evlfVar3 = this.c.a(evpj.a(List.class, evpj.a(Map.class, String.class, csxo.class).b));
                        this.b = evlfVar3;
                    }
                    list = (List) evlfVar3.a(evplVar);
                } else {
                    evplVar.q();
                }
            }
        }
        evplVar.o();
        return new csxe(str, str2, list);
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        csxn csxnVar = (csxn) obj;
        if (csxnVar == null) {
            evpnVar.j();
            return;
        }
        evpnVar.f();
        evpnVar.i("id");
        evlf evlfVar = this.a;
        if (evlfVar == null) {
            evlfVar = this.c.b(String.class);
            this.a = evlfVar;
        }
        evlfVar.b(evpnVar, csxnVar.a());
        evpnVar.i("url");
        evlf evlfVar2 = this.a;
        if (evlfVar2 == null) {
            evlfVar2 = this.c.b(String.class);
            this.a = evlfVar2;
        }
        evlfVar2.b(evpnVar, csxnVar.b());
        evpnVar.i("media");
        evlf evlfVar3 = this.b;
        if (evlfVar3 == null) {
            evlfVar3 = this.c.a(evpj.a(List.class, evpj.a(Map.class, String.class, csxo.class).b));
            this.b = evlfVar3;
        }
        evlfVar3.b(evpnVar, csxnVar.c());
        evpnVar.h();
    }

    public final String toString() {
        return "TypeAdapter(TenorGif)";
    }
}
