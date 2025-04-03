package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.vcard.VCardConfig;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dvdf implements dvcp {
    private static final entd a = entd.c("GnpSdk");
    private final eafv b;
    private final String c;
    private final Context d;
    private final fazb e;
    private final eagn f;
    private final emxc g;
    private final ffbr h;
    private final eapp i;
    private final eapp j;
    private final eanl k;

    public dvdf(eafv eafvVar, String str, Context context, fazb fazbVar, eagn eagnVar, emxc emxcVar, ffbr ffbrVar, eapp eappVar, eapp eappVar2, eanl eanlVar) {
        this.b = eafvVar;
        this.c = str;
        this.d = context;
        this.e = fazbVar;
        this.f = eagnVar;
        this.g = emxcVar;
        this.h = ffbrVar;
        this.i = eappVar;
        this.j = eappVar2;
        this.k = eanlVar;
    }

    private final emxc q(dvdp dvdpVar) {
        return r(dvdpVar.e(), dvdpVar.f());
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [ealz, java.lang.Object] */
    private final emxc r(String str, String str2) {
        boolean z = false;
        if (!TextUtils.isEmpty(str) && (fdon.a.get().a() || TextUtils.isEmpty(str2))) {
            z = true;
        }
        exrk exrkVar = (exrk) ((emxn) this.g).a.b(z).c();
        exss exssVar = (exss) exst.a.createBuilder();
        exssVar.copyOnWrite();
        exst exstVar = (exst) exssVar.instance;
        exstVar.c = 3;
        exstVar.b = 1 | exstVar.b;
        exssVar.copyOnWrite();
        exst exstVar2 = (exst) exssVar.instance;
        exrkVar.getClass();
        exstVar2.d = exrkVar;
        exstVar2.b |= 2;
        if (str2 != null) {
            exssVar.copyOnWrite();
            exst exstVar3 = (exst) exssVar.instance;
            exstVar3.b |= 8;
            exstVar3.e = str2;
        }
        return emxc.j((exst) exssVar.build());
    }

    private final evva s(dvdp dvdpVar) {
        evub evubVar = dvdpVar.c().c;
        if (evubVar == null) {
            evubVar = evub.a;
        }
        evva evvaVar = (evva) evvr.a.createBuilder();
        int i = evubVar.b;
        evvaVar.copyOnWrite();
        evvr evvrVar = (evvr) evvaVar.instance;
        evvrVar.b |= 1;
        evvrVar.d = i;
        eygi eygiVar = evubVar.c;
        evvaVar.copyOnWrite();
        evvr evvrVar2 = (evvr) evvaVar.instance;
        eygi eygiVar2 = evvrVar2.c;
        if (!eygiVar2.c()) {
            evvrVar2.c = eyfy.mutableCopy(eygiVar2);
        }
        eydl.addAll(eygiVar, evvrVar2.c);
        evsp evspVar = dvdpVar.c().h;
        if (evspVar == null) {
            evspVar = evsp.a;
        }
        String str = evspVar.c == 4 ? (String) evspVar.d : "";
        if (!str.isEmpty()) {
            evvaVar.copyOnWrite();
            evvr evvrVar3 = (evvr) evvaVar.instance;
            str.getClass();
            evvrVar3.b |= 8192;
            evvrVar3.p = str;
        }
        if (dvdpVar.d() != null && dvdpVar.d().e != 0) {
            String str2 = dvdpVar.d().c;
            evvaVar.copyOnWrite();
            evvr evvrVar4 = (evvr) evvaVar.instance;
            str2.getClass();
            evvrVar4.b |= 16;
            evvrVar4.f = str2;
            long j = dvdpVar.d().e;
            evvaVar.copyOnWrite();
            evvr evvrVar5 = (evvr) evvaVar.instance;
            evvrVar5.b |= 32;
            evvrVar5.g = j;
            int v = v();
            evvaVar.copyOnWrite();
            evvr evvrVar6 = (evvr) evvaVar.instance;
            evvrVar6.t = v - 1;
            evvrVar6.b |= 262144;
            eyee eyeeVar = dvdpVar.d().f;
            evvaVar.copyOnWrite();
            evvr evvrVar7 = (evvr) evvaVar.instance;
            eyeeVar.getClass();
            evvrVar7.b = 4 | evvrVar7.b;
            evvrVar7.e = eyeeVar;
        }
        if (!TextUtils.isEmpty(((eagl) this.f).a)) {
            eagn eagnVar = this.f;
            evvaVar.copyOnWrite();
            evvr evvrVar8 = (evvr) evvaVar.instance;
            evvrVar8.b |= 64;
            evvrVar8.h = ((eagl) eagnVar).a;
        }
        Object obj = ((emxn) q(dvdpVar)).a;
        evvaVar.copyOnWrite();
        evvr evvrVar9 = (evvr) evvaVar.instance;
        evvrVar9.s = (exst) obj;
        evvrVar9.b |= 131072;
        return evvaVar;
    }

    private final void t(dvdp dvdpVar, evuu evuuVar, evut evutVar) {
        u(dvdpVar.e(), evuuVar, evutVar);
    }

    private final void u(String str, evuu evuuVar, evut evutVar) {
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evuv evuvVar2 = evuv.a;
        String str2 = this.c;
        str2.getClass();
        evuvVar.b |= 1;
        evuvVar.c = str2;
        evutVar.copyOnWrite();
        evuv evuvVar3 = (evuv) evutVar.instance;
        evuvVar3.b |= 4;
        evuvVar3.d = 728121172;
        String a2 = dvdl.a(this.d);
        evutVar.copyOnWrite();
        evuv evuvVar4 = (evuv) evutVar.instance;
        a2.getClass();
        evuvVar4.b |= 8;
        evuvVar4.e = a2;
        evuv evuvVar5 = (evuv) evutVar.build();
        int i = 0;
        ((efkw) ((ears) this.e.b()).r.get()).a(this.c, easp.a(str), evuuVar.name());
        dflc j = ((dfld) this.b.a(str)).j(evuvVar5, dtql.b(this.d, new evvs()));
        j.i(evuuVar.bL);
        j.c();
        entd entdVar = a;
        ((ensz) entdVar.o().h("com/google/android/libraries/internal/growth/growthkit/internal/clearcut/impl/ClearcutLoggerImpl", "sendLogMessage", 609, "ClearcutLoggerImpl.java")).D("Logged %s for %s", evuuVar, str);
        entdVar.getClass();
        if (evuvVar5 == null) {
            return;
        }
        entdVar.o().t("Dumping proto %s", evuvVar5);
        String a3 = eafw.a(evuvVar5);
        int ceil = (int) Math.ceil(a3.length() / 3500.0d);
        while (i < ceil) {
            int i2 = i * 3500;
            i++;
            String substring = a3.substring(i2, Math.min(i * 3500, a3.length()));
            substring.getClass();
            entdVar.o().J("(%d/%d) %s", Integer.valueOf(i), Integer.valueOf(ceil), substring);
        }
    }

    private final int v() {
        int ordinal = ((eaki) this.h.b()).ordinal();
        if (ordinal == 0) {
            return 4;
        }
        if (ordinal == 1) {
            return 2;
        }
        if (ordinal == 2) {
            return 5;
        }
        if (ordinal == 3) {
            return 3;
        }
        if (ordinal != 4) {
            return ordinal != 5 ? 1 : 7;
        }
        return 6;
    }

    @Override // defpackage.dvcp
    public final void a(dvdp dvdpVar, boolean z, evsn evsnVar) {
        evuw evuwVar = (evuw) evux.a.createBuilder();
        int v = v();
        evuwVar.copyOnWrite();
        evux evuxVar = (evux) evuwVar.instance;
        evuxVar.e = v - 1;
        evuxVar.b |= 8;
        evuy evuyVar = (evuy) evuz.a.createBuilder();
        evsl evslVar = z ? evsl.ANDROID_PERMISSION_STATE_AUTHORIZED : evsl.ANDROID_PERMISSION_STATE_DENIED;
        evuyVar.copyOnWrite();
        evuz evuzVar = (evuz) evuyVar.instance;
        evuzVar.d = evslVar.a();
        evuzVar.b |= 8;
        evuyVar.copyOnWrite();
        evuz evuzVar2 = (evuz) evuyVar.instance;
        evuzVar2.c = evsnVar.a();
        evuzVar2.b |= 4;
        evuwVar.copyOnWrite();
        evux evuxVar2 = (evux) evuwVar.instance;
        evuz evuzVar3 = (evuz) evuyVar.build();
        evuzVar3.getClass();
        evuxVar2.c = evuzVar3;
        evuxVar2.b |= 2;
        if (dvdpVar.d() != null) {
            String str = dvdpVar.d().c;
            evuwVar.copyOnWrite();
            evux evuxVar3 = (evux) evuwVar.instance;
            str.getClass();
            evuxVar3.b |= 64;
            evuxVar3.h = str;
            long j = dvdpVar.d().e;
            evuwVar.copyOnWrite();
            evux evuxVar4 = (evux) evuwVar.instance;
            evuxVar4.b |= 4;
            evuxVar4.d = j;
            eyee eyeeVar = dvdpVar.d().f;
            evuwVar.copyOnWrite();
            evux evuxVar5 = (evux) evuwVar.instance;
            eyeeVar.getClass();
            evuxVar5.b |= 128;
            evuxVar5.i = eyeeVar;
        }
        if (!TextUtils.isEmpty(((eagl) this.f).a)) {
            eagn eagnVar = this.f;
            evuwVar.copyOnWrite();
            evux evuxVar6 = (evux) evuwVar.instance;
            evuxVar6.b |= 32;
            evuxVar6.g = ((eagl) eagnVar).a;
        }
        Object obj = ((emxn) q(dvdpVar)).a;
        evuwVar.copyOnWrite();
        evux evuxVar7 = (evux) evuwVar.instance;
        evuxVar7.f = (exst) obj;
        evuxVar7.b |= 16;
        evut evutVar = (evut) evuv.a.createBuilder();
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evux evuxVar8 = (evux) evuwVar.build();
        evuxVar8.getClass();
        evuvVar.g = evuxVar8;
        evuvVar.b |= 16777216;
        t(dvdpVar, z ? evuu.USER_AUTHORIZED_PERMISSION : evuu.USER_DENIED_PERMISSION, evutVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dvcp
    public final void b(enhk enhkVar, engw engwVar, String str) {
        engr engrVar = new engr();
        enqu listIterator = enhkVar.entrySet().listIterator();
        while (listIterator.hasNext()) {
            Map.Entry entry = (Map.Entry) listIterator.next();
            evuy evuyVar = (evuy) evuz.a.createBuilder();
            evsn evsnVar = (evsn) entry.getKey();
            evuyVar.copyOnWrite();
            evuz evuzVar = (evuz) evuyVar.instance;
            evuzVar.c = evsnVar.a();
            evuzVar.b |= 4;
            evsl evslVar = (evsl) entry.getValue();
            evuyVar.copyOnWrite();
            evuz evuzVar2 = (evuz) evuyVar.instance;
            evuzVar2.d = evslVar.a();
            evuzVar2.b |= 8;
            engrVar.h((evuz) evuyVar.build());
        }
        evur evurVar = (evur) evus.a.createBuilder();
        engw g = engrVar.g();
        evurVar.copyOnWrite();
        evus evusVar = (evus) evurVar.instance;
        eygr eygrVar = evusVar.c;
        if (!eygrVar.c()) {
            evusVar.c = eyfy.mutableCopy(eygrVar);
        }
        eydl.addAll(g, evusVar.c);
        if (!TextUtils.isEmpty(str)) {
            evurVar.copyOnWrite();
            evus evusVar2 = (evus) evurVar.instance;
            evusVar2.b |= 16;
            evusVar2.d = str;
        }
        evut evutVar = (evut) evuv.a.createBuilder();
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evus evusVar3 = (evus) evurVar.build();
        evusVar3.getClass();
        evuvVar.f = evusVar3;
        evuvVar.b |= 512;
        int size = engwVar.size();
        for (int i = 0; i < size; i++) {
            u((String) engwVar.get(i), evuu.PERIODIC_APPLICATION_STATE, evutVar);
        }
        u(null, evuu.PERIODIC_APPLICATION_STATE, evutVar);
    }

    @Override // defpackage.dvcp
    public final void c(dvdp dvdpVar, List list) {
        evut evutVar = (evut) evuv.a.createBuilder();
        evva s = s(dvdpVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dvgk dvgkVar = (dvgk) it.next();
            int i = 1;
            if (dvgkVar == null) {
                s.a(1);
            } else {
                switch (dvgkVar) {
                    case BATTERY:
                        i = 6;
                        break;
                    case INSTALLED_APPS:
                        i = 7;
                        break;
                    case NETWORK:
                        i = 2;
                        break;
                    case LANGUAGE:
                        i = 4;
                        break;
                    case TIME_CONSTRAINT:
                        i = 10;
                        break;
                    case DISPLAY_WITHOUT_NEW_SYNC:
                        i = 11;
                        break;
                    case VALID_INTENT:
                        i = 12;
                        break;
                    case DASHER_FILTER:
                        i = 13;
                        break;
                    case MINOR_FILTER:
                        i = 14;
                        break;
                }
                s.a(i);
            }
        }
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evvr evvrVar = (evvr) s.build();
        evvrVar.getClass();
        evuvVar.h = evvrVar;
        evuvVar.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        t(dvdpVar, evuu.PROMO_CONDITIONS_EVALUATED, evutVar);
    }

    @Override // defpackage.dvcp
    public final void d(dvdp dvdpVar) {
        evut evutVar = (evut) evuv.a.createBuilder();
        evva s = s(dvdpVar);
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evvr evvrVar = (evvr) s.build();
        evvrVar.getClass();
        evuvVar.h = evvrVar;
        evuvVar.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        t(dvdpVar, evuu.PROMO_EXPIRED, evutVar);
    }

    @Override // defpackage.dvcp
    public final void e(dvdp dvdpVar, eycm eycmVar) {
        evut evutVar = (evut) evuv.a.createBuilder();
        evva s = s(dvdpVar);
        evvl evvlVar = (evvl) dvcw.a.fP(eycmVar);
        s.copyOnWrite();
        evvr evvrVar = (evvr) s.instance;
        evvr evvrVar2 = evvr.a;
        evvrVar.m = evvlVar.G;
        evvrVar.b |= 512;
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evvr evvrVar3 = (evvr) s.build();
        evvrVar3.getClass();
        evuvVar.h = evvrVar3;
        evuvVar.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        t(dvdpVar, evuu.PROMO_NOT_SHOWN, evutVar);
    }

    @Override // defpackage.dvcp
    public final void f(dvdp dvdpVar, dvdq dvdqVar) {
        evva s = s(dvdpVar);
        evvi evviVar = (evvi) dvcw.d.fP(dvdqVar.c());
        s.copyOnWrite();
        evvr evvrVar = (evvr) s.instance;
        evvr evvrVar2 = evvr.a;
        evviVar.getClass();
        evvrVar.r = evviVar;
        evvrVar.b |= 65536;
        evvl evvlVar = evvl.PROMO_NOT_SHOWN_CONTROL_GROUP;
        s.copyOnWrite();
        evvr evvrVar3 = (evvr) s.instance;
        evvrVar3.m = evvlVar.G;
        evvrVar3.b |= 512;
        evut evutVar = (evut) evuv.a.createBuilder();
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evvr evvrVar4 = (evvr) s.build();
        evvrVar4.getClass();
        evuvVar.h = evvrVar4;
        evuvVar.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        t(dvdpVar, evuu.PROMO_NOT_SHOWN, evutVar);
        ((ears) this.e.b()).e(this.c, "CONTROL_NOT_SEEN");
    }

    @Override // defpackage.dvcp
    public final void g(dvdp dvdpVar) {
        evut evutVar = (evut) evuv.a.createBuilder();
        evva s = s(dvdpVar);
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evvr evvrVar = (evvr) s.build();
        evvrVar.getClass();
        evuvVar.h = evvrVar;
        evuvVar.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        t(dvdpVar, evuu.PROMO_NOT_SHOWN_DEVICE_CAPPED, evutVar);
    }

    @Override // defpackage.dvcp
    public final void h(dvdp dvdpVar, dvqt dvqtVar) {
        if (dvqt.SUCCESS.equals(dvqtVar)) {
            return;
        }
        evut evutVar = (evut) evuv.a.createBuilder();
        evva s = s(dvdpVar);
        switch (dvqtVar.ordinal()) {
            case 2:
                evvl evvlVar = evvl.PROMO_NOT_SHOWN_INTERNAL_ERROR;
                s.copyOnWrite();
                evvr evvrVar = (evvr) s.instance;
                evvr evvrVar2 = evvr.a;
                evvrVar.m = evvlVar.G;
                evvrVar.b |= 512;
                break;
            case 3:
                evvl evvlVar2 = evvl.PROMO_NOT_SHOWN_UNSUPPORTED_PROMO_UI;
                s.copyOnWrite();
                evvr evvrVar3 = (evvr) s.instance;
                evvr evvrVar4 = evvr.a;
                evvrVar3.m = evvlVar2.G;
                evvrVar3.b |= 512;
                break;
            case 4:
                evvl evvlVar3 = evvl.PROMO_NOT_SHOWN_UNSUPPORTED_CUSTOM_UI_TYPE;
                s.copyOnWrite();
                evvr evvrVar5 = (evvr) s.instance;
                evvr evvrVar6 = evvr.a;
                evvrVar5.m = evvlVar3.G;
                evvrVar5.b |= 512;
                break;
            case 5:
                evvl evvlVar4 = evvl.PROMO_NOT_SHOWN_THEME_NOT_FOUND;
                s.copyOnWrite();
                evvr evvrVar7 = (evvr) s.instance;
                evvr evvrVar8 = evvr.a;
                evvrVar7.m = evvlVar4.G;
                evvrVar7.b |= 512;
                break;
            case 6:
                evvl evvlVar5 = evvl.PROMO_NOT_SHOWN_APPLICATION_IN_BACKGROUND;
                s.copyOnWrite();
                evvr evvrVar9 = (evvr) s.instance;
                evvr evvrVar10 = evvr.a;
                evvrVar9.m = evvlVar5.G;
                evvrVar9.b |= 512;
                break;
            case 7:
                evvl evvlVar6 = evvl.PROMO_NOT_SHOWN_VIEW_NOT_IN_SCREEN;
                s.copyOnWrite();
                evvr evvrVar11 = (evvr) s.instance;
                evvr evvrVar12 = evvr.a;
                evvrVar11.m = evvlVar6.G;
                evvrVar11.b |= 512;
                break;
            case 8:
                evvl evvlVar7 = evvl.PROMO_NOT_SHOWN_VIEW_MOSTLY_HIDDEN;
                s.copyOnWrite();
                evvr evvrVar13 = (evvr) s.instance;
                evvr evvrVar14 = evvr.a;
                evvrVar13.m = evvlVar7.G;
                evvrVar13.b |= 512;
                break;
            case 9:
                evvl evvlVar8 = evvl.PROMO_NOT_SHOWN_MISSING_ASSETS;
                s.copyOnWrite();
                evvr evvrVar15 = (evvr) s.instance;
                evvr evvrVar16 = evvr.a;
                evvrVar15.m = evvlVar8.G;
                evvrVar15.b |= 512;
                break;
            case 10:
                evvl evvlVar9 = evvl.PROMO_NOT_SHOWN_INVALID_PROMOTION;
                s.copyOnWrite();
                evvr evvrVar17 = (evvr) s.instance;
                evvr evvrVar18 = evvr.a;
                evvrVar17.m = evvlVar9.G;
                evvrVar17.b |= 512;
                break;
            case 11:
                evvl evvlVar10 = evvl.PROMO_NOT_SHOWN_INVALID_CUSTOM_UI_PROTO;
                s.copyOnWrite();
                evvr evvrVar19 = (evvr) s.instance;
                evvr evvrVar20 = evvr.a;
                evvrVar19.m = evvlVar10.G;
                evvrVar19.b |= 512;
                break;
            case 12:
                evvl evvlVar11 = evvl.PROMO_NOT_SHOWN_PERMISSION_GRANTED;
                s.copyOnWrite();
                evvr evvrVar21 = (evvr) s.instance;
                evvr evvrVar22 = evvr.a;
                evvrVar21.m = evvlVar11.G;
                evvrVar21.b |= 512;
                break;
            default:
                evvl evvlVar12 = evvl.PROMO_NOT_SHOWN_RENDERER_INTERNAL_ERROR;
                s.copyOnWrite();
                evvr evvrVar23 = (evvr) s.instance;
                evvr evvrVar24 = evvr.a;
                evvrVar23.m = evvlVar12.G;
                evvrVar23.b |= 512;
                break;
        }
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evvr evvrVar25 = (evvr) s.build();
        evvrVar25.getClass();
        evuvVar.h = evvrVar25;
        evuvVar.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        t(dvdpVar, evuu.PROMO_NOT_SHOWN, evutVar);
    }

    @Override // defpackage.dvcp
    public final void i(dvdp dvdpVar) {
        evut evutVar = (evut) evuv.a.createBuilder();
        evva s = s(dvdpVar);
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evvr evvrVar = (evvr) s.build();
        evvrVar.getClass();
        evuvVar.h = evvrVar;
        evuvVar.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        t(dvdpVar, evuu.PROMO_SENT_FOR_RENDERING, evutVar);
    }

    @Override // defpackage.dvcp
    public final void j(dvdp dvdpVar, dvdq dvdqVar) {
        evva s = s(dvdpVar);
        evvi evviVar = (evvi) dvcw.d.fP(dvdqVar.c());
        s.copyOnWrite();
        evvr evvrVar = (evvr) s.instance;
        evvr evvrVar2 = evvr.a;
        evviVar.getClass();
        evvrVar.r = evviVar;
        evvrVar.b |= 65536;
        evut evutVar = (evut) evuv.a.createBuilder();
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evvr evvrVar3 = (evvr) s.build();
        evvrVar3.getClass();
        evuvVar.h = evvrVar3;
        evuvVar.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        t(dvdpVar, evuu.PROMO_SHOWN, evutVar);
    }

    @Override // defpackage.dvcp
    public final void k(dvdp dvdpVar, boolean z, enip enipVar) {
        evva s = s(dvdpVar);
        s.copyOnWrite();
        evvr evvrVar = (evvr) s.instance;
        evvr evvrVar2 = evvr.a;
        evvrVar.b |= 256;
        evvrVar.j = z;
        if (z && !enipVar.isEmpty()) {
            enin eninVar = new enin();
            enqu listIterator = enipVar.listIterator();
            while (listIterator.hasNext()) {
                eninVar.c((evvo) dvcw.c.fP((eycp) listIterator.next()));
            }
            enip g = eninVar.g();
            s.copyOnWrite();
            evvr evvrVar3 = (evvr) s.instance;
            eygi eygiVar = evvrVar3.k;
            if (!eygiVar.c()) {
                evvrVar3.k = eyfy.mutableCopy(eygiVar);
            }
            Iterator<E> it = g.iterator();
            while (it.hasNext()) {
                evvrVar3.k.h(((evvo) it.next()).n);
            }
        }
        evut evutVar = (evut) evuv.a.createBuilder();
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evvr evvrVar4 = (evvr) s.build();
        evvrVar4.getClass();
        evuvVar.h = evvrVar4;
        evuvVar.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        t(dvdpVar, evuu.PROMO_TARGETING_EVALUATED, evutVar);
    }

    @Override // defpackage.dvcp
    public final void l(dvdp dvdpVar, int i) {
        evva s = s(dvdpVar);
        s.copyOnWrite();
        evvr evvrVar = (evvr) s.instance;
        evvr evvrVar2 = evvr.a;
        evvrVar.b |= 128;
        evvrVar.i = i;
        evut evutVar = (evut) evuv.a.createBuilder();
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evvr evvrVar3 = (evvr) s.build();
        evvrVar3.getClass();
        evuvVar.h = evvrVar3;
        evuvVar.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        t(dvdpVar, evuu.PROMO_TRIGGERED, evutVar);
    }

    @Override // defpackage.dvcp
    public final void m(dvdp dvdpVar, eycq eycqVar) {
        evvq evvqVar = (evvq) dvcw.b.fP(eycqVar);
        evut evutVar = (evut) evuv.a.createBuilder();
        evva s = s(dvdpVar);
        s.copyOnWrite();
        evvr evvrVar = (evvr) s.instance;
        evvr evvrVar2 = evvr.a;
        evvrVar.o = evvqVar.f;
        evvrVar.b |= 2048;
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evvr evvrVar3 = (evvr) s.build();
        evvrVar3.getClass();
        evuvVar.h = evvrVar3;
        evuvVar.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        t(dvdpVar, evuu.PROMO_USER_ACTION, evutVar);
        ((ears) this.e.b()).e(this.c, evvqVar.name());
    }

    @Override // defpackage.dvcp
    public final void n(dvdp dvdpVar) {
        evut evutVar = (evut) evuv.a.createBuilder();
        evva s = s(dvdpVar);
        evvq evvqVar = evvq.ACTION_DISMISS;
        s.copyOnWrite();
        evvr evvrVar = (evvr) s.instance;
        evvr evvrVar2 = evvr.a;
        evvrVar.o = evvqVar.f;
        evvrVar.b |= 2048;
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evvr evvrVar3 = (evvr) s.build();
        evvrVar3.getClass();
        evuvVar.h = evvrVar3;
        evuvVar.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        t(dvdpVar, evuu.PROMO_USER_DISMISSED, evutVar);
        ((ears) this.e.b()).e(this.c, "DISMISSED");
    }

    @Override // defpackage.dvcp
    public final void o(dvdp dvdpVar, int i) {
        evut evutVar = (evut) evuv.a.createBuilder();
        evva s = s(dvdpVar);
        evvl evvlVar = evvl.PROMO_NOT_SHOWN_CLIENT_BLOCK;
        s.copyOnWrite();
        evvr evvrVar = (evvr) s.instance;
        evvr evvrVar2 = evvr.a;
        evvrVar.m = evvlVar.G;
        evvrVar.b |= 512;
        if (i - 1 != 1) {
            s.copyOnWrite();
            evvr evvrVar3 = (evvr) s.instance;
            evvrVar3.n = 0;
            evvrVar3.b |= 1024;
        } else {
            s.copyOnWrite();
            evvr evvrVar4 = (evvr) s.instance;
            evvrVar4.n = 1;
            evvrVar4.b |= 1024;
        }
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evvr evvrVar5 = (evvr) s.build();
        evvrVar5.getClass();
        evuvVar.h = evvrVar5;
        evuvVar.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        t(dvdpVar, evuu.PROMO_NOT_SHOWN, evutVar);
    }

    @Override // defpackage.dvcp
    public final void p(String str, int i, boolean z) {
        String str2;
        evva evvaVar = (evva) evvr.a.createBuilder();
        evvaVar.copyOnWrite();
        evvr evvrVar = (evvr) evvaVar.instance;
        evvrVar.q = i - 1;
        evvrVar.b |= 32768;
        eagt b = (this.k.e() ? this.j : this.i).b(easz.a(str));
        if (b != null) {
            str2 = b.p();
            String n = b.n();
            if (!TextUtils.isEmpty(n) && n.length() > 4) {
                StringBuilder sb = new StringBuilder();
                sb.append(n.substring(n.length() - 4));
                List e = (this.k.e() ? this.j : this.i).e();
                boolean z2 = e.size() > ((enip) Collection.EL.stream(e).map(new Function() { // from class: dvdd
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((eagt) obj).s();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).map(new Function() { // from class: dvde
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((easy) obj).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(endq.b)).size();
                sb.append(";DB_Multiple_Entries:");
                sb.append(z2);
                String sb2 = sb.toString();
                evvaVar.copyOnWrite();
                evvr evvrVar2 = (evvr) evvaVar.instance;
                evvrVar2.b |= 524288;
                evvrVar2.u = sb2;
            }
        } else {
            str2 = null;
        }
        if (!TextUtils.isEmpty(((eagl) this.f).a)) {
            eagn eagnVar = this.f;
            evvaVar.copyOnWrite();
            evvr evvrVar3 = (evvr) evvaVar.instance;
            evvrVar3.b |= 64;
            evvrVar3.h = ((eagl) eagnVar).a;
        }
        Object obj = ((emxn) r(str, str2)).a;
        evvaVar.copyOnWrite();
        evvr evvrVar4 = (evvr) evvaVar.instance;
        evvrVar4.s = (exst) obj;
        evvrVar4.b |= 131072;
        evut evutVar = (evut) evuv.a.createBuilder();
        evutVar.copyOnWrite();
        evuv evuvVar = (evuv) evutVar.instance;
        evvr evvrVar5 = (evvr) evvaVar.build();
        evvrVar5.getClass();
        evuvVar.h = evvrVar5;
        evuvVar.b |= VCardConfig.FLAG_APPEND_TYPE_PARAM;
        u(str, z ? evuu.PROMO_SYNC_SUCCESS : evuu.PROMO_SYNC_ERROR, evutVar);
    }
}
