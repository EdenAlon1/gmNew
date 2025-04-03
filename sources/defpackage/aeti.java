package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aeti extends ffhr {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ aetk d;
    int e;
    aetk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeti(aetk aetkVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = aetkVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, 0, this);
    }
}
