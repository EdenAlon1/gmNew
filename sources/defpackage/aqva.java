package defpackage;

import j$.util.Map;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqva extends ffhv implements ffjm {
    final /* synthetic */ aqvb a;
    final /* synthetic */ azsu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqva(aqvb aqvbVar, azsu azsuVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = aqvbVar;
        this.b = azsuVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((aqva) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        azvu azvuVar = (azvu) this.a.a.b();
        HashMap hashMap = new HashMap();
        engw g = azvuVar.g();
        int size = g.size();
        for (int i = 0; i < size; i++) {
            azvt azvtVar = (azvt) g.get(i);
            Map.EL.putIfAbsent(hashMap, azvtVar.a(), aqvf.a(azvtVar.b(), azvtVar.a()));
        }
        Object obj2 = enhk.j(hashMap).get(this.b);
        obj2.getClass();
        return obj2;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new aqva(this.a, this.b, ffguVar);
    }
}
