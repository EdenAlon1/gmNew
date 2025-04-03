package defpackage;

import java.util.Deque;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class eocm extends enbj {
    final /* synthetic */ Deque a;
    final /* synthetic */ Deque b;
    final /* synthetic */ eocn c;

    public eocm(eocn eocnVar, Deque deque, Deque deque2) {
        this.a = deque;
        this.b = deque2;
        this.c = eocnVar;
    }

    @Override // defpackage.enbj
    protected final Object a() {
        eocn eocnVar = this.c;
        Deque deque = this.a;
        while (true) {
            Object a = eocnVar.a(deque);
            if (a == null) {
                if (!this.b.isEmpty()) {
                    return this.b.pop();
                }
                b();
                return null;
            }
            Iterator it = this.c.a.b(a).iterator();
            if (!it.hasNext()) {
                return a;
            }
            this.a.addFirst(it);
            this.b.push(a);
            eocnVar = this.c;
            deque = this.a;
        }
    }
}
