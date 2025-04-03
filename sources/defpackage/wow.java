package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wow extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ wpe b;
    int c;
    wpe d;
    fbup e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wow(wpe wpeVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = wpeVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
