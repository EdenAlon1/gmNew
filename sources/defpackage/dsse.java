package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dsse implements ffjn {
    final /* synthetic */ ffmj a;
    final /* synthetic */ List b;

    public dsse(ffmj ffmjVar, List list) {
        this.a = ffmjVar;
        this.b = list;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        hfd hfdVar = (hfd) obj2;
        int intValue = ((Number) obj3).intValue();
        ((dys) obj).getClass();
        if ((intValue & 17) == 16 && hfdVar.I()) {
            hfdVar.s();
        } else {
            ffmj ffmjVar = this.a;
            int i = ffmjVar.a;
            int i2 = ffmjVar.b;
            if (i <= i2) {
                while (true) {
                    dssg.a((dsrv) this.b.get(i), hfdVar, 0);
                    if (i == i2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return ffcu.a;
    }
}
