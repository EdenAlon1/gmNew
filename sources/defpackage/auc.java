package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class auc {
    final List a;
    final List b;
    final List c;
    public long d;

    public auc(aud audVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.b = arrayList2;
        ArrayList arrayList3 = new ArrayList();
        this.c = arrayList3;
        this.d = 5000L;
        arrayList.addAll(audVar.a);
        arrayList2.addAll(audVar.b);
        arrayList3.addAll(audVar.c);
        this.d = audVar.d;
    }

    public final void a(awb awbVar, int i) {
        ksw.b(true, "Point cannot be null.");
        ksw.b(true, a.h(i, "Invalid metering mode "));
        if ((i & 1) != 0) {
            this.a.add(awbVar);
        }
        if ((i & 2) != 0) {
            this.b.add(awbVar);
        }
    }

    public final void b(int i) {
        if ((i & 1) != 0) {
            this.a.clear();
        }
        if ((i & 2) != 0) {
            this.b.clear();
        }
        if ((i & 4) != 0) {
            this.c.clear();
        }
    }

    public auc(awb awbVar) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = 5000L;
        a(awbVar, 1);
    }
}
