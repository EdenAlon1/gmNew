package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dit extends ffkk implements ffji {
    final /* synthetic */ float a;
    final /* synthetic */ ffmf b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dit(float f, ffmf ffmfVar) {
        super(1);
        this.a = f;
        this.b = ffmfVar;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jkr.p((jkv) obj, new jji(((Number) ffmk.s(Float.valueOf(this.a), this.b)).floatValue(), this.b));
        return ffcu.a;
    }
}
