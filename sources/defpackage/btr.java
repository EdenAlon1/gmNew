package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class btr implements bfk {
    final /* synthetic */ btz a;

    public btr(btz btzVar) {
        this.a = btzVar;
    }

    @Override // defpackage.bfk
    public final void a(Throwable th) {
        avw.g("VideoCapture", "Receive onError from StreamState observer", th);
    }

    @Override // defpackage.bfk
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        btf btfVar = (btf) obj;
        if (btfVar == null) {
            throw new IllegalArgumentException("StreamInfo can't be null");
        }
        if (this.a.g == 3) {
            return;
        }
        avw.a("VideoCapture", "Stream info update: old: " + this.a.b + " new: " + btfVar);
        btz btzVar = this.a;
        btf btfVar2 = btzVar.b;
        btzVar.b = btfVar;
        bgr bgrVar = btzVar.l;
        ksw.h(bgrVar);
        int a = btfVar2.a();
        int a2 = btfVar.a();
        if ((!btf.b.contains(Integer.valueOf(a)) && !btf.b.contains(Integer.valueOf(a2)) && a != a2) || (this.a.f && btfVar2.b() != null && btfVar.b() == null)) {
            this.a.h();
            return;
        }
        if ((btfVar2.a() != -1 && btfVar.a() == -1) || (btfVar2.a() == -1 && btfVar.a() != -1)) {
            btz btzVar2 = this.a;
            btzVar2.b(btzVar2.c, btfVar, bgrVar);
            btz btzVar3 = this.a;
            btzVar3.Q(btq.a(new Object[]{btzVar3.c.b()}));
            this.a.L();
            return;
        }
        if (btfVar2.c() != btfVar.c()) {
            btz btzVar4 = this.a;
            btzVar4.b(btzVar4.c, btfVar, bgrVar);
            btz btzVar5 = this.a;
            btzVar5.Q(btq.a(new Object[]{btzVar5.c.b()}));
            btz btzVar6 = this.a;
            Iterator it = btzVar6.j.iterator();
            while (it.hasNext()) {
                ((axu) it.next()).x(btzVar6);
            }
        }
    }
}
