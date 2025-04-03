package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.SmartSuggestionItemSuggestionData;
import j$.util.Map;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ctog implements ctiy {
    private static final Map a;
    private final ctyx b;

    static {
        fbri fbriVar = fbri.FULL_MESSAGE;
        ctix ctixVar = ctix.b;
        a = ffew.g(new ffcf(fbriVar, ctixVar), new ffcf(fbri.SHORT_MESSAGE, ctixVar), new ffcf(fbri.SCRIPTED_REPLY, ctixVar), new ffcf(fbri.EMOJI, ctixVar), new ffcf(fbri.ASSISTANT_QUERY, ctix.c), new ffcf(fbri.EMOTION, ctix.e), new ffcf(fbri.CALENDAR, ctix.f));
    }

    public ctog(ctyx ctyxVar) {
        ctyxVar.getClass();
        this.b = ctyxVar;
    }

    @Override // defpackage.ctiy
    public final ctix a(SuggestionData suggestionData) {
        suggestionData.getClass();
        return ((Boolean) ((cfup) ctjd.bb.get()).e()).booleanValue() ? ctix.a : suggestionData instanceof SmartSuggestionItemSuggestionData ? (ctix) Map.EL.getOrDefault(a, ((SmartSuggestionItemSuggestionData) suggestionData).l(), ctix.a) : ctix.a;
    }

    @Override // defpackage.ctiy
    public final List b() {
        if (((Boolean) ((cfup) ctjd.bb.get()).e()).booleanValue()) {
            return ffel.a;
        }
        ArrayList arrayList = new ArrayList();
        if (e(ctix.c)) {
            arrayList.add(ctix.c);
        }
        if (e(ctix.b)) {
            arrayList.add(ctix.b);
        }
        if (e(ctix.e)) {
            arrayList.add(ctix.e);
        }
        if (e(ctix.f)) {
            arrayList.add(ctix.f);
        }
        return arrayList;
    }

    @Override // defpackage.ctiy
    public final void c(ctix ctixVar) {
        ctixVar.getClass();
        if (((Boolean) ((cfup) ctjd.bb.get()).e()).booleanValue()) {
            return;
        }
        int ordinal = ctixVar.ordinal();
        if (ordinal == 1) {
            this.b.h("has_user_dismissed_p2p_conversation_suggestions_tooltip", true);
            return;
        }
        if (ordinal == 2) {
            this.b.h("has_user_dismissed_assistant_suggestions_tooltip", true);
        } else if (ordinal == 4) {
            this.b.h("has_user_dismissed_emotion_suggestions_tooltip", true);
        } else {
            if (ordinal != 5) {
                return;
            }
            this.b.h("has_user_dismissed_calendar_suggestions_tooltip", true);
        }
    }

    @Override // defpackage.ctiy
    public final void d(bdud bdudVar) {
        int d;
        if (((Boolean) ((cfup) ctjd.bb.get()).e()).booleanValue() || bdudVar.a.isEmpty()) {
            return;
        }
        engw engwVar = bdudVar.a;
        engwVar.getClass();
        E e = engwVar.get(0);
        SmartSuggestionData smartSuggestionData = e instanceof SmartSuggestionData ? (SmartSuggestionData) e : null;
        if (smartSuggestionData != null) {
            ctix a2 = a(smartSuggestionData);
            if (e(a2)) {
                a2.getClass();
                int ordinal = a2.ordinal();
                if (ordinal == 1) {
                    d = this.b.d("sent_message_counter_for_dismissing_p2p_suggestion_tooltip", 2);
                } else if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            d = this.b.d("sent_message_counter_for_dismissing_emotion_suggestion_tooltip", 2);
                        } else if (ordinal == 5) {
                            d = this.b.d("sent_message_counter_for_dismissing_calendar_suggestion_tooltip", 2);
                        }
                    }
                    d = 2;
                } else {
                    d = this.b.d("sent_message_counter_for_dismissing_assistant_suggestion_tooltip", 2);
                }
                int i = d - 1;
                if (i <= 0) {
                    c(a2);
                    return;
                }
                a2.getClass();
                int ordinal2 = a2.ordinal();
                if (ordinal2 == 1) {
                    this.b.j("sent_message_counter_for_dismissing_p2p_suggestion_tooltip", i);
                    return;
                }
                if (ordinal2 == 2) {
                    this.b.j("sent_message_counter_for_dismissing_assistant_suggestion_tooltip", i);
                } else if (ordinal2 == 4) {
                    this.b.j("sent_message_counter_for_dismissing_emotion_suggestion_tooltip", i);
                } else {
                    if (ordinal2 != 5) {
                        return;
                    }
                    this.b.j("sent_message_counter_for_dismissing_calendar_suggestion_tooltip", i);
                }
            }
        }
    }

    @Override // defpackage.ctiy
    public final boolean e(ctix ctixVar) {
        ctixVar.getClass();
        if (((Boolean) ((cfup) ctjd.bb.get()).e()).booleanValue()) {
            return false;
        }
        int ordinal = ctixVar.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 4) {
                    if (ordinal == 5 && !this.b.q("has_user_dismissed_calendar_suggestions_tooltip", false)) {
                        return true;
                    }
                } else if (!this.b.q("has_user_dismissed_emotion_suggestions_tooltip", false)) {
                    return true;
                }
            } else if (!this.b.q("has_user_dismissed_assistant_suggestions_tooltip", false)) {
                return true;
            }
        } else if (!this.b.q("has_user_dismissed_p2p_conversation_suggestions_tooltip", false)) {
            return true;
        }
        return false;
    }
}
