package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emcs implements xl {
    public final Handler b;
    public final emcp c;
    public String e;
    private final emcv f;
    public final Runnable a = new Runnable() { // from class: emcq
        @Override // java.lang.Runnable
        public final void run() {
            emcs.this.c();
        }
    };
    public volatile emct d = null;
    private final int g = 500;

    public emcs(emcu emcuVar) {
        this.c = new emcp(emcuVar);
        Handler handler = new Handler(Looper.getMainLooper());
        this.b = handler;
        this.f = new emcv(handler);
    }

    @Override // defpackage.xl
    public final boolean a(String str) {
        this.b.removeCallbacks(this.a);
        this.e = str;
        c();
        return true;
    }

    @Override // defpackage.xl
    public final void b(String str) {
        this.e = str;
        this.b.removeCallbacks(this.a);
        this.b.postDelayed(this.a, this.g);
    }

    public final void c() {
        String str = this.e;
        fbel fbelVar = (fbel) fbem.a.createBuilder();
        fbelVar.copyOnWrite();
        ((fbem) fbelVar.instance).d = 7;
        fbelVar.copyOnWrite();
        ((fbem) fbelVar.instance).b = 0;
        fbelVar.copyOnWrite();
        ((fbem) fbelVar.instance).e = fgth.a(4);
        fbelVar.copyOnWrite();
        ((fbem) fbelVar.instance).c = 0;
        fbeb fbebVar = (fbeb) fbec.a.createBuilder();
        String str2 = true != TextUtils.isEmpty(str) ? str : "hello";
        fbebVar.copyOnWrite();
        fbec fbecVar = (fbec) fbebVar.instance;
        str2.getClass();
        fbecVar.c = str2;
        fbebVar.copyOnWrite();
        ((fbec) fbebVar.instance).d = 20;
        fbebVar.copyOnWrite();
        fbec fbecVar2 = (fbec) fbebVar.instance;
        fbem fbemVar = (fbem) fbelVar.build();
        fbemVar.getClass();
        fbecVar2.i = fbemVar;
        fbecVar2.b |= 32;
        emcp emcpVar = this.c;
        fbei fbeiVar = emcpVar.b;
        if (fbeiVar != null) {
            fbebVar.copyOnWrite();
            fbec fbecVar3 = (fbec) fbebVar.instance;
            fbecVar3.e = fbeiVar;
            fbecVar3.b |= 2;
        }
        if (emcpVar.c != 0) {
            fbej fbejVar = (fbej) fbek.a.createBuilder();
            int i = emcpVar.c;
            fbejVar.copyOnWrite();
            ((fbek) fbejVar.instance).b = i;
            fbebVar.copyOnWrite();
            fbec fbecVar4 = (fbec) fbebVar.instance;
            fbek fbekVar = (fbek) fbejVar.build();
            fbekVar.getClass();
            fbecVar4.g = fbekVar;
            fbecVar4.b |= 8;
        }
        fbei fbeiVar2 = emcpVar.d;
        if (fbeiVar2 != null) {
            fbebVar.copyOnWrite();
            fbec fbecVar5 = (fbec) fbebVar.instance;
            fbecVar5.f = fbeiVar2;
            fbecVar5.b |= 4;
        }
        if (emcpVar.e != 0) {
            fbej fbejVar2 = (fbej) fbek.a.createBuilder();
            int i2 = emcpVar.e;
            fbejVar2.copyOnWrite();
            ((fbek) fbejVar2.instance).b = i2;
            fbebVar.copyOnWrite();
            fbec fbecVar6 = (fbec) fbebVar.instance;
            fbek fbekVar2 = (fbek) fbejVar2.build();
            fbekVar2.getClass();
            fbecVar6.h = fbekVar2;
            fbecVar6.b |= 16;
        }
        erqt.r(emcpVar.a.a((fbec) fbebVar.build()), new emcr(this, str), this.f);
    }
}
