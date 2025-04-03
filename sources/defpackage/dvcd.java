package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dvcd extends ffhr {
    long a;
    /* synthetic */ Object b;
    final /* synthetic */ dvci c;
    int d;
    dvci e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dvcd(dvci dvciVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = dvciVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.b(0L, null, this);
    }
}
