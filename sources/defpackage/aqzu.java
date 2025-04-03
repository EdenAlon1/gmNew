package defpackage;

import android.telephony.SmsMessage;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aqzu implements arae {
    private final fazb a;
    private final fazb b;
    private final boolean c;
    private final araf d;

    public aqzu(fazb fazbVar, fazb fazbVar2, alxi alxiVar, boolean z, araf arafVar) {
        this.a = fazbVar;
        this.b = fazbVar2;
        this.c = z;
        if (alxiVar == alxi.GROUP) {
            arafVar.h();
        } else {
            arafVar.i();
        }
        this.d = arafVar;
    }

    @Override // defpackage.arae
    public final arad a(String str) {
        araf arafVar = this.d;
        aqzs c = c(str);
        c.g(arafVar.c());
        c.j(arac.SMS);
        return c.i();
    }

    @Override // defpackage.arae
    public final araf b() {
        return this.d;
    }

    @Deprecated
    public final aqzs c(String str) {
        int a;
        efbd.b();
        boolean b = ((cpaz) this.a.b()).b(str);
        int[] iArr = {0, 0, 0, 0};
        try {
            iArr = SmsMessage.calculateLength(str, this.d.j() && b);
        } catch (ArrayIndexOutOfBoundsException | NullPointerException unused) {
        }
        aqzq aqzqVar = new aqzq();
        aqzqVar.h(arac.SMS);
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        aqzqVar.d(i);
        aqzqVar.c(i2);
        aqzqVar.b(i3);
        araf arafVar = this.d;
        boolean z = this.c;
        int e = arafVar.e();
        int f = arafVar.f();
        if (z) {
            emxf.l(true);
            aqzqVar.e(TextUtils.isEmpty(this.d.g()) || ((a = this.d.a()) >= 0 && i > a) || i > e);
        } else {
            aqzqVar.e(i > e);
        }
        aqzqVar.f(e);
        if (f > 0) {
            if (i3 + i2 < 140) {
                f >>= 1;
            }
            if (i2 > f) {
                aqzqVar.e(true);
            }
        }
        return aqzqVar;
    }
}
