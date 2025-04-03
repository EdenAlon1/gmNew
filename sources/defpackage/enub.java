package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class enub implements entx {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.entx
    public final /* synthetic */ void a(ensn ensnVar, Iterator it, Object obj) {
        enxb.b(ensnVar.b, "non repeating key");
        if (!ensnVar.c || Cenum.a() <= 20) {
            ensnVar.b(it, obj);
        } else {
            while (it.hasNext()) {
                obj.a(ensnVar.a, it.next());
            }
        }
    }
}
