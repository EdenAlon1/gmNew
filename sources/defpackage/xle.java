package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xle {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver");
    public final Context b;
    public final ffhd c;
    public final ffhd d;
    public final ffbr e;
    public final asvn f;
    public final askf g;
    public final ffbr h;
    public final auow i;
    public final auol j;
    public final ffxx k;
    public final ffxx l;
    public final ffxx m;
    public final ffxx n;
    public final ffxx o;
    private final ffxx p;
    private final ffxx q;
    private final ffxx r;
    private final ffxx s;
    private final ffxx t;
    private final ffxx u;

    public xle(Context context, ffxx ffxxVar, ffxx ffxxVar2, ydb ydbVar, ffhd ffhdVar, ffhd ffhdVar2, ffbr ffbrVar, ffbr ffbrVar2, asvn asvnVar, askf askfVar, ffbr ffbrVar3, auow auowVar, auol auolVar, ffxx ffxxVar3, attl attlVar) {
        context.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        ydbVar.getClass();
        ffhdVar.getClass();
        ffhdVar2.getClass();
        ffbrVar.getClass();
        ffbrVar2.getClass();
        asvnVar.getClass();
        askfVar.getClass();
        ffbrVar3.getClass();
        auolVar.getClass();
        ffxxVar3.getClass();
        attlVar.getClass();
        this.b = context;
        this.c = ffhdVar;
        this.d = ffhdVar2;
        this.e = ffbrVar;
        this.f = asvnVar;
        this.g = askfVar;
        this.h = ffbrVar3;
        this.i = auowVar;
        this.j = auolVar;
        ffxx ffxxVar4 = ffxxVar3;
        this.p = ffxxVar4;
        ffxx ffygVar = ((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue() ? (ffxx) ffbrVar2.b() : new ffyg(false);
        ffygVar.getClass();
        ffxx a2 = ffyy.a(ffygVar);
        this.q = a2;
        ffxx a3 = ffyy.a(attlVar.a() ? ffxxVar4 : new ffyg(false));
        this.r = a3;
        ffxx a4 = ffyy.a(new xjt(ffxxVar2));
        this.s = a4;
        ffxx a5 = ffyy.a(new xjw(ffxxVar, this));
        this.t = a5;
        this.k = ffyy.a(new xki(ffyo.a(fgck.a(ffyy.a(new xjz(ffxxVar)), ffyy.a(new xkc(ffxxVar)), ffyy.a(new xkf(ydbVar.a)), new xjp(null))), this));
        ffxx a6 = ffyy.a(fgck.a(a5, a4, ffyy.a(new xkl(ydbVar.a)), new xld(this, null)));
        xjq xjqVar = new xjq(null, this);
        int i = fgau.a;
        ffxx a7 = ffyy.a(new fgen(xjqVar, a6));
        this.u = a7;
        ffxx a8 = ffyy.a(axqw.a(a5, a4, a7, ffyy.a(new xko(ydbVar.a)), a2, a3, new xlc(this, null)));
        this.l = a8;
        this.m = ffyy.a(new xkr(new fgch(a8, ydbVar.a, new xjo(this, null))));
        this.n = ffyy.a(new fgch(a4, a5, new xjm(this, null)));
        this.o = ffyy.a(new fgcp(new xlb(ffxxVar, this, null)));
    }

    public static final xlp a(alxi alxiVar, xis xisVar, xlz xlzVar) {
        if (xlzVar.a || xlzVar.b) {
            ensk g = a.g();
            g.Y(ente.a, "BugleComposeRow2");
            ((enrr) g.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "calculateTransportBeforeSimpleMessageProperties", 199, "MapiTransportCapabilityResolver.kt")).q("Forcing MMS since draft contains subject or is urgent.");
            return xlj.a;
        }
        boolean z = xlzVar.c;
        alyx alyxVar = xisVar.c;
        int i = xisVar.h;
        if (alyxVar.g) {
            if (i == 3 && z) {
                ensk g2 = a.g();
                g2.Y(ente.a, "BugleComposeRow2");
                ((enrr) g2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "getTransportForRichTransportFeatureSet", 556, "MapiTransportCapabilityResolver.kt")).q("Forcing MMS since media attachments not supported in RCS and draft contains attachments.");
                return xlj.a;
            }
            ensk g3 = a.g();
            g3.Y(ente.a, "BugleComposeRow2");
            ((enrr) g3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "getTransportForRichTransportFeatureSet", 564, "MapiTransportCapabilityResolver.kt")).t("Using RCS due to its best available transport feature set %s.", alyxVar);
            return xlk.a;
        }
        if (alyxVar == alyx.SATELLITE) {
            return new xll((byte[]) null);
        }
        if (alyxVar != alyx.SIMPLE) {
            throw new IllegalStateException("Check failed.");
        }
        if (z) {
            ensk g4 = a.g();
            g4.Y(ente.a, "BugleComposeRow2");
            ((enrr) g4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "getTransportForSimpleTransportFeatureSet", 579, "MapiTransportCapabilityResolver.kt")).q("Upgrading to MMS since draft contains attachments.");
            return xlj.a;
        }
        alxi alxiVar2 = alxi.GROUP;
        if (alxiVar == alxiVar2 && i == 2) {
            ensk g5 = a.g();
            g5.Y(ente.a, "BugleComposeRow2");
            ((enrr) g5.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "getTransportForSimpleTransportFeatureSet", 583, "MapiTransportCapabilityResolver.kt")).q("Using SMS since we are sending as mass sms.");
            return new xlm((byte[]) null);
        }
        if (alxiVar != alxiVar2) {
            return null;
        }
        ensk g6 = a.g();
        g6.Y(ente.a, "BugleComposeRow2");
        ((enrr) g6.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/api/transportcapability/MapiTransportCapabilityResolver", "getTransportForSimpleTransportFeatureSet", 587, "MapiTransportCapabilityResolver.kt")).q("Upgrading to MMS since its a group conversation.");
        return xlj.a;
    }

    public static final ffxx b(xlp xlpVar, ffxx ffxxVar) {
        if (ffkj.e(xlpVar, xlj.a) || ffkj.e(xlpVar, xlk.a)) {
            return new ffyg(xlpVar);
        }
        if (xlpVar instanceof xll) {
            return new xji(ffxxVar);
        }
        if ((xlpVar instanceof xlo) || xlpVar == null) {
            return new xjl(ffxxVar, new fflb(), xlpVar);
        }
        throw new ffcd();
    }
}
