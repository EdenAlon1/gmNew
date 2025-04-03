package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yfu implements yfj {
    public final Context a;
    public final ffsk b;
    public final alye c;
    public final abbb d;
    private final ydb e;
    private final fgdj f;

    public yfu(Context context, ffsk ffskVar, alye alyeVar, ydb ydbVar, abbb abbbVar) {
        context.getClass();
        ffskVar.getClass();
        alyeVar.getClass();
        ydbVar.getClass();
        this.a = context;
        this.b = ffskVar;
        this.c = alyeVar;
        this.e = ydbVar;
        this.d = abbbVar;
        ffxx a = ffyy.a(new yfp(ydbVar.a));
        yfm yfmVar = new yfm(null, this);
        int i = fgau.a;
        fgen fgenVar = new fgen(yfmVar, a);
        int i2 = fgcz.a;
        this.f = fgbn.b(fgenVar, ffskVar, fgcy.b, null);
    }

    @Override // defpackage.yfj
    public final fgdj a() {
        return this.f;
    }

    public final void b() {
        this.e.c(new ffji() { // from class: yfk
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                xhu xhuVar = (xhu) obj;
                xhuVar.getClass();
                return xhu.c(xhuVar, null, null, null, false, null, null, false, 0, 990);
            }
        });
    }
}
