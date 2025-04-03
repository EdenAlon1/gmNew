package defpackage;

import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqxp implements emyl {
    final /* synthetic */ azsu a;

    public aqxp(azsu azsuVar) {
        this.a = azsuVar;
    }

    @Override // defpackage.emyl
    public final /* bridge */ /* synthetic */ Object get() {
        Object apply;
        bxuz a = bxve.a();
        a.z("SelfProfileRowFactory#getOrCreateSelfProfileRow");
        bxvd bxvdVar = new bxvd();
        apply = new Function[]{new aqxo(this.a)}[0].apply(new bxvd());
        bxvdVar.ar((bxvd) apply);
        a.k(new bxvc(bxvdVar));
        engw cW = ((bxuk) a.b().o()).cW();
        cW.getClass();
        return new aqwp((bxtp) ffdx.M(cW), false);
    }
}
