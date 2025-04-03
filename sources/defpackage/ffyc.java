package defpackage;

/* loaded from: classes6.dex */
public final class ffyc extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ ffyd c;
    Object d;
    Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffyc(ffyd ffydVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = ffydVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
