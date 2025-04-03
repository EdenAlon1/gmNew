package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dcpl extends dwei {
    final /* synthetic */ dcpn a;

    public dcpl(dcpn dcpnVar) {
        this.a = dcpnVar;
    }

    @Override // defpackage.dwei
    public final void a(double d) {
        dcpn dcpnVar = this.a;
        dcpnVar.c = (float) d;
        dcpnVar.invalidateSelf();
    }
}
