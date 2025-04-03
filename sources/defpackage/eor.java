package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class eor extends ffkk implements ffix {
    final /* synthetic */ eot a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eor(eot eotVar) {
        super(0);
        this.a = eotVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        return Integer.valueOf(this.a.i() ? this.a.B.c() : this.a.j());
    }
}
