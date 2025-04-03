package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxqs implements fbba {
    private final fbbf a;
    private final fbbf b;
    private final fbbf c;
    private final fbbf d;
    private final fbbf e;
    private final fbbf f;

    public dxqs(fbbf fbbfVar, fbbf fbbfVar2, fbbf fbbfVar3, fbbf fbbfVar4, fbbf fbbfVar5, fbbf fbbfVar6) {
        this.a = fbbfVar;
        this.b = fbbfVar2;
        this.c = fbbfVar3;
        this.d = fbbfVar4;
        this.e = fbbfVar5;
        this.f = fbbfVar6;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        ((dxqe) this.a).b();
        dxbv dxbvVar = (dxbv) this.b.b();
        dwxf dwxfVar = (dwxf) this.c.b();
        effy effyVar = (effy) this.d.b();
        Executor executor = (Executor) this.e.b();
        return new dxnf(dxbvVar, dwxfVar, effyVar, executor);
    }
}
