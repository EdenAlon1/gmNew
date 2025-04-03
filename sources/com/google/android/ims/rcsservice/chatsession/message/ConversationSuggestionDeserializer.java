package com.google.android.ims.rcsservice.chatsession.message;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.android.vcard.VCardConstants;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import com.google.android.ims.rcsservice.chatsession.message.groupmanagement.GroupManagementRequest;
import defpackage.diwx;
import defpackage.diyy;
import defpackage.dizd;
import defpackage.dktn;
import defpackage.dkty;
import defpackage.evkq;
import defpackage.evkr;
import defpackage.evks;
import defpackage.evkt;
import defpackage.evkv;
import defpackage.evkw;
import defpackage.evkz;
import java.lang.reflect.Type;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class ConversationSuggestionDeserializer implements evks<ConversationSuggestion> {
    public static final diyy<Boolean> DESERIALIZE_FALLBACK_URLS = dizd.a(148616363);
    private static final dktn TAG = new dktn("ConversationSuggestionDeserializer");
    private String postBackData;
    private HashMap<String, String> properties;
    private int suggestionType;

    private void deserializeComposeTextDraftMessage(evkw evkwVar) {
        deserializeProperty(evkwVar, ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, ConversationSuggestion.SUGGESTION_PROPERTY_COMPOSE_ACTION_DRAFT_TEXT);
    }

    private boolean deserializeCreateCalendarEvent(evkw evkwVar) {
        evkw d = evkwVar.d("createCalendarEvent");
        if (d == null) {
            dkty.d(TAG, "Unable to deserialize create calendar event action: null event", new Object[0]);
            return false;
        }
        String deserializeProperty = deserializeProperty(d, "startTime", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME);
        String deserializeProperty2 = deserializeProperty(d, "endTime", ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME);
        String deserializeProperty3 = deserializeProperty(d, ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE, ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE);
        deserializeProperty(d, "description", "description");
        deserializeFallbackUrl(d);
        if (!TextUtils.isEmpty(deserializeProperty) && !TextUtils.isEmpty(deserializeProperty2) && !TextUtils.isEmpty(deserializeProperty3)) {
            return true;
        }
        dkty.d(TAG, "Unable to deserialize create calendar action: invalid properties; startTime: %s, endTime: %s, title: %s", deserializeProperty, deserializeProperty2, deserializeProperty3);
        return false;
    }

    private boolean deserializeFallbackUrl(evkw evkwVar) {
        if (!((Boolean) DESERIALIZE_FALLBACK_URLS.a()).booleanValue()) {
            return false;
        }
        String deserializePropertyWithoutSaving = deserializePropertyWithoutSaving(evkwVar, ConversationSuggestion.SUGGESTION_PROPERTY_FALLBACK_URL);
        if (TextUtils.isEmpty(deserializePropertyWithoutSaving)) {
            dkty.d(TAG, "Unable to deserialize fallback url: empty url", new Object[0]);
            return false;
        }
        Uri parse = Uri.parse(deserializePropertyWithoutSaving);
        if (parse == null) {
            dkty.d(TAG, "Unable to deserialize fallback url: null uri", new Object[0]);
            return false;
        }
        if (!URLUtil.isNetworkUrl(deserializePropertyWithoutSaving) || TextUtils.isEmpty(parse.getHost())) {
            dkty.d(TAG, "Unable to deserialize fallback url: invalid url: %s", deserializePropertyWithoutSaving);
            return false;
        }
        dkty.d(TAG, "Valid fallback url: %s", deserializePropertyWithoutSaving);
        savePropertyInPropertyMap(ConversationSuggestion.SUGGESTION_PROPERTY_FALLBACK_URL, deserializePropertyWithoutSaving);
        return true;
    }

    private boolean deserializeLocation(evkw evkwVar) {
        evkw d = evkwVar.d("location");
        if (d == null) {
            dkty.d(TAG, "Unable to deserialize location action: null location", new Object[0]);
            return false;
        }
        String deserializeProperty = deserializeProperty(d, "latitude", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT);
        String deserializeProperty2 = deserializeProperty(d, "longitude", ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG);
        String deserializeProperty3 = deserializeProperty(d, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
        deserializeProperty(d, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL, ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
        deserializeFallbackUrl(evkwVar);
        if ((!TextUtils.isEmpty(deserializeProperty) && !TextUtils.isEmpty(deserializeProperty2)) || !TextUtils.isEmpty(deserializeProperty3)) {
            return true;
        }
        dkty.d(TAG, "Unable to deserialize location action: invalid properties; latitude: %s, longitude: %s, query: %s", deserializeProperty, deserializeProperty2, deserializeProperty3);
        return false;
    }

    private boolean deserializePhoneNumber(evkw evkwVar) {
        evkw d = evkwVar.d("dialPhoneNumber");
        if (d == null) {
            dkty.d(TAG, "Unable to deserialize phone action: null dialPhoneNumber", new Object[0]);
            return false;
        }
        if (TextUtils.isEmpty(deserializeProperty(d, ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER, ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER))) {
            dkty.d(TAG, "Unable to deserialize phone action: empty phoneNumber", new Object[0]);
            return false;
        }
        deserializeFallbackUrl(d);
        return true;
    }

    private boolean deserializePhoneNumberForComposeAction(evkw evkwVar) {
        return !TextUtils.isEmpty(deserializeProperty(evkwVar, ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER, ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER));
    }

    private String deserializeProperty(evkw evkwVar, String str, String str2) {
        String deserializePropertyWithoutSaving = deserializePropertyWithoutSaving(evkwVar, str);
        if (deserializePropertyWithoutSaving != null) {
            savePropertyInPropertyMap(str2, deserializePropertyWithoutSaving);
        }
        return deserializePropertyWithoutSaving;
    }

    private static String deserializePropertyWithoutSaving(evkw evkwVar, String str) {
        evkt evktVar;
        if (evkwVar == null || (evktVar = (evkt) evkwVar.a.get(str)) == null || (evktVar instanceof evkv)) {
            return null;
        }
        return evktVar instanceof evkw ? evktVar.c().toString() : evktVar instanceof evkq ? evktVar.b().toString() : evktVar.a();
    }

    private void deserializeSuggestedAction(evkw evkwVar) {
        int i;
        String deserializeDisplayText = deserializeDisplayText(evkwVar);
        String deserializePostBackData = deserializePostBackData(evkwVar);
        if (TextUtils.isEmpty(deserializeDisplayText)) {
            dkty.d(TAG, "Unable to deserialize suggested action: empty display text", new Object[0]);
            return;
        }
        this.postBackData = deserializePostBackData;
        this.properties.put(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, deserializeDisplayText);
        evkw d = evkwVar.d("urlAction");
        if (d != null) {
            dktn dktnVar = TAG;
            dkty.l(dktnVar, " EnableWebviewStaticBridge flag is : %s", Boolean.valueOf(diwx.a()));
            if (diwx.a()) {
                if (validateAndDeserializeOpenUrlAction(d)) {
                    dkty.l(dktnVar, " Valid open url action with suggestionType: %s", Integer.valueOf(this.suggestionType));
                    return;
                }
                return;
            } else {
                if (deserializeWebUri(d)) {
                    this.suggestionType = 1;
                    return;
                }
                return;
            }
        }
        evkw d2 = evkwVar.d("dialerAction");
        if (d2 == null || !deserializePhoneNumber(d2)) {
            evkw d3 = evkwVar.d("mapAction");
            if (d3 != null) {
                evkw d4 = d3.d("showLocation");
                if (d4 == null || !deserializeLocation(d4)) {
                    evkw d5 = d3.d("requestLocationPush");
                    if (d5 != null) {
                        deserializeFallbackUrl(d5);
                        this.suggestionType = 5;
                        return;
                    }
                } else {
                    i = 3;
                }
            }
            evkw d6 = evkwVar.d("calendarAction");
            if (d6 == null || !deserializeCreateCalendarEvent(d6)) {
                evkw d7 = evkwVar.d("composeAction");
                if (d7 != null) {
                    evkw d8 = d7.d("composeTextMessage");
                    if (d8 != null && deserializePhoneNumberForComposeAction(d8)) {
                        deserializeComposeTextDraftMessage(d8);
                        this.suggestionType = 8;
                        return;
                    }
                    evkw d9 = d7.d("composeRecordingMessage");
                    if (d9 == null || !deserializePhoneNumberForComposeAction(d9)) {
                        return;
                    }
                    this.suggestionType = determineComposeRecordingSuggestionType(d9);
                    return;
                }
                return;
            }
            i = 4;
        } else {
            i = 2;
        }
        this.suggestionType = i;
    }

    private void deserializeSuggestedReply(evkw evkwVar) {
        String deserializeDisplayText = deserializeDisplayText(evkwVar);
        String deserializePostBackData = deserializePostBackData(evkwVar);
        if (TextUtils.isEmpty(deserializeDisplayText)) {
            dkty.d(TAG, "Unable to deserialize suggested reply: empty display text", new Object[0]);
            return;
        }
        this.suggestionType = 0;
        this.postBackData = deserializePostBackData;
        this.properties.put(ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, deserializeDisplayText);
    }

    private boolean deserializeWebUri(evkw evkwVar) {
        evkw d = evkwVar.d("openUrl");
        if (d == null) {
            dkty.c("Unable to deserialize web action: null openUrl", new Object[0]);
            return false;
        }
        String deserializeProperty = deserializeProperty(d, "url", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        if (TextUtils.isEmpty(deserializeProperty)) {
            dkty.c("Unable to deserialize web action: empty url", new Object[0]);
            return false;
        }
        Uri parse = Uri.parse(deserializeProperty);
        if (parse == null) {
            dkty.c("Unable to deserialize web action: null uri", new Object[0]);
            return false;
        }
        if (URLUtil.isNetworkUrl(deserializeProperty)) {
            if (!TextUtils.isEmpty(parse.getHost())) {
                dkty.c("Valid web url: %s", deserializeProperty);
                return true;
            }
        } else if (!TextUtils.isEmpty(parse.getScheme()) && !URLUtil.isContentUrl(deserializeProperty) && !URLUtil.isFileUrl(deserializeProperty)) {
            dkty.c("Valid intent url: %s", deserializeProperty);
            return true;
        }
        dkty.c("Unable to deserialize web action: invalid url: %s", deserializeProperty);
        return false;
    }

    private int determineComposeRecordingSuggestionType(evkw evkwVar) {
        String deserializeProperty = deserializeProperty(evkwVar, BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, ConversationSuggestion.SUGGESTION_PROPERTY_COMPOSE_ACTION_RECORDING_TYPE);
        if (deserializeProperty == null) {
            return -1;
        }
        if (deserializeProperty.equals("AUDIO")) {
            return 9;
        }
        return deserializeProperty.equals(VCardConstants.PARAM_TYPE_VIDEO) ? 10 : -1;
    }

    private void savePropertyInPropertyMap(String str, String str2) {
        HashMap<String, String> hashMap = this.properties;
        if (hashMap != null) {
            hashMap.put(str, str2);
        }
    }

    private boolean validateAndDeserializeOpenUrlAction(evkw evkwVar) {
        char c;
        evkw d = evkwVar.d("openUrl");
        if (d == null) {
            dkty.d(TAG, "Unable to deserialize web action: null openUrl", new Object[0]);
            return false;
        }
        String deserializeProperty = deserializeProperty(d, "url", ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        if (TextUtils.isEmpty(deserializeProperty)) {
            dkty.d(TAG, "Unable to deserialize web action: empty url", new Object[0]);
            return false;
        }
        Uri parse = Uri.parse(deserializeProperty);
        if (parse == null) {
            dkty.d(TAG, "Unable to deserialize web action: null uri", new Object[0]);
            return false;
        }
        if (URLUtil.isNetworkUrl(deserializeProperty)) {
            if (TextUtils.isEmpty(parse.getHost())) {
                dkty.d(TAG, "Invalid empty web url host: %s", deserializeProperty);
                return false;
            }
        } else {
            if (TextUtils.isEmpty(parse.getScheme())) {
                dkty.d(TAG, "Invalid empty web url scheme: %s", deserializeProperty);
                return false;
            }
            if (URLUtil.isContentUrl(deserializeProperty) || URLUtil.isFileUrl(deserializeProperty)) {
                dkty.d(TAG, "Invalid file or content url: %s", deserializeProperty);
                return false;
            }
        }
        String deserializeProperty2 = deserializeProperty(d, "application", ConversationSuggestion.SUGGESTION_PROPERTY_OPEN_URL_APPLICATION);
        if (TextUtils.isEmpty(deserializeProperty2)) {
            dkty.d(TAG, "Unable to deserialize open url action application: empty application %s", deserializeProperty2);
            return false;
        }
        int hashCode = deserializeProperty2.hashCode();
        if (hashCode != 150940456) {
            if (hashCode == 1224424441 && deserializeProperty2.equals("webview")) {
                c = 0;
            }
            c = 65535;
        } else {
            if (deserializeProperty2.equals("browser")) {
                c = 1;
            }
            c = 65535;
        }
        if (c == 0) {
            this.suggestionType = 11;
        } else {
            if (c != 1) {
                dkty.d(TAG, "Unable to deserialize open url action application: invalid application %s", deserializeProperty2);
                return false;
            }
            this.suggestionType = 1;
        }
        String deserializeProperty3 = deserializeProperty(d, "viewMode", ConversationSuggestion.SUGGESTION_PROPERTY_OPEN_URL_VIEW_MODE);
        if (!TextUtils.isEmpty(deserializeProperty3) && !deserializeProperty3.equals("full") && !deserializeProperty3.equals("half") && !deserializeProperty3.equals("tall")) {
            dkty.d(TAG, "Unable to deserialize open url action view mode: invalid view mode %s", deserializeProperty3);
        }
        dkty.d(TAG, "Able to deserialize open url action:  url: %s,  application type: %s,  optional view mode: %s,  optional description: %s", deserializeProperty, deserializeProperty2, deserializeProperty3, deserializeProperty(d, "description", ConversationSuggestion.SUGGESTION_PROPERTY_OPEN_URL_DESCRIPTION));
        return true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.evks
    public ConversationSuggestion deserialize(evkt evktVar, Type type, evkr evkrVar) {
        evkw c = evktVar.c();
        this.suggestionType = -1;
        this.postBackData = null;
        this.properties = new HashMap<>();
        evkw d = c.d("reply");
        if (d != null) {
            deserializeSuggestedReply(d);
        } else {
            evkw d2 = c.d(GroupManagementRequest.ACTION_TAG);
            if (d2 != null) {
                deserializeSuggestedAction(d2);
            }
        }
        int i = this.suggestionType;
        if (i != -1) {
            return ConversationSuggestion.createRbmConversationSuggestion(i, this.properties, this.postBackData, (String) null, (String) null, (String) null);
        }
        dkty.q("Ignoring malformed suggestion.", new Object[0]);
        return null;
    }

    public String deserializeDisplayText(evkw evkwVar) {
        return deserializeProperty(evkwVar, ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT, ConversationSuggestion.SUGGESTION_PROPERTY_DISPLAY_TEXT);
    }

    public String deserializePostBackData(evkw evkwVar) {
        evkz evkzVar;
        evkw d = evkwVar.d("postback");
        if (d == null || (evkzVar = (evkz) d.a.get(GroupManagementRequest.DATA_TAG)) == null || !(evkzVar.a instanceof String) || TextUtils.isEmpty(evkzVar.a())) {
            return null;
        }
        return evkzVar.a();
    }
}
