package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes6.dex */
public final class alrv {
    public final ecdc R;
    public static final ecda a = new ecda("messageSendClickToSentLatency");
    public static final ecda b = new ecda("conversationMessagesLoadedLatency");
    public static final ecda c = new ecda("SendPrecheckLatency");
    public static final ecda d = new ecda("Sender2SendingLatency");
    public static final ecda e = new ecda("SMSSentLatency");
    public static final ecda f = new ecda("MMSSentLatency");
    public static final ecda g = new ecda("RCSSentLatency");
    public static final ecda h = new ecda("SMSPerceivedSentLatency");
    public static final ecda i = new ecda("MMSPerceivedSentLatency");
    public static final ecda j = new ecda("RCSPerceivedSentLatency");
    public static final ecda k = new ecda("DeleteMessageLatency");
    public static final ecda l = new ecda("DeleteMessagesLatency");
    public static final ecda m = new ecda("DeleteConversationLatency");
    public static final ecda n = new ecda("SoftDeleteConversationLatency");
    public static final ecda o = new ecda("MarkAsReadLatency");
    public static final ecda p = new ecda("ScrollHomeScreen");
    public static final ecda q = new ecda("ScrollConversationScreen");
    public static final ecda r = new ecda("LoadConversationFromListLatency");
    public static final ecda s = new ecda("LoadConversationFromNotificationLatency");
    public static final ecda t = new ecda("LoadConversationFromPickerLatency");
    public static final ecda u = new ecda("LoadConversationLatency");
    public static final ecda v = new ecda("LoadConversationFragmentLatency");
    public static final ecda w = new ecda("LoadConversationMessagesFragmentLatency");
    public static final ecda x = new ecda("LoadConversationComposeFragmentLatency");
    public static final ecda y = new ecda("LoadHomeScreenAccountLatency");
    public static final ecda z = new ecda("OnCreateToConversationListLoadedFromDb");
    public static final ecda A = new ecda("OpenCameraGallery");
    public static final ecda B = new ecda("OpenCameraGalleryPreviewReady");
    public static final ecda C = new ecda("AttachGalleryItem");
    public static final ecda D = new ecda("OpenPlusButton");
    public static final ecda E = new ecda("OpenEmojiGallery");
    public static final ecda F = new ecda("GmsComplianceApiLatency");
    public static final ecda G = new ecda("LoadContactPickerFragmentFromHomeScreenLatency");
    public static final ecda H = new ecda("LoadContactPickerFragmentLatency");
    public static final ecda I = new ecda("LoadAllContactLatency");
    public static final ecda J = new ecda("ScrollLighterConversationScreen");
    public static final ecda K = new ecda("LoadLighterConversationLatency");
    public static final ecda L = new ecda("BlockedParticipantsFragmentLoadLatency");
    public static final ecda M = new ecda("BlockedParticipantsFragmentLoadMemory");
    public static final ecda N = new ecda("DisableRecipientEncryption");
    public static final ecda O = new ecda("CloudSyncInitialBackupDuration");
    public static final ecda P = new ecda("CloudSyncInitialRestoreDuration");
    public static final ecda Q = new ecda("CloudSyncInitialBatchBackupDuration");

    public alrv(ecdc ecdcVar) {
        this.R = ecdcVar;
    }

    public final ecri a() {
        return this.R.c();
    }

    public final void b(ecda ecdaVar) {
        this.R.a.c(ecdaVar);
    }

    public final void c(ecda ecdaVar) {
        this.R.f(ecdaVar, null);
    }

    public final void d(ecou ecouVar) {
        this.R.g(ecouVar);
    }

    public final void e(ecda ecdaVar) {
        this.R.a.g(ecdaVar);
    }

    public final void f(ecda ecdaVar) {
        this.R.a.l(ecdaVar, ecrh.UNKNOWN);
    }

    public final void g(ecda ecdaVar, ecrh ecrhVar) {
        this.R.a.l(ecdaVar, ecrhVar);
    }

    public final void h(ecri ecriVar, ecda ecdaVar) {
        this.R.h(ecriVar, ecdaVar, ecrh.UNKNOWN);
    }
}
