package defpackage;

/* loaded from: classes5.dex */
public final class ejsi extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ ejsj c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ejsi(ejsj ejsjVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = ejsjVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}
