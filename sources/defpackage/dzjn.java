package defpackage;

import com.android.vcard.VCardConstants;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzjn {
    public static dzjg f() {
        dzmb dzmbVar = new dzmb();
        dzmbVar.c(0L);
        dzmbVar.s();
        return dzmbVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0257 A[Catch: JSONException -> 0x0319, TryCatch #6 {JSONException -> 0x0319, blocks: (B:8:0x002e, B:10:0x0041, B:11:0x0048, B:13:0x004e, B:14:0x0055, B:16:0x005b, B:17:0x0062, B:19:0x0068, B:29:0x00ca, B:31:0x00d0, B:38:0x00c3, B:39:0x00d9, B:42:0x00ec, B:45:0x0122, B:47:0x0128, B:49:0x0130, B:51:0x0119, B:52:0x013b, B:55:0x0147, B:75:0x01e1, B:77:0x01e7, B:79:0x01ea, B:74:0x01d4, B:90:0x01da, B:91:0x01f5, B:98:0x0251, B:100:0x0257, B:102:0x025a, B:110:0x0240, B:112:0x024a, B:113:0x0265, B:114:0x026e, B:115:0x0277, B:116:0x027b, B:118:0x0289, B:120:0x028c, B:121:0x02a2, B:122:0x02aa, B:123:0x02b2, B:125:0x02c0, B:126:0x02ca, B:128:0x02d8, B:129:0x02e2, B:131:0x02ea, B:135:0x02ff, B:137:0x0307, B:138:0x0310, B:21:0x006c, B:25:0x007d, B:27:0x008b, B:33:0x00b9, B:34:0x009b, B:36:0x00a9, B:37:0x00bc, B:93:0x01fe, B:95:0x0204, B:97:0x0212, B:103:0x0215, B:104:0x021e, B:106:0x0226, B:108:0x0234, B:109:0x0237, B:44:0x00f2), top: B:7:0x002e, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x025a A[Catch: JSONException -> 0x0319, TryCatch #6 {JSONException -> 0x0319, blocks: (B:8:0x002e, B:10:0x0041, B:11:0x0048, B:13:0x004e, B:14:0x0055, B:16:0x005b, B:17:0x0062, B:19:0x0068, B:29:0x00ca, B:31:0x00d0, B:38:0x00c3, B:39:0x00d9, B:42:0x00ec, B:45:0x0122, B:47:0x0128, B:49:0x0130, B:51:0x0119, B:52:0x013b, B:55:0x0147, B:75:0x01e1, B:77:0x01e7, B:79:0x01ea, B:74:0x01d4, B:90:0x01da, B:91:0x01f5, B:98:0x0251, B:100:0x0257, B:102:0x025a, B:110:0x0240, B:112:0x024a, B:113:0x0265, B:114:0x026e, B:115:0x0277, B:116:0x027b, B:118:0x0289, B:120:0x028c, B:121:0x02a2, B:122:0x02aa, B:123:0x02b2, B:125:0x02c0, B:126:0x02ca, B:128:0x02d8, B:129:0x02e2, B:131:0x02ea, B:135:0x02ff, B:137:0x0307, B:138:0x0310, B:21:0x006c, B:25:0x007d, B:27:0x008b, B:33:0x00b9, B:34:0x009b, B:36:0x00a9, B:37:0x00bc, B:93:0x01fe, B:95:0x0204, B:97:0x0212, B:103:0x0215, B:104:0x021e, B:106:0x0226, B:108:0x0234, B:109:0x0237, B:44:0x00f2), top: B:7:0x002e, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e7 A[Catch: JSONException -> 0x0319, TryCatch #6 {JSONException -> 0x0319, blocks: (B:8:0x002e, B:10:0x0041, B:11:0x0048, B:13:0x004e, B:14:0x0055, B:16:0x005b, B:17:0x0062, B:19:0x0068, B:29:0x00ca, B:31:0x00d0, B:38:0x00c3, B:39:0x00d9, B:42:0x00ec, B:45:0x0122, B:47:0x0128, B:49:0x0130, B:51:0x0119, B:52:0x013b, B:55:0x0147, B:75:0x01e1, B:77:0x01e7, B:79:0x01ea, B:74:0x01d4, B:90:0x01da, B:91:0x01f5, B:98:0x0251, B:100:0x0257, B:102:0x025a, B:110:0x0240, B:112:0x024a, B:113:0x0265, B:114:0x026e, B:115:0x0277, B:116:0x027b, B:118:0x0289, B:120:0x028c, B:121:0x02a2, B:122:0x02aa, B:123:0x02b2, B:125:0x02c0, B:126:0x02ca, B:128:0x02d8, B:129:0x02e2, B:131:0x02ea, B:135:0x02ff, B:137:0x0307, B:138:0x0310, B:21:0x006c, B:25:0x007d, B:27:0x008b, B:33:0x00b9, B:34:0x009b, B:36:0x00a9, B:37:0x00bc, B:93:0x01fe, B:95:0x0204, B:97:0x0212, B:103:0x0215, B:104:0x021e, B:106:0x0226, B:108:0x0234, B:109:0x0237, B:44:0x00f2), top: B:7:0x002e, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ea A[Catch: JSONException -> 0x0319, TryCatch #6 {JSONException -> 0x0319, blocks: (B:8:0x002e, B:10:0x0041, B:11:0x0048, B:13:0x004e, B:14:0x0055, B:16:0x005b, B:17:0x0062, B:19:0x0068, B:29:0x00ca, B:31:0x00d0, B:38:0x00c3, B:39:0x00d9, B:42:0x00ec, B:45:0x0122, B:47:0x0128, B:49:0x0130, B:51:0x0119, B:52:0x013b, B:55:0x0147, B:75:0x01e1, B:77:0x01e7, B:79:0x01ea, B:74:0x01d4, B:90:0x01da, B:91:0x01f5, B:98:0x0251, B:100:0x0257, B:102:0x025a, B:110:0x0240, B:112:0x024a, B:113:0x0265, B:114:0x026e, B:115:0x0277, B:116:0x027b, B:118:0x0289, B:120:0x028c, B:121:0x02a2, B:122:0x02aa, B:123:0x02b2, B:125:0x02c0, B:126:0x02ca, B:128:0x02d8, B:129:0x02e2, B:131:0x02ea, B:135:0x02ff, B:137:0x0307, B:138:0x0310, B:21:0x006c, B:25:0x007d, B:27:0x008b, B:33:0x00b9, B:34:0x009b, B:36:0x00a9, B:37:0x00bc, B:93:0x01fe, B:95:0x0204, B:97:0x0212, B:103:0x0215, B:104:0x021e, B:106:0x0226, B:108:0x0234, B:109:0x0237, B:44:0x00f2), top: B:7:0x002e, inners: #2, #4, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a3 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v5, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.emxc i(org.json.JSONObject r18) {
        /*
            Method dump skipped, instructions count: 830
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzjn.i(org.json.JSONObject):emxc");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final boolean m(JSONObject jSONObject, String str, dzje dzjeVar) {
        emxc emxcVar;
        emxc emxcVar2;
        emxc emxcVar3;
        switch (dzjeVar.a().ordinal()) {
            case 0:
                dyhr.c("Action", "failed to convert Action to JSONObject due to Unknown action type");
                break;
            case 1:
                emxc b = dzjeVar.d().b();
                if (b.g()) {
                    jSONObject.put(str, b.c());
                    break;
                }
                break;
            case 2:
                emxc b2 = dzjeVar.c().b();
                if (b2.g()) {
                    jSONObject.put(str, b2.c());
                    break;
                }
                break;
            case 3:
                jSONObject.put(str, dzjeVar.i());
                break;
            case 4:
                jSONObject.put(str, dzjeVar.k());
                break;
            case 5:
                jSONObject.put("ACTION_TYPE", dzjf.COMPOSED_OVERLAY_ACTION);
                dzmd dzmdVar = new dzmd();
                dzmdVar.b(dzjeVar.f());
                emxc c = dzjk.c(dzmdVar.a());
                if (c.g()) {
                    jSONObject.put(str, c.c());
                    break;
                }
                break;
            case 7:
                jSONObject.put(str, dzjeVar.h());
                break;
            case 8:
                jSONObject.put(str, dzjeVar.j());
                break;
            case 9:
                jSONObject.put("ACTION_TYPE", dzjf.COMPOSED_OVERLAY_ACTION);
                emxc c2 = dzjk.c(dzjeVar.b());
                if (c2.g()) {
                    jSONObject.put(str, c2.c());
                    break;
                }
                break;
            case 10:
                dzsg g = dzjeVar.g();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    JSONArray jSONArray = new JSONArray();
                    enqv it = g.a().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            dzsf dzsfVar = (dzsf) it.next();
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.put("PATTERN", dzsfVar.b());
                                jSONObject3.put("SUBSTITUTE", dzsfVar.a());
                                emxcVar2 = emxc.j(jSONObject3);
                            } catch (JSONException unused) {
                                dyhr.c("UrlAction", "failed to convert UrlContentReplacement to JSONObject");
                                emxcVar2 = emux.a;
                            }
                            if (emxcVar2.g()) {
                                jSONArray.put(emxcVar2.c());
                            } else {
                                emxcVar = emux.a;
                            }
                        } else {
                            jSONObject2.put("REPLACEMENTS", jSONArray);
                            jSONObject2.put(VCardConstants.PROPERTY_URL, g.c());
                            emxcVar = emxc.j(jSONObject2);
                        }
                    }
                } catch (JSONException unused2) {
                    dyhr.c("UrlAction", "failed to convert ReplyActionPayload to JSONObject");
                    emxcVar = emux.a;
                }
                if (!emxcVar.g()) {
                    dyhr.c("Action", "failed to convert UrlAction payload to json.");
                    break;
                } else {
                    jSONObject.put(str, emxcVar.c());
                    break;
                }
            case 11:
                dzpy e = dzjeVar.e();
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject4.put("DECORATION_IDS_TO_ADD", new JSONArray((Collection) e.a()));
                    jSONObject4.put("DECORATION_IDS_TO_REMOVE", new JSONArray((Collection) e.b()));
                    emxcVar3 = emxc.j(jSONObject4);
                } catch (JSONException unused3) {
                    dyhr.c(dzpy.a, "Failed to convert the decoration id lists to JSON.");
                    emxcVar3 = emux.a;
                }
                if (!emxcVar3.g()) {
                    dyhr.c("Action", "Failed to convert decoration transition action to json.");
                    break;
                } else {
                    jSONObject.put(str, emxcVar3.c());
                    break;
                }
        }
        return false;
    }

    public abstract long a();

    public abstract dzje b();

    public abstract dzje c();

    public final dzjf d() {
        return b().a();
    }

    public final dzjf e() {
        return c().a();
    }

    public abstract emxc g();

    public abstract emxc h();

    public abstract emxc j();

    /* JADX WARN: Removed duplicated region for block: B:18:0x00af A[Catch: JSONException -> 0x0119, TryCatch #1 {JSONException -> 0x0119, blocks: (B:3:0x0009, B:5:0x0013, B:6:0x0020, B:8:0x0033, B:16:0x00a9, B:18:0x00af, B:27:0x00a2, B:28:0x00b6, B:30:0x00c0, B:31:0x00cd, B:33:0x00d7, B:34:0x00e4, B:36:0x00f9, B:39:0x00fc, B:41:0x0111, B:43:0x0114, B:10:0x0040, B:15:0x0095, B:19:0x005e, B:21:0x006e, B:22:0x0076, B:23:0x007e, B:25:0x008e, B:26:0x009a), top: B:2:0x0009, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.emxc k() {
        /*
            Method dump skipped, instructions count: 289
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzjn.k():emxc");
    }

    public abstract emxc l();
}
