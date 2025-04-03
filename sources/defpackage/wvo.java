package defpackage;

/* loaded from: classes2.dex */
public final class wvo extends ffhr {
    /* synthetic */ Object a;
    int b;
    Object c;
    final /* synthetic */ wvp d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wvo(wvp wvpVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = wvpVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.d.fQ(null, this);
    }
}
