package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.conversation.input.compose.VideoTrimmerSource;
import j$.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xfu {
    private static final enru a = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/AttachmentInfoCreator");

    public static final eppr a(xfo xfoVar) {
        emyg emygVar;
        epog a2 = epof.a((eppq) eppr.a.createBuilder());
        Uri uri = null;
        if (xfoVar instanceof xfn) {
            xfn xfnVar = (xfn) xfoVar;
            doxs a3 = xfnVar.a();
            doxr fm = a3.fm();
            Class<?> cls = a3.getClass();
            int i = fflc.a;
            xgm.c(a2, fm, new ffkb(cls));
            doxs a4 = xfnVar.a();
            if (a4 instanceof drni) {
                drni drniVar = (drni) a4;
                if (ffkj.e(drniVar.g, doya.a)) {
                    e(a2, drniVar);
                } else {
                    eqtr a5 = eqtq.a((epqs) eprl.a.createBuilder());
                    a5.h(drniVar.d);
                    a5.e(drniVar.e);
                    a5.f(drne.a(drniVar).a());
                    d(a5, drniVar);
                    a2.d(a5.a());
                }
            } else if (a4 instanceof drnl) {
                drnl drnlVar = (drnl) a4;
                if (ffkj.e(drnlVar.f, doya.a)) {
                    e(a2, drnlVar);
                } else {
                    eqtr a6 = eqtq.a((epqs) eprl.a.createBuilder());
                    a6.h(drnlVar.c);
                    a6.e(drnlVar.d);
                    a6.f(drne.a(drnlVar).a());
                    int seconds = (int) drnlVar.g.getSeconds();
                    epqs epqsVar = a6.a;
                    epqsVar.copyOnWrite();
                    eprl eprlVar = (eprl) epqsVar.instance;
                    eprlVar.b |= 16;
                    eprlVar.h = seconds;
                    d(a6, drnlVar);
                    a2.d(a6.a());
                }
            } else if (a4 instanceof drng) {
                drng drngVar = (drng) a4;
                if (ffkj.e(drngVar.d, doya.a)) {
                    e(a2, drngVar);
                } else {
                    epps eppsVar = (epps) eppt.a.createBuilder();
                    eppsVar.getClass();
                    int seconds2 = (int) drngVar.e.getSeconds();
                    eppsVar.copyOnWrite();
                    eppt epptVar = (eppt) eppsVar.instance;
                    epptVar.b |= 1;
                    epptVar.c = seconds2;
                    eyfy build = eppsVar.build();
                    build.getClass();
                    eppq eppqVar = a2.a;
                    eppqVar.copyOnWrite();
                    eppr epprVar = (eppr) eppqVar.instance;
                    epprVar.f = (eppt) build;
                    epprVar.e = 207;
                }
            } else if (a4 instanceof doyd) {
                e(a2, (doyd) a4);
            } else if (a4 instanceof drcr) {
                drcr drcrVar = (drcr) a4;
                if (!(xfnVar instanceof xfq)) {
                    if (!(xfnVar instanceof xft)) {
                        throw new ffcd();
                    }
                    uri = ((xft) xfnVar).a;
                    if (uri == null) {
                        throw new IllegalStateException("GifMedia missing selectedUri");
                    }
                }
                c(a2, drcrVar, uri);
            } else if (a4 instanceof dsci) {
                dsci dsciVar = (dsci) a4;
                if (!(xfnVar instanceof xfq)) {
                    if (!(xfnVar instanceof xft)) {
                        throw new ffcd();
                    }
                    uri = ((xft) xfnVar).a;
                    if (uri == null) {
                        throw new IllegalStateException("StickerMedia missing selectedUri");
                    }
                }
                c(a2, dsciVar, uri);
            } else if (a4 instanceof dqzc) {
                dqzc dqzcVar = (dqzc) a4;
                eqtr a7 = eqtq.a((epqs) eprl.a.createBuilder());
                a7.h(dqzcVar.g);
                a7.e(dqzcVar.h);
                a7.f(drne.a(dqzcVar).a());
                d(a7, dqzcVar);
                a2.d(a7.a());
            }
        } else {
            if (!(xfoVar instanceof xfr)) {
                throw new ffcd();
            }
            xfr xfrVar = (xfr) xfoVar;
            xgm.c(a2, xfrVar.a.e, null);
            xhl xhlVar = xfrVar.a;
            b(a2, xhlVar.b, xhlVar.d);
        }
        if ((xfoVar instanceof xft) && (emygVar = ((xft) xfoVar).b) != null && emygVar.a) {
            eyev d = eyki.d(emygVar.a(TimeUnit.MILLISECONDS));
            d.getClass();
            eppq eppqVar2 = a2.a;
            eppqVar2.copyOnWrite();
            eppr epprVar2 = (eppr) eppqVar2.instance;
            epprVar2.i = d;
            epprVar2.b |= 1;
        }
        xgv b = xfoVar.b();
        if (b instanceof xgv) {
            epqj epqjVar = (epqj) epqk.a.createBuilder();
            epqjVar.getClass();
            boolean z = b.a;
            epqjVar.copyOnWrite();
            epqk epqkVar = (epqk) epqjVar.instance;
            epqkVar.b |= 1;
            epqkVar.c = z;
            int i2 = b.b;
            epqjVar.copyOnWrite();
            epqk epqkVar2 = (epqk) epqjVar.instance;
            epqkVar2.b |= 2;
            epqkVar2.d = i2;
            int i3 = b.c;
            epqjVar.copyOnWrite();
            epqk epqkVar3 = (epqk) epqjVar.instance;
            epqkVar3.b |= 4;
            epqkVar3.e = i3;
            eyfy build2 = epqjVar.build();
            build2.getClass();
            eppq eppqVar3 = a2.a;
            eppqVar3.copyOnWrite();
            eppr epprVar3 = (eppr) eppqVar3.instance;
            epprVar3.h = (epqk) build2;
            epprVar3.g = 301;
        } else {
            if (b != null) {
                throw new ffcd();
            }
            ensk f = a.f();
            f.Y(ente.a, "BugleComposeRow2");
            ((enrr) f.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/AttachmentInfoCreator", "setCompressionInfo", 362, "AttachmentInfoCreator.kt")).t("No compression info to add for %s", xfoVar);
        }
        return a2.a();
    }

    private static final void b(epog epogVar, drlx drlxVar, Long l) {
        epqh epqhVar = (epqh) epqi.a.createBuilder();
        epqhVar.getClass();
        if (l != null) {
            long longValue = l.longValue();
            if (longValue < 0) {
                throw new IllegalArgumentException(a.s(longValue, "File size is negative: "));
            }
            long a2 = longValue != 0 ? longValue < 7500 ? 5000L : longValue < 2000000 ? xfp.a(longValue, 10000L) : longValue < 10000000 ? xfp.a(longValue, 100000L) : xfp.a(longValue, 1000000L) : 0L;
            epqhVar.copyOnWrite();
            epqi epqiVar = (epqi) epqhVar.instance;
            epqiVar.b |= 1;
            epqiVar.c = a2;
        }
        String a3 = drlxVar.a();
        a3.getClass();
        epqhVar.copyOnWrite();
        epqi epqiVar2 = (epqi) epqhVar.instance;
        epqiVar2.b |= 2;
        epqiVar2.d = a3;
        eyfy build = epqhVar.build();
        build.getClass();
        eppq eppqVar = epogVar.a;
        eppqVar.copyOnWrite();
        eppr epprVar = (eppr) eppqVar.instance;
        eppr epprVar2 = eppr.a;
        epprVar.f = (epqi) build;
        epprVar.e = 208;
    }

    private static final void c(epog epogVar, dren drenVar, Uri uri) {
        drem dremVar;
        Object next;
        String host;
        Object obj;
        boolean z = drenVar instanceof drcr;
        if (!z && !(drenVar instanceof dsci)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (uri != null) {
            Iterator it = drenVar.c().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (ffkj.e(((drem) obj).b, uri.toString())) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            dremVar = (drem) obj;
            if (dremVar == null) {
                throw new IllegalStateException(a.j(drenVar, uri, "Selected URI ", " not found in "));
            }
            if (!ffkj.e(drenVar.a(), dremVar.e)) {
                throw new IllegalStateException(a.j(dremVar, drenVar, "GifStickerMedia and selected variation source are not equal: ", ", "));
            }
        } else {
            dremVar = null;
        }
        eqtr a2 = eqtq.a((epqs) eprl.a.createBuilder());
        if (dremVar != null) {
            a2.h(dremVar.c);
            a2.e(dremVar.d);
            a2.f(drle.b(dremVar).a());
        } else {
            Iterable c = drenVar.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : c) {
                String a3 = drle.b((drem) obj2).a();
                Object obj3 = linkedHashMap.get(a3);
                if (obj3 == null) {
                    obj3 = new ArrayList();
                    linkedHashMap.put(a3, obj3);
                }
                ((List) obj3).add(obj2);
            }
            Iterator it2 = linkedHashMap.entrySet().iterator();
            if (it2.hasNext()) {
                next = it2.next();
                if (it2.hasNext()) {
                    int size = ((List) ((Map.Entry) next).getValue()).size();
                    while (true) {
                        Object next2 = it2.next();
                        int size2 = ((List) ((Map.Entry) next2).getValue()).size();
                        int i = size < size2 ? size2 : size;
                        if (size < size2) {
                            next = next2;
                        }
                        if (!it2.hasNext()) {
                            break;
                        } else {
                            size = i;
                        }
                    }
                }
            } else {
                next = null;
            }
            Map.Entry entry = (Map.Entry) next;
            String str = entry != null ? (String) entry.getKey() : null;
            if (str == null) {
                Objects.toString(drenVar);
                throw new IllegalStateException("No most common mime type found for ".concat(drenVar.toString()));
            }
            a2.f(str);
        }
        if (z) {
            eprb eprbVar = (eprb) eprc.a.createBuilder();
            eprbVar.getClass();
            if (uri == null || (host = uri.getHost()) == null) {
                host = Uri.parse(((drcr) drenVar).b).getHost();
            }
            if (host != null) {
                eqtt.b(host, eprbVar);
            }
            a2.d(eqtt.a(eprbVar));
        } else if (drenVar instanceof dsci) {
            eprh eprhVar = (eprh) epri.a.createBuilder();
            eprhVar.getClass();
            String c2 = eerv.c(((dsci) drenVar).a);
            c2.getClass();
            eprhVar.copyOnWrite();
            epri epriVar = (epri) eprhVar.instance;
            epriVar.b |= 1;
            epriVar.c = c2;
            a2.g(eqtu.a(eprhVar));
        }
        epogVar.d(a2.a());
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static final void d(eqtr eqtrVar, drnm drnmVar) {
        int i;
        String host;
        String str;
        Uri parse = Uri.parse(drnmVar.f());
        int i2 = 3;
        if (ffkj.e(parse.getScheme(), "content") && (host = parse.getHost()) != null && ffpc.t(host, "com.google.android.inputmethod.latin")) {
            List<String> pathSegments = parse.getPathSegments();
            if (pathSegments.size() == 3 && ffkj.e(pathSegments.get(0), "content") && (str = pathSegments.get(1)) != null) {
                switch (str.hashCode()) {
                    case -1890252483:
                        if (str.equals("sticker")) {
                            eprh eprhVar = (eprh) epri.a.createBuilder();
                            eprhVar.getClass();
                            eqtrVar.g(eqtu.a(eprhVar));
                            return;
                        }
                        break;
                    case -1448896059:
                        if (str.equals("tenor_gif")) {
                            eprb eprbVar = (eprb) eprc.a.createBuilder();
                            eprbVar.getClass();
                            eqtt.b("tenor.com", eprbVar);
                            eqtrVar.d(eqtt.a(eprbVar));
                            return;
                        }
                        break;
                    case -102405906:
                        if (str.equals("bitmoji")) {
                            epqq epqqVar = (epqq) epqr.a.createBuilder();
                            epqqVar.getClass();
                            eyfy build = epqqVar.build();
                            build.getClass();
                            epqs epqsVar = eqtrVar.a;
                            epqsVar.copyOnWrite();
                            eprl eprlVar = (eprl) epqsVar.instance;
                            eprl eprlVar2 = eprl.a;
                            eprlVar.d = (epqr) build;
                            eprlVar.c = 106;
                            return;
                        }
                        break;
                    case 102340:
                        if (str.equals("gif")) {
                            eprb eprbVar2 = (eprb) eprc.a.createBuilder();
                            eprbVar2.getClass();
                            eqtrVar.d(eqtt.a(eprbVar2));
                            return;
                        }
                        break;
                    case 583427413:
                        if (str.equals("make_a_gif")) {
                            eprb eprbVar3 = (eprb) eprc.a.createBuilder();
                            eprbVar3.getClass();
                            eprbVar3.copyOnWrite();
                            eprc.a((eprc) eprbVar3.instance);
                            eqtrVar.d(eqtt.a(eprbVar3));
                            return;
                        }
                        break;
                }
            }
        }
        doxr fm = drnmVar.fm();
        if (fm instanceof dpgj) {
            dpgj dpgjVar = (dpgj) fm;
            if (!ffkj.e(dpgjVar, dpgg.a)) {
                if (!ffkj.e(dpgjVar, dpgi.a)) {
                    throw new ffcd();
                }
                epqx epqxVar = (epqx) epqy.a.createBuilder();
                epqxVar.getClass();
                eqtrVar.c(eqts.a(epqxVar));
                return;
            }
            epqz epqzVar = (epqz) epra.a.createBuilder();
            epqzVar.getClass();
            eyfy build2 = epqzVar.build();
            build2.getClass();
            epqs epqsVar2 = eqtrVar.a;
            epqsVar2.copyOnWrite();
            eprl eprlVar3 = (eprl) epqsVar2.instance;
            eprl eprlVar4 = eprl.a;
            eprlVar3.d = (epra) build2;
            eprlVar3.c = 102;
            return;
        }
        if (!(fm instanceof dpgr)) {
            if (fm instanceof VideoTrimmerSource) {
                eprj eprjVar = (eprj) eprk.a.createBuilder();
                eprjVar.getClass();
                eyfy build3 = eprjVar.build();
                build3.getClass();
                epqs epqsVar3 = eqtrVar.a;
                epqsVar3.copyOnWrite();
                eprl eprlVar5 = (eprl) epqsVar3.instance;
                eprl eprlVar6 = eprl.a;
                eprlVar5.d = (eprk) build3;
                eprlVar5.c = 108;
                return;
            }
            if (!(fm instanceof dqzn)) {
                if (fm instanceof doxm) {
                    epqx epqxVar2 = (epqx) epqy.a.createBuilder();
                    epqxVar2.getClass();
                    eqtrVar.c(eqts.a(epqxVar2));
                    return;
                } else if (fm instanceof doxq) {
                    ensk e = a.e();
                    e.Y(ente.a, "BugleComposeRow2");
                    ((enrr) e.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/AttachmentInfoCreator", "setVisualLocalMediaSource", 417, "AttachmentInfoCreator.kt")).t("Skipping MediaSource for %s", fm);
                    return;
                } else {
                    ensk i3 = a.i();
                    i3.Y(ente.a, "BugleComposeRow2");
                    ((enrr) i3.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/AttachmentInfoCreator", "setVisualLocalMediaSource", 420, "AttachmentInfoCreator.kt")).t("Cannot set MediaSource for unhandled LocalMedia source %s", fm);
                    return;
                }
            }
            epqv epqvVar = (epqv) epqw.a.createBuilder();
            epqvVar.getClass();
            boolean a2 = ((dqzn) fm).a();
            epqvVar.copyOnWrite();
            epqw epqwVar = (epqw) epqvVar.instance;
            epqwVar.b |= 1;
            epqwVar.c = a2;
            eyfy build4 = epqvVar.build();
            build4.getClass();
            epqs epqsVar4 = eqtrVar.a;
            epqsVar4.copyOnWrite();
            eprl eprlVar7 = (eprl) epqsVar4.instance;
            eprl eprlVar8 = eprl.a;
            eprlVar7.d = (epqw) build4;
            eprlVar7.c = 110;
            return;
        }
        dpgr dpgrVar = (dpgr) fm;
        if (drnmVar instanceof drni) {
            i = 2;
        } else {
            if (!(drnmVar instanceof drnl)) {
                throw new IllegalStateException("Media must be Image or Video");
            }
            i = 3;
        }
        Duration duration = drnmVar instanceof drnl ? ((drnl) drnmVar).g : null;
        if (!(dpgrVar instanceof dpgo)) {
            if (!(dpgrVar instanceof dpgq)) {
                throw new ffcd();
            }
            epqt epqtVar = (epqt) epqu.a.createBuilder();
            epqtVar.getClass();
            epso epsoVar = (epso) epsw.a.createBuilder();
            epsoVar.getClass();
            eqmy.c(i, epsoVar);
            eqmy.b(4, epsoVar);
            eqtp.b(eqmy.a(epsoVar), epqtVar);
            eqtrVar.b(eqtp.a(epqtVar));
            return;
        }
        epqt epqtVar2 = (epqt) epqu.a.createBuilder();
        epqtVar2.getClass();
        epso epsoVar2 = (epso) epsw.a.createBuilder();
        epsoVar2.getClass();
        eqmy.c(i, epsoVar2);
        dpgo dpgoVar = (dpgo) dpgrVar;
        int i4 = dpgoVar.e - 1;
        int i5 = i4 != 0 ? i4 != 1 ? 2 : 3 : 1;
        epsoVar2.copyOnWrite();
        epsw epswVar = (epsw) epsoVar2.instance;
        epswVar.d = i5 - 1;
        epswVar.b |= 2;
        int i6 = dpgoVar.f - 1;
        int i7 = i6 != 0 ? i6 != 1 ? 3 : 2 : 1;
        epsoVar2.copyOnWrite();
        epsw epswVar2 = (epsw) epsoVar2.instance;
        epswVar2.e = i7 - 1;
        epswVar2.b |= 4;
        boolean z = dpgoVar.b;
        epsoVar2.copyOnWrite();
        epsw epswVar3 = (epsw) epsoVar2.instance;
        epswVar3.b |= 8;
        epswVar3.f = z;
        if (duration != null) {
            int seconds = (int) duration.getSeconds();
            epsoVar2.copyOnWrite();
            epsw epswVar4 = (epsw) epsoVar2.instance;
            epswVar4.b |= 16;
            epswVar4.g = seconds;
        }
        int ordinal = dpgoVar.a.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i2 = 2;
            } else {
                if (ordinal != 2) {
                    throw new ffcd();
                }
                i2 = 5;
            }
        }
        eqmy.b(i2, epsoVar2);
        String str2 = dpgoVar.d;
        if (str2 != null) {
            epsoVar2.copyOnWrite();
            epsw epswVar5 = (epsw) epsoVar2.instance;
            epswVar5.b |= 32;
            epswVar5.h = str2;
        }
        eqtp.b(eqmy.a(epsoVar2), epqtVar2);
        eqtrVar.b(eqtp.a(epqtVar2));
    }

    private static final void e(epog epogVar, doyc doycVar) {
        if (!le.z(doycVar.b().a())) {
            b(epogVar, doycVar.b(), Long.valueOf(doycVar.a()));
            return;
        }
        eppu eppuVar = (eppu) eppw.a.createBuilder();
        eppuVar.getClass();
        eqnj.b(1, eppuVar);
        epogVar.b(eqnj.a(eppuVar));
    }
}
