package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dolj implements ffjm {
    final /* synthetic */ String a;
    final /* synthetic */ String b;
    final /* synthetic */ String c;
    final /* synthetic */ float d;
    final /* synthetic */ hvi e;
    final /* synthetic */ long f;
    final /* synthetic */ jpo g;
    final /* synthetic */ jpi h;
    final /* synthetic */ jpg i;
    final /* synthetic */ float j;
    final /* synthetic */ float k;
    final /* synthetic */ List l;
    final /* synthetic */ boolean m;
    final /* synthetic */ ffjm n;
    final /* synthetic */ hus o;

    public dolj(String str, String str2, String str3, float f, hvi hviVar, long j, jpo jpoVar, jpi jpiVar, jpg jpgVar, float f2, float f3, hus husVar, List list, boolean z, ffjm ffjmVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = f;
        this.e = hviVar;
        this.f = j;
        this.g = jpoVar;
        this.h = jpiVar;
        this.i = jpgVar;
        this.j = f2;
        this.k = f3;
        this.o = husVar;
        this.l = list;
        this.m = z;
        this.n = ffjmVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        hfd hfdVar = (hfd) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && hfdVar.I()) {
            hfdVar.s();
        } else {
            dolo.f(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.o, this.l, this.m, this.n, hfdVar, 1073741824, 0);
        }
        return ffcu.a;
    }
}
