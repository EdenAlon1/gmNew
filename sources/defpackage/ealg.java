package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ealg {
    public static final void a(pqu pquVar, ealb ealbVar, Long l) {
        pquVar.d("GNP_SDK_JOB");
        if (l != null) {
            pquVar.h(l.longValue(), TimeUnit.MILLISECONDS);
        }
        int h = ealbVar.h();
        Long c = ealbVar.c();
        if (c != null) {
            pquVar.f(h + (-1) != 0 ? poa.EXPONENTIAL : poa.LINEAR, c.longValue(), TimeUnit.MILLISECONDS);
        }
    }
}
