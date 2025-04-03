package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;
import com.google.android.apps.messaging.shared.conversation.draft.IncomingDraft;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abac implements aaxk {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/suggestion/SuggestionUiAdapterImpl");
    public static final Map b = ffew.g(new ffcf(8, abgh.a), new ffcf(9, abgh.b), new ffcf(10, abgh.c));
    public static final Map c = ffew.g(new ffcf(abgh.a, eqej.TEXT), new ffcf(abgh.b, eqej.AUDIO), new ffcf(abgh.c, eqej.VIDEO));
    public static final Map d = ffew.g(new ffcf(11, eqeo.WEBVIEW), new ffcf(1, eqeo.BROWSER));
    public final ffbr A;
    public final ffbr B;
    public final ajjc C;
    public final ffbr D;
    public final ffbr E;
    public final ffbr F;
    public final ffbr G;
    public final ffbr H;
    public final ffbr I;
    public final aaxh J;
    public final xgp K;
    private final Optional L;
    private final ffbr M;
    private final ffbr N;
    private final ffbr O;
    private final ffbr P;
    private final ffbz Q;
    private final ffbz R;
    public final ffsk e;
    public final ffsk f;
    public final Context g;
    public final Conversation h;
    public final alxs i;
    public final alxu j;
    public final ffxx k;
    public final ffbr l;
    public final ffbr m;
    public final ffbr n;
    public final ffbr o;
    public final ffbr p;
    public final ffbr q;
    public final ffbr r;
    public final ffbr s;
    public final ffbr t;
    public final ffbr u;
    public final ffbr v;
    public final ffbr w;
    public final ffbr x;
    public final ffbr y;
    public final ffbr z;

    public abac(ffsk ffskVar, ffsk ffskVar2, Context context, Conversation conversation, alxs alxsVar, alxu alxuVar, ffxx ffxxVar, ffbr ffbrVar, @asgu ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, Optional optional, ffbr ffbrVar11, ffbr ffbrVar12, ffbr ffbrVar13, ffbr ffbrVar14, ffbr ffbrVar15, ffbr ffbrVar16, ffbr ffbrVar17, final ffbr ffbrVar18, final ffbr ffbrVar19, ffbr ffbrVar20, ffbr ffbrVar21, ffbr ffbrVar22, ffbr ffbrVar23, ajjc ajjcVar, ffbr ffbrVar24, ffbr ffbrVar25, ffbr ffbrVar26, ffbr ffbrVar27, ffbr ffbrVar28, ffbr ffbrVar29, aaxh aaxhVar, xgp xgpVar) {
        ffskVar.getClass();
        ffskVar2.getClass();
        context.getClass();
        conversation.getClass();
        alxsVar.getClass();
        alxuVar.getClass();
        ffxxVar.getClass();
        ffbrVar2.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        ffbrVar7.getClass();
        ffbrVar11.getClass();
        ffbrVar12.getClass();
        ffbrVar13.getClass();
        ffbrVar15.getClass();
        ffbrVar16.getClass();
        ffbrVar17.getClass();
        ffbrVar19.getClass();
        ffbrVar20.getClass();
        ffbrVar21.getClass();
        ffbrVar23.getClass();
        ajjcVar.getClass();
        ffbrVar24.getClass();
        ffbrVar25.getClass();
        ffbrVar27.getClass();
        ffbrVar29.getClass();
        this.e = ffskVar;
        this.f = ffskVar2;
        this.g = context;
        this.h = conversation;
        this.i = alxsVar;
        this.j = alxuVar;
        this.k = ffxxVar;
        this.l = ffbrVar;
        this.m = ffbrVar2;
        this.n = ffbrVar3;
        this.o = ffbrVar4;
        this.p = ffbrVar5;
        this.q = ffbrVar6;
        this.r = ffbrVar7;
        this.s = ffbrVar8;
        this.t = ffbrVar9;
        this.u = ffbrVar10;
        this.L = optional;
        this.M = ffbrVar11;
        this.v = ffbrVar12;
        this.w = ffbrVar13;
        this.x = ffbrVar14;
        this.y = ffbrVar15;
        this.z = ffbrVar16;
        this.A = ffbrVar17;
        this.B = ffbrVar20;
        this.N = ffbrVar21;
        this.O = ffbrVar22;
        this.P = ffbrVar23;
        this.C = ajjcVar;
        this.D = ffbrVar24;
        this.E = ffbrVar25;
        this.F = ffbrVar26;
        this.G = ffbrVar27;
        this.H = ffbrVar28;
        this.I = ffbrVar29;
        this.J = aaxhVar;
        this.K = xgpVar;
        this.Q = ffca.a(new ffix() { // from class: aaxy
            @Override // defpackage.ffix
            public final Object invoke() {
                Optional optional2;
                Object b2 = this.m.b();
                b2.getClass();
                ffbr ffbrVar30 = true != ((Boolean) b2).booleanValue() ? null : ffbr.this;
                if (ffbrVar30 == null || (optional2 = (Optional) ffbrVar30.b()) == null) {
                    return null;
                }
                return (yqv) fflm.b(optional2);
            }
        });
        this.R = ffca.a(new ffix() { // from class: aaxz
            @Override // defpackage.ffix
            public final Object invoke() {
                enru enruVar = abac.a;
                return (xih) ffbr.this.b();
            }
        });
    }

    public static final ComposeRowState o(String str, abgh abghVar) {
        IncomingDraft a2;
        ComposeRowState a3;
        IncomingDraft a4;
        IncomingDraft a5;
        int ordinal = abghVar.ordinal();
        if (ordinal == 0) {
            a2 = aygw.a(aygq.m, str, ffel.a, null);
            a3 = aygi.a(a2, 0);
            return a3;
        }
        if (ordinal == 1) {
            a4 = aygw.a(aygq.m, str, ffel.a, null);
            return aygi.a(a4, 1);
        }
        if (ordinal != 2) {
            throw new ffcd();
        }
        a5 = aygw.a(aygq.m, str, ffel.a, null);
        return aygi.a(a5, 2);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ffbr, java.lang.Object] */
    @Override // defpackage.aaxk
    public final dokm a(final anzh anzhVar) {
        dokm a2;
        anzhVar.getClass();
        if (this.L.isEmpty() || (a2 = ((abad) this.L.get().b()).a(anzhVar)) == null) {
            return null;
        }
        if (anzhVar instanceof SmartSuggestionData) {
            ffix b2 = axqa.b(new ffix() { // from class: aaxu
                @Override // defpackage.ffix
                public final Object invoke() {
                    ffix ffixVar;
                    ffix aaxwVar;
                    anzh anzhVar2 = anzhVar;
                    final SmartSuggestionData smartSuggestionData = (SmartSuggestionData) anzhVar2;
                    int ordinal = smartSuggestionData.l().ordinal();
                    final abac abacVar = abac.this;
                    switch (ordinal) {
                        case 0:
                        case 4:
                        case 6:
                        case 7:
                        case 8:
                        case 10:
                        case 14:
                        case 17:
                        case 18:
                        case 19:
                        case 20:
                        case 21:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 40:
                            ffixVar = new ffix() { // from class: aayh
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    enru enruVar = abac.a;
                                    return ffcu.a;
                                }
                            };
                            ffixVar.invoke();
                            axol.k(abacVar.f, null, new aaym(abacVar, anzhVar2, null), 3);
                            return ffcu.a;
                        case 1:
                        case 2:
                        case 15:
                        case 16:
                            aaxwVar = new aaxw(abacVar, smartSuggestionData);
                            ffixVar = aaxwVar;
                            ffixVar.invoke();
                            axol.k(abacVar.f, null, new aaym(abacVar, anzhVar2, null), 3);
                            return ffcu.a;
                        case 3:
                            ffixVar = new ffix() { // from class: aayd
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    ((xie) abac.this.o.b()).c(new xic(yru.a));
                                    return ffcu.a;
                                }
                            };
                            ffixVar.invoke();
                            axol.k(abacVar.f, null, new aaym(abacVar, anzhVar2, null), 3);
                            return ffcu.a;
                        case 5:
                            aaxwVar = new ffix() { // from class: aayj
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    ((xie) abac.this.o.b()).c(new xhz(xhw.b, smartSuggestionData.p()));
                                    return ffcu.a;
                                }
                            };
                            ffixVar = aaxwVar;
                            ffixVar.invoke();
                            axol.k(abacVar.f, null, new aaym(abacVar, anzhVar2, null), 3);
                            return ffcu.a;
                        case 9:
                            ffixVar = new ffix() { // from class: aaxm
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    ((xie) abac.this.o.b()).c(xia.a);
                                    return ffcu.a;
                                }
                            };
                            ffixVar.invoke();
                            axol.k(abacVar.f, null, new aaym(abacVar, anzhVar2, null), 3);
                            return ffcu.a;
                        case 11:
                            ffixVar = new ffix() { // from class: aaxn
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    enru enruVar = abac.a;
                                    return ffcu.a;
                                }
                            };
                            ffixVar.invoke();
                            axol.k(abacVar.f, null, new aaym(abacVar, anzhVar2, null), 3);
                            return ffcu.a;
                        case 12:
                            aaxwVar = new ffix() { // from class: aaxq
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    abac abacVar2 = abac.this;
                                    SmartSuggestionData smartSuggestionData2 = smartSuggestionData;
                                    abacVar2.k(smartSuggestionData2.o(), smartSuggestionData2.u());
                                    return ffcu.a;
                                }
                            };
                            ffixVar = aaxwVar;
                            ffixVar.invoke();
                            axol.k(abacVar.f, null, new aaym(abacVar, anzhVar2, null), 3);
                            return ffcu.a;
                        case 13:
                            ffixVar = new aayb(abacVar);
                            ffixVar.invoke();
                            axol.k(abacVar.f, null, new aaym(abacVar, anzhVar2, null), 3);
                            return ffcu.a;
                        case 22:
                            aaxwVar = new ffix() { // from class: aaxo
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    ((crnc) abac.this.r.b()).e(smartSuggestionData, fbqp.CONVERSATION_VIEW);
                                    return ffcu.a;
                                }
                            };
                            ffixVar = aaxwVar;
                            ffixVar.invoke();
                            axol.k(abacVar.f, null, new aaym(abacVar, anzhVar2, null), 3);
                            return ffcu.a;
                        case 23:
                            aaxwVar = new ffix() { // from class: aaxp
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    SmartSuggestionData smartSuggestionData2 = SmartSuggestionData.this;
                                    if (smartSuggestionData2.m().c == 19) {
                                        fbxa m = smartSuggestionData2.m();
                                        fbsh fbshVar = m.c == 19 ? (fbsh) m.d : fbsh.a;
                                        fbshVar.getClass();
                                        fcfy a3 = fbcy.a(fbshVar);
                                        String str = fbshVar.e;
                                        String b3 = smartSuggestionData2.b();
                                        Intent c2 = czts.c(a3, "android.intent.action.INSERT");
                                        if (!TextUtils.isEmpty(str)) {
                                            c2.putExtra("eventLocation", str);
                                        }
                                        abac abacVar2 = abacVar;
                                        c2.putExtra("description", abacVar2.g.getString(R.string.calendar_suggestion_event_description));
                                        dlps dlpsVar = (dlps) dlpv.a.createBuilder();
                                        dlpsVar.copyOnWrite();
                                        dlpv.a((dlpv) dlpsVar.instance);
                                        dlpt dlptVar = (dlpt) dlpu.a.createBuilder();
                                        String string = abacVar2.g.getString(R.string.calendar_suggestion_event_chat_title);
                                        dlptVar.copyOnWrite();
                                        dlpu dlpuVar = (dlpu) dlptVar.instance;
                                        string.getClass();
                                        dlpuVar.b |= 16;
                                        dlpuVar.c = string;
                                        dlpsVar.copyOnWrite();
                                        dlpv dlpvVar = (dlpv) dlpsVar.instance;
                                        dlpu dlpuVar2 = (dlpu) dlptVar.build();
                                        dlpuVar2.getClass();
                                        dlpvVar.h = dlpuVar2;
                                        dlpvVar.b |= 8192;
                                        if (c2.hasExtra(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE)) {
                                            String stringExtra = c2.getStringExtra(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
                                            stringExtra.getClass();
                                            dlpsVar.copyOnWrite();
                                            dlpv dlpvVar2 = (dlpv) dlpsVar.instance;
                                            dlpvVar2.b |= 2;
                                            dlpvVar2.c = stringExtra;
                                        }
                                        if (c2.hasExtra("eventLocation")) {
                                            String stringExtra2 = c2.getStringExtra("eventLocation");
                                            stringExtra2.getClass();
                                            dlpsVar.copyOnWrite();
                                            dlpv dlpvVar3 = (dlpv) dlpsVar.instance;
                                            dlpvVar3.b |= 64;
                                            dlpvVar3.f = stringExtra2;
                                        }
                                        if (c2.hasExtra("description")) {
                                            String stringExtra3 = c2.getStringExtra("description");
                                            stringExtra3.getClass();
                                            dlpsVar.copyOnWrite();
                                            dlpv dlpvVar4 = (dlpv) dlpsVar.instance;
                                            dlpvVar4.b |= 128;
                                            dlpvVar4.g = stringExtra3;
                                        }
                                        if (c2.hasExtra("beginTime")) {
                                            long longExtra = c2.getLongExtra("beginTime", 0L);
                                            dlpsVar.copyOnWrite();
                                            dlpv dlpvVar5 = (dlpv) dlpsVar.instance;
                                            dlpvVar5.b |= 8;
                                            dlpvVar5.d = longExtra;
                                        }
                                        if (c2.hasExtra("endTime")) {
                                            long longExtra2 = c2.getLongExtra("endTime", 0L);
                                            dlpsVar.copyOnWrite();
                                            dlpv dlpvVar6 = (dlpv) dlpsVar.instance;
                                            dlpvVar6.b |= 16;
                                            dlpvVar6.e = longExtra2;
                                        }
                                        eyfy build = dlpsVar.build();
                                        build.getClass();
                                        c2.putExtra("proto", ((dlpv) build).toByteArray());
                                        axol.k(abacVar2.f, null, new aazz(abacVar2, c2, b3, null), 3);
                                    }
                                    return ffcu.a;
                                }
                            };
                            ffixVar = aaxwVar;
                            ffixVar.invoke();
                            axol.k(abacVar.f, null, new aaym(abacVar, anzhVar2, null), 3);
                            return ffcu.a;
                        case 34:
                            aaxwVar = new ffix() { // from class: aaxr
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    SmartSuggestionData smartSuggestionData2 = SmartSuggestionData.this;
                                    String d2 = smartSuggestionData2.d();
                                    if (d2 != null) {
                                        abac abacVar2 = abacVar;
                                        if (((Boolean) ((cfup) ctjd.at.get()).e()).booleanValue()) {
                                            new aaxw(abacVar2, smartSuggestionData2).invoke();
                                        } else {
                                            axol.k(abacVar2.f, null, new aayy(abacVar2, d2, null), 3);
                                        }
                                    }
                                    return ffcu.a;
                                }
                            };
                            ffixVar = aaxwVar;
                            ffixVar.invoke();
                            axol.k(abacVar.f, null, new aaym(abacVar, anzhVar2, null), 3);
                            return ffcu.a;
                        case 35:
                            aaxwVar = new ffix() { // from class: aayi
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    abac abacVar2 = abac.this;
                                    axol.k(abacVar2.f, null, new aayw(abacVar2, smartSuggestionData, null), 3);
                                    return ffcu.a;
                                }
                            };
                            ffixVar = aaxwVar;
                            ffixVar.invoke();
                            axol.k(abacVar.f, null, new aaym(abacVar, anzhVar2, null), 3);
                            return ffcu.a;
                        case 36:
                            ffixVar = new ffix() { // from class: aaxs
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    yqv d2 = abac.this.d();
                                    if (d2 != null) {
                                        d2.a(3);
                                    }
                                    return ffcu.a;
                                }
                            };
                            ffixVar.invoke();
                            axol.k(abacVar.f, null, new aaym(abacVar, anzhVar2, null), 3);
                            return ffcu.a;
                        case 37:
                            aaxwVar = new ffix() { // from class: aaye
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    abac.this.j(smartSuggestionData.q());
                                    return ffcu.a;
                                }
                            };
                            ffixVar = aaxwVar;
                            ffixVar.invoke();
                            axol.k(abacVar.f, null, new aaym(abacVar, anzhVar2, null), 3);
                            return ffcu.a;
                        case 38:
                            aaxwVar = new ffix() { // from class: aayf
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    fbxa m = SmartSuggestionData.this.m();
                                    int a3 = fbvc.a((m.c == 31 ? (fbvd) m.d : fbvd.a).b);
                                    if (a3 == 0) {
                                        a3 = 1;
                                    }
                                    abac abacVar2 = abacVar;
                                    int i = a3 - 2;
                                    if (i == 1) {
                                        ((whk) abacVar2.F.b()).c();
                                    } else if (i == 2) {
                                        ((whk) abacVar2.F.b()).b();
                                    }
                                    ((xie) abacVar2.o.b()).c(xhx.a);
                                    return ffcu.a;
                                }
                            };
                            ffixVar = aaxwVar;
                            ffixVar.invoke();
                            axol.k(abacVar.f, null, new aaym(abacVar, anzhVar2, null), 3);
                            return ffcu.a;
                        case Maneuver.TYPE_DESTINATION /* 39 */:
                            ffixVar = new ffix() { // from class: aayg
                                @Override // defpackage.ffix
                                public final Object invoke() {
                                    ((xie) abac.this.o.b()).c(xhy.a);
                                    return ffcu.a;
                                }
                            };
                            ffixVar.invoke();
                            axol.k(abacVar.f, null, new aaym(abacVar, anzhVar2, null), 3);
                            return ffcu.a;
                        default:
                            throw new ffcd();
                    }
                }
            }, this.f);
            if (a2 instanceof dokq) {
                return dokq.e((dokq) a2, b2);
            }
            if (a2 instanceof dokw) {
                return dokw.e((dokw) a2, b2);
            }
            if (a2 instanceof doip) {
                return doip.b((doip) a2, b2);
            }
            throw new ffcd();
        }
        if (!(anzhVar instanceof RbmSuggestionData)) {
            return null;
        }
        final RbmSuggestionData rbmSuggestionData = (RbmSuggestionData) anzhVar;
        ffix b3 = axqa.b(new ffix() { // from class: aaxl
            @Override // defpackage.ffix
            public final Object invoke() {
                RbmSuggestionData rbmSuggestionData2 = rbmSuggestionData;
                abac abacVar = abac.this;
                axol.k(abacVar.e, null, new aazx(rbmSuggestionData2, abacVar, null), 3);
                return ffcu.a;
            }
        }, this.f);
        if (a2 instanceof dokq) {
            return dokq.e((dokq) a2, b3);
        }
        if (a2 instanceof dokw) {
            return dokw.e((dokw) a2, b3);
        }
        Objects.toString(a2);
        throw new IllegalArgumentException("Unsupported RBM suggestion UI data type: ".concat(a2.toString()));
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ffbr, java.lang.Object] */
    @Override // defpackage.aaxk
    public final dokm b(final aoax aoaxVar) {
        dokm b2 = ((abad) this.L.get().b()).b(aoaxVar);
        ffix b3 = axqa.b(new ffix() { // from class: aaya
            @Override // defpackage.ffix
            public final Object invoke() {
                abac abacVar = abac.this;
                axol.m(abacVar.f, new aayn(abacVar, aoaxVar, null));
                return ffcu.a;
            }
        }, this.f);
        if (b2 instanceof dokq) {
            return dokq.e((dokq) b2, b3);
        }
        if (b2 instanceof dokw) {
            return dokw.e((dokw) b2, b3);
        }
        if (b2 instanceof doip) {
            return doip.b((doip) b2, b3);
        }
        throw new ffcd();
    }

    public final xih c() {
        Object a2 = this.R.a();
        a2.getClass();
        return (xih) a2;
    }

    public final yqv d() {
        return (yqv) this.Q.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData r13, defpackage.ffgu r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof defpackage.aayk
            if (r0 == 0) goto L13
            r0 = r14
            aayk r0 = (defpackage.aayk) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aayk r0 = new aayk
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            defpackage.ffci.b(r14)
            goto La1
        L29:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L31:
            defpackage.ffci.b(r14)
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion r14 = r13.b
            boolean r2 = r14.canUseFallbackUrl()
            if (r4 == r2) goto L3d
            r14 = 0
        L3d:
            if (r14 == 0) goto La6
            ffbr r14 = r12.M
            java.lang.Object r14 = r14.b()
            czui r14 = (defpackage.czui) r14
            android.content.Intent r14 = r14.b(r13)
            if (r14 == 0) goto La6
            ffbr r2 = r12.v
            java.lang.Object r2 = r2.b()
            crjp r2 = (defpackage.crjp) r2
            boolean r14 = r2.e(r14)
            if (r14 == 0) goto L60
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r4)
            return r13
        L60:
            enru r14 = defpackage.abac.a
            ensk r14 = r14.j()
            java.lang.String r2 = "attemptFallbackUrlIntent"
            r5 = 995(0x3e3, float:1.394E-42)
            java.lang.String r6 = "com/google/android/apps/messaging/conversation2/messagelist/suggestion/SuggestionUiAdapterImpl"
            java.lang.String r7 = "SuggestionUiAdapterImpl.kt"
            ensk r14 = r14.h(r6, r2, r5, r7)
            enrr r14 = (defpackage.enrr) r14
            java.lang.String r2 = "No app on device seems able to handle this action %s."
            r14.t(r2, r13)
            ffbr r13 = r12.w
            java.lang.Object r13 = r13.b()
            ablq r13 = (defpackage.ablq) r13
            android.content.Context r14 = r12.g
            ablt r5 = new ablt
            r2 = 2132083176(0x7f1501e8, float:1.9806487E38)
            java.lang.String r6 = r14.getString(r2)
            r6.getClass()
            r10 = 0
            r11 = 109(0x6d, float:1.53E-43)
            r7 = 0
            r8 = 0
            r9 = 2
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0.c = r4
            java.lang.Object r13 = r13.a(r5, r0)
            if (r13 != r1) goto La1
            return r1
        La1:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
            return r13
        La6:
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r3)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abac.e(com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData, ffgu):java.lang.Object");
    }

    public final Object f(RbmSuggestionData rbmSuggestionData, ffgu ffguVar) {
        int suggestionType = rbmSuggestionData.b.getSuggestionType();
        Intent a2 = suggestionType != 1 ? suggestionType != 2 ? suggestionType != 3 ? suggestionType != 4 ? null : ((czui) this.M.b()).a(rbmSuggestionData) : ((czui) this.M.b()).c(rbmSuggestionData) : ((czui) this.M.b()).d(rbmSuggestionData) : ((czui) this.M.b()).e(rbmSuggestionData);
        if (a2 == null || !((crjp) this.v.b()).e(a2)) {
            return e(rbmSuggestionData, ffguVar);
        }
        m(rbmSuggestionData.b.getSuggestionType());
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData r24, defpackage.ffgu r25) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = r25
            boolean r3 = r2 instanceof defpackage.aayr
            if (r3 == 0) goto L19
            r3 = r2
            aayr r3 = (defpackage.aayr) r3
            int r4 = r3.c
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.c = r4
            goto L1e
        L19:
            aayr r3 = new aayr
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.a
            ffhh r4 = defpackage.ffhh.a
            int r5 = r3.c
            java.lang.String r6 = "uri"
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L4a
            if (r5 == r8) goto L3a
            if (r5 != r7) goto L32
            defpackage.ffci.b(r2)
            return r2
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            java.lang.String r1 = r3.f
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData r5 = r3.e
            abac r9 = r3.d
            defpackage.ffci.b(r2)
            r22 = r2
            r2 = r1
            r1 = r5
            r5 = r22
            goto L84
        L4a:
            defpackage.ffci.b(r2)
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion r2 = r1.b
            java.lang.String r2 = r2.getPropertyValue(r6)
            if (r2 != 0) goto L5b
            r1 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
        L5b:
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion r5 = r1.b
            java.lang.String r9 = "openUrlViewMode"
            java.lang.String r5 = r5.getPropertyValue(r9)
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion r9 = r1.b
            int r9 = r9.getSuggestionType()
            r0.m(r9)
            ffbr r9 = r0.E
            java.lang.Object r9 = r9.b()
            avij r9 = (defpackage.avij) r9
            r3.d = r0
            r3.e = r1
            r3.f = r2
            r3.c = r8
            java.lang.Object r5 = r9.a(r2, r5, r3)
            if (r5 != r4) goto L83
            goto Lc5
        L83:
            r9 = r0
        L84:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto Lc7
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r11.put(r6, r2)
            java.lang.String r14 = r1.g()
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r2 = r1.c
            java.lang.String r15 = r2.toString()
            r10 = 1
            r12 = 0
            r13 = 0
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion r17 = com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion.createRbmConversationSuggestion(r10, r11, r12, r13, r14, r15)
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r1 = r1.c
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData r16 = new com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData
            r20 = 4
            r21 = 0
            r19 = 0
            r18 = r1
            r16.<init>(r17, r18, r19, r20, r21)
            r1 = r16
            r2 = 0
            r3.d = r2
            r3.e = r2
            r3.f = r2
            r3.c = r7
            java.lang.Object r1 = r9.f(r1, r3)
            if (r1 != r4) goto Lc6
        Lc5:
            return r4
        Lc6:
            return r1
        Lc7:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abac.g(com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(defpackage.dqzc r11, defpackage.ffgu r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof defpackage.aazy
            if (r0 == 0) goto L13
            r0 = r12
            aazy r0 = (defpackage.aazy) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aazy r0 = new aazy
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r12)
            goto L53
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            defpackage.ffci.b(r12)
            xgp r12 = r10.K
            xho r2 = new xho
            xhn r4 = new xhn
            xhi r5 = r12.a()
            r8 = 0
            r9 = 62
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            r2.<init>(r11, r4)
            xih r11 = r10.c()
            r0.c = r3
            java.lang.Object r12 = r11.a(r2, r0)
            if (r12 == r1) goto L77
        L53:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r11 = r12.booleanValue()
            if (r11 != 0) goto L74
            enru r11 = defpackage.abac.a
            ensk r11 = r11.i()
            java.lang.String r12 = "sendPhotomojiSticker"
            r0 = 798(0x31e, float:1.118E-42)
            java.lang.String r1 = "com/google/android/apps/messaging/conversation2/messagelist/suggestion/SuggestionUiAdapterImpl"
            java.lang.String r2 = "SuggestionUiAdapterImpl.kt"
            ensk r11 = r11.h(r1, r12, r0, r2)
            enrr r11 = (defpackage.enrr) r11
            java.lang.String r12 = "Failed to send photomoji suggestion"
            r11.q(r12)
        L74:
            ffcu r11 = defpackage.ffcu.a
            return r11
        L77:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abac.h(dqzc, ffgu):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Type inference failed for: r15v0, types: [com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(defpackage.aqux r22, java.lang.String r23, java.lang.String r24, com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState r25, defpackage.ffgu r26) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abac.i(aqux, java.lang.String, java.lang.String, com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState, ffgu):java.lang.Object");
    }

    public final void j(String str) {
        axol.k(this.f, null, new aayl(this, str, null), 3);
    }

    public final void k(String str, String str2) {
        axol.k(this.e, null, new aayo(this, str, str2, null), 3);
    }

    public final void l(abgh abghVar) {
        axol.k(this.e, null, new aayt(this, abghVar, null), 3);
    }

    public final void m(int i) {
        if (i == 1 || i == 11) {
            axol.k(this.e, null, new aayu(this, i, null), 3);
        }
    }

    public final Object n(final abgh abghVar, final String str, final String str2) {
        if (str == null) {
            return false;
        }
        this.C.b(new ffji() { // from class: aaxx
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                ((ajiy) obj).getClass();
                final abac abacVar = this;
                final String str3 = str;
                final String str4 = str2;
                final abgh abghVar2 = abghVar;
                return new abge(new ffix() { // from class: aaxv
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        abac abacVar2 = abac.this;
                        axol.k(abacVar2.e, null, new aayq(abacVar2, str3, str4, abghVar2, null), 3);
                        return ffcu.a;
                    }
                }, str3, abghVar2);
            }
        });
        l(abghVar);
        return true;
    }
}
