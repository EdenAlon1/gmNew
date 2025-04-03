package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class evoc extends evlf {
    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ Object a(evpl evplVar) {
        if (evplVar.t() == 9) {
            evplVar.p();
            return null;
        }
        String j = evplVar.j();
        if (j.length() == 1) {
            return Character.valueOf(j.charAt(0));
        }
        throw new evlb(a.Q(j, evplVar, "Expecting character, got: ", "; at "));
    }

    @Override // defpackage.evlf
    public final /* bridge */ /* synthetic */ void b(evpn evpnVar, Object obj) {
        Character ch = (Character) obj;
        evpnVar.m(ch == null ? null : ch.toString());
    }
}
