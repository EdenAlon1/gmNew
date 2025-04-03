package defpackage;

import com.google.android.apps.messaging.wearable.WearableBindService;

/* compiled from: PG */
/* loaded from: classes3.dex */
public class deef extends diay implements fbat {
    private volatile fbaj a;
    private final Object b = new Object();
    private boolean c = false;

    @Override // defpackage.fbat
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final fbaj aW() {
        if (this.a == null) {
            synchronized (this.b) {
                if (this.a == null) {
                    this.a = new fbaj(this);
                }
            }
        }
        return this.a;
    }

    @Override // defpackage.fbas
    public final Object aX() {
        return aW().aX();
    }

    @Override // defpackage.diay, android.app.Service
    public void onCreate() {
        if (!this.c) {
            this.c = true;
            WearableBindService wearableBindService = (WearableBindService) this;
            akhb akhbVar = (akhb) aX();
            akis akisVar = akhbVar.b;
            wearableBindService.c = akisVar.q;
            akko akkoVar = akisVar.b;
            wearableBindService.d = akkoVar.rd;
            wearableBindService.e = akisVar.nI;
            akkp akkpVar = akisVar.a;
            wearableBindService.f = akkpVar.qM;
            wearableBindService.g = akkpVar.pE;
            wearableBindService.h = akkpVar.pS;
            wearableBindService.i = akkpVar.mF;
            wearableBindService.j = akisVar.cT;
            wearableBindService.k = akkpVar.nW;
            wearableBindService.l = akisVar.dB;
            wearableBindService.m = akkoVar.re;
            wearableBindService.n = akkpVar.iF;
            wearableBindService.o = akkpVar.SC;
            wearableBindService.p = akisVar.cz;
            wearableBindService.q = akisVar.aJ;
            wearableBindService.r = akkoVar.fr;
            wearableBindService.s = akkoVar.fs;
            wearableBindService.t = akkpVar.f;
            wearableBindService.u = akisVar.p;
            wearableBindService.v = akisVar.t;
            wearableBindService.w = akisVar.aK;
            wearableBindService.x = akkpVar.Z;
            wearableBindService.y = akkpVar.kp;
            wearableBindService.z = akkpVar.Nm;
            wearableBindService.A = akhbVar.A;
            fbbf fbbfVar = akhbVar.B;
            wearableBindService.B = akkpVar.pR;
            wearableBindService.C = akkpVar.No;
            wearableBindService.D = akkoVar.rf;
            wearableBindService.E = akkoVar.rg;
        }
        super.onCreate();
    }
}
