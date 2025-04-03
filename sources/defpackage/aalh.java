package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.format.Formatter;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aalh {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/richcards/RichCardBubbleUiAdapter");
    public final Context b;
    public final ffsk c;
    public final ConversationId d;
    public final alye e;
    public final aigz f;
    public final ffji g;
    public final ffjm h;
    public final ffji i;
    public final ffji j;
    public final ffji k;
    private final ffbr l;
    private final xto m;
    private final xgp n;

    public aalh(Context context, ffsk ffskVar, ConversationId conversationId, alye alyeVar, auod auodVar, xto xtoVar, ffbr ffbrVar, aigz aigzVar, xgp xgpVar) {
        ffji a2;
        ffji a3;
        ffji a4;
        ffji a5;
        context.getClass();
        ffskVar.getClass();
        conversationId.getClass();
        alyeVar.getClass();
        auodVar.getClass();
        xtoVar.getClass();
        ffbrVar.getClass();
        aigzVar.getClass();
        this.b = context;
        this.c = ffskVar;
        this.d = conversationId;
        this.e = alyeVar;
        this.m = xtoVar;
        this.l = ffbrVar;
        this.f = aigzVar;
        this.n = xgpVar;
        a2 = axqa.a(new aakz(this), 1000L, ffskVar);
        this.g = a2;
        this.h = axqa.d(new aala(this), ffskVar);
        a3 = axqa.a(new aale(this), 1000L, ffskVar);
        this.i = a3;
        a4 = axqa.a(new aalg(this), 1000L, ffskVar);
        this.j = a4;
        a5 = axqa.a(new aaks(this), 1000L, ffskVar);
        this.k = a5;
    }

    private final docy d(aakg aakgVar, final apor aporVar) {
        apny apnyVar = (apny) aporVar;
        final appq appqVar = apnyVar.c;
        apmz apmzVar = (apmz) appqVar;
        if (!ffkj.e(apmzVar.b, Uri.EMPTY)) {
            if (!le.A(apmzVar.a)) {
                return new docv(apmzVar.b, new ffix() { // from class: aakr
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        aalh.this.k.invoke(aporVar);
                        return ffcu.a;
                    }
                }, new ffix() { // from class: aakh
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        aalh.this.i.invoke(appqVar);
                        return ffcu.a;
                    }
                });
            }
            Uri uri = apmzVar.b;
            Optional optional = apmzVar.c;
            final ffji ffjiVar = new ffji() { // from class: aakn
                @Override // defpackage.ffji
                public final Object invoke(Object obj) {
                    return ((Long) obj).toString();
                }
            };
            Optional map = optional.map(new Function() { // from class: aako
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return ffji.this.invoke(obj);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            map.getClass();
            return new docw(uri, (String) fflm.b(map), new ffix() { // from class: aakp
                @Override // defpackage.ffix
                public final Object invoke() {
                    aalh.this.k.invoke(aporVar);
                    return ffcu.a;
                }
            }, new ffix() { // from class: aakq
                @Override // defpackage.ffix
                public final Object invoke() {
                    aalh.this.j.invoke(appqVar);
                    return ffcu.a;
                }
            });
        }
        apra apraVar = apmzVar.e;
        if (apraVar != null && ((apql) apraVar).b) {
            docr g = g(aporVar);
            appq appqVar2 = apnyVar.b;
            return new docx(g, appqVar2 != null ? appqVar2.e() : null, null, new ffix() { // from class: aakl
                @Override // defpackage.ffix
                public final Object invoke() {
                    aalh aalhVar = aalh.this;
                    axol.k(aalhVar.c, null, new aakv(aalhVar, aporVar, null), 3);
                    return ffcu.a;
                }
            });
        }
        if (apraVar == null || !((apql) apraVar).c) {
            final MessageId b = aakgVar.a.b();
            docr g2 = g(aporVar);
            appq appqVar3 = apnyVar.b;
            return new docs(g2, appqVar3 != null ? appqVar3.e() : null, Formatter.formatShortFileSize(this.b, apnyVar.a.longValue()), new ffix() { // from class: aakj
                @Override // defpackage.ffix
                public final Object invoke() {
                    aalh aalhVar = aalh.this;
                    axol.k(aalhVar.c, null, new aakt(aalhVar, b, aporVar, null), 3);
                    return ffcu.a;
                }
            });
        }
        final MessageId b2 = aakgVar.a.b();
        docr g3 = g(aporVar);
        appq appqVar4 = apnyVar.b;
        return new doct(g3, appqVar4 != null ? appqVar4.e() : null, new ffix() { // from class: aaki
            @Override // defpackage.ffix
            public final Object invoke() {
                aalh aalhVar = aalh.this;
                axol.k(aalhVar.c, null, new aaku(aalhVar, b2, aporVar, null), 3);
                return ffcu.a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [dobi] */
    /* JADX WARN: Type inference failed for: r5v7, types: [dobl] */
    /* JADX WARN: Type inference failed for: r5v9, types: [dobj] */
    private final List e(List list) {
        dobk dobkVar;
        ArrayList arrayList = new ArrayList(ffdx.n(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dokm a2 = ((aaxk) this.l.b()).a((anzh) it.next());
            dobk dobkVar2 = null;
            if (a2 instanceof dokx) {
                dokx dokxVar = (dokx) a2;
                String c = dokxVar.c();
                c.getClass();
                if (dokxVar instanceof dokw) {
                    dokv dokvVar = ((dokw) dokxVar).a;
                    if (dokvVar instanceof dokt) {
                        dobkVar = new dobj(((dokt) dokvVar).a);
                    } else {
                        if (!(dokvVar instanceof doku)) {
                            throw new ffcd();
                        }
                        dobkVar = new dobl(((doku) dokvVar).a);
                    }
                    dobkVar2 = dobkVar;
                } else {
                    if (!(dokxVar instanceof dokq)) {
                        throw new ffcd();
                    }
                    dmzz dmzzVar = ((dokq) dokxVar).a;
                    if (dmzzVar != null) {
                        dobkVar2 = new dobk(dmzzVar);
                    }
                }
                dobkVar2 = new dobi(c, dobkVar2, dokxVar.a());
            }
            arrayList.add(dobkVar2);
        }
        return ffdx.aa(arrayList);
    }

    private static final apor f(apos aposVar) {
        return aposVar.a();
    }

    private static final docr g(apor aporVar) {
        return le.A(((apmz) ((apny) aporVar).c).a) ? docr.b : docr.a;
    }

    public final axrc a(ffsk ffskVar, aakg aakgVar) {
        apra apraVar;
        ffxx a2;
        appr apprVar = aakgVar.b;
        dodz b = b(aakgVar, null);
        apos a3 = apprVar.a();
        apor f = a3 != null ? f(a3) : null;
        ffxx ffygVar = (f == null || (apraVar = ((apmz) ((apny) f).c).e) == null || (a2 = aqfn.a(((apql) apraVar).a, ffskVar).a()) == null) ? new ffyg(b) : new aaky(a2, this, aakgVar);
        int i = fgcz.a;
        return axrg.a(fgbn.b(ffygVar, ffskVar, fgcy.a, b));
    }

    public final dodz b(aakg aakgVar, apqy apqyVar) {
        docp docpVar;
        doco docoVar;
        appr apprVar = aakgVar.b;
        docp docpVar2 = null;
        if (apprVar instanceof apnv) {
            appw d = apprVar.d();
            String str = d != null ? ((apnc) d).a : null;
            appw c = apprVar.c();
            String str2 = c != null ? ((apnc) c).a : null;
            apnv apnvVar = (apnv) apprVar;
            apnu apnuVar = apnvVar.a;
            if (apnuVar != null) {
                final apor f = f(apnuVar);
                if (apqyVar == null) {
                    docoVar = new doco(d(aakgVar, f));
                } else {
                    docr g = g(f);
                    appq appqVar = ((apny) f).b;
                    docoVar = new doco(new docx(g, appqVar != null ? appqVar.e() : null, Float.valueOf(apqyVar.a() / apqyVar.b()), new ffix() { // from class: aakm
                        @Override // defpackage.ffix
                        public final Object invoke() {
                            aalh aalhVar = aalh.this;
                            axol.k(aalhVar.c, null, new aalb(aalhVar, f, null), 3);
                            return ffcu.a;
                        }
                    }));
                }
            } else {
                docoVar = null;
            }
            return new dodv(str, str2, docoVar, e(apprVar.e()), apnvVar.b + (-1) != 0 ? 2 : 1, aakgVar.c, new ffix() { // from class: dodu
                @Override // defpackage.ffix
                public final Object invoke() {
                    return ffcu.a;
                }
            }, aakgVar.d);
        }
        if (!(apprVar instanceof apoq)) {
            throw new ffcd();
        }
        appw d2 = apprVar.d();
        String str3 = d2 != null ? ((apnc) d2).a : null;
        appw c2 = apprVar.c();
        String str4 = c2 != null ? ((apnc) c2).a : null;
        apop apopVar = ((apoq) apprVar).a;
        if (true != (apopVar instanceof apop)) {
            apopVar = null;
        }
        if (apopVar != null) {
            int i = apopVar.a - 1;
            int i2 = i != 0 ? i != 1 ? 264 : 168 : 112;
            final apor f2 = f(apopVar);
            if (apqyVar != null) {
                docr g2 = g(f2);
                appq appqVar2 = ((apny) f2).b;
                docpVar = new docp(new docx(g2, appqVar2 != null ? appqVar2.e() : null, Float.valueOf(apqyVar.a() / apqyVar.b()), new ffix() { // from class: aakk
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        aalh aalhVar = aalh.this;
                        axol.k(aalhVar.c, null, new aalc(aalhVar, f2, null), 3);
                        return ffcu.a;
                    }
                }), i2);
                return new dody(str3, str4, docpVar, e(apprVar.e()), aakgVar.c, aakgVar.d, 32);
            }
            docpVar2 = new docp(d(aakgVar, f2), i2);
        }
        docpVar = docpVar2;
        return new dody(str3, str4, docpVar, e(apprVar.e()), aakgVar.c, aakgVar.d, 32);
    }

    public final void c(ainw ainwVar) {
        drlx a2 = drlo.a(ainwVar.a);
        if (a2 == null) {
            return;
        }
        xto xtoVar = this.m;
        xgp xgpVar = this.n;
        xtoVar.a(new xhl(xgpVar.a(), a2, ainwVar.b, null, doxq.a));
        ensk h = a.h();
        h.Y(ente.a, "BugleRbmRichCard");
        ((enrr) h.h("com/google/android/apps/messaging/conversation2/messagelist/message/bubble/richcards/RichCardBubbleUiAdapter", "processMediaViewerResult", 440, "RichCardBubbleUiAdapter.kt")).D("Draft attachment added with uri: %s media type: %s", ainwVar.b, ainwVar.a);
    }
}
