package defpackage;

import android.content.Context;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ljc extends ffkk implements ffji {
    final /* synthetic */ fr a;
    final /* synthetic */ ljf b;
    final /* synthetic */ Context c;
    final /* synthetic */ Class d;
    final /* synthetic */ hkx e;
    final /* synthetic */ ljg f;
    final /* synthetic */ Bundle g;
    final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ljc(fr frVar, ljf ljfVar, Context context, Class cls, hkx hkxVar, ljg ljgVar, Bundle bundle, int i) {
        super(1);
        this.a = frVar;
        this.b = ljfVar;
        this.c = context;
        this.d = cls;
        this.e = hkxVar;
        this.f = ljgVar;
        this.g = bundle;
        this.h = i;
    }

    @Override // defpackage.ffji
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ffkx ffkxVar = new ffkx();
        ea g = this.a.g(this.b.a().getId());
        if (g == null) {
            fr frVar = this.a;
            Context context = this.c;
            Class cls = this.d;
            em l = frVar.l();
            context.getClassLoader();
            g = l.b(cls.getName());
            ljg ljgVar = this.f;
            Bundle bundle = this.g;
            fr frVar2 = this.a;
            ljf ljfVar = this.b;
            int i = this.h;
            g.aw((dz) ljgVar.a.a());
            g.at(bundle);
            cg cgVar = new cg(frVar2);
            cgVar.B();
            cgVar.D(ljfVar.a(), g, String.valueOf(i));
            if (frVar2.ai()) {
                ffkxVar.a = true;
                g.P().c(new lja(ffkxVar, g));
                cgVar.d();
            } else {
                cgVar.c();
            }
        }
        this.a.R(this.b.a());
        ffji ffjiVar = (ffji) this.e.a();
        g.getClass();
        ffjiVar.invoke(g);
        return new ljb(this.a, g, this.f, ffkxVar);
    }
}
