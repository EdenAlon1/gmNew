package defpackage;

import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cptk {
    private final cevh a;

    public cptk(cevh cevhVar) {
        cevhVar.getClass();
        this.a = cevhVar;
    }

    public final void a(UUID uuid) {
        cpwd cpwdVar = (cpwd) cpwe.a.createBuilder();
        cpwdVar.getClass();
        if (uuid != null) {
            cpwd cpwdVar2 = (cpwd) cpwe.a.createBuilder();
            eyee a = cqjf.a(uuid);
            cpwdVar2.copyOnWrite();
            cpwe cpweVar = (cpwe) cpwdVar2.instance;
            cpweVar.b |= 4;
            cpweVar.e = a;
        }
        this.a.a(ceyr.g("IncrementalReverseSyncWorkItemHandler", cpwdVar.build()));
    }
}
