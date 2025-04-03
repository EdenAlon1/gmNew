package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jit extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ jiu b;
    int c;
    jiu d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jit(jiu jiuVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = jiuVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(0.0f, this);
    }
}
