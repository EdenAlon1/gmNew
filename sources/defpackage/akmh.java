package defpackage;

import com.google.android.apps.messaging.samsung.BugleSamsung_Application;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class akmh extends akfb {
    private boolean v = false;
    private final fbac w = new fbac(new akmg(this));

    @Override // defpackage.ekjz, defpackage.fbat
    public final /* synthetic */ fbas aW() {
        return this.w;
    }

    @Override // defpackage.ekjz
    public final fbac c() {
        return this.w;
    }

    @Override // defpackage.akfb, defpackage.ser, defpackage.arbh, defpackage.ekka, android.app.Application
    public void onCreate() {
        if (!this.v) {
            this.v = true;
            BugleSamsung_Application bugleSamsung_Application = (BugleSamsung_Application) this;
            akko akkoVar = ((akis) aX()).d.b;
            bugleSamsung_Application.s = (elbx) akkoVar.a.aJ.b();
            bugleSamsung_Application.t = akkoVar.bx;
            bugleSamsung_Application.f = akkoVar.ck;
            akis akisVar = akkoVar.a;
            akkp akkpVar = akisVar.a;
            bugleSamsung_Application.g = akkpVar.jl;
            bugleSamsung_Application.h = akkoVar.co;
            bugleSamsung_Application.i = akisVar.hv;
            bugleSamsung_Application.j = akisVar.t;
            bugleSamsung_Application.k = akkoVar.cp;
            bugleSamsung_Application.l = akkpVar.kF;
            bugleSamsung_Application.m = akisVar.aK;
            bugleSamsung_Application.n = (elbx) akisVar.aJ.b();
            bugleSamsung_Application.o = akkoVar.dO;
            akkp akkpVar2 = akkoVar.a.a;
            bugleSamsung_Application.p = akkpVar2.g;
            bugleSamsung_Application.q = akkoVar.dP;
            bugleSamsung_Application.r = akkoVar.an();
            ((ser) bugleSamsung_Application).a = akkpVar2.vS;
            bugleSamsung_Application.b = akkpVar2.af;
        }
        super.onCreate();
    }
}
