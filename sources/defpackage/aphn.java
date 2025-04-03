package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aphn implements arae {
    public final int a;
    private final ausa b;

    public aphn(ausa ausaVar, int i) {
        this.b = ausaVar;
        this.a = i;
    }

    @Override // defpackage.arae
    public final arad a(String str) {
        int i;
        int length;
        efbd.b();
        int i2 = (str == null || str.length() == 0) ? 0 : 1;
        if (str != null) {
            i = str.length();
        } else {
            str = null;
            i = 0;
        }
        int i3 = this.a;
        boolean a = this.b.a();
        if (str == null) {
            str = "";
        }
        if (a) {
            length = str.length();
        } else {
            byte[] bytes = str.getBytes(ffoo.a);
            bytes.getClass();
            length = bytes.length;
        }
        int i4 = i3 - length;
        aqzq aqzqVar = new aqzq();
        aqzqVar.d(i2);
        aqzqVar.c(i);
        aqzqVar.b(i4);
        aqzqVar.f(1);
        aqzqVar.e(false);
        aqzqVar.g(0);
        aqzqVar.h(arac.SATELLITE);
        aqzqVar.j(arac.SATELLITE);
        return aqzqVar.i();
    }

    @Override // defpackage.arae
    public final araf b() {
        return new aphm(this);
    }
}
