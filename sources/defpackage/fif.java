package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fif extends ffkk implements ffix {
    final /* synthetic */ fig a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fif(fig figVar) {
        super(0);
        this.a = figVar;
    }

    @Override // defpackage.ffix
    public final Object invoke() {
        Object c = this.a.c();
        if (c != null) {
            return c;
        }
        fig figVar = this.a;
        float a = figVar.a();
        if (Float.isNaN(a)) {
            return figVar.b();
        }
        Object b = figVar.b();
        figVar.d();
        float floatValue = ((Number) figVar.a.invoke()).floatValue();
        if (a == Float.NaN || Float.isNaN(Float.NaN)) {
            return b;
        }
        if (a > Float.NaN) {
            if (floatValue <= 0.0f) {
                throw null;
            }
            throw null;
        }
        if ((-floatValue) >= 0.0f) {
            throw null;
        }
        throw null;
    }
}
