package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cwdk extends ffhv implements ffji {
    int a;
    final /* synthetic */ cwdp b;
    final /* synthetic */ List c;
    final /* synthetic */ aqux d;
    final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwdk(cwdp cwdpVar, List list, aqux aquxVar, String str, ffgu ffguVar) {
        super(1, ffguVar);
        this.b = cwdpVar;
        this.c = list;
        this.d = aquxVar;
        this.e = str;
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            cwdp cwdpVar = this.b;
            List list = this.c;
            aqux aquxVar = this.d;
            String str = this.e;
            this.a = 1;
            ((ecrj) cwdpVar.d.b()).e(alrv.t);
            ((ecrj) cwdpVar.d.b()).e(csra.m);
            Object a = ffra.a(ekxi.a(cwdpVar.b), new cwdl(null, list, cwdpVar, aquxVar, str), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ffcu.a;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new cwdk(this.b, this.c, this.d, this.e, (ffgu) obj).b(ffcu.a);
    }
}
