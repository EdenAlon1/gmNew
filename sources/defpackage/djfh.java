package defpackage;

import com.google.android.rcs.client.messaging.data.TraceId;

/* compiled from: PG */
/* loaded from: classes4.dex */
class djfh extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eihm b = TraceId.b();
        b.c(((fjay) obj).b);
        return b.d();
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        fjax fjaxVar = (fjax) fjay.a.createBuilder();
        String a = ((TraceId) obj).a();
        fjaxVar.copyOnWrite();
        ((fjay) fjaxVar.instance).b = a;
        return (fjay) fjaxVar.build();
    }
}
