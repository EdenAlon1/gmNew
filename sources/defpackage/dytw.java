package defpackage;

import com.android.vcard.VCardConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dytw {
    public static emxc a(HashMap hashMap) {
        try {
            dzjg f = dzjn.f();
            c(f, hashMap);
            dzjf a = dzjf.a(((Integer) hashMap.get("ACTION_TYPE")).intValue());
            switch (a.ordinal()) {
                case 1:
                    emxc a2 = dyht.a(dyhu.b(hashMap.get("ACTION_PAYLOAD")), new emwl() { // from class: dytq
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            HashMap hashMap2 = (HashMap) obj;
                            try {
                                dzmf dzmfVar = new dzmf();
                                dzmfVar.c((String) hashMap2.get("TEXT"));
                                dzmfVar.b((String) hashMap2.get("MESSAGE_CALLBACK_PAYLOAD"));
                                return emxc.j(dzmfVar.a());
                            } catch (IllegalStateException | NullPointerException e) {
                                dyhr.d("ActionConv", "failed to convert Map to ReplyActionPayload", e);
                                return emux.a;
                            }
                        }
                    });
                    if (a2.g()) {
                        f.m((dzjm) a2.c());
                        break;
                    }
                    break;
                case 2:
                    emxc a3 = dyht.a(dyhu.b(hashMap.get("ACTION_PAYLOAD")), new emwl() { // from class: dytq
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            HashMap hashMap2 = (HashMap) obj;
                            try {
                                dzmf dzmfVar = new dzmf();
                                dzmfVar.c((String) hashMap2.get("TEXT"));
                                dzmfVar.b((String) hashMap2.get("MESSAGE_CALLBACK_PAYLOAD"));
                                return emxc.j(dzmfVar.a());
                            } catch (IllegalStateException | NullPointerException e) {
                                dyhr.d("ActionConv", "failed to convert Map to ReplyActionPayload", e);
                                return emux.a;
                            }
                        }
                    });
                    if (a3.g()) {
                        f.l((dzjm) a3.c());
                        break;
                    }
                    break;
                case 3:
                    f.e((String) hashMap.get("ACTION_PAYLOAD"));
                    break;
                case 4:
                    f.q((String) hashMap.get("ACTION_PAYLOAD"));
                    break;
                case 5:
                    emxc a4 = dyht.a(dyhu.b(hashMap.get("ACTION_PAYLOAD")), new dytp());
                    if (!a4.g()) {
                        return emux.a;
                    }
                    dzmd dzmdVar = new dzmd();
                    dzmdVar.b((dzqo) a4.c());
                    f.r(dzmdVar.a());
                    break;
                case 6:
                    f.t();
                    break;
                case 7:
                    f.d((String) hashMap.get("ACTION_PAYLOAD"));
                    break;
                case 8:
                    f.n((String) hashMap.get("ACTION_PAYLOAD"));
                    break;
                case 9:
                    emxc a5 = dyht.a(dyhu.b(hashMap.get("ACTION_PAYLOAD")), new emwl() { // from class: dytr
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            HashMap hashMap2 = (HashMap) obj;
                            dzmd dzmdVar2 = new dzmd();
                            if (hashMap2.containsKey("REACTION_OVERLAY_HEADER")) {
                                emxc a6 = dyht.a(dyhu.b(hashMap2.get("REACTION_OVERLAY_HEADER")), new dytp());
                                if (!a6.g()) {
                                    return emux.a;
                                }
                                dzmdVar2.b((dzqo) a6.c());
                            }
                            if (hashMap2.containsKey("STACKED_REACTION_WEB_VIEW")) {
                                emxc b = dyhu.b(hashMap2.get("STACKED_REACTION_WEB_VIEW"));
                                if (b.g()) {
                                    emxc a7 = dyht.a(dyhu.b(((HashMap) b.c()).get("WEB_VIEW_HEADER")), new dytp());
                                    if (!a7.g()) {
                                        return emux.a;
                                    }
                                    dznb dznbVar = new dznb();
                                    dznbVar.b((String) ((HashMap) b.c()).get(VCardConstants.PROPERTY_URL));
                                    dznbVar.a = (dzqo) a7.c();
                                    dzmdVar2.c(dznbVar.a());
                                }
                            }
                            return emxc.j(dzmdVar2.a());
                        }
                    });
                    if (!a5.g()) {
                        return emux.a;
                    }
                    f.r((dzjk) a5.c());
                    break;
                case 10:
                    emxc a6 = dyht.a(dyhu.b(hashMap.get("ACTION_PAYLOAD")), new emwl() { // from class: dyts
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            HashMap hashMap2 = (HashMap) obj;
                            if (!hashMap2.containsKey(VCardConstants.PROPERTY_URL) || !hashMap2.containsKey("REPLACEMENTS")) {
                                dyhr.c("ActionConv", "failed to convert Map to UrlAction, missing necessary property key.");
                                return emux.a;
                            }
                            dzok dzokVar = new dzok();
                            dzokVar.c((String) hashMap2.get(VCardConstants.PROPERTY_URL));
                            ArrayList arrayList = (ArrayList) hashMap2.get("REPLACEMENTS");
                            engw b = dyhx.b(arrayList, new emwl() { // from class: dytv
                                @Override // defpackage.emwl
                                public final Object apply(Object obj2) {
                                    HashMap hashMap3 = (HashMap) obj2;
                                    if (!hashMap3.containsKey("SUBSTITUTE") || !hashMap3.containsKey("PATTERN")) {
                                        dyhr.c("ActionConv", "failed to convert Map to UrlAction missing necessary properity key.");
                                        return emux.a;
                                    }
                                    dzom dzomVar = new dzom();
                                    dzomVar.c(((Integer) hashMap3.get("SUBSTITUTE")).intValue());
                                    dzomVar.b((String) hashMap3.get("PATTERN"));
                                    return emxc.j(dzomVar.a());
                                }
                            });
                            if (((enou) b).c != arrayList.size()) {
                                dyhr.c("ActionConv", "failed to convert Map to UrlAction missing some replacement");
                                return emux.a;
                            }
                            dzokVar.b(b);
                            return emxc.j(dzokVar.a());
                        }
                    });
                    if (!a6.g()) {
                        dyhr.c("ActionConv", "Fail to convert map to url action");
                        return emux.a;
                    }
                    f.p((dzsg) a6.c());
                    break;
                case 11:
                    emxc a7 = dyht.a(dyhu.b(hashMap.get("ACTION_PAYLOAD")), new emwl() { // from class: dytt
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            HashMap hashMap2 = (HashMap) obj;
                            dzpx c = dzpy.c();
                            try {
                                ArrayList arrayList = (ArrayList) hashMap2.get("DECORATION_IDS_TO_REMOVE");
                                ArrayList arrayList2 = (ArrayList) hashMap2.get("DECORATION_IDS_TO_ADD");
                                if (arrayList == null && arrayList2 == null) {
                                    dyhr.c("ActionConv", "Decoration action missing list of ids to add or remove.");
                                    return emux.a;
                                }
                                c.b(engw.n(arrayList2));
                                c.c(engw.n(arrayList));
                                return emxc.j(c.a());
                            } catch (NullPointerException unused) {
                                dyhr.c("ActionConv", "Failed to build Decoration action.");
                                return emux.a;
                            }
                        }
                    });
                    if (!a7.g()) {
                        dyhr.c("ActionConv", "Failed to convert map to decoration transition action.");
                        break;
                    } else {
                        f.f((dzpy) a7.c());
                        break;
                    }
                default:
                    dyhr.c("ActionConv", a.C(a, "encountered unknown action type: "));
                    return emux.a;
            }
            if (hashMap.containsKey("EVENT_CALLBACK_FAILURE_ACTION_TYPE") && dzjf.a(((Integer) hashMap.get("EVENT_CALLBACK_FAILURE_ACTION_TYPE")).intValue()).ordinal() == 8) {
                f.i((String) hashMap.get("EVENT_CALLBACK_FAILURE_ACTION_PAYLOAD"));
            }
            return emxc.j(f.a());
        } catch (IllegalStateException | NullPointerException e) {
            dyhr.d("ActionConv", "failed to convert Map to Action", e);
            return emux.a;
        }
    }

    public static HashMap b(dzjn dzjnVar) {
        HashMap hashMap = new HashMap();
        g(dzjnVar, hashMap);
        switch (dzjnVar.d().ordinal()) {
            case 1:
                hashMap.put("ACTION_PAYLOAD", e(dzjnVar.b().d()));
                break;
            case 2:
                hashMap.put("ACTION_PAYLOAD", e(dzjnVar.b().c()));
                break;
            case 3:
                hashMap.put("ACTION_PAYLOAD", dzjnVar.b().i());
                break;
            case 4:
                hashMap.put("ACTION_PAYLOAD", dzjnVar.b().k());
                break;
            case 5:
                hashMap.put("ACTION_TYPE", Integer.valueOf(dzjf.COMPOSED_OVERLAY_ACTION.m));
                dzmd dzmdVar = new dzmd();
                dzmdVar.b(dzjnVar.b().f());
                hashMap.put("ACTION_PAYLOAD", f(dzmdVar.a()));
                break;
            case 7:
                hashMap.put("ACTION_PAYLOAD", dzjnVar.b().h());
                break;
            case 8:
                hashMap.put("ACTION_PAYLOAD", dzjnVar.b().j());
                break;
            case 9:
                hashMap.put("ACTION_PAYLOAD", f(dzjnVar.b().b()));
                break;
            case 10:
                dzsg g = dzjnVar.b().g();
                HashMap hashMap2 = new HashMap();
                hashMap2.put(VCardConstants.PROPERTY_URL, g.b());
                hashMap2.put("REPLACEMENTS", dyhx.d(g.a(), new emwl() { // from class: dyto
                    @Override // defpackage.emwl
                    public final Object apply(Object obj) {
                        dzsf dzsfVar = (dzsf) obj;
                        HashMap hashMap3 = new HashMap();
                        hashMap3.put("PATTERN", dzsfVar.b());
                        hashMap3.put("SUBSTITUTE", Integer.valueOf(dzsfVar.a()));
                        return hashMap3;
                    }
                }));
                hashMap.put("ACTION_PAYLOAD", hashMap2);
                break;
            case 11:
                dzpy e = dzjnVar.b().e();
                ArrayList arrayList = new ArrayList(e.a());
                ArrayList arrayList2 = new ArrayList(e.b());
                HashMap hashMap3 = new HashMap();
                hashMap3.put("DECORATION_IDS_TO_ADD", arrayList);
                hashMap3.put("DECORATION_IDS_TO_REMOVE", arrayList2);
                hashMap.put("ACTION_PAYLOAD", hashMap3);
                break;
        }
        if (dzjnVar.e().ordinal() != 8) {
            return hashMap;
        }
        hashMap.put("EVENT_CALLBACK_FAILURE_ACTION_PAYLOAD", dzjnVar.c().j());
        return hashMap;
    }

    public static void c(dzjg dzjgVar, HashMap hashMap) {
        if (!hashMap.containsKey("ACTION_TRIGGERED_LOG_ID")) {
            dyhr.c("ActionConv", "Missing action triggered log id setting it to 0");
            dzjgVar.c(0L);
        }
        dzjgVar.c(((Long) hashMap.get("ACTION_TRIGGERED_LOG_ID")).longValue());
        if (hashMap.containsKey("EVENT_CALLBACK_PAYLOAD")) {
            dzjgVar.j((String) hashMap.get("EVENT_CALLBACK_PAYLOAD"));
        }
        if (hashMap.containsKey("TRACE_ID")) {
            dzjgVar.o((String) hashMap.get("TRACE_ID"));
        }
        if (hashMap.containsKey("MESSAGE_ID")) {
            dzjgVar.k((String) hashMap.get("MESSAGE_ID"));
        }
        if (hashMap.containsKey("EVENT_CALLBACK_DESTINATION")) {
            emxc a = dyht.a(dyhu.b(hashMap.get("EVENT_CALLBACK_DESTINATION")), new emwl() { // from class: dytu
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    emxc emxcVar;
                    emxc emxcVar2;
                    HashMap hashMap2 = (HashMap) obj;
                    try {
                        int b = dzji.b(((Integer) hashMap2.get("EVENT_CALLBACK_DESTINATION_TYPE")).intValue()) - 1;
                        try {
                            if (b == 1) {
                                HashMap hashMap3 = (HashMap) hashMap2.get("EVENT_CALLBACK_DESTINATION");
                                try {
                                    dzil dzilVar = new dzil();
                                    dzilVar.c((String) hashMap3.get("ID"));
                                    dzilVar.d((String) hashMap3.get("TACHYON_APP_NAME"));
                                    dzilVar.e(dzpf.a(((Integer) hashMap3.get(VCardConstants.PARAM_TYPE)).intValue()));
                                    dzilVar.b((String) hashMap3.get("HANDLER_ID"));
                                    emxcVar = emxc.j(dzilVar.a());
                                } catch (Exception unused) {
                                    dyhr.c("ContactIdConverters", "failed to convert HashMap to ContactId");
                                    emxcVar = emux.a;
                                }
                                if (emxcVar.g()) {
                                    return emxc.j(new dzkd((dzpg) emxcVar.c()));
                                }
                                return emux.a;
                            }
                            if (b != 2) {
                                dyhr.c("EventCallDestConvter", "encountered unknown EventCallbackDestinationType");
                                return emux.a;
                            }
                            HashMap hashMap4 = (HashMap) hashMap2.get("EVENT_CALLBACK_DESTINATION");
                            try {
                                dzip dzipVar = new dzip();
                                dzipVar.c((String) hashMap4.get("ID"));
                                dzipVar.b((String) hashMap4.get("APP_NAME"));
                                emxcVar2 = emxc.j(dzipVar.a());
                            } catch (ClassCastException unused2) {
                                dyhr.c("GroupIdConverters", "failed to convert HashMap to GroupId");
                                emxcVar2 = emux.a;
                            }
                            if (emxcVar2.g()) {
                                return emxc.j(new dzke((dzpn) emxcVar2.c()));
                            }
                            return emux.a;
                        } catch (IllegalStateException | NullPointerException e) {
                            dyhr.d("EventCallDestConvter", "failed to convert Map to EventCallbackDestination", e);
                            return emux.a;
                        }
                    } catch (ClassCastException unused3) {
                        return emux.a;
                    }
                }
            });
            if (a.g()) {
                dzjgVar.g((dzjh) a.c());
            }
        }
    }

    private static HashMap d(dzqo dzqoVar) {
        HashMap hashMap = new HashMap();
        if (dzqoVar.c().g()) {
            if (!((dzjn) dzqoVar.c().c()).d().equals(dzjf.NO_OP_ACTION)) {
                dyhr.c("ActionConv", " Dismiss action can only be NoOp. Fail to convert overlay header to map.");
                return hashMap;
            }
            HashMap hashMap2 = new HashMap();
            g((dzjn) dzqoVar.c().c(), hashMap2);
            hashMap.put("dismiss_action", hashMap2);
        }
        hashMap.put("time_to_live_sec", Integer.valueOf(dzqoVar.b()));
        hashMap.put("OVERLAY_STYLE", Integer.valueOf(dzqoVar.a()));
        if (dzqoVar.d().g()) {
            hashMap.put("display_icon", dzqoVar.d().c());
        }
        if (dzqoVar.e().g()) {
            hashMap.put("display_text", dzqoVar.e().c());
        }
        if (dzqoVar.g().g()) {
            hashMap.put("overlay_lighter_icon", dyuk.b((dzqb) dzqoVar.g().c()));
        }
        if (dzqoVar.f().g()) {
            hashMap.put("overlay_expire_time", dzqoVar.f().c());
        }
        hashMap.put("hide_dismiss_button", Boolean.valueOf(dzqoVar.i()));
        hashMap.put("hide_snippet_in_conversation_list", Boolean.valueOf(dzqoVar.j()));
        hashMap.put("dismissible_by_tapping_outside", Boolean.valueOf(dzqoVar.h()));
        return hashMap;
    }

    private static HashMap e(dzjm dzjmVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("TEXT", dzjmVar.d());
        hashMap.put("MESSAGE_CALLBACK_PAYLOAD", dzjmVar.c());
        return hashMap;
    }

    private static Map f(dzjk dzjkVar) {
        HashMap hashMap = new HashMap();
        if (dzjkVar.a().g()) {
            hashMap.put("REACTION_OVERLAY_HEADER", d((dzqo) dzjkVar.a().c()));
        }
        if (dzjkVar.b().g()) {
            HashMap hashMap2 = new HashMap();
            hashMap2.put(VCardConstants.PROPERTY_URL, ((dzpw) dzjkVar.b().c()).b());
            hashMap2.put("WEB_VIEW_HEADER", d(((dzpw) dzjkVar.b().c()).a()));
            hashMap.put("STACKED_REACTION_WEB_VIEW", hashMap2);
        }
        return hashMap;
    }

    private static void g(dzjn dzjnVar, HashMap hashMap) {
        hashMap.put("ACTION_TYPE", Integer.valueOf(dzjnVar.d().m));
        hashMap.put("EVENT_CALLBACK_FAILURE_ACTION_TYPE", Integer.valueOf(dzjnVar.e().m));
        hashMap.put("ACTION_TRIGGERED_LOG_ID", Long.valueOf(dzjnVar.a()));
        if (dzjnVar.h().g()) {
            hashMap.put("EVENT_CALLBACK_PAYLOAD", dzjnVar.h().c());
        }
        if (dzjnVar.g().g()) {
            Object c = dzjnVar.g().c();
            HashMap hashMap2 = new HashMap();
            dzjh dzjhVar = (dzjh) c;
            int c2 = dzjhVar.c() - 1;
            if (c2 == 1) {
                hashMap2.put("EVENT_CALLBACK_DESTINATION_TYPE", Integer.valueOf(dzjhVar.c() - 1));
                dzpg a = dzjhVar.a();
                HashMap hashMap3 = new HashMap();
                dzim dzimVar = (dzim) a;
                hashMap3.put("ID", dzimVar.a);
                hashMap3.put("TACHYON_APP_NAME", dzimVar.b);
                hashMap3.put(VCardConstants.PARAM_TYPE, Integer.valueOf(dzimVar.c.f));
                emxc emxcVar = dzimVar.d;
                if (emxcVar.g()) {
                    hashMap3.put("HANDLER_ID", emxcVar.c());
                }
                hashMap2.put("EVENT_CALLBACK_DESTINATION", hashMap3);
            } else if (c2 == 2) {
                hashMap2.put("EVENT_CALLBACK_DESTINATION_TYPE", Integer.valueOf(dzjhVar.c() - 1));
                dzpn b = dzjhVar.b();
                HashMap hashMap4 = new HashMap();
                dziq dziqVar = (dziq) b;
                hashMap4.put("ID", dziqVar.a);
                hashMap4.put("APP_NAME", dziqVar.b);
                hashMap2.put("EVENT_CALLBACK_DESTINATION", hashMap4);
            }
            hashMap.put("EVENT_CALLBACK_DESTINATION", hashMap2);
        }
        if (dzjnVar.l().g()) {
            hashMap.put("TRACE_ID", dzjnVar.l().c());
        }
        if (dzjnVar.j().g()) {
            hashMap.put("MESSAGE_ID", dzjnVar.j().c());
        }
    }
}
