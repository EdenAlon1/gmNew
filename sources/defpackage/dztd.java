package defpackage;

import com.android.vcard.VCardConstants;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dztd {
    static emxc a(HashMap hashMap) {
        dzwe g;
        int ordinal;
        emxc emxcVar;
        emxc emxcVar2;
        emxc emxcVar3;
        emxc emxcVar4;
        try {
            g = dzwi.g();
            g.e(((Integer) hashMap.get("PADDING_START")).intValue());
            g.f(((Integer) hashMap.get("PADDING_TOP")).intValue());
            g.d(((Integer) hashMap.get("PADDING_END")).intValue());
            g.c(((Integer) hashMap.get("PADDING_BOTTOM")).intValue());
            if (hashMap.containsKey("USE_INCOMING_OUTGOING_COLORS")) {
                g.g(((Boolean) hashMap.get("USE_INCOMING_OUTGOING_COLORS")).booleanValue());
            }
            ordinal = ((dzwh) hashMap.get(VCardConstants.PARAM_TYPE)).ordinal();
        } catch (Exception e) {
            dyhr.d("UiElementConverters", "failed to convert HashMap to UiElement", e);
            return emux.a;
        }
        if (ordinal == 0) {
            g.n((dzrw) dyvl.c((HashMap) hashMap.get("RICH_TEXT")).c());
            return emxc.j(g.a());
        }
        if (ordinal == 8) {
            if (!fdql.n()) {
                dyhr.c("UiElementConverters", "Cannot convert HashMap to UiElement; Please enable direct-download flag.");
                return emux.a;
            }
            emxc h = dzvn.h(new JSONObject((String) hashMap.get("MEDIA_ELEMENT")));
            if (h.g()) {
                g.l((dzvn) h.c());
                return emxc.j(g.a());
            }
            dyhr.c("UiElementConverters", "failed to convert HashMap to UiElement");
            return emux.a;
        }
        if (ordinal == 2) {
            HashMap hashMap2 = (HashMap) hashMap.get("STATUS_BADGE");
            try {
                dzuw dzuwVar = new dzuw();
                dzuwVar.c((String) hashMap2.get("TEXT"));
                dzuwVar.b(((Integer) hashMap2.get("BACKGROUND_COLOR")).intValue());
                dzuwVar.d(((Integer) hashMap2.get("TEXT_COLOR")).intValue());
                emxcVar = emxc.j(dzuwVar.a());
            } catch (Exception e2) {
                dyhr.d("StatusBadgeConverters", "failed to convert HashMap to StatusBadge", e2);
                emxcVar = emux.a;
            }
            g.o((dzvz) emxcVar.c());
            return emxc.j(g.a());
        }
        if (ordinal == 3) {
            HashMap hashMap3 = (HashMap) hashMap.get("RICH_CARD_BUTTONS");
            try {
                String str = dzre.d;
                dznv dznvVar = new dznv();
                if (((Integer) hashMap3.get("ORIENTATION")).intValue() == 2) {
                    dznvVar.c(hashMap3.containsKey("HORIZONTAL_ALIGNMENT") ? ((Integer) hashMap3.get("HORIZONTAL_ALIGNMENT")).intValue() : 0);
                }
                dznvVar.b(dyhx.b((ArrayList) hashMap3.get("BUTTONS"), new emwl() { // from class: dyuz
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        return dyva.a((HashMap) obj);
                    }
                }));
                dznvVar.d(((Integer) hashMap3.get("ORIENTATION")).intValue());
                emxcVar2 = emxc.j(dznvVar.a());
            } catch (IllegalStateException | NullPointerException e3) {
                dyhr.d("RCButtonsConverters", "failed to convert Map to RichCardButtons", e3);
                emxcVar2 = emux.a;
            }
            g.m((dzre) emxcVar2.c());
            return emxc.j(g.a());
        }
        if (ordinal == 4) {
            HashMap hashMap4 = (HashMap) hashMap.get("HORIZONTAL_LINE");
            try {
                dzum dzumVar = new dzum();
                dzumVar.b(((Integer) hashMap4.get("LINE_COLOR")).intValue());
                dzumVar.c(((Float) hashMap4.get("LINE_WIDTH")).floatValue());
                emxcVar3 = emxc.j(dzumVar.a());
            } catch (Exception e4) {
                dyhr.d("HrzntlLineConverters", "failed to convert HashMap to HorizontalLine", e4);
                emxcVar3 = emux.a;
            }
            g.j((dzvj) emxcVar3.c());
            return emxc.j(g.a());
        }
        if (ordinal == 5) {
            HashMap hashMap5 = (HashMap) hashMap.get("HORIZONTAL_LAYOUT_BUTTONS");
            try {
                dzui dzuiVar = new dzui();
                dzuiVar.b(dyhx.b((ArrayList) hashMap5.get("VERTICAL_LAYOUT_BUTTON"), new emwl() { // from class: dzsw
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        HashMap hashMap6 = (HashMap) obj;
                        try {
                            dzuk dzukVar = new dzuk();
                            emxc a = dyuk.a((HashMap) hashMap6.get("VERTICAL_LAYOUT_BUTTON_LIGHTER_ICON"));
                            emxc a2 = dyht.a(dyhu.b(hashMap6.get("ACTION")), new emwl() { // from class: dzsu
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    return dytw.a((HashMap) obj2);
                                }
                            });
                            dzjg f = dzjn.f();
                            f.t();
                            dzukVar.b = (dzjn) a2.e(f.a());
                            dzukVar.b((String) hashMap6.get("DISPLAY_TEXT"));
                            dzukVar.c((byte[]) hashMap6.get("ICON"));
                            dzukVar.a = (dzqb) (a.g() ? a.c() : dzqb.g());
                            return emxc.j(dzukVar.a());
                        } catch (IllegalStateException | NullPointerException e5) {
                            dyhr.d("HrzntlytBtnConverter", "failed to convert Map to VerticalLayoutButton", e5);
                            return emux.a;
                        }
                    }
                }));
                emxcVar4 = emxc.j(dzuiVar.a());
            } catch (IllegalStateException | NullPointerException e5) {
                dyhr.d("HrzntlytBtnConverter", "failed to convert Map to RichCardButtons", e5);
                emxcVar4 = emux.a;
            }
            g.i((dzvh) emxcVar4.c());
            return emxc.j(g.a());
        }
        if (ordinal != 6) {
            dyhr.c("UiElementConverters", "Unsupported UiElement type: " + String.valueOf(hashMap.get(VCardConstants.PARAM_TYPE)));
            return emux.a;
        }
        emxc h2 = dzvl.h(new JSONObject((String) hashMap.get("IMAGE_ELEMENT")));
        if (h2.g()) {
            g.k((dzvl) h2.c());
            return emxc.j(g.a());
        }
        dyhr.c("UiElementConverters", "failed to convert HashMap to UiElement");
        return emux.a;
        dyhr.d("UiElementConverters", "failed to convert HashMap to UiElement", e);
        return emux.a;
    }

    static HashMap b(dzwi dzwiVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("PADDING_START", Integer.valueOf(dzwiVar.c()));
        hashMap.put("PADDING_TOP", Integer.valueOf(dzwiVar.d()));
        hashMap.put("PADDING_END", Integer.valueOf(dzwiVar.b()));
        hashMap.put("PADDING_BOTTOM", Integer.valueOf(dzwiVar.a()));
        hashMap.put("USE_INCOMING_OUTGOING_COLORS", Boolean.valueOf(dzwiVar.f()));
        hashMap.put(VCardConstants.PARAM_TYPE, dzwiVar.h());
        int ordinal = dzwiVar.h().ordinal();
        if (ordinal == 0) {
            hashMap.put("RICH_TEXT", dyvl.d(dzwiVar.e().g()));
            return hashMap;
        }
        if (ordinal == 8) {
            if (!fdql.n()) {
                dyhr.c("UiElementConverters", "Cannot convert media element to HashMap, please enable direct-download flag.");
                return hashMap;
            }
            emxc i = dzwiVar.e().e().i();
            if (!i.g()) {
                throw new IllegalArgumentException("Unable to convert media element to HashMap.");
            }
            hashMap.put("MEDIA_ELEMENT", ((JSONObject) i.c()).toString());
            return hashMap;
        }
        if (ordinal == 2) {
            dzvz h = dzwiVar.e().h();
            HashMap hashMap2 = new HashMap();
            dzux dzuxVar = (dzux) h;
            hashMap2.put("TEXT", dzuxVar.a);
            hashMap2.put("BACKGROUND_COLOR", Integer.valueOf(dzuxVar.b));
            hashMap2.put("TEXT_COLOR", Integer.valueOf(dzuxVar.c));
            hashMap.put("STATUS_BADGE", hashMap2);
            return hashMap;
        }
        if (ordinal == 3) {
            dzre f = dzwiVar.e().f();
            HashMap hashMap3 = new HashMap();
            dznw dznwVar = (dznw) f;
            hashMap3.put("ORIENTATION", Integer.valueOf(dznwVar.b));
            hashMap3.put("BUTTONS", dyhx.d(dznwVar.a, new emwl() { // from class: dyuw
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    return dyva.b((dzrd) obj);
                }
            }));
            if (dznwVar.b == 2) {
                hashMap3.put("HORIZONTAL_ALIGNMENT", Integer.valueOf(dznwVar.c.g() ? ((Integer) dznwVar.c.c()).intValue() : 0));
            }
            hashMap.put("RICH_CARD_BUTTONS", hashMap3);
            return hashMap;
        }
        if (ordinal == 4) {
            dzvj c = dzwiVar.e().c();
            HashMap hashMap4 = new HashMap();
            dzun dzunVar = (dzun) c;
            hashMap4.put("LINE_COLOR", Integer.valueOf(dzunVar.a));
            hashMap4.put("LINE_WIDTH", Float.valueOf(dzunVar.b));
            hashMap.put("HORIZONTAL_LINE", hashMap4);
            return hashMap;
        }
        if (ordinal == 5) {
            dzvh b = dzwiVar.e().b();
            HashMap hashMap5 = new HashMap();
            hashMap5.put("VERTICAL_LAYOUT_BUTTON", dyhx.d(((dzuj) b).a, new emwl() { // from class: dzsv
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    dzvg dzvgVar = (dzvg) obj;
                    HashMap hashMap6 = new HashMap();
                    hashMap6.put("DISPLAY_TEXT", dzvgVar.c());
                    hashMap6.put("ICON", dzvgVar.d());
                    hashMap6.put("VERTICAL_LAYOUT_BUTTON_LIGHTER_ICON", dyuk.b(dzvgVar.b()));
                    hashMap6.put("ACTION", dytw.b(dzvgVar.a()));
                    return hashMap6;
                }
            }));
            hashMap.put("HORIZONTAL_LAYOUT_BUTTONS", hashMap5);
            return hashMap;
        }
        if (ordinal != 6) {
            throw new IllegalArgumentException("Unsupported UiElement type: " + dzwiVar.h().j);
        }
        emxc i2 = dzwiVar.e().d().i();
        if (!i2.g()) {
            throw new IllegalArgumentException("Unable to convert image element to JSON.");
        }
        hashMap.put("IMAGE_ELEMENT", ((JSONObject) i2.c()).toString());
        return hashMap;
    }
}
