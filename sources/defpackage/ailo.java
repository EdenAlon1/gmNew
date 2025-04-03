package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ailo extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ ailp b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ailo(ailp ailpVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ailpVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(this);
    }
}
