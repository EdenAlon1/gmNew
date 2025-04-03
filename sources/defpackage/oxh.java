package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class oxh implements oxp {
    private final String a;
    private final Object[] b;

    public oxh(String str, Object[] objArr) {
        this.a = str;
        this.b = objArr;
    }

    @Override // defpackage.oxp
    public final String b() {
        return this.a;
    }

    @Override // defpackage.oxp
    public final void h(oxo oxoVar) {
        oxg.a(oxoVar, this.b);
    }

    public oxh(String str) {
        this(str, null);
    }
}
