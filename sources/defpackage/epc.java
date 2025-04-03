package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class epc extends ffhr {
    int a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ epe d;
    int e;
    iam f;
    Object[] g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public epc(epe epeVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = epeVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(null, this);
    }
}
