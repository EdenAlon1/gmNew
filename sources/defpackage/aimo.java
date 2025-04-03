package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aimo extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ aimp b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aimo(aimp aimpVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = aimpVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
