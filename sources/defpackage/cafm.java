package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import com.google.communication.synapse.security.scytale.Prekey;
import com.google.communication.synapse.security.scytale.PrekeyBundle;
import com.google.communication.synapse.security.scytale.UserDevices;
import com.google.media.webrtc.common.StatusOr;
import io.grpc.Status;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cafm {
    public static final chis a = chis.c("Bugle.Etouffee.DownloadPreKeys");
    public static final chis b = chis.c("Bugle.Etouffee.UploadPreKeys");
    public final fazb c;
    public final String d;
    public final ffbr e;
    private final errl f;

    public cafm(fazb fazbVar, String str, ffbr ffbrVar, errl errlVar) {
        this.c = fazbVar;
        this.d = str;
        this.e = ffbrVar;
        this.f = errlVar;
    }

    public static Prekey a(fcev fcevVar) {
        return new Prekey(fcevVar.b, fcevVar.c.I(), fcevVar.d.I());
    }

    public final void b(Status status) {
        fagh b2 = fagh.b(status.getCode().value());
        akxl akxlVar = (akxl) this.e.b();
        eolu eoluVar = (eolu) eolv.a.createBuilder();
        eolt eoltVar = eolt.BUGLE_E2EE_FETCH_PREKEYS_EVENT;
        eoluVar.copyOnWrite();
        eolv eolvVar = (eolv) eoluVar.instance;
        eolvVar.j = eoltVar.dk;
        eolvVar.b |= 1;
        eozf eozfVar = (eozf) eozg.a.createBuilder();
        eozfVar.copyOnWrite();
        eozg eozgVar = (eozg) eozfVar.instance;
        eozgVar.c = b2.a();
        eozgVar.b |= 1;
        eoluVar.copyOnWrite();
        eolv eolvVar2 = (eolv) eoluVar.instance;
        eozg eozgVar2 = (eozg) eozfVar.build();
        eozgVar2.getClass();
        eolvVar2.aJ = eozgVar2;
        eolvVar2.e |= 32;
        akxlVar.j(eoluVar);
    }

    public final ListenableFuture c(final ArrayList arrayList) {
        return ((chep) this.c.b()).b(new bzwa(arrayList, this.d), a).e(fedn.class, new emwl() { // from class: cafk
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                fedn fednVar = (fedn) obj;
                cafm.this.b(fednVar.a);
                throw fednVar;
            }
        }, this.f).h(new emwl() { // from class: cafl
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Prekey prekey;
                fclg fclgVar = (fclg) obj;
                ArrayList arrayList2 = new ArrayList();
                for (fclf fclfVar : fclgVar.c) {
                    for (fcle fcleVar : fclfVar.c) {
                        if ((fcleVar.b & 2) != 0) {
                            int i = fcleVar.c;
                            fcek fcekVar = fclfVar.b;
                            if (fcekVar == null) {
                                fcekVar = fcek.a;
                            }
                            String str = fcekVar.c;
                            String E = fcleVar.d.E();
                            if ((fcleVar.b & 1) != 0) {
                                fcev fcevVar = fcleVar.f;
                                if (fcevVar == null) {
                                    fcevVar = fcev.a;
                                }
                                prekey = cafm.a(fcevVar);
                            } else {
                                prekey = null;
                            }
                            Prekey prekey2 = prekey;
                            fcev fcevVar2 = fcleVar.g;
                            if (fcevVar2 == null) {
                                fcevVar2 = fcev.a;
                            }
                            arrayList2.add(new PrekeyBundle(i, str, E, prekey2, cafm.a(fcevVar2), fcleVar.e.I()));
                        }
                    }
                }
                cafm cafmVar = cafm.this;
                if (arrayList2.isEmpty()) {
                    cafmVar.b(Status.g);
                    return StatusOr.fromStatus(Status.g);
                }
                ArrayList arrayList3 = arrayList;
                int size = arrayList3.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i2 += ((UserDevices) arrayList3.get(i3)).getDeviceIds().size();
                }
                int size2 = arrayList3.size();
                int size3 = fclgVar.c.size();
                int size4 = arrayList2.size();
                akxl akxlVar = (akxl) cafmVar.e.b();
                eolu eoluVar = (eolu) eolv.a.createBuilder();
                eolt eoltVar = eolt.BUGLE_E2EE_FETCH_PREKEYS_EVENT;
                eoluVar.copyOnWrite();
                eolv eolvVar = (eolv) eoluVar.instance;
                eolvVar.j = eoltVar.dk;
                eolvVar.b |= 1;
                eozf eozfVar = (eozf) eozg.a.createBuilder();
                fagh faghVar = fagh.OK;
                eozfVar.copyOnWrite();
                eozg eozgVar = (eozg) eozfVar.instance;
                eozgVar.c = faghVar.a();
                eozgVar.b |= 1;
                eozfVar.copyOnWrite();
                eozg eozgVar2 = (eozg) eozfVar.instance;
                eozgVar2.b |= 2;
                eozgVar2.d = size2;
                eozfVar.copyOnWrite();
                eozg eozgVar3 = (eozg) eozfVar.instance;
                eozgVar3.b |= 4;
                eozgVar3.e = size3;
                eozfVar.copyOnWrite();
                eozg eozgVar4 = (eozg) eozfVar.instance;
                eozgVar4.b |= 8;
                eozgVar4.f = i2;
                eozfVar.copyOnWrite();
                eozg eozgVar5 = (eozg) eozfVar.instance;
                eozgVar5.b |= 16;
                eozgVar5.g = size4;
                eoluVar.copyOnWrite();
                eolv eolvVar2 = (eolv) eoluVar.instance;
                eozg eozgVar6 = (eozg) eozfVar.build();
                eozgVar6.getClass();
                eolvVar2.aJ = eozgVar6;
                eolvVar2.e |= 32;
                akxlVar.j(eoluVar);
                return StatusOr.fromValue(arrayList2);
            }
        }, erpp.a);
    }
}
