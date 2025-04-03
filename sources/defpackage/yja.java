package defpackage;

import android.content.Context;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yja implements yig, xig {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/scheduledsend/ScheduledSendUiAdapterImpl");
    public final Context b;
    public final ffsk c;
    public final ydb d;
    public final aksx e;
    public final ffbr f;
    private final yht g;
    private final ajjc h;
    private final aigz i;
    private final cqoh j;
    private final xyd k;
    private final ctud l;
    private final fgdj m;
    private final ablq n;

    public yja(Context context, ffsk ffskVar, ydb ydbVar, aksx aksxVar, yht yhtVar, ajjc ajjcVar, aigz aigzVar, cqoh cqohVar, xyd xydVar, ctud ctudVar, ablq ablqVar, ffbr ffbrVar) {
        context.getClass();
        ffskVar.getClass();
        ydbVar.getClass();
        aksxVar.getClass();
        ajjcVar.getClass();
        aigzVar.getClass();
        cqohVar.getClass();
        ctudVar.getClass();
        ablqVar.getClass();
        ffbrVar.getClass();
        this.b = context;
        this.c = ffskVar;
        this.d = ydbVar;
        this.e = aksxVar;
        this.g = yhtVar;
        this.h = ajjcVar;
        this.i = aigzVar;
        this.j = cqohVar;
        this.k = xydVar;
        this.l = ctudVar;
        this.n = ablqVar;
        this.f = ffbrVar;
        yiz yizVar = new yiz(ffyy.a(new yiw(ydbVar.a)), this);
        int i = fgcz.a;
        this.m = fgbn.b(yizVar, ffskVar, fgcy.b, null);
    }

    public static final ffcu d() {
        ensk e = a.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/scheduledsend/ScheduledSendUiAdapterImpl", "showScheduledSendDialog$lambda$2", 94, "ScheduledSendUiAdapterImpl.kt")).q("Dismissed scheduled send dialog");
        return ffcu.a;
    }

    @Override // defpackage.xig
    public final boolean a() {
        if (((xhu) this.d.a.c()).e != null) {
            this.k.i();
            return false;
        }
        if (((Boolean) this.f.b()).booleanValue() && ((xhu) this.d.a.c()).f != null) {
            this.k.g();
            return false;
        }
        ensk e = a.e();
        e.Y(ente.a, "BugleComposeRow2");
        ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/draft/scheduledsend/ScheduledSendUiAdapterImpl", "showScheduledSendDialog", 91, "ScheduledSendUiAdapterImpl.kt")).q("Opening scheduled send dialog");
        this.g.a(new ffix() { // from class: yii
            @Override // defpackage.ffix
            public final Object invoke() {
                return yja.d();
            }
        }, new ffji() { // from class: yij
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                Instant instant = (Instant) obj;
                instant.getClass();
                yja yjaVar = yja.this;
                axol.k(yjaVar.c, null, new yit(yjaVar, instant, null), 3);
                return ffcu.a;
            }
        });
        return true;
    }

    @Override // defpackage.yig
    public final fgdj b() {
        return this.m;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0115, code lost:
    
        if (r5.c(r1, r3) == r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0154, code lost:
    
        if (r1.a(r11, r3) == r4) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e9, code lost:
    
        if (r2 != r4) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(j$.time.Instant r19, defpackage.ffgu r20) {
        /*
            Method dump skipped, instructions count: 408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yja.c(j$.time.Instant, ffgu):java.lang.Object");
    }
}
