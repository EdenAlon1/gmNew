package defpackage;

import com.google.android.apps.messaging.util.examplestore.MessagesExampleStoreService;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class debx extends dgty implements fbat {
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

    @Override // android.app.Service
    public final void onCreate() {
        if (!this.c) {
            this.c = true;
            MessagesExampleStoreService messagesExampleStoreService = (MessagesExampleStoreService) this;
            akhb akhbVar = (akhb) aX();
            Optional optional = (Optional) akhbVar.b.mk.b();
            fbbf fbbfVar = akhbVar.w;
            akis akisVar = akhbVar.b;
            fbbf fbbfVar2 = akisVar.q;
            akkp akkpVar = akisVar.a;
            fbbf fbbfVar3 = akkpVar.dw;
            fbbf fbbfVar4 = akkpVar.dB;
            fbbf fbbfVar5 = akkpVar.iy;
            fbbf fbbfVar6 = akkpVar.nr;
            fbbf fbbfVar7 = akisVar.t;
            fbbf fbbfVar8 = akisVar.p;
            fbbf a = fbbg.a(akkpVar.sb);
            akis akisVar2 = akhbVar.b;
            messagesExampleStoreService.a = new deby(optional, fbbfVar, new decn(fbbfVar2, fbbfVar3, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, a, akisVar2.cz, akisVar2.a.nC, akhbVar.w, akisVar2.aJ), akhbVar.x, akhbVar.y);
            messagesExampleStoreService.b = (elbx) akhbVar.b.aJ.b();
        }
        super.onCreate();
    }
}
