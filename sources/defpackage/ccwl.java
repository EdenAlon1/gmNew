package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class ccwl extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ ccwm b;
    int c;
    eswr d;
    ccvl e;
    ccwm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ccwl(ccwm ccwmVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ccwmVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        Object c = this.b.c(null, null, null, this);
        return c == ffhh.a ? c : new ffch(c);
    }
}
