package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqi extends ffkk implements ffix {
    final /* synthetic */ ea a;
    final /* synthetic */ ffbz b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wqi(ea eaVar, ffbz ffbzVar) {
        super(0);
        this.a = eaVar;
        this.b = ffbzVar;
    }

    @Override // defpackage.ffix
    public final /* bridge */ /* synthetic */ Object invoke() {
        lms R;
        lmy a = lii.a(this.b);
        lkd lkdVar = a instanceof lkd ? (lkd) a : null;
        return (lkdVar == null || (R = lkdVar.R()) == null) ? this.a.R() : R;
    }
}
