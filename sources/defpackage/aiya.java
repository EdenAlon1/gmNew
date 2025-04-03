package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aiya extends ffhr {
    Object a;
    Object b;
    boolean c;
    /* synthetic */ Object d;
    final /* synthetic */ aiyb e;
    int f;
    aiyb g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiya(aiyb aiybVar, ffgu ffguVar) {
        super(ffguVar);
        this.e = aiybVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, false, this);
    }
}
