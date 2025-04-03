package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzis extends ffhr {
    boolean a;
    /* synthetic */ Object b;
    final /* synthetic */ bzid c;
    int d;
    bzid e;
    String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzis(bzid bzidVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = bzidVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.k(0, null, false, this);
    }
}
