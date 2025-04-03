package defpackage;

import android.util.Size;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
final class alu extends ffkk implements ffix {
    final /* synthetic */ alw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public alu(alw alwVar) {
        super(0);
        this.a = alwVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        List list = (List) this.a.b.a();
        if (true == list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return null;
        }
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            int a = blz.a((Size) next);
            while (true) {
                Object next2 = it.next();
                int a2 = blz.a((Size) next2);
                int i = a < a2 ? a2 : a;
                if (a < a2) {
                    next = next2;
                }
                if (!it.hasNext()) {
                    break;
                }
                a = i;
            }
        }
        return (Size) next;
    }
}
