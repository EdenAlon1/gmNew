package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evot extends evlf {
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        int t = evplVar.t();
        if (t != 9) {
            return t == 6 ? Boolean.valueOf(Boolean.parseBoolean(evplVar.j())) : Boolean.valueOf(evplVar.s());
        }
        evplVar.p();
        return null;
    }

    @Override // defpackage.evlf
    public final /* synthetic */ void b(evpn evpnVar, Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool == null) {
            evpnVar.j();
            return;
        }
        evpnVar.c();
        evpnVar.a();
        evpnVar.a.write(true != bool.booleanValue() ? "false" : "true");
    }
}
