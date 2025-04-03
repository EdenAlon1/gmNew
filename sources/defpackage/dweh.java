package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dweh {
    public final CopyOnWriteArrayList a;
    public final cpn b;
    public int c;
    public long d;
    public boolean e;
    public boolean f;
    public final dwea g;
    private final dwei h;

    public dweh(dwee... dweeVarArr) {
        dwef dwefVar = new dwef(this);
        this.h = dwefVar;
        this.g = new dweg(this);
        this.a = new CopyOnWriteArrayList(dweeVarArr);
        cpn cpnVar = new cpn(1);
        this.b = cpnVar;
        this.c = 1;
        dweeVarArr[0].d(dwefVar);
        cpnVar.put(dweeVarArr[0], true);
    }

    public final void a() {
        if (this.f || !this.e || this.c == 0) {
            return;
        }
        this.f = true;
        dwec.c().a(this.g);
    }
}
