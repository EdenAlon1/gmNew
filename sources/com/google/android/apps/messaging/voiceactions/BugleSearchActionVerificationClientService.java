package com.google.android.apps.messaging.voiceactions;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.amet;
import defpackage.aueb;
import defpackage.axol;
import defpackage.bbeq;
import defpackage.bcpt;
import defpackage.bcwa;
import defpackage.bcwb;
import defpackage.bcwc;
import defpackage.bdgq;
import defpackage.bdqu;
import defpackage.csux;
import defpackage.ctba;
import defpackage.deea;
import defpackage.deeb;
import defpackage.deed;
import defpackage.deee;
import defpackage.einp;
import defpackage.elfl;
import defpackage.enrr;
import defpackage.enru;
import defpackage.ensk;
import defpackage.ensz;
import defpackage.entd;
import defpackage.ente;
import defpackage.ffbr;
import defpackage.ffhe;
import defpackage.ffsm;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BugleSearchActionVerificationClientService extends einp {
    private static final entd c = entd.c("BugleConversation");
    private boolean d = false;
    private boolean e = true;
    private boolean f = false;
    private boolean g = false;

    /* compiled from: PG */
    public interface a {
        deeb di();

        deee dj();

        ffbr gl();

        ffbr go();
    }

    private static void b(a aVar, Intent intent, ConversationId conversationId, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        elfl c2;
        deee dj = aVar.dj();
        c2 = axol.c(dj.a, ffhe.a, ffsm.a, new deed(dj, intent, conversationId, str, z, z2, z3, z4, null));
        try {
            c2.get(10L, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((ensz) ((ensz) ((ensz) c.j()).g(e)).h("com/google/android/apps/messaging/voiceactions/BugleSearchActionVerificationClientService", "handleIntent", (char) 271, "BugleSearchActionVerificationClientService.java")).q("Blocked for more than 10 seconds waiting for the voice action handler to complete.");
        }
    }

    @Override // defpackage.einp
    public final void a(Intent intent, boolean z) {
        ConversationId conversationId;
        String action;
        if (!z) {
            throw new IllegalArgumentException("Can't perform action. isVerified is false");
        }
        if (intent != null && intent.getAction() != null && ((action = intent.getAction()) == null || !action.equals("com.google.android.voicesearch.SEND_MESSAGE_TO_CONTACTS"))) {
            throw new IllegalArgumentException("Invalid action.");
        }
        Intent intent2 = new Intent(intent);
        String stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (TextUtils.isEmpty(stringExtra)) {
            throw new IllegalArgumentException("Invalid referer.");
        }
        if (stringExtra != null && !stringExtra.equals("android-app://com.google.android.googlequicksearchbox/https/www.google.com")) {
            throw new IllegalArgumentException("Invalid referer.");
        }
        a aVar = (a) ctba.a(a.class);
        boolean a2 = ((aueb) aVar.go().b()).a();
        String stringExtra2 = intent2.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID");
        ConversationIdType conversationIdType = bdgq.a;
        if (a2) {
            conversationId = ((amet) aVar.gl().b()).a(intent2);
            if (conversationId == null) {
                ((ensz) ((ensz) c.h()).h("com/google/android/apps/messaging/voiceactions/BugleSearchActionVerificationClientService", "performAction", 131, "BugleSearchActionVerificationClientService.java")).q("Did not find MAPI ConversationId in intent.");
                conversationIdType = bdgq.b(intent2.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONVERSATION_ID"));
                conversationId = conversationIdType.b() ? null : new BugleConversationId(conversationIdType);
            }
            if (TextUtils.isEmpty(stringExtra2) && conversationId == null) {
                throw new IllegalArgumentException("Invalid recipient.");
            }
        } else {
            conversationIdType = bdgq.b(intent2.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONVERSATION_ID"));
            if (TextUtils.isEmpty(stringExtra2) && conversationIdType.b()) {
                throw new IllegalArgumentException("Invalid recipient.");
            }
            conversationId = null;
        }
        if (intent2.hasExtra("EXPECT_EXTERNAL_APP_UI")) {
            this.d = intent2.getBooleanExtra("EXPECT_EXTERNAL_APP_UI", true);
        }
        if (intent2.hasExtra("EXPECT_EXTERNAL_CONFIRMATION")) {
            this.e = intent2.getBooleanExtra("EXPECT_EXTERNAL_CONFIRMATION", true);
        }
        if (intent2.hasExtra("android.intent.extra.STREAM")) {
            this.f = true;
        }
        if (intent2.hasExtra("FOCUS_ON_FIELD") && "message.text".equals(intent2.getStringExtra("FOCUS_ON_FIELD"))) {
            this.g = true;
        }
        intent2.replaceExtras((Bundle) null);
        if (intent.hasExtra("android.intent.extra.SUBJECT")) {
            intent2.putExtra("android.intent.extra.SUBJECT", intent.getStringExtra("android.intent.extra.SUBJECT"));
        }
        if (intent.hasExtra("extra_subject_mandatory")) {
            intent2.putExtra("extra_subject_mandatory", intent.getBooleanExtra("extra_subject_mandatory", false));
        }
        if (intent.hasExtra("android.intent.extra.STREAM")) {
            if (intent.hasExtra("SEND_MULTIPLE") && intent.getBooleanExtra("SEND_MULTIPLE", false)) {
                intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", intent.getParcelableArrayListExtra("android.intent.extra.STREAM"));
            } else {
                intent2.putExtra("android.intent.extra.STREAM", intent.getParcelableExtra("android.intent.extra.STREAM"));
            }
        }
        if (intent.hasExtra("sms_body")) {
            intent2.putExtra("sms_body", intent.getStringExtra("sms_body"));
        }
        if (intent.hasExtra("android.intent.extra.TEXT")) {
            intent2.putExtra("android.intent.extra.TEXT", intent.getStringExtra("android.intent.extra.TEXT"));
        }
        if (intent.hasExtra("SEND_MULTIPLE")) {
            intent2.putExtra("SEND_MULTIPLE", intent.getBooleanExtra("SEND_MULTIPLE", false));
        }
        if (intent.hasExtra("FOCUS_ON_FIELD")) {
            intent2.putExtra("FOCUS_ON_FIELD", intent.getStringExtra("FOCUS_ON_FIELD"));
        }
        if (a2) {
            b(aVar, intent2, conversationId, stringExtra2, this.d, this.e, this.f, this.g);
            return;
        }
        deeb di = aVar.di();
        boolean z2 = this.d;
        boolean z3 = this.e;
        boolean z4 = this.f;
        boolean z5 = this.g;
        ensz enszVar = (ensz) deeb.a.h();
        enszVar.Y(csux.p, conversationIdType);
        ((ensz) enszVar.h("com/google/android/apps/messaging/voiceactions/common/LegacyVoiceActionHandler", "processSendMessageIntent", 89, "LegacyVoiceActionHandler.java")).q("Action Voice Handler (legacy) invoked");
        if (!conversationIdType.b() || TextUtils.isEmpty(stringExtra2)) {
            if (conversationIdType.b() || !TextUtils.isEmpty(stringExtra2)) {
                return;
            }
            di.a(intent2, conversationIdType, z2, z3, z4, z5);
            return;
        }
        bcpt bcptVar = di.d;
        bcwc bcwcVar = di.b;
        deea deeaVar = new deea(di, intent2, z2, z3, z4, z5);
        bbeq bbeqVar = (bbeq) bcwcVar.a.b();
        bbeqVar.getClass();
        bcptVar.c(new bcwb(bbeqVar, deeaVar));
        bcwb bcwbVar = (bcwb) di.d.a();
        String[] strArr = {stringExtra2};
        String b = di.d.b();
        if (bcwbVar.j(b) && bcwbVar.a == null) {
            List asList = Arrays.asList(strArr);
            enru enruVar = bdqu.a;
            ArrayList arrayList = new ArrayList();
            Iterator it = asList.iterator();
            while (it.hasNext()) {
                String trim = ((String) it.next()).trim();
                if (TextUtils.isEmpty(trim)) {
                    ensk j = bdqu.a.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/datamodel/data/participant/ParticipantData", "getFromDestinationByDeviceCountries", 363, "ParticipantData.java")).q("Hit empty recipient.");
                } else {
                    arrayList.add(bdqu.b(trim));
                }
            }
            bcwbVar.a = bcwbVar.b.b(arrayList, new bcwa(b), bcwbVar, Optional.empty());
        }
    }
}
