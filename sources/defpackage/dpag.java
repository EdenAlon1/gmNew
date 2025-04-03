package defpackage;

import java.util.Iterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dpag implements ffix {
    final /* synthetic */ enip a;

    public dpag(enip enipVar) {
        this.a = enipVar;
    }

    @Override // defpackage.ffix
    public final /* synthetic */ Object invoke() {
        enip enipVar = this.a;
        Set set = ffen.a;
        Iterator<E> it = enipVar.iterator();
        while (it.hasNext()) {
            set = fffi.g(set, ((dpab) it.next()).i);
        }
        return new dpac(dpai.b(set));
    }
}
