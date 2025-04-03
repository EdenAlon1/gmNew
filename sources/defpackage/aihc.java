package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aihc extends ffhr {
    Object a;
    /* synthetic */ Object b;
    final /* synthetic */ aihd c;
    int d;
    aihd e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aihc(aihd aihdVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = aihdVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}
