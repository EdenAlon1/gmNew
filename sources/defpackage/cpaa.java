package defpackage;

import com.google.android.rcs.client.messaging.data.IsComposingMessage;
import com.google.common.util.concurrent.ListenableFuture;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpaa implements cowz {
    private final ffbr a;
    private final couo b;
    private final cozz c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;

    public cpaa(ffbr ffbrVar, couo couoVar, cozz cozzVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4) {
        this.a = ffbrVar;
        this.b = couoVar;
        this.c = cozzVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
        this.f = ffbrVar4;
    }

    @Override // defpackage.cowz
    public final elfl a(cowy cowyVar, final avkl avklVar, Instant instant, int i) {
        elfl e;
        eiem eiemVar;
        eigd eigdVar;
        awxv awxvVar = (awxv) awya.a.createBuilder();
        awxz awxzVar = awxz.CONTROL;
        awxvVar.copyOnWrite();
        awya awyaVar = (awya) awxvVar.instance;
        awyaVar.c = awxzVar.d;
        awyaVar.b |= 1;
        awxx awxxVar = awxx.LOW;
        awxvVar.copyOnWrite();
        awya awyaVar2 = (awya) awxvVar.instance;
        awyaVar2.d = awxxVar.e;
        awyaVar2.b |= 2;
        awxvVar.copyOnWrite();
        awya awyaVar3 = (awya) awxvVar.instance;
        awyaVar3.b |= 4;
        awyaVar3.e = false;
        final awya awyaVar4 = (awya) awxvVar.build();
        final awui b = ((ckac) this.d.b()).b(i);
        final fayv fayvVar = fayv.a;
        ekzz f = eleg.f("ChatApiSender::sendTypingIndicator");
        cozz cozzVar = this.c;
        final couo couoVar = this.b;
        try {
            final bdhg a = couoVar.d.a();
            awzi awziVar = (awzi) awzj.a.createBuilder();
            String f2 = a.f();
            awziVar.copyOnWrite();
            awzj awzjVar = (awzj) awziVar.instance;
            awzjVar.b |= 1;
            awzjVar.e = f2;
            axaa axaaVar = (axaa) axab.a.createBuilder();
            boolean equals = cowy.ACTIVE.equals(cowyVar);
            axaaVar.copyOnWrite();
            axab axabVar = (axab) axaaVar.instance;
            axabVar.b |= 1;
            axabVar.c = equals;
            awziVar.copyOnWrite();
            awzj awzjVar2 = (awzj) awziVar.instance;
            axab axabVar2 = (axab) axaaVar.build();
            axabVar2.getClass();
            awzjVar2.d = axabVar2;
            awzjVar2.c = 6;
            avuh avuhVar = couoVar.g;
            cslr cslrVar = couoVar.j;
            axad axadVar = (axad) avuhVar.fP(cslr.a());
            awziVar.copyOnWrite();
            awzj awzjVar3 = (awzj) awziVar.instance;
            axadVar.getClass();
            awzjVar3.g = axadVar;
            awzjVar3.b |= 4;
            final awzj awzjVar4 = (awzj) awziVar.build();
            try {
                eiemVar = new eiem();
                int ordinal = cowyVar.ordinal();
                if (ordinal == 0) {
                    eigdVar = eigd.START;
                } else {
                    if (ordinal != 1) {
                        throw new IllegalArgumentException("Unsupported typing state ".concat(String.valueOf(cowyVar.name())));
                    }
                    eigdVar = eigd.STOP;
                }
                eiemVar.c(eigdVar);
                eiemVar.b(cozz.a);
                eiemVar.d(instant);
            } catch (IllegalArgumentException e2) {
                e = elfo.e(couo.l(e2, a, 5));
            }
            try {
                e = elfo.e((awul) cozzVar.c.fP(cozzVar.b.b(IsComposingMessage.class).b(eiemVar.a()))).i(new eroh() { // from class: couc
                    @Override // defpackage.eroh
                    public final ListenableFuture a(Object obj) {
                        return couo.this.e(a, (awul) obj, fayvVar, avklVar, awzjVar4, awyaVar4, b);
                    }
                }, couoVar.c).h(new emwl() { // from class: coue
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return couo.this.m((awzd) obj, 5);
                    }
                }, couoVar.c).e(IllegalArgumentException.class, new emwl() { // from class: couf
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return couo.l((IllegalArgumentException) obj, bdhg.this, 5);
                    }
                }, couoVar.c);
                f.b(e);
                f.close();
                return e;
            } catch (eikm e3) {
                throw new cowg(e3);
            }
        } finally {
        }
    }

    @Override // defpackage.cowz
    public final boolean b(int i) {
        if (!((djsi) this.f.b()).g(i).isEmpty() && ((djrv) this.e.b()).x(i)) {
            return ((ctyz) this.a.b()).m();
        }
        return false;
    }
}
