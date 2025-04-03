package defpackage;

import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpg implements tqz {
    private static final entd b = entd.c("BugleCms");
    public final tns a;
    private final ffbr c;
    private final crty d;
    private final errl e;

    public tpg(ffbr ffbrVar, crty crtyVar, tns tnsVar, errl errlVar) {
        this.c = ffbrVar;
        this.d = crtyVar;
        this.a = tnsVar;
        this.e = errlVar;
    }

    @Override // defpackage.tqz
    public final /* bridge */ /* synthetic */ ListenableFuture a(eszk eszkVar) {
        elfl c;
        if (eszkVar.b != 9) {
            ((ensz) ((ensz) b.j()).h("com/google/android/apps/messaging/cloudstore/notifications/BoxMetadataEventHandler", "handleEvent", 47, "BoxMetadataEventHandler.java")).t("Cannot handle event of type %s", eszj.a(eszkVar.b));
            return elfo.e(null);
        }
        eswf eswfVar = (eswf) eszkVar.c;
        int b2 = eswe.b(eswfVar.b);
        if (b2 == 0) {
            b2 = 1;
        }
        if (b2 - 2 != 1) {
            ensk n = b.n();
            ensn ensnVar = cdii.t;
            int b3 = eswe.b(eswfVar.b);
            n.Y(ensnVar, eswe.a(b3 != 0 ? b3 : 1));
            n.Y(cdii.w, eswfVar.c);
            n.Y(cdii.x, "Not implemented");
            ((ensz) n.h("com/google/android/apps/messaging/cloudstore/notifications/BoxMetadataEventHandler", "handleEvent", 62, "BoxMetadataEventHandler.java")).q("BoxMetadataEvent received");
            return elfo.e(null);
        }
        ensk n2 = b.n();
        ensn ensnVar2 = cdii.t;
        int b4 = eswe.b(eswfVar.b);
        n2.Y(ensnVar2, eswe.a(b4 != 0 ? b4 : 1));
        n2.Y(cdii.w, eswfVar.c);
        ((ensz) n2.h("com/google/android/apps/messaging/cloudstore/notifications/BoxMetadataEventHandler", "handleBoxDevicesUpdatedEvent", 73, "BoxMetadataEventHandler.java")).q("BoxMetadataEvent received");
        if (csgj.a()) {
            tpq tpqVar = (tpq) this.c.b();
            c = axol.c(tpqVar.c, ffhe.a, ffsm.a, new tpp(tpqVar, null));
            return c;
        }
        crty crtyVar = this.d;
        eyfg eyfgVar = (eyfg) eyfh.a.createBuilder();
        eyfgVar.a("box_devices");
        return crtyVar.k((eyfh) eyfgVar.build()).i(new eroh() { // from class: tpf
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return tpg.this.a.a((esvv) obj);
            }
        }, this.e);
    }
}
