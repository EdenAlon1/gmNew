package defpackage;

import android.content.Context;
import j$.util.Optional;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aajq implements aafi {
    static final /* synthetic */ ffmx[] a;
    public static final /* synthetic */ int i = 0;
    public final Context b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final fgcm g;
    public final ffls h;
    private final ffbr j;
    private final ffbz k;
    private final ffbz l;

    static {
        ffko ffkoVar = new ffko(aajq.class, "promoSeenForMessage", "getPromoSeenForMessage()Lcom/google/android/apps/messaging/shared/api/messaging/MessageId;", 0);
        int i2 = fflc.a;
        a = new ffmx[]{ffkoVar};
    }

    public aajq(Context context, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        context.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffbrVar5.getClass();
        this.b = context;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.j = ffbrVar4;
        this.f = ffbrVar5;
        this.k = ffca.a(new ffix() { // from class: aajf
            @Override // defpackage.ffix
            public final Object invoke() {
                return (String) ((Optional) aajq.this.c.b()).get();
            }
        });
        this.g = fgdm.a(null);
        this.h = new aajp(this);
        this.l = ffca.a(new ffix() { // from class: aajg
            @Override // defpackage.ffix
            public final Object invoke() {
                aajq aajqVar = aajq.this;
                Object b = aajqVar.d.b();
                b.getClass();
                return new ffzh(new aajk(null), new fgch(new fgch(new aajn((ffxx) b), new aaiv(((aaja) aajqVar.e.b()).a().e()), new aajh(null)), aajqVar.g, new aajj(aajqVar, null)));
            }
        });
    }

    @Override // defpackage.aafi
    public final axrc a(zvp zvpVar) {
        Object c;
        if (!b(zvpVar)) {
            return new axqd(new ffix() { // from class: aaje
                @Override // defpackage.ffix
                public final Object invoke() {
                    int i2 = aajq.i;
                    return ffel.a;
                }
            });
        }
        fgcm fgcmVar = this.g;
        do {
            c = fgcmVar.c();
        } while (!fgcmVar.g(c, zvpVar.a().b()));
        return axrg.b(new fgch(((abcf) this.j.b()).a(zvpVar.a(), cmsk.a()), (ffxx) this.l.a(), new aajo(null)), ffel.a);
    }

    @Override // defpackage.aafi
    public final boolean b(zvp zvpVar) {
        boolean z;
        boolean z2 = zsr.q(zvpVar.a()) && zvpVar.e();
        apyd i2 = zvpVar.a().i();
        if (i2 != null) {
            engw d = i2.d();
            if (!d.isEmpty()) {
                Iterator<E> it = d.iterator();
                while (it.hasNext()) {
                    if (ffkj.e(((apya) it.next()).a, apzb.a(c()))) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        return z2 && !z;
    }

    public final String c() {
        return (String) this.k.a();
    }
}
