package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ovf implements oxp {
    final /* synthetic */ ovg a;

    public ovf(ovg ovgVar) {
        this.a = ovgVar;
    }

    @Override // defpackage.oxp
    public final String b() {
        return this.a.g;
    }

    @Override // defpackage.oxp
    public final void h(oxo oxoVar) {
        int length = this.a.a.length;
        for (int i = 1; i < length; i++) {
            ovg ovgVar = this.a;
            int i2 = ovgVar.a[i];
            if (i2 == 1) {
                oxoVar.e(i, ovgVar.b[i]);
            } else if (i2 == 2) {
                oxoVar.d(i, ovgVar.c[i]);
            } else if (i2 == 3) {
                String str = ovgVar.d[i];
                str.getClass();
                oxoVar.g(i, str);
            } else if (i2 == 4) {
                byte[] bArr = ovgVar.e[i];
                bArr.getClass();
                oxoVar.c(i, bArr);
            } else if (i2 == 5) {
                oxoVar.f(i);
            }
        }
    }
}
