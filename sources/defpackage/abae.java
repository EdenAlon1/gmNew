package defpackage;

import android.content.Context;
import android.net.Uri;
import androidx.car.app.navigation.model.Maneuver;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.SmartSuggestionData;
import com.google.android.apps.messaging.shared.datamodel.data.suggestions.impl.RbmSuggestionData;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.util.Optional;
import java.util.List;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abae implements abad {
    private final Context a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final Optional f;

    public abae(Context context, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, Optional optional) {
        context.getClass();
        ffbrVar.getClass();
        ffbrVar3.getClass();
        ffbrVar4.getClass();
        optional.getClass();
        this.a = context;
        this.b = ffbrVar;
        this.c = ffbrVar2;
        this.d = ffbrVar3;
        this.e = ffbrVar4;
        this.f = optional;
    }

    private final doip d(String str, String str2) {
        String str3 = this.a.getString(R.string.conversation_suggestion_sticker) + ": " + str;
        Uri parse = Uri.parse(str2);
        parse.getClass();
        return new doip(str3, parse, new ffix() { // from class: doin
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        }, new ffix() { // from class: doio
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
    }

    private final dokq e(String str) {
        String string = this.a.getString(R.string.conversation_suggestion_launch_calendar_action);
        string.getClass();
        return new dokq(string, str, dmzz.O, null, false, 248);
    }

    private final dokq f(String str) {
        if (!((dixm) this.e.b()).a()) {
            return null;
        }
        String string = this.a.getString(R.string.conversation_suggestion_compose_audio_action);
        string.getClass();
        return new dokq(string, str, dmzz.ci, null, false, 248);
    }

    private final dokq g(String str) {
        if (!((dixm) this.e.b()).a()) {
            return null;
        }
        String string = this.a.getString(R.string.conversation_suggestion_compose_text_action);
        string.getClass();
        return new dokq(string, str, dmzz.aa, null, false, 248);
    }

    private final dokq h(String str) {
        if (!((dixm) this.e.b()).a()) {
            return null;
        }
        String string = this.a.getString(R.string.conversation_suggestion_compose_video_action);
        string.getClass();
        return new dokq(string, str, dmzz.eo, null, false, 248);
    }

    private final dokq i(String str) {
        String string = this.a.getString(R.string.action_copy_otp, crnx.f(str));
        string.getClass();
        return new dokq("", string, dmzz.aB, null, false, 248);
    }

    private final dokq j(String str) {
        String string = this.a.getString(R.string.p2p_conversation_suggestion_gif_search_display_text, str);
        string.getClass();
        String string2 = this.a.getString(R.string.p2p_conversation_suggestion_gif_search_action);
        string2.getClass();
        return new dokq(string2, string, dmzz.dj, null, false, 248);
    }

    private final dokq k(String str) {
        String string = this.a.getString(R.string.conversation_suggestion_share_location_action);
        string.getClass();
        return new dokq(string, str, dmzz.cu, null, false, 248);
    }

    private final dokq l(String str) {
        String string = this.a.getString(R.string.conversation_suggestion_launch_map_action);
        string.getClass();
        return new dokq(string, str, dmzz.bY, null, false, 248);
    }

    private final dokq m(boolean z) {
        if (!this.f.isPresent()) {
            return null;
        }
        Context context = this.a;
        String string = context.getString(R.string.suggested_text_label);
        string.getClass();
        return z ? new dokq(string, null, dmzz.cG, null, false, 248) : new dokq(string, null, dmzz.cg, null, false, 248);
    }

    private final dokq n(String str) {
        String string = this.a.getString(R.string.conversation_suggestion_launch_phone_action);
        string.getClass();
        return new dokq(string, str, dmzz.R, null, false, 248);
    }

    private final dokq o() {
        String string = this.a.getString(R.string.conversation_suggestion_create_photomoji);
        string.getClass();
        String string2 = this.a.getString(R.string.conversation_suggestion_create_photomoji_action);
        string2.getClass();
        return new dokq(string2, string, dmzz.dE, null, false, 248);
    }

    private final dokq p() {
        String string = this.a.getResources().getString(R.string.p2p_conversation_suggestion_share_recent_image_display_text);
        string.getClass();
        return new dokq("", string, dmzz.bI, null, false, 248);
    }

    private final dokq q() {
        String string = this.a.getString(R.string.conversation_suggestion_record_voice_message_action);
        string.getClass();
        return new dokq(string, this.a.getString(R.string.conversation_suggestion_record_voice_message), dmzz.ay, null, false, 248);
    }

    private final dokq r() {
        String string = ((Boolean) ddjr.l.e()).booleanValue() ? this.a.getString(R.string.p2p_conversation_suggestion_set_reminder_predefined_text) : this.a.getString(R.string.p2p_conversation_suggestion_set_reminder_text);
        string.getClass();
        String string2 = this.a.getString(R.string.conversation_suggestion_set_reminder_action);
        string2.getClass();
        return new dokq(string2, string, dmzz.k, null, false, 248);
    }

    private final dokq s(String str) {
        if (str == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String string = this.a.getString(R.string.conversation_suggestion_send_reply);
        string.getClass();
        return new dokq(string, str, null, null, ((cstx) this.c.b()).g(str), 236);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final dokq t(String str, int i) {
        String[] strArr;
        Context context = this.a;
        List i2 = ffdx.i(context.getString(R.string.conversation_suggestion_selfie_gif_action));
        switch (str.hashCode()) {
            case -1039460313:
                if (str.equals("GoodMorning")) {
                    strArr = context.getResources().getStringArray(R.array.goodmorning_strings);
                    strArr.getClass();
                    break;
                }
                strArr = new String[0];
                break;
            case -929955525:
                if (str.equals("GoodNight")) {
                    strArr = context.getResources().getStringArray(R.array.goodnight_strings);
                    strArr.getClass();
                    break;
                }
                strArr = new String[0];
                break;
            case -901253765:
                if (str.equals("HowAreYou")) {
                    strArr = context.getResources().getStringArray(R.array.howareyou_strings);
                    strArr.getClass();
                    break;
                }
                strArr = new String[0];
                break;
            case -373140790:
                if (str.equals("Celebration")) {
                    strArr = context.getResources().getStringArray(R.array.celebration_strings);
                    strArr.getClass();
                    break;
                }
                strArr = new String[0];
                break;
            case 2374546:
                if (str.equals("Love")) {
                    strArr = context.getResources().getStringArray(R.array.love_strings);
                    strArr.getClass();
                    break;
                }
                strArr = new String[0];
                break;
            default:
                strArr = new String[0];
                break;
        }
        ffdx.x(i2, strArr);
        Object obj = i2.get(i % i2.size());
        obj.getClass();
        String string = this.a.getString(R.string.conversation_suggestion_selfie_gif_action_content_description);
        string.getClass();
        return new dokq(string, (String) obj, dmzz.dl, null, false, 248);
    }

    private final dokw u() {
        String string = this.a.getString(R.string.p2p_conversation_suggestion_duo_call_action_text);
        string.getClass();
        boolean booleanValue = ((Boolean) cvfg.b.e()).booleanValue();
        int i = R.drawable.comms_gm_ic_videocam_vd_theme_24;
        if (booleanValue) {
            i = ((Number) ((cvfe) this.b.b()).c().orElse(Integer.valueOf(R.drawable.comms_gm_ic_videocam_vd_theme_24))).intValue();
        }
        return new dokw("", string, new dokt(i), new dojv(null), 112);
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.dokx v(java.lang.String r8, java.lang.String r9, java.lang.String r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abae.v(java.lang.String, java.lang.String, java.lang.String, boolean):dokx");
    }

    @Override // defpackage.abad
    public final dokm a(anzh anzhVar) {
        anzhVar.getClass();
        if (!(anzhVar instanceof SmartSuggestionData)) {
            if (!(anzhVar instanceof RbmSuggestionData)) {
                throw new IllegalArgumentException("Unsupported suggestion type when creating SuggestionUiData: ".concat(String.valueOf(anzhVar.getClass().getSimpleName())));
            }
            RbmSuggestionData rbmSuggestionData = (RbmSuggestionData) anzhVar;
            switch (rbmSuggestionData.b.getSuggestionType()) {
                case 0:
                    String string = this.a.getString(R.string.conversation_suggestion_send_reply);
                    string.getClass();
                    return new dokq(string, rbmSuggestionData.a(), null, null, false, 248);
                case 1:
                case 11:
                    ConversationSuggestion conversationSuggestion = rbmSuggestionData.b;
                    return v(rbmSuggestionData.a(), conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI), conversationSuggestion.getPropertyValue(ConversationSuggestion.SUGGESTION_PROPERTY_OPEN_URL_DESCRIPTION), conversationSuggestion.getSuggestionType() == 11);
                case 2:
                    return n(rbmSuggestionData.a());
                case 3:
                    return l(rbmSuggestionData.a());
                case 4:
                    String string2 = this.a.getString(R.string.conversation_suggestion_launch_calendar_action);
                    string2.getClass();
                    return new dokq(string2, rbmSuggestionData.a(), dmzz.O, null, false, 248);
                case 5:
                    return k(rbmSuggestionData.a());
                case 6:
                case 7:
                default:
                    return null;
                case 8:
                    return g(rbmSuggestionData.a());
                case 9:
                    return f(rbmSuggestionData.a());
                case 10:
                    return h(rbmSuggestionData.a());
            }
        }
        SmartSuggestionData smartSuggestionData = (SmartSuggestionData) anzhVar;
        switch (smartSuggestionData.l().ordinal()) {
            case 0:
            case 4:
            case 6:
            case 7:
            case 8:
            case 10:
            case 14:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 33:
            case 40:
                return null;
            case 1:
            case 2:
            case 15:
            case 16:
            case 34:
                return s(smartSuggestionData.a());
            case 3:
                return k(this.a.getString(R.string.p2p_conversation_suggestion_share_location_text));
            case 5:
                return j(smartSuggestionData.p());
            case 9:
                return p();
            case 11:
                return r();
            case 12:
                return d(smartSuggestionData.t(), smartSuggestionData.u());
            case 13:
                return u();
            case 22:
                return i(smartSuggestionData.r());
            case 23:
                return e(this.a.getString(R.string.p2p_conversation_suggestion_add_to_calendar_action_text));
            case 31:
                return c(smartSuggestionData);
            case 32:
                String string3 = this.a.getString(R.string.conversation_suggestion_send_reply);
                string3.getClass();
                return new dokq(string3, smartSuggestionData.a(), dmzz.ce, new dojt(), false, 240);
            case 35:
                String string4 = this.a.getString(R.string.p2p_conversation_suggestion_share_location_penpal_text);
                string4.getClass();
                String string5 = this.a.getString(R.string.conversation_suggestion_share_location_penpal_action);
                string5.getClass();
                return new dokq(string5, string4, dmzz.cu, null, false, 248);
            case 36:
                return t(smartSuggestionData.s(), smartSuggestionData.h());
            case 37:
                return o();
            case 38:
                fbxa m = smartSuggestionData.m();
                int a = fbvc.a((m.c == 31 ? (fbvd) m.d : fbvd.a).b);
                return m(a != 0 && a == 4);
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return q();
            default:
                throw new ffcd();
        }
    }

    @Override // defpackage.abad
    public final dokm b(aoax aoaxVar) {
        dokm s;
        if (aoaxVar instanceof bdtz) {
            return s(((bdtz) aoaxVar).b);
        }
        if (aoaxVar instanceof aoat) {
            return i(((aoat) aoaxVar).d());
        }
        if (aoaxVar instanceof bdua) {
            bdua bduaVar = (bdua) aoaxVar;
            return t(bduaVar.a, bduaVar.b);
        }
        if (aoaxVar instanceof bdtt) {
            return j(((bdtt) aoaxVar).a);
        }
        if (aoaxVar instanceof bdtu) {
            bdtu bdtuVar = (bdtu) aoaxVar;
            return d(bdtuVar.a.t(), bdtuVar.c());
        }
        if (aoaxVar instanceof aoaw) {
            aoaw aoawVar = (aoaw) aoaxVar;
            return v(aoawVar.h().c(), aoawVar.d(), aoawVar.c(), aoaxVar.a() == aoav.e);
        }
        int ordinal = aoaxVar.a().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    s = k(aoaxVar instanceof aoar ? ((aoar) aoaxVar).h().c() : this.a.getString(R.string.p2p_conversation_suggestion_share_location_text));
                } else if (ordinal == 5) {
                    s = e(aoaxVar instanceof aoar ? ((aoar) aoaxVar).h().c() : this.a.getString(R.string.p2p_conversation_suggestion_add_to_calendar_action_text));
                } else if (ordinal != 9) {
                    switch (ordinal) {
                        case 12:
                            s = o();
                            break;
                        case 13:
                            s = m(true);
                            break;
                        case 14:
                            s = m(false);
                            break;
                        case 15:
                            s = q();
                            break;
                        case 16:
                            s = p();
                            break;
                        case 17:
                            s = r();
                            break;
                        case 18:
                            if (!(aoaxVar instanceof aoar)) {
                                throw new IllegalArgumentException("Unsupported map suggestion");
                            }
                            s = l(((aoar) aoaxVar).h().c());
                            break;
                        case 19:
                            if (!(aoaxVar instanceof aoar)) {
                                throw new IllegalArgumentException("Unsupported compose txt suggestion");
                            }
                            s = g(((aoar) aoaxVar).h().c());
                            break;
                        case 20:
                            if (!(aoaxVar instanceof aoar)) {
                                throw new IllegalArgumentException("Unsupported compose video suggestion");
                            }
                            s = h(((aoar) aoaxVar).h().c());
                            break;
                        case 21:
                            if (!(aoaxVar instanceof aoar)) {
                                throw new IllegalArgumentException("Unsupported compose audio suggestion");
                            }
                            s = f(((aoar) aoaxVar).h().c());
                            break;
                        default:
                            aoav a = aoaxVar.a();
                            Objects.toString(a);
                            throw new IllegalArgumentException("Unsupported suggestion type when creating SuggestionUiData for SuggestionV2: ".concat(String.valueOf(a)));
                    }
                } else {
                    s = u();
                }
            } else {
                if (!(aoaxVar instanceof aoar)) {
                    throw new IllegalArgumentException("Unsupported phone suggestion");
                }
                s = n(((aoar) aoaxVar).h().c());
            }
        } else {
            if (!(aoaxVar instanceof aoar)) {
                throw new IllegalArgumentException("Unsupported Reply suggestion");
            }
            s = s(((aoar) aoaxVar).h().c());
        }
        s.getClass();
        return s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.abad
    public final dokq c(anzh anzhVar) {
        if (anzhVar.l() != fbri.SMARTER_REPLY) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        String a = anzhVar.a();
        if (a == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String string = this.a.getString(R.string.conversation_suggestion_send_reply);
        string.getClass();
        return new dokq(string, a, null, new dojs(true, 1), false, 244);
    }
}
