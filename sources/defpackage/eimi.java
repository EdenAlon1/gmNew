package defpackage;

import com.google.android.rcs.client.messaging.data.GroupEvent;
import com.google.android.rcs.client.messaging.data.GroupMember;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eimi extends eilf {
    private final eimo a;

    public eimi(eimo eimoVar) {
        this.a = eimoVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.eilf
    public final void b(GroupEvent groupEvent, clos closVar) {
        engw a = groupEvent.a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            cloz clozVar = (cloz) this.a.m().fP((GroupMember) a.get(i));
            closVar.copyOnWrite();
            clot clotVar = (clot) closVar.instance;
            clot clotVar2 = clot.a;
            clozVar.getClass();
            eygr eygrVar = clotVar.b;
            if (!eygrVar.c()) {
                clotVar.b = eyfy.mutableCopy(eygrVar);
            }
            clotVar.b.add(clozVar);
        }
    }
}
