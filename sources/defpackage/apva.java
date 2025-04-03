package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.time.Duration;
import java.security.InvalidParameterException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apva implements AutoCloseable, apvl {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/message/internal/OptimisticMessagePager");
    public final apvl b;
    public final aptx c;
    public final ffsk d;
    public final apvt e;
    public final apsx f;
    public final axsq g;
    public final AtomicReference h;
    public final apvw i;
    private final ffhd j;
    private final axsr k;

    public apva(ffhd ffhdVar, axsr axsrVar, apvw apvwVar, apvl apvlVar, aptx aptxVar) {
        this.j = ffhdVar;
        this.k = axsrVar;
        this.i = apvwVar;
        this.b = apvlVar;
        this.c = aptxVar;
        ffsk b = ffsl.b(ffhdVar.plus(new ffvf(null)));
        this.d = b;
        this.e = new apvt(new ffji() { // from class: aput
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                alxr alxrVar = (alxr) obj;
                alxrVar.getClass();
                return apva.this.c.aa(alxrVar.b(), alxrVar.n());
            }
        });
        this.f = new apsx(apvlVar);
        Duration ofMillis = Duration.ofMillis(((Long) aoyx.d.e()).longValue());
        cqoh cqohVar = (cqoh) axsrVar.a.b();
        cqohVar.getClass();
        ofMillis.getClass();
        this.g = new axsq(cqohVar, ofMillis);
        this.h = new AtomicReference(apvn.a);
        axol.k(b, null, new apuw(this, null), 3);
    }

    @Override // defpackage.alxy
    public final alxw a(alxr alxrVar) {
        alxrVar.getClass();
        apvl apvlVar = this.b;
        return new apvv(apvlVar.a(alxrVar), this.e.a());
    }

    @Override // defpackage.alxy
    public final /* bridge */ /* synthetic */ alxw b(Integer num) {
        apvt apvtVar = this.e;
        num.intValue();
        return new apvv(this.b.b(num), apvtVar.a());
    }

    @Override // defpackage.alxy
    public final ctbx c(final alxx alxxVar) {
        boolean add;
        final apsx apsxVar = this.f;
        synchronized (apsxVar.a) {
            add = apsxVar.b.add(alxxVar);
        }
        if (add) {
            return new ctbx() { // from class: apsw
                @Override // defpackage.ctbx
                public final void a() {
                    alxx alxxVar2 = alxxVar;
                    apsx apsxVar2 = apsx.this;
                    synchronized (apsxVar2.a) {
                        apsxVar2.b.remove(alxxVar2);
                    }
                }

                @Override // defpackage.ctbx, java.io.Closeable, java.lang.AutoCloseable
                public final /* synthetic */ void close() {
                    ctbw.a(this);
                }
            };
        }
        throw new IllegalStateException("Check failed.");
    }

    @Override // java.lang.AutoCloseable, defpackage.apvl
    public final void close() {
        ffsl.e(this.d, null);
        this.f.close();
        ((aptv) this.b).j();
    }

    @Override // defpackage.alxy
    public final elfl d(MessageId messageId) {
        messageId.getClass();
        elfl d = this.b.d(messageId);
        d.getClass();
        return d;
    }

    @Override // defpackage.alxy
    public final elfl e(alxw alxwVar, int i) {
        if (alxwVar instanceof apvv) {
            return this.b.e(((apvv) alxwVar).a, i);
        }
        throw new InvalidParameterException("wrong PagingKey type, expected VersionedPagingKey");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r7 < (r1.c.a.size() / 2)) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00aa  */
    @Override // defpackage.alxy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.elfl f(defpackage.alxw r13, int r14) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.apva.f(alxw, int):elfl");
    }

    @Override // defpackage.alxy
    public final elfl g(alxw alxwVar, int i) {
        if (alxwVar instanceof apvv) {
            return this.b.g(((apvv) alxwVar).a, i);
        }
        throw new InvalidParameterException("wrong PagingKey type, expected VersionedPagingKey");
    }

    @Override // defpackage.alxy
    public final elfl h(MessageId messageId) {
        ffhe ffheVar = ffhe.a;
        ffsm ffsmVar = ffsm.a;
        return axol.a(ffra.b(this.d, ekxi.a(ffheVar), ffsmVar, new apuz(null, this, messageId)));
    }

    @Override // defpackage.apvl
    public final void k() {
    }
}
