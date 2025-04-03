package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class druj extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ drum b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public druj(drum drumVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = drumVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.a(0, 0, 0, null, this);
    }
}
