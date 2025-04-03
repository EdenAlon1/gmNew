package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class bzip extends ffhr {
    Object a;
    boolean b;
    /* synthetic */ Object c;
    final /* synthetic */ bzid d;
    int e;
    int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzip(bzid bzidVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = bzidVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.j(false, 0, this);
    }
}
