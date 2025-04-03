package defpackage;

/* loaded from: classes4.dex */
public final class dthc extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ dthd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dthc(dthd dthdVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = dthdVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}
