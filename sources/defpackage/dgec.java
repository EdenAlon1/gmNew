package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class dgec {
    private static dgec b;
    public final String a;
    private final dgfg c;

    private dgec(Context context) {
        this.c = new dgfg(context);
        this.a = context.getPackageName();
    }

    public static synchronized dgec a(Context context) {
        dgec dgecVar;
        synchronized (dgec.class) {
            if (b == null) {
                b = new dgec(context);
            }
            dgecVar = b;
        }
        return dgecVar;
    }

    public final void b(faud faudVar) {
        faue faueVar = (faue) fauf.a.createBuilder();
        faueVar.copyOnWrite();
        ((fauf) faueVar.instance).c = 484;
        faueVar.copyOnWrite();
        fauf faufVar = (fauf) faueVar.instance;
        faudVar.getClass();
        faufVar.d = faudVar;
        faufVar.b |= 16777216;
        fauf faufVar2 = (fauf) faueVar.build();
        fgtt fgttVar = (fgtt) fgtu.a.createBuilder();
        fgttVar.copyOnWrite();
        fgtu fgtuVar = (fgtu) fgttVar.instance;
        faufVar2.getClass();
        fgtuVar.c = faufVar2;
        fgtuVar.b |= 1;
        this.c.a.i((fgtu) fgttVar.build()).c();
    }

    public final void c(boolean z) {
        fatm fatmVar = (fatm) faud.a.createBuilder();
        fatmVar.copyOnWrite();
        ((faud) fatmVar.instance).d = fgtd.a(true != z ? 15 : 16);
        fatmVar.copyOnWrite();
        faud faudVar = (faud) fatmVar.instance;
        String str = this.a;
        str.getClass();
        faudVar.e = str;
        fatmVar.copyOnWrite();
        ((faud) fatmVar.instance).f = fgtc.a(4);
        b((faud) fatmVar.build());
    }

    public final void d(faty fatyVar) {
        fatm fatmVar = (fatm) faud.a.createBuilder();
        fatmVar.copyOnWrite();
        ((faud) fatmVar.instance).d = fgtd.a(14);
        fatmVar.copyOnWrite();
        faud faudVar = (faud) fatmVar.instance;
        String str = this.a;
        str.getClass();
        faudVar.e = str;
        fatmVar.copyOnWrite();
        ((faud) fatmVar.instance).f = fgtc.a(4);
        fatmVar.copyOnWrite();
        faud faudVar2 = (faud) fatmVar.instance;
        fatyVar.getClass();
        faudVar2.c = fatyVar;
        faudVar2.b = 15;
        b((faud) fatmVar.build());
    }

    public final void e(int i, int i2) {
        fatm fatmVar = (fatm) faud.a.createBuilder();
        fatmVar.copyOnWrite();
        ((faud) fatmVar.instance).d = fgtd.a(i);
        fatmVar.copyOnWrite();
        faud faudVar = (faud) fatmVar.instance;
        String str = this.a;
        str.getClass();
        faudVar.e = str;
        fatmVar.copyOnWrite();
        ((faud) fatmVar.instance).f = fgtc.a(i2);
        b((faud) fatmVar.build());
    }

    public final void f(int i) {
        e(i, 5);
    }

    public final void g(int i, emxc emxcVar) {
        fatm fatmVar = (fatm) faud.a.createBuilder();
        fatmVar.copyOnWrite();
        ((faud) fatmVar.instance).d = fgtd.a(i);
        fatmVar.copyOnWrite();
        faud faudVar = (faud) fatmVar.instance;
        String str = this.a;
        str.getClass();
        faudVar.e = str;
        fatmVar.copyOnWrite();
        ((faud) fatmVar.instance).f = fgtc.a(3);
        if (emxcVar.g()) {
            String str2 = (String) emxcVar.c();
            fatmVar.copyOnWrite();
            ((faud) fatmVar.instance).g = str2;
        }
        b((faud) fatmVar.build());
    }

    public final void h(int i) {
        fatm fatmVar = (fatm) faud.a.createBuilder();
        fatmVar.copyOnWrite();
        ((faud) fatmVar.instance).d = fgtd.a(8);
        fatmVar.copyOnWrite();
        faud faudVar = (faud) fatmVar.instance;
        String str = this.a;
        str.getClass();
        faudVar.e = str;
        fatmVar.copyOnWrite();
        ((faud) fatmVar.instance).f = fgtc.a(4);
        fatk fatkVar = (fatk) fatl.a.createBuilder();
        fatkVar.copyOnWrite();
        ((fatl) fatkVar.instance).b = i - 2;
        fatmVar.copyOnWrite();
        faud faudVar2 = (faud) fatmVar.instance;
        fatl fatlVar = (fatl) fatkVar.build();
        fatlVar.getClass();
        faudVar2.c = fatlVar;
        faudVar2.b = 7;
        b((faud) fatmVar.build());
    }

    public final void i(int i) {
        fatm fatmVar = (fatm) faud.a.createBuilder();
        fatmVar.copyOnWrite();
        ((faud) fatmVar.instance).d = fgtd.a(7);
        fatmVar.copyOnWrite();
        faud faudVar = (faud) fatmVar.instance;
        String str = this.a;
        str.getClass();
        faudVar.e = str;
        fatmVar.copyOnWrite();
        ((faud) fatmVar.instance).f = fgtc.a(4);
        faub faubVar = (faub) fauc.a.createBuilder();
        faubVar.copyOnWrite();
        ((fauc) faubVar.instance).b = i - 2;
        fatmVar.copyOnWrite();
        faud faudVar2 = (faud) fatmVar.instance;
        fauc faucVar = (fauc) faubVar.build();
        faucVar.getClass();
        faudVar2.c = faucVar;
        faudVar2.b = 6;
        b((faud) fatmVar.build());
    }
}
