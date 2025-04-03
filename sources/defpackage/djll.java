package defpackage;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class djll {
    public static final /* synthetic */ int a = 0;
    private static final enhk b;

    static {
        enhd enhdVar = new enhd();
        enhdVar.k(emuz.c(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT), eyud.FEATURE_TAG_TEXT);
        enhdVar.k(emuz.c("video"), eyud.FEATURE_TAG_VIDEO);
        enhdVar.k(emuz.c("+g.3gpp.smsip"), eyud.FEATURE_TAG_3GPP_SMSIP);
        enhdVar.k(emuz.c("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcse.dp\""), eyud.FEATURE_TAG_3GPP_IARI_REF_RCSE_DP);
        enhdVar.k(emuz.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.mmtel\""), eyud.FEATURE_TAG_3GPP_ICSI_REF_MMTEL);
        enhdVar.k(emuz.c("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geopush\""), eyud.FEATURE_TAG_3GPP_IARI_REF_GEOPUSH);
        enhdVar.k(emuz.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session\""), eyud.FEATURE_TAG_3GPP_ICSI_REF_CPM_SESSION);
        enhdVar.k(emuz.c("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.fthttp\""), eyud.FEATURE_TAG_3GPP_IARI_REF_FTHTTP);
        enhdVar.k(emuz.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.filetransfer\""), eyud.FEATURE_TAG_3GPP_IARI_REF_CPM_FILETRANSFER);
        enhdVar.k(emuz.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.msg\""), eyud.FEATURE_TAG_3GPP_ICSI_REF_CPM_MSG);
        enhdVar.k(emuz.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.largemsg\""), eyud.FEATURE_TAG_3GPP_ICSI_REF_CPM_LARGEMSG);
        enhdVar.k(emuz.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.deferred\""), eyud.FEATURE_TAG_3GPP_ICSI_REF_CPM_DEFERRED);
        enhdVar.k(emuz.c("+g.gsma.rcs.cpm.pager-large"), eyud.FEATURE_TAG_CPM_PAGER_LARGE);
        enhdVar.k(emuz.c("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms\""), eyud.FEATURE_TAG_3GPP_IARI_REF_FTSMS);
        enhdVar.k(emuz.c("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callcomposer\""), eyud.FEATURE_TAG_3GPP_ICSI_REF_CALLCOMPOSER);
        enhdVar.k(emuz.c("+g.gsma.callcomposer"), eyud.FEATURE_TAG_GSMA_CALLCOMPOSER);
        enhdVar.k(emuz.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.callunanswered\""), eyud.FEATURE_TAG_3GPP_ICSI_REF_CALLUNANSWERED);
        enhdVar.k(emuz.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedmap\""), eyud.FEATURE_TAG_3GPP_ICSI_REF_SHAREDMAP);
        enhdVar.k(emuz.c("+g.3gpp.icsi-ref=\"urn%3Aurn-7%3A3gpp-service.ims.icsi.gsma.sharedsketch\""), eyud.FEATURE_TAG_3GPP_ICSI_REF_SHAREDSKETCH);
        enhdVar.k(emuz.c("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.geosms\""), eyud.FEATURE_TAG_3GPP_IARI_REF_GEOSMS);
        enhdVar.k(emuz.c("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot\""), eyud.FEATURE_TAG_3GPP_IARI_REF_CHATBOT);
        enhdVar.k(emuz.c("+g.3gpp.iari-ref=\"urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.chatbot.sa\""), eyud.FEATURE_TAG_3GPP_IARI_REF_CHATBOT_SA);
        enhdVar.k(emuz.c("+g.gsma.rcs.botversion=\"#=1,#=2\""), eyud.FEATURE_TAG_GSMA_BOTVERSION);
        enhdVar.k(emuz.c("+g.gsma.rcs.cpimext"), eyud.FEATURE_TAG_GSMA_CPIMEXT);
        b = enhdVar.c();
    }

    static eyud a(String str) {
        return (eyud) b.getOrDefault(emuz.c(str), eyud.FEATURE_TAG_TYPE_UNKNOWN);
    }
}
