package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajoz {
    public static final dktn a = new dktn(dkty.a);
    public final ffbr b;
    public final ckhf c;
    public final ffbr d;
    private final csjk e;
    private final dkvu f;

    public ajoz(ffbr ffbrVar, ckhf ckhfVar, csjk csjkVar, dkvu dkvuVar, ffbr ffbrVar2) {
        this.b = ffbrVar;
        this.c = ckhfVar;
        this.e = csjkVar;
        this.f = dkvuVar;
        this.d = ffbrVar2;
    }

    public final elfl a(int i, eyxa eyxaVar) {
        this.c.a();
        try {
            ((ajon) this.b.b()).a();
        } catch (ceul e) {
            dkty.q("setupVendorIms precondition failed: RemovingNonExistentRowIdException thrown when trying to cancel all pending tasks. Error: %s", e.getMessage());
        }
        if (new djtc(((ckge) this.e.a()).x()).d()) {
            dkty.q("setupVendorIms precondition failed: RCS is disabled.", new Object[0]);
        } else {
            dkvg a2 = this.f.a(i);
            if (dkvg.SINGLE_REG.equals(a2)) {
                return b(i, eyxc.OPERATION_TYPE_SETUP_VENDOR_IMS, eyxaVar);
            }
            dkty.q("setupVendorIms precondition failed: Expected SipConnectionType: %s. Active version: %s", dkvg.SINGLE_REG.name(), a2.name());
        }
        dkty.q("setupVendorIms precondition failed, the task will not be scheduled.", new Object[0]);
        return elfo.e(ceyt.k());
    }

    public final elfl b(int i, eyxc eyxcVar, eyxa eyxaVar) {
        dkty.k("[SR]: Scheduling %s task. Trigger: %s", eyxcVar.name(), eyxaVar.name());
        ajon ajonVar = (ajon) this.b.b();
        ajol ajolVar = (ajol) ajom.a.createBuilder();
        ajolVar.copyOnWrite();
        ajom ajomVar = (ajom) ajolVar.instance;
        ajomVar.b = 1 | ajomVar.b;
        ajomVar.c = i;
        ajolVar.copyOnWrite();
        ajom ajomVar2 = (ajom) ajolVar.instance;
        ajomVar2.d = eyxcVar.d;
        ajomVar2.b |= 2;
        ajolVar.copyOnWrite();
        ajom ajomVar3 = (ajom) ajolVar.instance;
        ajomVar3.e = eyxaVar.l;
        ajomVar3.b |= 4;
        return ((cevh) ajonVar.a.b()).b(ceyr.g("vendor_ims_call", (ajom) ajolVar.build())).i(new eroh() { // from class: ajoy
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                return ((cevg) obj).a();
            }
        }, (Executor) this.d.b());
    }
}
