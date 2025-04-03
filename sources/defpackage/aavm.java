package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aavm extends ffhr {
    /* synthetic */ Object a;
    final /* synthetic */ aavn b;
    int c;
    String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aavm(aavn aavnVar, ffgu ffguVar) {
        super(ffguVar);
        this.b = aavnVar;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(null, this);
    }
}
