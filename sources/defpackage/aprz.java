package defpackage;

import android.os.Build;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.util.Optional;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aprz implements apsb {
    public static final /* synthetic */ int f = 0;
    private static final entd g = entd.c("BugleSending");
    public final Optional a;
    public final ffbr b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    private final errl h;
    private final errl i;
    private final errl j;
    private final apgc k;
    private final byzp l;
    private final apqh m;
    private final clwf n;
    private final ffbr o;
    private final ffbr p;
    private final cqoh q;
    private final ffbr r;
    private final ffbr s;
    private final ffbr t;
    private final ffbr u;

    public aprz(errl errlVar, errl errlVar2, errl errlVar3, apgc apgcVar, byzp byzpVar, apqh apqhVar, clwf clwfVar, Optional optional, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, cqoh cqohVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10) {
        this.h = errlVar;
        this.i = errlVar2;
        this.j = errlVar3;
        this.k = apgcVar;
        this.l = byzpVar;
        this.m = apqhVar;
        this.n = clwfVar;
        this.o = ffbrVar;
        this.c = ffbrVar2;
        this.a = optional;
        this.b = ffbrVar3;
        this.p = ffbrVar4;
        this.q = cqohVar;
        this.r = ffbrVar5;
        this.d = ffbrVar6;
        this.s = ffbrVar7;
        this.t = ffbrVar8;
        this.e = ffbrVar9;
        this.u = ffbrVar10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static String e(engw engwVar) {
        if (engwVar.size() != 1) {
            return null;
        }
        apmq apmqVar = ((apry) engwVar.get(0)).a;
        if (apmqVar instanceof apqd) {
            return ((apqd) apmqVar).k();
        }
        return null;
    }

    @Override // defpackage.apsb
    public final elfl a(final apyz apyzVar, final alxg alxgVar, final long j, final long j2) {
        ensz enszVar = (ensz) g.h();
        enszVar.Y(csux.q, alxgVar.f());
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/message/envelope/BugleMessagePackager", "prepareReactionForSending", 278, "BugleMessagePackager.java")).J("Prepare REACTION for sending: %s reaction to message %s from %s.", apyzVar.c(), apyzVar.a().a(), apyzVar.d().name());
        return elfo.g(new Callable() { // from class: aprp
            /* JADX WARN: Removed duplicated region for block: B:23:0x00e5  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 266
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.aprp.call():java.lang.Object");
            }
        }, this.i);
    }

    @Override // defpackage.apsb
    public final elfl b(final alxg alxgVar, final MessageId messageId, final long j, final long j2, final String str, final fjay fjayVar) {
        return elfo.g(new Callable() { // from class: aprw
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final String str2 = str;
                appw appwVar = new appw() { // from class: aprt
                    @Override // defpackage.appw
                    public final /* synthetic */ engw a() {
                        int i = engw.d;
                        return enou.a;
                    }

                    @Override // defpackage.appw, defpackage.appj
                    public final /* synthetic */ String b() {
                        return "text/plain";
                    }

                    @Override // defpackage.appw
                    public final String c() {
                        int i = aprz.f;
                        return str2;
                    }
                };
                alxg alxgVar2 = alxgVar;
                alyx alyxVar = alyx.RICH;
                apfz apfzVar = (apfz) alxgVar2;
                int i = engw.d;
                engw engwVar = enou.a;
                eooi eooiVar = eooi.UNKNOWN_BUGLE_MESSAGE_SOURCE;
                long j3 = j;
                long j4 = j2;
                return aprz.this.c(alyxVar, apfzVar, appwVar, engwVar, null, null, messageId, null, null, eooiVar, j3, j4, fjayVar, null, null);
            }
        }, Build.VERSION.SDK_INT <= 26 ? this.j : this.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x06de  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x070b  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x070d  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0748  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x07e2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x07fb A[LOOP:1: B:148:0x07f5->B:150:0x07fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x07f0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0815  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0774  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0765  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0231  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.apro c(defpackage.alyx r40, defpackage.apfz r41, defpackage.appw r42, defpackage.engw r43, defpackage.alxr r44, com.google.android.apps.messaging.shared.api.messaging.MessageId r45, com.google.android.apps.messaging.shared.api.messaging.MessageId r46, defpackage.apsd r47, defpackage.apcs r48, defpackage.eooi r49, long r50, long r52, defpackage.fjay r54, java.util.List r55, defpackage.fayv r56) {
        /*
            Method dump skipped, instructions count: 2249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aprz.c(alyx, apfz, appw, engw, alxr, com.google.android.apps.messaging.shared.api.messaging.MessageId, com.google.android.apps.messaging.shared.api.messaging.MessageId, apsd, apcs, eooi, long, long, fjay, java.util.List, fayv):apro");
    }

    @Override // defpackage.apsb
    public final elfl d(final alyx alyxVar, final alxg alxgVar, final appw appwVar, final engw engwVar, final alxr alxrVar, final MessageId messageId, final apcs apcsVar, final eooi eooiVar, final long j, final long j2, final fjay fjayVar, final List list, final fayv fayvVar) {
        ensz enszVar = (ensz) g.h();
        enszVar.Y(csux.q, alxgVar.f());
        ((ensz) enszVar.h("com/google/android/apps/messaging/shared/api/messaging/message/envelope/BugleMessagePackager", "prepareContentForSending", 236, "BugleMessagePackager.java")).D("Prepare CONTENT for sending from %s, FeatureSetRequested: %s.", eooiVar.name(), alyxVar);
        if (alxrVar != null && messageId != null) {
            return elfo.d(new IllegalArgumentException("Message can't be sent as reply and edit."));
        }
        return elfo.g(new Callable() { // from class: aprq
            @Override // java.util.concurrent.Callable
            public final Object call() {
                apcs apcsVar2 = apcsVar;
                aprz aprzVar = aprz.this;
                eooi eooiVar2 = eooiVar;
                alyx alyxVar2 = alyxVar;
                long j3 = j;
                apfz apfzVar = (apfz) alxgVar;
                appw appwVar2 = appwVar;
                long j4 = j2;
                engw engwVar2 = engwVar;
                fjay fjayVar2 = fjayVar;
                return aprzVar.c(alyxVar2, apfzVar, appwVar2, engwVar2, alxrVar, messageId, null, null, apcsVar2, eooiVar2, j3, j4, fjayVar2, list, fayvVar);
            }
        }, Build.VERSION.SDK_INT <= 26 ? this.j : this.h);
    }
}
