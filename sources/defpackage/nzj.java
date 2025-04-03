package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nzj {
    public static final ffnl a(nzl nzlVar) {
        return ffno.e(nzlVar, nzi.a);
    }

    public static final nzh b(nzl nzlVar) {
        nzlVar.getClass();
        Iterator a = a(nzlVar).a();
        if (!a.hasNext()) {
            throw new NoSuchElementException("Sequence is empty.");
        }
        Object next = a.next();
        while (a.hasNext()) {
            next = a.next();
        }
        return (nzh) next;
    }
}
