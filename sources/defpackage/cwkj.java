package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import j$.util.Optional;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.Function$CC;
import java.util.Objects;
import java.util.concurrent.ConcurrentMap;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cwkj implements cwjx {
    public final ffhd a;
    public final ffsk b;
    public final ffbr c;
    public final ConcurrentMap d;
    private final ejvb e;
    private final ejvp f;
    private final ffbr g;
    private final ConcurrentMap h;

    public cwkj(ejvb ejvbVar, ffhd ffhdVar, ffsk ffskVar, ffbr ffbrVar, ejvp ejvpVar, cqoh cqohVar, ffbr ffbrVar2) {
        ejvbVar.getClass();
        ffhdVar.getClass();
        ffskVar.getClass();
        ffbrVar.getClass();
        ejvpVar.getClass();
        cqohVar.getClass();
        ffbrVar2.getClass();
        this.e = ejvbVar;
        this.a = ffhdVar;
        this.b = ffskVar;
        this.c = ffbrVar;
        this.f = ejvpVar;
        this.g = ffbrVar2;
        this.d = new ConcurrentHashMap();
        this.h = new ConcurrentHashMap();
    }

    private static final bsag i(ConversationIdType conversationIdType) {
        final buxo a = ctrt.a(conversationIdType);
        bsah a2 = bsam.a();
        a2.z("createRbmSuggestionsQuery");
        a2.c(new Function() { // from class: cwkc
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Object apply;
                bsal bsalVar = (bsal) obj;
                final buxo buxoVar = buxo.this;
                Function[] functionArr = {new Function() { // from class: cwjy
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsal bsalVar2 = (bsal) obj2;
                        buun[] buunVarArr = {MessagesTable.c.C};
                        buxo buxoVar2 = buxo.this;
                        buxoVar2.c(buunVarArr);
                        buxm b = buxoVar2.b();
                        int intValue = bsam.c().intValue();
                        if (intValue < 12000) {
                            dtub.w("target_rcs_message_id", intValue);
                        }
                        bsalVar2.aq(new dtru("conversation_suggestions.target_rcs_message_id", 1, b));
                        return bsalVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }, new Function() { // from class: cwjz
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj2) {
                        bsal bsalVar2 = (bsal) obj2;
                        Function function = new Function() { // from class: cwkb
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function2) {
                                return Function$CC.$default$andThen(this, function2);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj3) {
                                return ((buum) obj3).a;
                            }

                            public final /* synthetic */ Function compose(Function function2) {
                                return Function$CC.$default$compose(this, function2);
                            }
                        };
                        buxo buxoVar2 = buxo.this;
                        buxoVar2.f(function);
                        bsalVar2.c(buxoVar2.b());
                        return bsalVar2;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }};
                bsal[] bsalVarArr = new bsal[2];
                for (int i = 0; i < 2; i++) {
                    Function function = functionArr[i];
                    String[] strArr = bsam.a;
                    apply = function.apply(new bsal());
                    bsalVarArr[i] = (bsal) apply;
                }
                bsalVar.ar(bsalVarArr);
                return bsalVar;
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        return a2.b();
    }

    private static final String j(ConversationIdType conversationIdType) {
        Objects.toString(conversationIdType);
        return "pending_suggestion".concat(conversationIdType.toString());
    }

    @Override // defpackage.cwjx
    public final ejuh a(lkk lkkVar, final ConversationIdType conversationIdType) {
        lkkVar.getClass();
        return new ejuy(this.e, new eros() { // from class: cwka
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                elfl c;
                cwkj cwkjVar = cwkj.this;
                c = axol.c(cwkjVar.b, ffhe.a, ffsm.a, new cwkf(cwkjVar, conversationIdType, null));
                return new erph(c);
            }
        }, j(conversationIdType));
    }

    @Override // defpackage.cwjx
    public final ejuh b(lkk lkkVar, final ConversationIdType conversationIdType) {
        bvhc c;
        lkkVar.getClass();
        if (conversationIdType.b()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        c = ctrt.c(conversationIdType, null, null);
        bzac.b(c, "conversation_suggestions", lkkVar, this.f);
        bzac.b(i(conversationIdType), "conversation_suggestions", lkkVar, this.f);
        return new ejuy(this.e, new eros() { // from class: cwkd
            @Override // defpackage.eros
            public final erph a(erpc erpcVar) {
                elfl c2;
                cwkj cwkjVar = cwkj.this;
                c2 = axol.c(cwkjVar.b, ffhe.a, ffsm.a, new cwkg(cwkjVar, conversationIdType, null));
                return new erph(c2);
            }
        }, "conversation_suggestions");
    }

    @Override // defpackage.cwjx
    public final Optional c(ConversationIdType conversationIdType) {
        return Optional.ofNullable(this.h.get(conversationIdType));
    }

    @Override // defpackage.cwjx
    public final void d(ConversationIdType conversationIdType) {
        String str = (String) this.d.remove(conversationIdType);
        this.h.remove(conversationIdType);
        if (str != null) {
            this.f.a(elfo.e(null), j(conversationIdType));
        }
    }

    @Override // defpackage.cwjx
    public final void e(ConversationIdType conversationIdType, SuggestionData suggestionData) {
        this.h.put(conversationIdType, suggestionData);
    }

    @Override // defpackage.cwjx
    public final void f(ConversationIdType conversationIdType, String str) {
        this.d.put(conversationIdType, str);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r9, defpackage.ffgu r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.cwkh
            if (r0 == 0) goto L13
            r0 = r10
            cwkh r0 = (defpackage.cwkh) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cwkh r0 = new cwkh
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            defpackage.ffci.b(r10)
            goto L45
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            defpackage.ffci.b(r10)
            bsag r9 = i(r9)
            elfl r9 = r9.w()
            r9.getClass()
            r0.c = r3
            java.lang.Object r10 = defpackage.fgfz.c(r9, r0)
            if (r10 == r1) goto Lc6
        L45:
            engw r10 = (defpackage.engw) r10
            r10.getClass()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r10 = r10.iterator()
        L53:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lc1
            java.lang.Object r0 = r10.next()
            bryo r0 = (defpackage.bryo) r0
            r0.getClass()
            emyl r1 = com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData.a
            java.lang.Object r1 = r1.get()
            cfup r1 = (defpackage.cfup) r1
            java.lang.Object r1 = r1.e()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L7f
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r1 = r0.l()
            boolean r1 = r1.c()
            goto L87
        L7f:
            bdhg r1 = r0.n()
            boolean r1 = r1.i()
        L87:
            if (r1 == 0) goto L8b
            r0 = 0
            goto Lbb
        L8b:
            com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData r1 = new com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData
            int r2 = r0.k()
            java.lang.String r3 = r0.r()
            java.lang.String r4 = r0.o()
            java.lang.String r5 = r0.q()
            bdhg r6 = r0.m()
            java.lang.String r6 = r6.b
            bdhg r7 = r0.n()
            java.lang.String r7 = r7.b
            com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion r2 = com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion.createRbmConversationSuggestion(r2, r3, r4, r5, r6, r7)
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType r3 = r0.l()
            r3.getClass()
            r5 = 4
            r6 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            r0 = r1
        Lbb:
            if (r0 == 0) goto L53
            r9.add(r0)
            goto L53
        Lc1:
            engw r9 = defpackage.engq.a(r9)
            return r9
        Lc6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwkj.g(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, ffgu):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7, defpackage.ffgu r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cwki
            if (r0 == 0) goto L13
            r0 = r8
            cwki r0 = (defpackage.cwki) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            cwki r0 = new cwki
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.a
            ffhh r1 = defpackage.ffhh.a
            int r2 = r0.c
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            defpackage.ffci.b(r8)
            return r8
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            defpackage.ffci.b(r8)
            return r8
        L39:
            com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType r7 = r0.e
            cwkj r2 = r0.d
            defpackage.ffci.b(r8)
            goto L5a
        L41:
            defpackage.ffci.b(r8)
            r0.d = r6
            r0.e = r7
            r0.c = r5
            bvvl r8 = defpackage.txt.b(r7)
            com.google.common.util.concurrent.ListenableFuture r8 = r8.C()
            java.lang.Object r8 = defpackage.fgfz.c(r8, r0)
            if (r8 != r1) goto L59
            goto L85
        L59:
            r2 = r6
        L5a:
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            r5 = 0
            if (r8 == 0) goto L71
            r0.d = r5
            r0.e = r5
            r0.c = r4
            java.lang.Object r7 = r2.g(r7, r0)
            if (r7 != r1) goto L70
            goto L85
        L70:
            return r7
        L71:
            r0.d = r5
            r0.e = r5
            r0.c = r3
            ffbr r8 = r2.g
            java.lang.Object r8 = r8.b()
            ctrg r8 = (defpackage.ctrg) r8
            java.lang.Object r7 = defpackage.ctrg.b(r8, r7, r0)
            if (r7 != r1) goto L86
        L85:
            return r1
        L86:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cwkj.h(com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType, ffgu):java.lang.Object");
    }
}
