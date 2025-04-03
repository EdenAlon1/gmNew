package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gqk extends ffkk implements ffji {
    final /* synthetic */ List a;
    final /* synthetic */ irg b;
    final /* synthetic */ ffjm c;
    final /* synthetic */ ffkz d;
    final /* synthetic */ long e;
    final /* synthetic */ int f;
    final /* synthetic */ ffjn g;
    final /* synthetic */ List h;
    final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqk(List list, irg irgVar, ffjm ffjmVar, ffkz ffkzVar, long j, int i, ffjn ffjnVar, List list2, int i2) {
        super(1);
        this.a = list;
        this.b = irgVar;
        this.c = ffjmVar;
        this.d = ffkzVar;
        this.e = j;
        this.f = i;
        this.g = ffjnVar;
        this.h = list2;
        this.i = i2;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        iqj iqjVar = (iqj) obj;
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            iqj.m(iqjVar, (iqk) list.get(i), this.d.a * i, 0);
        }
        List a = this.b.a(gqp.b, this.c);
        long j = this.e;
        int i2 = this.f;
        int size2 = a.size();
        for (int i3 = 0; i3 < size2; i3++) {
            iqk e = ((ipl) a.get(i3)).e(jzk.m(j, 0, 0, 0, 0, 11));
            iqj.m(iqjVar, e, 0, i2 - e.b);
        }
        List a2 = this.b.a(gqp.c, new hpw(1621992604, true, new gqj(this.g, this.h)));
        int i4 = this.i;
        int i5 = this.f;
        int size3 = a2.size();
        for (int i6 = 0; i6 < size3; i6++) {
            iqj.m(iqjVar, ((ipl) a2.get(i6)).e(jzj.c(i4, i5)), 0, 0);
        }
        return ffcu.a;
    }
}
