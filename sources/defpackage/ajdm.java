package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ajdm extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ ajee b;
    int c;
    ajee d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajdm(ajee ajeeVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = ajeeVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(false, false, false, this);
    }
}
