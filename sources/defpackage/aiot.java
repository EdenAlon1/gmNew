package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aiot extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ aiow b;
    int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiot(aiow aiowVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = aiowVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.b(this);
    }
}
