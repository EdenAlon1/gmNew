package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.concurrent.Callable;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class dijp {
    public final eplu a;
    private final dkpp b;
    private final djix c;
    private final errl d;
    private final dijt e;

    public dijp(djix djixVar, dkpp dkppVar, eplu epluVar, errl errlVar, dijt dijtVar) {
        this.b = dkppVar;
        this.c = djixVar;
        this.a = epluVar;
        this.d = errlVar;
        this.e = dijtVar;
    }

    public final epls K(Context context) {
        eyrc eyrcVar;
        eysq eysqVar = null;
        if (context == null) {
            dkty.q("Unable to create CarrierServices clearcut event. Context is null!", new Object[0]);
            return null;
        }
        if (this.e.e(this.b.k())) {
            return null;
        }
        epls eplsVar = (epls) eplx.a.createBuilder();
        int i = true != "com.google.android.apps.messaging".equals(context.getPackageName()) ? 3 : 2;
        eplsVar.copyOnWrite();
        eplx eplxVar = (eplx) eplsVar.instance;
        eplxVar.k = i - 1;
        eplxVar.b |= 256;
        eplu epluVar = this.a;
        eplsVar.copyOnWrite();
        eplx eplxVar2 = (eplx) eplsVar.instance;
        eplxVar2.j = epluVar.e;
        eplxVar2.b |= 128;
        djix djixVar = this.c;
        String b = djixVar.b();
        String d = djixVar.d();
        String c = djixVar.c();
        eyrb eyrbVar = (eyrb) eyrc.a.createBuilder();
        boolean f = this.c.f();
        eyrbVar.copyOnWrite();
        eyrc eyrcVar2 = (eyrc) eyrbVar.instance;
        eyrcVar2.b |= 16;
        eyrcVar2.g = f;
        if (this.c.a() == 0 && b == null && d == null && c == null) {
            eyrcVar = (!((Boolean) dizg.o().a.G.a()).booleanValue() || dizg.o().L()) ? null : (eyrc) eyrbVar.build();
        } else {
            if (this.c.a() >= 0) {
                int a = this.c.a();
                eyrbVar.copyOnWrite();
                eyrc eyrcVar3 = (eyrc) eyrbVar.instance;
                eyrcVar3.b |= 4;
                eyrcVar3.e = a;
            }
            if (b != null) {
                eyrbVar.copyOnWrite();
                eyrc eyrcVar4 = (eyrc) eyrbVar.instance;
                eyrcVar4.b |= 1;
                eyrcVar4.c = b;
            }
            if (d != null) {
                eyrbVar.copyOnWrite();
                eyrc eyrcVar5 = (eyrc) eyrbVar.instance;
                eyrcVar5.b |= 2;
                eyrcVar5.d = d;
            }
            if (c != null) {
                eyrbVar.copyOnWrite();
                eyrc eyrcVar6 = (eyrc) eyrbVar.instance;
                eyrcVar6.b |= 8;
                eyrcVar6.f = c;
            }
            eyrcVar = (eyrc) eyrbVar.build();
        }
        if (eyrcVar != null) {
            eplsVar.copyOnWrite();
            eplx eplxVar3 = (eplx) eplsVar.instance;
            eplxVar3.i = eyrcVar;
            eplxVar3.b |= 64;
        }
        this.e.d(eplsVar, context);
        String m = this.b.m();
        if (TextUtils.isEmpty(m)) {
            dkty.o("Unable to retrieve SIM operator information for metrics!", new Object[0]);
        } else {
            dkpp dkppVar = this.b;
            String n = dkppVar.n();
            String i2 = dkppVar.i();
            eysp eyspVar = (eysp) eysq.a.createBuilder();
            String substring = m.substring(0, 3);
            eyspVar.copyOnWrite();
            eysq eysqVar2 = (eysq) eyspVar.instance;
            substring.getClass();
            eysqVar2.b = 1 | eysqVar2.b;
            eysqVar2.c = substring;
            String substring2 = m.substring(3);
            eyspVar.copyOnWrite();
            eysq eysqVar3 = (eysq) eyspVar.instance;
            substring2.getClass();
            eysqVar3.b |= 2;
            eysqVar3.d = substring2;
            boolean t = this.b.t();
            eyspVar.copyOnWrite();
            eysq eysqVar4 = (eysq) eyspVar.instance;
            eysqVar4.b |= 16;
            eysqVar4.g = t;
            if (!TextUtils.isEmpty(i2)) {
                String i3 = this.b.i();
                eyspVar.copyOnWrite();
                eysq eysqVar5 = (eysq) eyspVar.instance;
                i3.getClass();
                eysqVar5.b |= 8;
                eysqVar5.f = i3;
            }
            if (!TextUtils.isEmpty(n)) {
                eyspVar.copyOnWrite();
                eysq eysqVar6 = (eysq) eyspVar.instance;
                n.getClass();
                eysqVar6.b |= 4;
                eysqVar6.e = n;
            }
            eysqVar = (eysq) eyspVar.build();
        }
        if (eysqVar != null) {
            eplsVar.copyOnWrite();
            eplx eplxVar4 = (eplx) eplsVar.instance;
            eplxVar4.d = eysqVar;
            eplxVar4.c = 6;
        }
        if (!TextUtils.isEmpty((String) dkrz.i.d())) {
            String str = (String) dkrz.i.d();
            eplsVar.copyOnWrite();
            eplx eplxVar5 = (eplx) eplsVar.instance;
            str.getClass();
            eplxVar5.b |= 512;
            eplxVar5.l = str;
        }
        return eplsVar;
    }

    public final void L(Callable callable, Function function) {
        erqt.r(erqc.o(this.d.submit(callable)), new dijo(function), this.d);
    }

    public final void M(Context context, eplx eplxVar, ezee ezeeVar) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return;
        }
        this.e.c(context, eplxVar, ezeeVar);
    }
}
