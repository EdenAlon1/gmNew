package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eapf extends ffhr {
    boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ eapm c;
    int d;
    eapm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eapf(eapm eapmVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = eapmVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.g(null, null, null, false, this);
    }
}
