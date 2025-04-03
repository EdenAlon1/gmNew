package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class eapg extends ffhr {
    Object a;
    Object b;
    /* synthetic */ Object c;
    final /* synthetic */ eapm d;
    int e;
    eapm f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eapg(eapm eapmVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = eapmVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.h(null, null, null, null, null, false, this);
    }
}
