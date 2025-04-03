package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.api.messaging.recipient.Recipient;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ampx implements ampq {
    public static final enru a = enru.c("com/google/android/apps/messaging/shared/api/messaging/conversation/customtheme/controller/RichThemeControllerImpl");
    public final ffhd b;
    public final ffbr c;
    public final cbwj d;
    private final ffsk e;
    private final amqj f;
    private final Context g;

    public ampx(ffsk ffskVar, ffhd ffhdVar, cbwj cbwjVar, ffbr ffbrVar, amqj amqjVar, Context context) {
        ffskVar.getClass();
        ffhdVar.getClass();
        cbwjVar.getClass();
        ffbrVar.getClass();
        context.getClass();
        this.e = ffskVar;
        this.b = ffhdVar;
        this.d = cbwjVar;
        this.c = ffbrVar;
        this.f = amqjVar;
        this.g = context;
    }

    public static final ConversationIdType e(Conversation conversation) {
        return ((DefaultConversation) conversation).a.a;
    }

    public static final boolean f(Conversation conversation, ampp amppVar) {
        String[] strArr = bsom.a;
        bsoe bsoeVar = new bsoe();
        bsoeVar.ap("RichThemeControllerImpl#persistRichThemeInDatabase");
        ckkz g = g(amppVar);
        int intValue = bsom.g().intValue();
        int intValue2 = bsom.g().intValue();
        if (intValue2 < 59820) {
            dtub.w("custom_theme", intValue2);
        }
        if (intValue >= 59820) {
            bsoeVar.a.put("custom_theme", g.toByteArray());
        }
        return bsoeVar.f(e(conversation));
    }

    private static final ckkz g(ampp amppVar) {
        ckky ckkyVar = (ckky) ckkz.a.createBuilder();
        ckkyVar.getClass();
        Integer b = amppVar.b();
        if (b != null) {
            int intValue = b.intValue();
            ckkyVar.copyOnWrite();
            ckkz ckkzVar = (ckkz) ckkyVar.instance;
            ckkzVar.b |= 1;
            ckkzVar.c = intValue;
        }
        eyja b2 = eykn.b(amppVar.a());
        ckkyVar.copyOnWrite();
        ckkz ckkzVar2 = (ckkz) ckkyVar.instance;
        ckkzVar2.d = b2;
        ckkzVar2.b |= 2;
        eyfy build = ckkyVar.build();
        build.getClass();
        return (ckkz) build;
    }

    @Override // defpackage.ampq
    public final elfl a(final Conversation conversation, final ampp amppVar, final Recipient recipient) {
        recipient.getClass();
        elfl a2 = this.d.a("RichThemeControllerImpl#incomingRichThemeUpdate", new emyl() { // from class: ampr
            @Override // defpackage.emyl
            public final Object get() {
                Conversation conversation2 = conversation;
                ckkz ckkzVar = (ckkz) bsom.j(ampx.e(conversation2), new Function() { // from class: amps
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((bseh) obj).J();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                ampp amppVar2 = amppVar;
                if (ckkzVar != null) {
                    eyja eyjaVar = ckkzVar.d;
                    if (eyjaVar == null) {
                        eyjaVar = eyja.a;
                    }
                    if (eyjaVar != null && eykn.d(eyjaVar).isAfter(amppVar2.a())) {
                        ((enrr) ampx.a.h().h("com/google/android/apps/messaging/shared/api/messaging/conversation/customtheme/controller/RichThemeControllerImpl", "incomingRichThemeUpdate$lambda$0", 90, "RichThemeControllerImpl.kt")).q("Ignoring out of date theme.");
                        return false;
                    }
                }
                ampx ampxVar = ampx.this;
                Recipient recipient2 = recipient;
                String d = ampxVar.d(amppVar2);
                if (!(recipient2 instanceof aqkx)) {
                    throw new IllegalStateException("Check failed.");
                }
                enrr enrrVar = (enrr) ampx.a.h();
                enrrVar.Y(new ensn("custom_theme_name", String.class, false, false), d);
                ((enrr) enrrVar.h("com/google/android/apps/messaging/shared/api/messaging/conversation/customtheme/controller/RichThemeControllerImpl", "insertParticipantThemeChangeTombstone", 127, "RichThemeControllerImpl.kt")).q("Inserting theme change tombstone.");
                cbup cbupVar = (cbup) ampxVar.c.b();
                ConversationIdType e = ampx.e(conversation2);
                ParticipantsTable.BindData n = ((aqkx) recipient2).n();
                n.getClass();
                cbupVar.c(e, n, d);
                return Boolean.valueOf(ampx.f(conversation2, amppVar2));
            }
        });
        a2.getClass();
        return a2;
    }

    @Override // defpackage.ampq
    public final elfl b(BugleConversation bugleConversation, ampp amppVar) {
        elfl c;
        c = axol.c(this.e, ffhe.a, ffsm.a, new ampu(this, bugleConversation, amppVar, null));
        return c;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation r5, defpackage.ampp r6, defpackage.ffgu r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.ampw
            if (r0 == 0) goto L13
            r0 = r7
            ampw r0 = (defpackage.ampw) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ampw r0 = new ampw
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.a
            int r0 = r0.c
            r1 = 1
            if (r0 == 0) goto L33
            if (r0 == r1) goto L29
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L29:
            defpackage.ffci.b(r7)
            amfx r7 = (defpackage.amfx) r7
            r7.o()
            r5 = 0
            throw r5
        L33:
            defpackage.ffci.b(r7)
            amql r7 = defpackage.amql.a
            eyfq r7 = r7.createBuilder()
            amqk r7 = (defpackage.amqk) r7
            r7.getClass()
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation r5 = (com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation) r5
            com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId r5 = r5.a
            java.lang.String r5 = r5.b()
            r5.getClass()
            r7.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r0 = r7.instance
            amql r0 = (defpackage.amql) r0
            r0.c = r5
            ckkz r5 = g(r6)
            r7.copyOnWrite()
            MessageType extends eyfy<MessageType, BuilderType> r6 = r7.instance
            amql r6 = (defpackage.amql) r6
            r6.d = r5
            int r5 = r6.b
            r5 = r5 | r1
            r6.b = r5
            eyfy r5 = r7.build()
            r5.getClass()
            amqj r6 = r4.f
            amql r5 = (defpackage.amql) r5
            ffbr r6 = r6.a
            java.lang.Object r6 = r6.b()
            cevh r6 = (defpackage.cevh) r6
            java.lang.String r7 = "custom_themes_sender"
            ceyr r5 = defpackage.ceyr.g(r7, r5)
            r6.a(r5)
            ffcu r5 = defpackage.ffcu.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ampx.c(com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation, ampp, ffgu):java.lang.Object");
    }

    public final String d(ampp amppVar) {
        Map map = ampy.a;
        Integer num = (Integer) ampy.a.get(amppVar.b());
        if (num == null) {
            return null;
        }
        Context context = this.g;
        return context.getResources().getString(num.intValue());
    }
}
