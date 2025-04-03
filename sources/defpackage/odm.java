package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class odm extends ffhr {
    /* synthetic */ Object a;
    int b;
    final /* synthetic */ odn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public odm(odn odnVar, ffgu ffguVar) {
        super(ffguVar);
        this.c = odnVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.fQ(null, this);
    }
}
