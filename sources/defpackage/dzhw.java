package defpackage;

import android.util.Pair;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dzhw implements dzht {
    private final ConcurrentHashMap a;
    private final ConcurrentHashMap b;
    private final ecdc c;

    public dzhw(ecdc ecdcVar) {
        new ConcurrentHashMap();
        this.a = new ConcurrentHashMap();
        this.b = new ConcurrentHashMap();
        this.c = ecdcVar;
    }

    private final void a(String str, String str2, ecrh ecrhVar) {
        ConcurrentHashMap concurrentHashMap = this.a;
        Pair create = Pair.create(str, str2);
        ecri ecriVar = (ecri) concurrentHashMap.get(create);
        if (ecriVar == null || !this.a.remove(create, ecriVar)) {
            return;
        }
        ecda ecdaVar = new ecda(str);
        ecdc ecdcVar = this.c;
        ecdcVar.a.i(ecriVar, ecdaVar, (fgmh) this.b.get(str2), ecrhVar);
    }

    @Override // defpackage.dzht
    public final void b(String str, dzqs dzqsVar) {
        a(str, dzqsVar.r(), ecrh.CANCEL);
        ecri c = this.c.c();
        this.a.putIfAbsent(Pair.create(str, dzqsVar.r()), c);
        this.b.putIfAbsent(dzqsVar.r(), dzhu.a(dzqsVar));
    }

    @Override // defpackage.dzht
    public final void c(String str, String str2) {
        a(str, str2, null);
    }
}
