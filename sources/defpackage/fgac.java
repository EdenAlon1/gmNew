package defpackage;

/* loaded from: classes6.dex */
public final class fgac extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ fgad c;
    fgaf d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fgac(fgad fgadVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = fgadVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.a(null, this);
    }
}
