package defpackage;

import android.net.Uri;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.Duration;
import j$.time.Instant;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cpyk {
    public static final cskc a = cskc.g("BugleDataModel", "ForwardSyncBatchExecutor");
    public final errl b;
    public final ctyx c;
    public final cqoh d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final cozl o;
    public final cbgf p;
    public final ffbr q;
    public final ffbr r;
    public final ffbr s;
    private final ffbr t;
    private final ffbr u;

    public cpyk(errl errlVar, ctyx ctyxVar, cqoh cqohVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, cozl cozlVar, cbgf cbgfVar, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15) {
        this.b = errlVar;
        this.c = ctyxVar;
        this.d = cqohVar;
        this.e = ffbrVar;
        this.f = ffbrVar2;
        this.g = ffbrVar3;
        this.h = ffbrVar4;
        this.i = ffbrVar5;
        this.j = ffbrVar6;
        this.k = ffbrVar7;
        this.l = ffbrVar8;
        this.m = ffbrVar9;
        this.n = ffbrVar10;
        this.o = cozlVar;
        this.p = cbgfVar;
        this.t = ffbrVar11;
        this.u = ffbrVar12;
        this.q = ffbrVar13;
        this.r = ffbrVar14;
        this.s = ffbrVar15;
    }

    public static void b(cpzi cpziVar, ArrayList arrayList, ArrayList arrayList2, cno cnoVar, long j, long j2) {
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            covb covbVar = (covb) arrayList.get(i);
            if (!covbVar.l) {
                covbVar.l = e(covbVar.k, covbVar.f < j);
            }
            cpziVar.a.add(covbVar);
            i++;
        }
        if (j2 > Long.MIN_VALUE) {
            emyw.a(arrayList2.size() == cnoVar.b());
            for (int i2 = 0; i2 < cnoVar.b(); i2++) {
                coux couxVar = (coux) arrayList2.get(i2);
                if (!couxVar.m) {
                    couxVar.m = e(couxVar.l, couxVar.g < j);
                }
                if (((Boolean) ((cfup) cpze.h.get()).e()).booleanValue() && couxVar.l()) {
                    cpziVar.c.add(couxVar);
                } else {
                    cpziVar.b.add(couxVar);
                }
            }
        }
    }

    public static boolean e(boolean z, boolean z2) {
        return z2 || z;
    }

    public final Duration a(Instant instant) {
        return Duration.between(instant, this.d.f());
    }

    public final void c(cno cnoVar, cozl cozlVar) {
        aoku aokuVar;
        for (int i = 0; i < cnoVar.b(); i++) {
            coux couxVar = (coux) cnoVar.e(i);
            if (couxVar.k()) {
                aokuVar = null;
            } else {
                cpbd a2 = cozlVar.a(coto.c, couxVar.i, couxVar.a);
                csix.l(a2);
                csix.k(!a2.b.isEmpty());
                if (a2.b.size() == 1 && ((aoku) a2.b.get(0)).E()) {
                    csjb e = a.e();
                    e.I("MMS message has unknown sender from thread data.");
                    e.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, couxVar.a);
                    e.z("threadId", couxVar.i);
                    e.r();
                }
                Optional D = ((coxk) this.f.b()).D(a2, couxVar.a);
                if (!D.isEmpty()) {
                    aoku aokuVar2 = (aoku) D.get();
                    cfva cfvaVar = aoqm.a;
                    if (!cuxt.i(aokuVar2.k(((Boolean) new aoox().get()).booleanValue()))) {
                        aokuVar = (aoku) D.get();
                    }
                }
                csjb e2 = a.e();
                e2.I("Could not find sender of incoming MMS, using 'unknown sender'.");
                e2.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, couxVar.a);
                e2.r();
                aokuVar = ((aolr) this.u.b()).f();
                ((akzt) this.t.b()).c("Bugle.Telephony.ForwardSync.NullOrEmptyMmsSender");
            }
            couxVar.r = aokuVar;
        }
    }

    public final void d(cno cnoVar) {
        ekzz f = eleg.f("ForwardSync#setMmsSendersAndEnvelopes");
        for (int i = 0; i < cnoVar.b(); i++) {
            try {
                coux couxVar = (coux) cnoVar.e(i);
                if (couxVar.f() == null) {
                    a.r("MMS message found with null URI: " + couxVar.a);
                } else {
                    coxk coxkVar = (coxk) this.f.b();
                    Uri f2 = couxVar.f();
                    f2.getClass();
                    coxj v = coxkVar.v(f2);
                    couxVar.s = v;
                    couxVar.r = (aoku) Collection.EL.stream(((cotn) v).d).findFirst().orElse(((aolr) this.u.b()).f());
                    if (((cotn) v).d.isEmpty()) {
                        csjb e = a.e();
                        e.I("Could not find sender of incoming MMS, using 'unknown sender'.");
                        e.A(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, couxVar.a);
                        e.r();
                    }
                }
            } catch (Throwable th) {
                try {
                    f.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        f.close();
    }
}
