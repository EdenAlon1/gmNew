package defpackage;

import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes5.dex */
class eilp extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        clsm clsmVar = (clsm) clsn.a.createBuilder();
        String a = ((TraceId) obj).a();
        clsmVar.copyOnWrite();
        clsn clsnVar = (clsn) clsmVar.instance;
        clsnVar.b |= 1;
        clsnVar.c = a;
        return (clsn) clsmVar.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        clsn clsnVar = (clsn) obj;
        eihm b = TraceId.b();
        if ((clsnVar.b & 1) != 0) {
            b.c(clsnVar.c);
        }
        return b.d();
    }
}
