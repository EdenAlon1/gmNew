package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.Queue;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class ccub {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsZeroKeyRecoveryHelper");
    public static final int b = ((ccue.a(3) | ccue.a(5)) | ccue.a(65)) | ccue.a(33);
    public final eisx c;
    public final ccdo d;
    private final Queue e;
    private final Queue f;
    private final Queue g;
    private final akzt h;
    private final ffsk i;
    private final ccxj j;
    private final crty k;
    private final cryg l;

    public ccub(Queue queue, Queue queue2, Queue queue3, akzt akztVar, ffsk ffskVar, eisx eisxVar, ccdo ccdoVar, ccxj ccxjVar, crty crtyVar, cryg crygVar) {
        queue.getClass();
        queue2.getClass();
        queue3.getClass();
        akztVar.getClass();
        ffskVar.getClass();
        eisxVar.getClass();
        ccdoVar.getClass();
        crtyVar.getClass();
        crygVar.getClass();
        this.e = queue;
        this.f = queue2;
        this.g = queue3;
        this.h = akztVar;
        this.i = ffskVar;
        this.c = eisxVar;
        this.d = ccdoVar;
        this.j = ccxjVar;
        this.k = crtyVar;
        this.l = crygVar;
    }

    public static final enip i(Queue queue) {
        enin i = enip.i(0);
        while (true) {
            String str = (String) queue.poll();
            if (str == null) {
                break;
            }
            i.c(str);
        }
        enip g = i.g();
        if (true != g.isEmpty()) {
            return g;
        }
        return null;
    }

    private final elfl j(Queue queue, int i, int i2, ffji ffjiVar) {
        elfl c;
        c = axol.c(this.i, ffhe.a, ffsm.a, new ccty(this, queue, i, i2, ffjiVar, null));
        return c;
    }

    public final elfl a() {
        return j(this.e, 3, 2, new ffji() { // from class: cctv
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                final String str = (String) obj;
                str.getClass();
                bsob e = bsom.e();
                e.z("Cms#getConversationTableIdFromCmsId");
                e.c(bsom.c.a);
                e.i(new Function() { // from class: cctu
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsol bsolVar = (bsol) obj2;
                        bsolVar.e(str);
                        return bsolVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bskr bskrVar = (bskr) e.b().o();
                if (!bskrVar.moveToFirst()) {
                    throw new RuntimeException(str.concat(" not found in BugleDb"));
                }
                String a2 = bskrVar.h().a();
                a2.getClass();
                return a2;
            }
        });
    }

    public final elfl b() {
        elfl c;
        c = axol.c(this.i, ffhe.a, ffsm.a, new ccua(this, null));
        return c;
    }

    public final elfl c() {
        return j(this.g, 4, 3, new ffji() { // from class: cctx
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                final String str = (String) obj;
                str.getClass();
                bvvn e = ParticipantsTable.e();
                e.z("Cms#getParticipantTableIdFromCmsId");
                e.c(ParticipantsTable.c.a);
                e.h(new Function() { // from class: cctw
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bvvw bvvwVar = (bvvw) obj2;
                        bvvwVar.d(str);
                        return bvvwVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bvti bvtiVar = (bvti) e.b().o();
                if (!bvtiVar.moveToFirst()) {
                    throw new RuntimeException(str.concat(" not found in BugleDb"));
                }
                String p = bvtiVar.p();
                p.getClass();
                return p;
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|7|(1:(1:(2:11|12)(2:31|32))(5:33|34|23|(1:25)|21))(4:35|(1:37)|29|30)|13|(3:15|16|(5:18|(2:20|21)|23|(0)|21)(2:26|27))|29|30))|40|6|7|(0)(0)|13|(0)|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x003c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x014d, code lost:
    
        r13 = defpackage.ccub.a.j();
        r13.Y(defpackage.ente.a, "BugleCms");
        ((defpackage.enrr) ((defpackage.enrr) r13).g(r0).h("com/google/android/apps/messaging/shared/datamodel/worker/cloudstore/CmsZeroKeyRecoveryHelper", "updateZeroKeyMessagesInCms", 119, "CmsZeroKeyRecoveryHelper.kt")).t("Failed to re-encrypt and update message %s.", r4);
        r5 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x013e -> B:13:0x00b3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x014d -> B:13:0x00b3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r17) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccub.d(ffgu):java.lang.Object");
    }

    public final void e(String str) {
        str.getClass();
        this.e.add(str);
    }

    public final void f(String str) {
        str.getClass();
        this.f.add(str);
    }

    public final void g(String str) {
        this.g.add(str);
    }

    public final void h(int i, int i2) {
        this.h.f("Bugle.Cms.Cloudstore.ZeroKeyFallback", i, i2);
    }
}
