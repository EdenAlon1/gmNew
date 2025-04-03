package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.io.UnsupportedEncodingException;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class czui {
    private static final cskc a = cskc.g("Bugle", "SuggestionIntentFactory");
    private final crjp b;
    private final Optional c;

    public czui(crjp crjpVar, Optional optional) {
        this.b = crjpVar;
        this.c = optional;
    }

    public final Intent a(RbmSuggestionData rbmSuggestionData) {
        final ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        if (conversationSuggestion.getSuggestionType() != 4) {
            csjb c = a.c();
            c.I("suggestion is not calendar type, cannot create calendar intent");
            c.N("suggestion", rbmSuggestionData);
            c.r();
            return null;
        }
        String propertyValue = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_START_TIME);
        String propertyValue2 = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_END_TIME);
        if (propertyValue != null && propertyValue2 != null) {
            try {
                final long j = dktc.b(propertyValue).a;
                final long j2 = dktc.b(propertyValue2).a;
                return (Intent) this.c.map(new Function() { // from class: czuh
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        ConversationSuggestion conversationSuggestion2 = conversationSuggestion;
                        return ((tap) obj).a(new crsz(Long.valueOf(j), Long.valueOf(j2), conversationSuggestion2.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE), conversationSuggestion2.getPropertyValue("description"), null, null));
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).orElse(null);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    public final Intent b(RbmSuggestionData rbmSuggestionData) {
        ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        if (!conversationSuggestion.canUseFallbackUrl()) {
            csjb c = a.c();
            c.I("Suggestion is not a type that supports fallback urls. Cannot create fallback url intent");
            c.N("suggestion", rbmSuggestionData);
            c.r();
            return null;
        }
        if (!conversationSuggestion.hasFallbackUrl()) {
            csjb c2 = a.c();
            c2.I("Suggestion has no fallback url. Cannot create fallback url intent.");
            c2.N("suggestion", rbmSuggestionData);
            c2.r();
            return null;
        }
        String propertyValue = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_FALLBACK_URL);
        if (!TextUtils.isEmpty(propertyValue)) {
            return this.b.c(propertyValue);
        }
        csjb c3 = a.c();
        c3.I("Suggestion somehow has empty fallback url. Cannot create fallback url intent.");
        c3.N("suggestion", rbmSuggestionData);
        c3.r();
        return null;
    }

    public final Intent c(RbmSuggestionData rbmSuggestionData) {
        ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        if (conversationSuggestion.getSuggestionType() != 3) {
            csjb c = a.c();
            c.I("suggestion is not map type, cannot create map intent");
            c.N("suggestion", rbmSuggestionData);
            c.r();
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String propertyValue = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_QUERY);
        try {
            if (TextUtils.isEmpty(propertyValue)) {
                String propertyValue2 = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT);
                String propertyValue3 = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LONG);
                if (!TextUtils.isEmpty(propertyValue2) && !TextUtils.isEmpty(propertyValue3)) {
                    String k = cuxt.k(propertyValue2);
                    String k2 = cuxt.k(propertyValue3);
                    String propertyValue4 = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LABEL);
                    if (TextUtils.isEmpty(propertyValue4)) {
                        sb.append(String.format("geo:%s,%s", k, k2));
                    } else {
                        sb.append(String.format("geo:0,0?q=%s,%s(%s)", k, k2, cuxt.k(propertyValue4)));
                    }
                }
                csjb c2 = a.c();
                c2.I("suggestion type map missing lat/lng, cannot create intent");
                c2.M(ConversationSuggestion.SUGGESTION_PROPERTY_MAP_LAT, propertyValue2);
                c2.M("lng", propertyValue3);
                c2.r();
                return null;
            }
            sb.append("geo:0,0?q=");
            sb.append(cuxt.k(propertyValue));
            return this.b.b(Uri.parse(sb.toString()));
        } catch (UnsupportedEncodingException unused) {
            csjb a2 = a.a();
            a2.I("Unsupported encoding exception for suggested map action.");
            a2.N("suggestion", rbmSuggestionData);
            a2.r();
            return null;
        }
    }

    public final Intent d(RbmSuggestionData rbmSuggestionData) {
        ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        if (conversationSuggestion.getSuggestionType() != 2) {
            csjb c = a.c();
            c.I("suggestion is not phone type, cannot create call intent");
            c.N("suggestion", rbmSuggestionData);
            c.r();
            return null;
        }
        String propertyValue = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_PHONE_NUMBER);
        if (!TextUtils.isEmpty(propertyValue)) {
            return this.b.a(propertyValue);
        }
        csjb c2 = a.c();
        c2.I("suggestion type phone has empty number. Cannot create call intent.");
        c2.N("suggestion", rbmSuggestionData);
        c2.r();
        return null;
    }

    public final Intent e(RbmSuggestionData rbmSuggestionData) {
        ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
        if (conversationSuggestion.getSuggestionType() != 1) {
            csjb c = a.c();
            c.I("suggestion is not web type, cannot create web intent");
            c.N("suggestion", rbmSuggestionData);
            c.r();
            return null;
        }
        String propertyValue = conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI);
        if (!TextUtils.isEmpty(propertyValue)) {
            return this.b.c(propertyValue);
        }
        csjb c2 = a.c();
        c2.I("suggestion type web has empty uri. Cannot create web intent.");
        c2.N("suggestion", rbmSuggestionData);
        c2.r();
        return null;
    }
}
