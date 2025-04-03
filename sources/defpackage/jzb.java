package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class jzb extends ffkk implements ffix {
    final /* synthetic */ Object[] a;
    final /* synthetic */ hjz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jzb(hjz hjzVar, Object[] objArr) {
        super(0);
        this.b = hjzVar;
        this.a = objArr;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        this.b.i((this.b.c() + 1) % this.a.length);
        return ffcu.a;
    }
}
