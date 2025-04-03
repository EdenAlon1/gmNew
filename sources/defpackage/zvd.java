package defpackage;

/* loaded from: classes2.dex */
public final class zvd extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ zve c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvd(zve zveVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = zveVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}
