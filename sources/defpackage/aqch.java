package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class aqch extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ aqci c;
    int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqch(aqci aqciVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = aqciVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(null, null, false, this);
    }
}
