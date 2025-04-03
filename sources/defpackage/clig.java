package defpackage;

import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes8.dex */
class clig extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        axac createBuilder = axad.a.createBuilder();
        String a = ((TraceId) obj).a();
        createBuilder.copyOnWrite();
        axad axadVar = (axad) createBuilder.instance;
        axadVar.b |= 1;
        axadVar.c = a;
        return createBuilder.build();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        axad axadVar = (axad) obj;
        eihm b = TraceId.b();
        if ((axadVar.b & 1) != 0) {
            b.c(axadVar.c);
        }
        return b.d();
    }
}
