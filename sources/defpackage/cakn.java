package defpackage;

import com.google.android.apps.messaging.shared.datamodel.etouffee.info.DetailsPageE2eeInfoRequest;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cakn implements capp {
    public static final cskc a = cskc.g("BugleEtouffee", "E2eeInfoDataService");
    public final ffbr b;
    public final ejvb c;
    public final ffbr d;
    private final ffsk f;
    private final ffbr g;

    public cakn(ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ejvb ejvbVar, ffbr ffbrVar3) {
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ejvbVar.getClass();
        ffbrVar3.getClass();
        this.f = ffskVar;
        this.b = ffbrVar;
        this.g = ffbrVar2;
        this.c = ejvbVar;
        this.d = ffbrVar3;
    }

    @Override // defpackage.capp
    public final ejuh a(DetailsPageE2eeInfoRequest detailsPageE2eeInfoRequest) {
        cakd cakdVar = (cakd) this.g.b();
        ffsk ffskVar = (ffsk) cakdVar.a.b();
        ffskVar.getClass();
        ffhd ffhdVar = (ffhd) cakdVar.b.b();
        ffhdVar.getClass();
        ffhd ffhdVar2 = (ffhd) cakdVar.c.b();
        ffhdVar2.getClass();
        ffbr ffbrVar = cakdVar.d;
        ffbr ffbrVar2 = cakdVar.e;
        ffbr ffbrVar3 = cakdVar.f;
        ffbr ffbrVar4 = cakdVar.g;
        cqoh cqohVar = (cqoh) cakdVar.h.b();
        cqohVar.getClass();
        return new cakc(ffskVar, ffhdVar, ffhdVar2, ffbrVar, ffbrVar2, ffbrVar3, ffbrVar4, cqohVar, cakdVar.i, detailsPageE2eeInfoRequest);
    }

    @Override // defpackage.capp
    public final elfl b(capz capzVar) {
        elfl c;
        capzVar.getClass();
        c = axol.c(this.f, ffhe.a, ffsm.a, new cakl(this, capzVar, null));
        return c;
    }

    @Override // defpackage.capp
    public final elfl c(Iterable iterable) {
        elfl c;
        iterable.getClass();
        c = axol.c(this.f, ffhe.a, ffsm.a, new cakm(iterable, this, null));
        return c;
    }
}
