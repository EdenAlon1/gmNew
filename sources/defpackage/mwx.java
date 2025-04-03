package defpackage;

import androidx.car.app.model.Alert;

/* compiled from: PG */
/* loaded from: classes.dex */
final class mwx extends mwz implements Comparable {
    private final int e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final int i;
    private final int j;
    private final int k;
    private final int l;
    private final boolean m;

    /* JADX WARN: Multi-variable type inference failed */
    public mwx(int i, lrv lrvVar, int i2, mws mwsVar, int i3, String str, String str2) {
        super(i, lrvVar, i2);
        int i4;
        int i5;
        int i6 = 0;
        this.f = mih.g(i3, false);
        int i7 = this.d.e & (~mwsVar.y);
        this.g = 1 == (i7 & 1);
        this.h = (i7 & 2) != 0;
        engw r = str2 != null ? engw.r(str2) : mwsVar.v.isEmpty() ? engw.r("") : mwsVar.v;
        int i8 = 0;
        while (true) {
            if (i8 >= ((enou) r).c) {
                i8 = Alert.DURATION_SHOW_INDEFINITELY;
                i4 = 0;
                break;
            }
            lqc lqcVar = this.d;
            String str3 = (String) r.get(i8);
            boolean z = mwsVar.z;
            i4 = mxd.a(lqcVar, str3, false);
            if (i4 > 0) {
                break;
            } else {
                i8++;
            }
        }
        this.i = i8;
        this.j = i4;
        if (str2 != null) {
            i5 = 1088;
        } else {
            int i9 = mwsVar.w;
            i5 = 0;
        }
        int b = mxd.b(this.d.f, i5);
        this.k = b;
        this.m = (1088 & this.d.f) != 0;
        int a = mxd.a(this.d, str, mxd.f(str) == null);
        this.l = a;
        boolean z2 = i4 > 0 || (mwsVar.v.isEmpty() && b > 0) || this.g || (this.h && a > 0);
        if (mih.g(i3, mwsVar.R) && z2) {
            i6 = 1;
        }
        this.e = i6;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(mwx mwxVar) {
        enem b = enem.b.e(this.f, mwxVar.f).d(Integer.valueOf(this.i), Integer.valueOf(mwxVar.i), enpf.a).b(this.j, mwxVar.j).b(this.k, mwxVar.k).e(this.g, mwxVar.g).d(Boolean.valueOf(this.h), Boolean.valueOf(mwxVar.h), this.j == 0 ? enoe.a : enpf.a).b(this.l, mwxVar.l);
        if (this.k == 0) {
            b = b.f(this.m, mwxVar.m);
        }
        return b.a();
    }

    @Override // defpackage.mwz
    public final int b() {
        return this.e;
    }

    @Override // defpackage.mwz
    public final /* bridge */ /* synthetic */ boolean c(mwz mwzVar) {
        return false;
    }
}
