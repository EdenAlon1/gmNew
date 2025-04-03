package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class lbl extends ffhr {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ lcc c;
    int d;
    lcc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lbl(lcc lccVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = lccVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.h(this);
    }
}
