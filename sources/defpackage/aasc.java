package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.Html;
import android.text.Spanned;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.etouffee.util.LinkTextUtil;
import j$.util.Optional;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aasc {
    public static final enru a = enru.c("com/google/android/apps/messaging/conversation2/messagelist/message/tombstone/TombstoneUiAdapter");
    public final Context b;
    public final ffsk c;
    public final ffxx d;
    public final ConversationId e;
    public final ffbr f;
    public final ajjc g;
    public final aigz h;
    public final aalu i;
    public final ffbr j;
    public final ffbr k;
    public final ffbr l;
    private final ffxx m;
    private final alxs n;
    private final ffbr o;
    private final ffbr p;
    private final fgcq q;
    private final ffbr r;

    public aasc(Context context, ffsk ffskVar, ffxx ffxxVar, ffxx ffxxVar2, alxs alxsVar, ConversationId conversationId, ffbr ffbrVar, ajjc ajjcVar, aigz aigzVar, ffbr ffbrVar2, asnt asntVar, aalu aaluVar, ffbr ffbrVar3, ffbr ffbrVar4, fgcq fgcqVar, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        context.getClass();
        ffskVar.getClass();
        ffxxVar.getClass();
        ffxxVar2.getClass();
        alxsVar.getClass();
        conversationId.getClass();
        ffbrVar.getClass();
        ajjcVar.getClass();
        aigzVar.getClass();
        asntVar.getClass();
        ffbrVar3.getClass();
        fgcqVar.getClass();
        ffbrVar5.getClass();
        ffbrVar6.getClass();
        this.b = context;
        this.c = ffskVar;
        this.m = ffxxVar;
        this.d = ffxxVar2;
        this.n = alxsVar;
        this.e = conversationId;
        this.f = ffbrVar;
        this.g = ajjcVar;
        this.h = aigzVar;
        this.o = ffbrVar2;
        this.i = aaluVar;
        this.p = ffbrVar3;
        this.j = ffbrVar4;
        this.q = fgcqVar;
        this.k = ffbrVar5;
        this.r = ffbrVar6;
        this.l = ffbrVar7;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final doqa a(appx appxVar) {
        Spanned fromHtml;
        Object obj;
        String m;
        int Q;
        dlto dltoVar;
        String u;
        int Q2;
        boolean I;
        boolean I2;
        fromHtml = Html.fromHtml(ffpc.q(appxVar.a(), "\n", "<br/>"), 63);
        String obj2 = fromHtml.toString();
        switch (appxVar.b() - 1) {
            case 0:
            case 7:
                obj = null;
                break;
            case 1:
                String string = this.b.getString(R.string.settings_link_text);
                string.getClass();
                int Q3 = ffpc.Q(obj2, string, 0, false, 6);
                if (Q3 >= 0) {
                    obj = new dlto(dlus.h, Q3, Q3 + string.length(), string, new ffji() { // from class: aarb
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            aasc aascVar = aasc.this;
                            axol.k(aascVar.c, null, new aaru(aascVar, null), 3);
                            return true;
                        }
                    });
                    break;
                }
                obj = null;
                break;
            case 2:
                Context context = this.b;
                final String a2 = LinkTextUtil.a(context);
                final String string2 = context.getString(R.string.e2ee_description, a2);
                string2.getClass();
                String string3 = this.b.getString(R.string.tombstone_learn_more_link);
                string3.getClass();
                int Q4 = ffpc.Q(obj2, string3, 0, false, 6);
                if (Q4 >= 0) {
                    final String str = (String) bzqa.b.e();
                    obj = new dlto(dlus.h, Q4, Q4 + string3.length(), string3, new ffji() { // from class: aarc
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            final aasc aascVar = aasc.this;
                            final String str2 = str;
                            final String str3 = string2;
                            final String str4 = a2;
                            aascVar.g.d(true, new ffji() { // from class: aarj
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj4) {
                                    final ajiy ajiyVar = (ajiy) obj4;
                                    ajiyVar.getClass();
                                    final aasc aascVar2 = aasc.this;
                                    Context context2 = aascVar2.b;
                                    dmzz dmzzVar = dmzz.bZ;
                                    String string4 = context2.getString(R.string.user_toggle_for_etouffee);
                                    final String str5 = str2;
                                    str5.getClass();
                                    ffji ffjiVar = new ffji() { // from class: aard
                                        @Override // defpackage.ffji
                                        public final Object invoke(Object obj5) {
                                            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str5));
                                            intent.setFlags(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
                                            aascVar2.b.startActivity(intent);
                                            return true;
                                        }
                                    };
                                    String str6 = str3;
                                    List b = ffdx.b(new dltp(str5, str6.length() - str4.length(), str6.length(), ffjiVar, 24));
                                    String string5 = aascVar2.b.getString(android.R.string.ok);
                                    string5.getClass();
                                    return new dmve(str6, b, dmzzVar, string4, false, false, new doas(string5, new ffix() { // from class: aare
                                        @Override // defpackage.ffix
                                        public final Object invoke() {
                                            ajiy.this.a();
                                            return ffcu.a;
                                        }
                                    }), null, null, 432);
                                }
                            });
                            return true;
                        }
                    });
                    break;
                }
                obj = null;
                break;
            case 3:
                String string4 = this.b.getString(R.string.details_link);
                string4.getClass();
                int Q5 = ffpc.Q(obj2, string4, 0, false, 6);
                if (Q5 >= 0) {
                    obj = new dlto(dlus.h, Q5, Q5 + string4.length(), string4, new ffji() { // from class: aark
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            ((enrr) aasc.a.h().h("com/google/android/apps/messaging/conversation2/messagelist/message/tombstone/TombstoneUiAdapter", "createDetailsLinkAnnotation$lambda$10", 287, "TombstoneUiAdapter.kt")).q("Open conversation detail from tombstone link.");
                            aasc aascVar = aasc.this;
                            axol.k(aascVar.c, null, new aart(aascVar, null), 3);
                            return true;
                        }
                    });
                    break;
                }
                obj = null;
                break;
            case 4:
                String string5 = this.b.getString(R.string.tombstone_learn_more_link);
                string5.getClass();
                int Q6 = ffpc.Q(obj2, string5, 0, false, 6);
                if (Q6 >= 0) {
                    obj = new dlto(dlus.h, Q6, Q6 + string5.length(), string5, new ffji() { // from class: aarg
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            aasc aascVar = aasc.this;
                            axol.k(aascVar.c, null, new aarv(aascVar, null), 3);
                            return true;
                        }
                    });
                    break;
                }
                obj = null;
                break;
            case 5:
                Optional optional = (Optional) this.o.b();
                if (!optional.isEmpty() && (Q = ffpc.Q(obj2, (m = ((cjdk) optional.get()).m()), 0, false, 6)) >= 0) {
                    final String l = ((cjdk) optional.get()).l();
                    obj = new dltp(((cjdk) optional.get()).l(), Q, Q + m.length(), new ffji() { // from class: aarl
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            Uri parse = Uri.parse(l);
                            parse.getClass();
                            aasc.this.h.h(new aile(parse));
                            return true;
                        }
                    }, 24);
                    break;
                }
                obj = null;
                break;
            case 6:
                final Optional optional2 = (Optional) this.p.b();
                if (!optional2.isEmpty()) {
                    String string6 = this.b.getString(R.string.change_link);
                    string6.getClass();
                    int Q7 = ffpc.Q(obj2, string6, 0, false, 6);
                    if (Q7 >= 0) {
                        dltoVar = new dlto(dlus.h, Q7, Q7 + string6.length(), this.b.getString(R.string.custom_theme_plugin_title), new ffji() { // from class: aarn
                            @Override // defpackage.ffji
                            public final Object invoke(Object obj3) {
                                aasc aascVar = aasc.this;
                                axol.k(aascVar.c, null, new aary(aascVar, optional2, null), 3);
                                return true;
                            }
                        });
                        obj = dltoVar;
                        break;
                    } else {
                        ((enrr) a.j().h("com/google/android/apps/messaging/conversation2/messagelist/message/tombstone/TombstoneUiAdapter", "createThemeChangeLinkAnnotation", 383, "TombstoneUiAdapter.kt")).q("Change link not found.");
                    }
                } else {
                    ((enrr) a.j().h("com/google/android/apps/messaging/conversation2/messagelist/message/tombstone/TombstoneUiAdapter", "createThemeChangeLinkAnnotation", 377, "TombstoneUiAdapter.kt")).q("Unable to linkify. Custom theme uiAdapter not present");
                }
                obj = null;
                break;
            case 8:
                Optional optional3 = (Optional) this.o.b();
                if (!optional3.isEmpty() && (Q2 = ffpc.Q(obj2, (u = ((cjdk) optional3.get()).u()), 0, false, 6)) >= 0) {
                    obj = new dlto(dlus.h, Q2, Q2 + u.length(), new ffji() { // from class: aarf
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            aasc aascVar = aasc.this;
                            axol.l(aascVar.c, new aarw(aascVar, null));
                            return true;
                        }
                    }, 8);
                    break;
                }
                obj = null;
                break;
            case 9:
                ((cued) this.l.b()).d(2);
                String string7 = this.b.getString(R.string.tombstone_chatbot_subscribe_link);
                string7.getClass();
                obj = new dlto(dlus.h, ffpc.Q(obj2, string7, 0, false, 6), ffpc.Q(obj2, string7, 0, false, 6) + string7.length(), string7, new ffji() { // from class: aarm
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        aasc aascVar = aasc.this;
                        ((cued) aascVar.l.b()).d(4);
                        axol.k(aascVar.c, null, new aars(aascVar, null), 3);
                        return true;
                    }
                });
                break;
            case 10:
                ((cued) this.l.b()).d(1);
                String string8 = this.b.getString(R.string.tombstone_chatbot_unsubscribe_link);
                string8.getClass();
                obj = new dlto(dlus.h, ffpc.Q(obj2, string8, 0, false, 6), ffpc.Q(obj2, string8, 0, false, 6) + string8.length(), string8, new ffji() { // from class: aara
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj3) {
                        aasc aascVar = aasc.this;
                        ((cued) aascVar.l.b()).d(3);
                        axol.k(aascVar.c, null, new aarr(aascVar, null), 3);
                        return true;
                    }
                });
                break;
            default:
                String string9 = this.b.getString(R.string.tombstone_active_self_identity_changed, "");
                string9.getClass();
                I = ffpc.I(obj2, string9, false);
                if (!I) {
                    String string10 = this.b.getString(R.string.rbm_sim_change, "__");
                    string10.getClass();
                    List V = ffpc.V(string10, new String[]{"__"}, 0, 6);
                    if (V.size() == 2) {
                        I2 = ffpc.I(obj2, (CharSequence) ffdx.K(V), false);
                        if (I2) {
                            String q = ffpc.q(ffpc.q(obj2, (String) V.get(0), ""), (String) V.get(1), "");
                            int Q8 = ffpc.Q(obj2, q, 0, false, 6);
                            dltoVar = new dlto(dlus.h, Q8, Q8 + q.length(), this.b.getString(R.string.active_sim_changed_click_label), new ffji() { // from class: aari
                                @Override // defpackage.ffji
                                public final Object invoke(Object obj3) {
                                    aasc aascVar = aasc.this;
                                    axol.k(aascVar.c, null, new aarp(aascVar, null), 3);
                                    return true;
                                }
                            });
                        }
                    }
                    obj = null;
                    break;
                } else {
                    String q2 = ffpc.q(obj2, string9, "");
                    int Q9 = ffpc.Q(obj2, q2, 0, false, 6);
                    dltoVar = new dlto(dlus.h, Q9, Q9 + q2.length(), this.b.getString(R.string.active_sim_changed_click_label), new ffji() { // from class: aarh
                        @Override // defpackage.ffji
                        public final Object invoke(Object obj3) {
                            aasc aascVar = aasc.this;
                            axol.k(aascVar.c, null, new aaro(aascVar, null), 3);
                            return true;
                        }
                    });
                }
                obj = dltoVar;
                break;
        }
        return new doqa(obj2, obj != null ? ffdx.b(obj) : ffel.a, appxVar.b() + (-1) == 2 ? dmzz.bZ : null, 4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(int r5, defpackage.ffgu r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.aarz
            if (r0 == 0) goto L13
            r0 = r6
            aarz r0 = (defpackage.aarz) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            aarz r0 = new aarz
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.c
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            int r5 = r0.b
            java.lang.Object r1 = r0.a
            aasc r0 = r0.f
            defpackage.ffci.b(r6)
            goto L4d
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            defpackage.ffci.b(r6)
            aigz r6 = r4.h
            ffxx r2 = r4.m
            r0.f = r4
            r0.a = r6
            r0.b = r5
            r0.e = r3
            java.lang.Object r0 = defpackage.fgbj.a(r2, r0)
            if (r0 == r1) goto L5d
            r1 = r6
            r6 = r0
            r0 = r4
        L4d:
            alxj r6 = (defpackage.alxj) r6
            alxs r0 = r0.n
            aijq r2 = new aijq
            r3 = 2
            r2.<init>(r6, r0, r5, r3)
            r1.h(r2)
            ffcu r5 = defpackage.ffcu.a
            return r5
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aasc.b(int, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aasa
            if (r0 == 0) goto L13
            r0 = r5
            aasa r0 = (defpackage.aasa) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aasa r0 = new aasa
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            aasc r0 = r0.d
            defpackage.ffci.b(r5)
            goto L62
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            defpackage.ffci.b(r5)
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r5 = r4.e
            boolean r5 = r5 instanceof com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId
            if (r5 != 0) goto L54
            enru r5 = defpackage.aasc.a
            ensk r5 = r5.j()
            java.lang.String r0 = "launchInfoAndOptions"
            r1 = 308(0x134, float:4.32E-43)
            java.lang.String r2 = "com/google/android/apps/messaging/conversation2/messagelist/message/tombstone/TombstoneUiAdapter"
            java.lang.String r3 = "TombstoneUiAdapter.kt"
            ensk r5 = r5.h(r2, r0, r1, r3)
            enrr r5 = (defpackage.enrr) r5
            java.lang.String r0 = "Attempted to launch info and options from non-RBM conversation."
            r5.q(r0)
            goto L95
        L54:
            ffxx r5 = r4.d
            r0.d = r4
            r0.c = r3
            java.lang.Object r5 = defpackage.fgbj.a(r5, r0)
            if (r5 != r1) goto L61
            return r1
        L61:
            r0 = r4
        L62:
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r5 = defpackage.ffdx.U(r5)
            com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient r5 = (com.google.android.apps.messaging.shared.api.messaging.recipient.ResolvedRecipient) r5
            r1 = 0
            if (r5 == 0) goto L77
            aoku r5 = r5.g()
            if (r5 == 0) goto L77
            java.lang.String r1 = r5.l()
        L77:
            if (r1 == 0) goto L95
            ffbr r5 = r0.r
            java.lang.Object r5 = r5.b()
            altk r5 = (defpackage.altk) r5
            r2 = 2
            eorw r3 = defpackage.eorw.BIZINFO_SOURCE_SIM_SWITCHED_TOMBSTONE
            r5.aH(r2, r3, r1)
            aigz r5 = r0.h
            com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId r0 = r0.e
            com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId r0 = (com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId) r0
            ailc r2 = new ailc
            r2.<init>(r0, r1)
            r5.h(r2)
        L95:
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aasc.c(ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.ffgu r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.aasb
            if (r0 == 0) goto L13
            r0 = r5
            aasb r0 = (defpackage.aasb) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            aasb r0 = new aasb
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r5)
            goto L3c
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            defpackage.ffci.b(r5)
            fgcq r5 = r4.q
            r0.c = r3
            java.lang.Object r5 = defpackage.fgbj.a(r5, r0)
            if (r5 == r1) goto L54
        L3c:
            boolean r0 = r5 instanceof defpackage.xlv
            if (r0 == 0) goto L43
            xlv r5 = (defpackage.xlv) r5
            goto L44
        L43:
            r5 = 0
        L44:
            r0 = 0
            if (r5 == 0) goto L4e
            boolean r5 = r5.v()
            if (r5 != r3) goto L4e
            goto L4f
        L4e:
            r3 = r0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        L54:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aasc.d(ffgu):java.lang.Object");
    }
}
