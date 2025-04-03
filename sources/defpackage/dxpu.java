package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxpu implements fbba {
    private final fbbf a;
    private final fbbf b;
    private final fbbf c;
    private final fbbf d;
    private final fbbf e;

    public dxpu(fbbf fbbfVar, fbbf fbbfVar2, fbbf fbbfVar3, fbbf fbbfVar4, fbbf fbbfVar5) {
        this.a = fbbfVar;
        this.b = fbbfVar2;
        this.c = fbbfVar3;
        this.d = fbbfVar4;
        this.e = fbbfVar5;
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final dxpt b() {
        return new dxpt(((dxqe) this.a).b(), (dxbv) this.b.b(), (dwxf) this.c.b(), (emxc) this.d.b(), (Executor) this.e.b());
    }
}
