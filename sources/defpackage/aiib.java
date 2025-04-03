package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aiib extends ffhr {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ aiic c;
    int d;
    aiic e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiib(aiic aiicVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = aiicVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.a(0, null, null, this);
    }
}
