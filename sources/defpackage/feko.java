package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class feko extends fekk {
    final /* synthetic */ fela a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public feko(felb felbVar, fela felaVar) {
        super(felbVar.a);
        this.a = felaVar;
    }

    @Override // defpackage.fekk
    public final void a() {
        List list;
        List arrayList = new ArrayList();
        while (true) {
            fela felaVar = this.a;
            synchronized (felaVar) {
                if (felaVar.c.isEmpty()) {
                    felaVar.c = null;
                    felaVar.b = true;
                    return;
                } else {
                    list = felaVar.c;
                    felaVar.c = arrayList;
                }
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            list.clear();
            arrayList = list;
        }
    }
}
