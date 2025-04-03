package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csxf extends evlf {
    private volatile evlf a;
    private volatile evlf b;
    private volatile evlf c;
    private final evkn d;

    public csxf(evkn evknVar) {
        this.d = evknVar;
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
        Integer num = null;
        List list = null;
        while (evplVar.r()) {
            String h = evplVar.h();
            if (evplVar.t() == 9) {
                evplVar.p();
            } else {
                h.hashCode();
                if ("url".equals(h)) {
                    evlf evlfVar = this.a;
                    if (evlfVar == null) {
                        evlfVar = this.d.b(String.class);
                        this.a = evlfVar;
                    }
                    str = (String) evlfVar.a(evplVar);
                } else if ("preview".equals(h)) {
                    evlf evlfVar2 = this.a;
                    if (evlfVar2 == null) {
                        evlfVar2 = this.d.b(String.class);
                        this.a = evlfVar2;
                    }
                    str2 = (String) evlfVar2.a(evplVar);
                } else if ("size".equals(h)) {
                    evlf evlfVar3 = this.b;
                    if (evlfVar3 == null) {
                        evlfVar3 = this.d.b(Integer.class);
                        this.b = evlfVar3;
                    }
                    num = (Integer) evlfVar3.a(evplVar);
                } else if ("dims".equals(h)) {
                    evlf evlfVar4 = this.c;
                    if (evlfVar4 == null) {
                        evlfVar4 = this.d.a(evpj.a(List.class, Integer.class));
                        this.c = evlfVar4;
                    }
                    list = (List) evlfVar4.a(evplVar);
                } else {
                    evplVar.q();
                }
            }
        }
        evplVar.o();
        return new csxg(str, str2, num, list);
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        csxo csxoVar = (csxo) obj;
        if (csxoVar == null) {
            evpnVar.j();
            return;
        }
        evpnVar.f();
        evpnVar.i("url");
        if (csxoVar.c() == null) {
            evpnVar.j();
        } else {
            evlf evlfVar = this.a;
            if (evlfVar == null) {
                evlfVar = this.d.b(String.class);
                this.a = evlfVar;
            }
            evlfVar.b(evpnVar, csxoVar.c());
        }
        evpnVar.i("preview");
        if (csxoVar.b() == null) {
            evpnVar.j();
        } else {
            evlf evlfVar2 = this.a;
            if (evlfVar2 == null) {
                evlfVar2 = this.d.b(String.class);
                this.a = evlfVar2;
            }
            evlfVar2.b(evpnVar, csxoVar.b());
        }
        evpnVar.i("size");
        if (csxoVar.a() == null) {
            evpnVar.j();
        } else {
            evlf evlfVar3 = this.b;
            if (evlfVar3 == null) {
                evlfVar3 = this.d.b(Integer.class);
                this.b = evlfVar3;
            }
            evlfVar3.b(evpnVar, csxoVar.a());
        }
        evpnVar.i("dims");
        if (csxoVar.d() == null) {
            evpnVar.j();
        } else {
            evlf evlfVar4 = this.c;
            if (evlfVar4 == null) {
                evlfVar4 = this.d.a(evpj.a(List.class, Integer.class));
                this.c = evlfVar4;
            }
            evlfVar4.b(evpnVar, csxoVar.d());
        }
        evpnVar.h();
    }

    public final String toString() {
        return "TypeAdapter(TenorMedia)";
    }
}
