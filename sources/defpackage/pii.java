package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class pii extends ffkk implements ffji {
    final /* synthetic */ pim a;
    final /* synthetic */ pij b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pii(pim pimVar, pij pijVar) {
        super(1);
        this.a = pimVar;
        this.b = pijVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (pgq$$ExternalSyntheticApiModelOutline0.m$4(obj2)) {
                arrayList.add(obj2);
            }
        }
        pim pimVar = this.a;
        this.b.b.a(arrayList);
        pimVar.b();
        return ffcu.a;
    }
}
