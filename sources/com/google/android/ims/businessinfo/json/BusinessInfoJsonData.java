package com.google.android.ims.businessinfo.json;

import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import defpackage.ctvb;
import defpackage.diyr;
import defpackage.diyy;
import defpackage.dizd;
import defpackage.emxe;
import defpackage.emyl;
import defpackage.emys;
import defpackage.engw;
import defpackage.enou;
import defpackage.evlh;
import defpackage.evlj;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class BusinessInfoJsonData {
    protected static final String MAILTO_PREFIX = "mailto:";
    protected static final String SCHEME_SMS = "sms:";

    @evlh
    @evlj(a = "comm-addr")
    CommunicationAddressesData communicationAddressesData;

    @evlh
    @evlj(a = "media-list")
    MediaListData mediaListData;

    @evlh
    @evlj(a = "web-resources")
    WebResourceData webResourceData;
    private static final diyy<Boolean> ENABLE_FORMATTABLE_PHONE_NUMBERS_REGEX = dizd.a(152440489);
    private static final emyl<Pattern> formattablePhoneNumbers = emys.a(new emyl() { // from class: com.google.android.ims.businessinfo.json.BusinessInfoJsonData$$ExternalSyntheticLambda0
        @Override // defpackage.emyl
        public final Object get() {
            Pattern compile;
            compile = Pattern.compile((String) diyr.a().b.e.a());
            return compile;
        }
    });

    /* compiled from: PG */
    private static class CommunicationAddressesData {

        @evlh
        @evlj(a = "tel")
        private TelephoneData telephoneData;

        @evlh
        @evlj(a = "uri-entry")
        private List<UriEntryData> uriEntries;

        private CommunicationAddressesData() {
        }
    }

    /* compiled from: PG */
    private static class MediaListData {

        @evlh
        @evlj(a = "media-entry")
        private List<MediaEntryJsonData> mediaEntries;

        private MediaListData() {
        }
    }

    /* compiled from: PG */
    static class TelephoneData {

        @evlh
        @evlj(a = "custom-label")
        private String customLabel;

        @evlh
        @evlj(a = ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL)
        private String label;

        @evlh
        @evlj(a = "tel-nb")
        private TelephoneNumber telephoneNumber;

        @evlh
        @evlj(a = "tel-type")
        private String type;

        /* compiled from: PG */
        private static class TelephoneNumber {

            @evlh
            @evlj(a = "tel-str")
            private String telephoneString;

            private TelephoneNumber() {
            }
        }

        TelephoneData() {
        }

        public String getCustomLabel() {
            return this.customLabel;
        }

        String getLabel() {
            return this.label;
        }

        public String getTelephoneString() {
            TelephoneNumber telephoneNumber = this.telephoneNumber;
            return (telephoneNumber == null || telephoneNumber.telephoneString == null) ? "" : this.telephoneNumber.telephoneString;
        }

        public String getTelephoneType() {
            return this.type;
        }

        public String toString() {
            return String.format("tel-str: %s tel-type: %s label: %s custom-label: %s", getTelephoneString(), this.type, this.label, this.customLabel);
        }
    }

    /* compiled from: PG */
    protected static class UriEntryData {

        @evlh
        @evlj(a = "custom-label")
        private String customLabel;

        @evlh
        @evlj(a = ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL)
        private String label;

        @evlh
        @evlj(a = "addr-uri-type")
        private String type;

        @evlh
        @evlj(a = "addr-uri")
        private String uri;

        protected UriEntryData() {
        }

        public String getCustomLabel() {
            return this.customLabel;
        }

        public String getLabel() {
            return this.label;
        }

        public String getType() {
            return this.type;
        }

        public String getUri() {
            return this.uri;
        }

        public String toString() {
            return String.format("addr-uri-type: %s addr-uri: %s label: %s custom-label: %s", this.type, this.uri, this.label, this.customLabel);
        }
    }

    /* compiled from: PG */
    protected static class WebEntryData {

        @evlh
        @evlj(a = "custom-label")
        private String customLabel;

        @evlh
        @evlj(a = ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL)
        private String label;

        @evlh
        @evlj(a = "url")
        private String url;

        protected WebEntryData() {
        }

        protected String getCustomLabel() {
            return this.customLabel;
        }

        protected String getLabel() {
            return this.label;
        }

        protected String getUrl() {
            return this.url;
        }

        public String toString() {
            return String.format("url: %s label: %s custom-label: %s", this.url, this.label, this.customLabel);
        }
    }

    /* compiled from: PG */
    private static class WebResourceData {

        @evlh
        @evlj(a = "web-entry")
        private List<WebEntryData> webEntries;

        private WebResourceData() {
        }
    }

    static String formatPhoneNumberForHeader(String str, ctvb ctvbVar) {
        return (!((Boolean) ENABLE_FORMATTABLE_PHONE_NUMBERS_REGEX.a()).booleanValue() || formattablePhoneNumbers.get().matcher(str).matches()) ? ctvbVar.p(str) : str.startsWith("tel:") ? str.substring(4) : str;
    }

    static String removeSmsPrefix(String str) {
        return emxe.b(str).replaceFirst(SCHEME_SMS, "");
    }

    protected List<MediaEntryJsonData> getMediaEntries() {
        MediaListData mediaListData = this.mediaListData;
        if (mediaListData != null && mediaListData.mediaEntries != null) {
            return this.mediaListData.mediaEntries;
        }
        int i = engw.d;
        return enou.a;
    }

    protected TelephoneData getTelephoneData() {
        CommunicationAddressesData communicationAddressesData = this.communicationAddressesData;
        if (communicationAddressesData == null) {
            return null;
        }
        return communicationAddressesData.telephoneData;
    }

    protected List<UriEntryData> getUriEntries() {
        CommunicationAddressesData communicationAddressesData = this.communicationAddressesData;
        if (communicationAddressesData != null && communicationAddressesData.uriEntries != null) {
            return this.communicationAddressesData.uriEntries;
        }
        int i = engw.d;
        return enou.a;
    }

    protected List<WebEntryData> getWebEntries() {
        WebResourceData webResourceData = this.webResourceData;
        if (webResourceData != null && webResourceData.webEntries != null) {
            return this.webResourceData.webEntries;
        }
        int i = engw.d;
        return enou.a;
    }
}
