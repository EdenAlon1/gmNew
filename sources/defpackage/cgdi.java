package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cgdi extends ffhr {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ cgdm d;
    int e;
    cgdm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgdi(cgdm cgdmVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = cgdmVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.k(0, null, this);
    }
}
