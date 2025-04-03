package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aihb extends ffhr {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ aihf d;
    int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aihb(aihf aihfVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = aihfVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.c(null, this);
    }
}
