package com.google.android.ims.chatsession;

import android.content.Context;
import android.os.Binder;
import androidx.car.app.hardware.info.EnergyProfile;
import com.google.android.ims.rcsservice.chatsession.ChatSessionServiceResult;
import com.google.android.ims.rcsservice.chatsession.IChatSession;
import com.google.android.ims.rcsservice.chatsession.MessageRevocationSupportedResult;
import com.google.android.ims.rcsservice.chatsession.message.ChatMessage;
import com.google.android.ims.rcsservice.group.GroupInfo;
import defpackage.diik;
import defpackage.diil;
import defpackage.dikt;
import defpackage.diyv;
import defpackage.diyy;
import defpackage.dizd;
import defpackage.dkmv;
import defpackage.dkqd;
import defpackage.dktn;
import defpackage.dkty;
import defpackage.eyri;
import defpackage.eyrk;
import defpackage.eyrn;
import defpackage.eyrp;
import j$.util.Objects;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ChatSessionEngine extends IChatSession.Stub {
    private final Context d;
    private diil e;
    private final dkmv f;
    public dikt rcsExtensionSender;
    static final diyy<Boolean> ENABLE_RECOVER_DISABLED_RCS_GROUPS_FROM_TELEPHONY = dizd.a(149786222);
    static final diyy<Boolean> ENABLE_CHAT_SESSION_ENGINE_SEND_REPORT_UNSUPPORTED = diyv.b("enable_ChatSessionEngine_sendReport_unsupported");
    static final diyy<Boolean> ENABLE_CHAT_SESSION_ENGINE_SEND_GROUP_REPORT_UNSUPPORTED = diyv.b("enable_ChatSessionEngine_sendGroupReport_unsupported");
    static final diyy<Boolean> enableChatSessionEngineLogIncomingRpcEvent = diyv.b("enable_chat_session_engine_log_incoming_rpc_event");
    static final diyy<Boolean> enableChatSessionEngineMethodsNotImplemented = diyv.b("enable_chat_session_engine_methods_not_implemented");
    private static final dktn a = new dktn("IChatSession");
    private static final String[] b = new String[0];
    private static final long[] c = new long[0];

    public ChatSessionEngine(Context context, dkmv dkmvVar, dikt diktVar) {
        this.d = context;
        this.f = dkmvVar;
        this.rcsExtensionSender = diktVar;
    }

    private final void a(Optional optional, Optional optional2, int i) {
        eyri eyriVar = (eyri) eyrk.a.createBuilder();
        eyriVar.copyOnWrite();
        eyrk eyrkVar = (eyrk) eyriVar.instance;
        eyrkVar.d = i - 1;
        eyrkVar.b |= 32;
        if (optional2.isPresent()) {
            String obj = optional2.get().toString();
            eyriVar.copyOnWrite();
            eyrk eyrkVar2 = (eyrk) eyriVar.instance;
            eyrkVar2.b |= 1;
            eyrkVar2.c = obj;
        }
        optional.isPresent();
        eyrn eyrnVar = (eyrn) eyrp.a.createBuilder();
        eyrnVar.copyOnWrite();
        eyrp eyrpVar = (eyrp) eyrnVar.instance;
        eyrpVar.e = 1;
        eyrpVar.b |= 1;
        eyrnVar.copyOnWrite();
        eyrp eyrpVar2 = (eyrp) eyrnVar.instance;
        eyrk eyrkVar3 = (eyrk) eyriVar.build();
        eyrkVar3.getClass();
        eyrpVar2.d = eyrkVar3;
        eyrpVar2.c = EnergyProfile.EVCONNECTOR_TYPE_OTHER;
        this.rcsExtensionSender.e(this.d, (eyrp) eyrnVar.build());
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult addUserToSession(long j, String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult endSession(long j) {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new diik("endSession");
        }
        dkqd.d(this.d, Binder.getCallingUid());
        diil diilVar = this.e;
        if (Objects.isNull(diilVar)) {
            return new ChatSessionServiceResult(2);
        }
        try {
            return diilVar.b(j);
        } catch (Exception e) {
            dkty.i(e, "Error while ending chat session: %s", e.getMessage());
            return new ChatSessionServiceResult(1);
        }
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public long[] getActiveSessionIds() {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new diik("getActiveSessionIds");
        }
        dkty.d(a, "Starting get active sessions", new Object[0]);
        if (((Boolean) enableChatSessionEngineLogIncomingRpcEvent.a()).booleanValue()) {
            a(Optional.empty(), Optional.empty(), 7);
        }
        dkqd.d(this.d, Binder.getCallingUid());
        return getActiveSessions();
    }

    @Deprecated
    public long[] getActiveSessions() {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new diik("getActiveSessions");
        }
        diil diilVar = this.e;
        if (Objects.isNull(diilVar)) {
            dkty.h(a, "Error on getting sessions no chat session provider.", new Object[0]);
            return c;
        }
        dkty.d(a, "Try get active sessions", new Object[0]);
        return diilVar.j();
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public GroupInfo getGroupInfo(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public long getPreferredSessionByUser(String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public String getRemoteUserId(long j) {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new diik("getRemoteUserId");
        }
        dktn dktnVar = a;
        Long valueOf = Long.valueOf(j);
        dkty.d(dktnVar, "Starting getRemoteUserId for sessionId %s", valueOf);
        if (((Boolean) enableChatSessionEngineLogIncomingRpcEvent.a()).booleanValue()) {
            a(Optional.empty(), Optional.of(valueOf), 19);
        }
        dkqd.d(this.d, Binder.getCallingUid());
        diil diilVar = this.e;
        if (Objects.isNull(diilVar)) {
            dkty.h(dktnVar, "Could not get remote user id for sessionId %s no chat session provider.", valueOf);
            return null;
        }
        try {
            dkty.d(dktnVar, "Try getRemoteUserId for session %s", valueOf);
            return diilVar.h(j);
        } catch (Exception e) {
            dkty.i(e, "Error while getting remote user id: %s", e.getMessage());
            return null;
        }
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult getSessionState(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public long[] getSessionsByUser(String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult getUpdatedGroupInfo(String str, String str2) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public String[] getUsersInSession(long j) {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new diik("getUsersInSession");
        }
        dktn dktnVar = a;
        Long valueOf = Long.valueOf(j);
        dkty.d(dktnVar, "Starting get users in session for session %s", valueOf);
        if (((Boolean) enableChatSessionEngineLogIncomingRpcEvent.a()).booleanValue()) {
            a(Optional.empty(), Optional.of(valueOf), 18);
        }
        dkqd.d(this.d, Binder.getCallingUid());
        diil diilVar = this.e;
        if (Objects.isNull(diilVar)) {
            dkty.h(dktnVar, "Could not get users in session for session id %s no chat session provider.", valueOf);
            return b;
        }
        try {
            dkty.d(dktnVar, "Try get users in session for session %s", valueOf);
            return diilVar.k(j);
        } catch (Exception e) {
            dkty.i(e, "Error while users in chat session: %s", e.getMessage());
            return b;
        }
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public boolean isGroupSession(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public MessageRevocationSupportedResult isMessageRevocationSupported(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult joinSession(long j) {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new diik("joinSession");
        }
        dkqd.d(this.d, Binder.getCallingUid());
        diil diilVar = this.e;
        if (Objects.isNull(diilVar)) {
            return new ChatSessionServiceResult(2);
        }
        try {
            return diilVar.c(j);
        } catch (Exception e) {
            dkty.i(e, "Error while joining chat session: %s", e.getMessage());
            return new ChatSessionServiceResult(1);
        }
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult leaveSession(long j) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Deprecated
    public void registerProvider(diil diilVar) {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new diik("registerProvider");
        }
        this.e = diilVar;
    }

    @Deprecated
    public long registerSession(diil diilVar) {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new diik("registerSession");
        }
        return this.f.a();
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult removeUserFromSession(long j, String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult reportRbmSpam(String str, String str2) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult revokeMessage(String str, String str2) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult sendGroupReport(long j, String str, String str2, long j2, int i) {
        throw new IllegalStateException("Method not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult sendIndicator(long j, int i) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult sendMessage(long j, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult sendMessageTo(String str, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult sendPrivateIndicator(long j, String str, int i) {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new diik("sendPrivateIndicator");
        }
        dkqd.d(this.d, Binder.getCallingUid());
        diil diilVar = this.e;
        if (Objects.isNull(diilVar)) {
            dkty.h(a, "Unable to send private indicator, chat session provider not initialized.", new Object[0]);
            return new ChatSessionServiceResult(2);
        }
        try {
            dkty.d(a, "Sending private indicator [%d]", Integer.valueOf(i));
            return diilVar.l(j);
        } catch (Exception e) {
            dkty.i(e, "Error while sending private indicator: %s", e.getMessage());
            return new ChatSessionServiceResult(1);
        }
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult sendPrivateMessage(long j, String str, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    public ChatSessionServiceResult sendReport(String str, String str2, String str3, long j, int i) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult sendSuggestionPostBack(String str, String str2, String str3, String str4, String str5) {
        throw new UnsupportedOperationException("sendSuggestionPostBack is deprecated");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult startGroupSession(String[] strArr) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult startGroupSessionWithMessage(String[] strArr, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public ChatSessionServiceResult startGroupSessionWithMessageAndSubject(String[] strArr, ChatMessage chatMessage, String str) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Override // com.google.android.ims.rcsservice.chatsession.IChatSession
    @Deprecated
    public final ChatSessionServiceResult startSessionWithMessage(String str, ChatMessage chatMessage) {
        throw new IllegalStateException("Not implemented anymore!");
    }

    @Deprecated
    public void unregisterProvider(diil diilVar) {
        if (((Boolean) enableChatSessionEngineMethodsNotImplemented.a()).booleanValue()) {
            throw new diik("unregisterProvider");
        }
        this.e = null;
    }

    @Deprecated
    public void unregisterSession(long j) {
    }
}
