package defpackage;

import com.google.android.rcs.client.messaging.data.RcsDestinationId;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class einh extends eill {
    @Override // defpackage.eill, defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        RcsDestinationId rcsDestinationId = (RcsDestinationId) obj;
        if (rcsDestinationId.b() - 1 != 0) {
            clqt clqtVar = (clqt) clqv.a.createBuilder();
            clte clteVar = (clte) cltf.a.createBuilder();
            String a = rcsDestinationId.a();
            clteVar.copyOnWrite();
            cltf cltfVar = (cltf) clteVar.instance;
            cltfVar.b = 1 | cltfVar.b;
            cltfVar.c = a;
            cltf cltfVar2 = (cltf) clteVar.build();
            clqtVar.copyOnWrite();
            clqv clqvVar = (clqv) clqtVar.instance;
            cltfVar2.getClass();
            clqvVar.c = cltfVar2;
            clqvVar.b = 2;
            return (clqv) clqtVar.build();
        }
        clqt clqtVar2 = (clqt) clqv.a.createBuilder();
        clqp clqpVar = (clqp) clqq.a.createBuilder();
        String a2 = rcsDestinationId.a();
        clqpVar.copyOnWrite();
        clqq clqqVar = (clqq) clqpVar.instance;
        clqqVar.b |= 1;
        clqqVar.c = a2;
        clqq clqqVar2 = (clqq) clqpVar.build();
        clqtVar2.copyOnWrite();
        clqv clqvVar2 = (clqv) clqtVar2.instance;
        clqqVar2.getClass();
        clqvVar2.c = clqqVar2;
        clqvVar2.b = 1;
        return (clqv) clqtVar2.build();
    }

    @Override // defpackage.eill, defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        clqv clqvVar = (clqv) obj;
        int a = clqu.a(clqvVar.b);
        if (a == 0) {
            throw null;
        }
        int i = a - 1;
        if (i == 0) {
            eieu eieuVar = new eieu();
            eieuVar.c(1);
            eieuVar.b((clqvVar.b == 1 ? (clqq) clqvVar.c : clqq.a).c);
            return eieuVar.a();
        }
        if (i != 1) {
            throw new IllegalArgumentException("No valid destination case value set in from.");
        }
        eieu eieuVar2 = new eieu();
        eieuVar2.c(2);
        eieuVar2.b((clqvVar.b == 2 ? (cltf) clqvVar.c : cltf.a).c);
        return eieuVar2.a();
    }
}
