package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aiio extends ffhr {
    Object a;
    int b;
    /* synthetic */ Object c;
    final /* synthetic */ aiip d;
    int e;
    aiip f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aiio(aiip aiipVar, ffgu ffguVar) {
        super(ffguVar);
        this.d = aiipVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.a(0, null, null, this);
    }
}
