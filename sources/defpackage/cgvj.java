package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgvj extends ffhr {
    int a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ cgvm d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgvj(cgvm cgvmVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = cgvmVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.o(null, 0, this);
    }
}
