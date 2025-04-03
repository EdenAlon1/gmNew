package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzvv {
    private static final String a = "dzvv";
    public static final /* synthetic */ int c = 0;

    public static emxc c(JSONObject jSONObject) {
        emxc emxcVar;
        emxc emxcVar2;
        try {
            dzus dzusVar = new dzus();
            int i = engw.d;
            engr engrVar = new engr();
            JSONArray jSONArray = jSONObject.getJSONArray("COMPONENTS");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                try {
                } catch (JSONException e) {
                    dyhr.d("UI_COMPONENT", "Failed to get UiComponent from JSONObject", e);
                }
                if (jSONObject2.has("UI_ELEMENT")) {
                    emxc i3 = dzwi.i(jSONObject2.getJSONObject("UI_ELEMENT"));
                    if (i3.g()) {
                        emxcVar = emxc.j(new dztv((dzwi) i3.c()));
                    } else {
                        dyhr.c("UI_COMPONENT", "Failed to get UiElement from JSON when decoding UiComponent.");
                        emxcVar = emux.a;
                    }
                } else {
                    if (jSONObject2.has("STACK_COMPONENT")) {
                        JSONObject jSONObject3 = jSONObject2.getJSONObject("STACK_COMPONENT");
                        dzuy dzuyVar = new dzuy();
                        engr engrVar2 = new engr();
                        try {
                            JSONArray jSONArray2 = jSONObject3.getJSONArray("UI_ELEMENTS");
                            int i4 = 0;
                            while (true) {
                                if (i4 >= jSONArray2.length()) {
                                    dzuyVar.b(engrVar2.g());
                                    emxcVar2 = emxc.j(dzuyVar.a());
                                    break;
                                }
                                emxc i5 = dzwi.i(jSONArray2.getJSONObject(i4));
                                if (!i5.g()) {
                                    dyhr.c("UI_COMPONENT", "Failed to get UiElement from JSON when decoding StackComponent.");
                                    emxcVar2 = emux.a;
                                    break;
                                }
                                engrVar2.h(i5.c());
                                i4++;
                            }
                        } catch (JSONException e2) {
                            dyhr.d("UI_COMPONENT", "Failed to get LineStyle from JSONObject.", e2);
                            emxcVar2 = emux.a;
                        }
                        if (emxcVar2.g()) {
                            emxcVar = emxc.j(new dztu((dzwc) emxcVar2.c()));
                        } else {
                            dyhr.c("UI_COMPONENT", "Failed to get StackComponent from JSON when decoding UiComponent.");
                            emxcVar = emux.a;
                        }
                    }
                    emxcVar = emux.a;
                }
                if (!emxcVar.g()) {
                    dyhr.c(a, "Failed to convert JSONObject to StackCard.");
                    return emux.a;
                }
                engrVar.h(emxcVar.c());
            }
            dzusVar.b(engrVar.g());
            if (jSONObject.has("PREFERRED_MAX_WIDTH")) {
                dzusVar.c(jSONObject.getInt("PREFERRED_MAX_WIDTH"));
            }
            return emxc.j(dzusVar.a());
        } catch (JSONException e3) {
            dyhr.d(a, "Failed to convert JSONObject to StackCard.", e3);
            return emux.a;
        }
    }

    public abstract emxc a();

    public abstract engw b();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7 A[Catch: JSONException -> 0x0101, LOOP:0: B:4:0x0016->B:16:0x00d7, LOOP_END, TryCatch #1 {JSONException -> 0x0101, blocks: (B:3:0x0009, B:4:0x0016, B:6:0x001c, B:13:0x00bc, B:14:0x00c9, B:18:0x00cf, B:16:0x00d7, B:47:0x00c2, B:49:0x00e0, B:51:0x00ef, B:8:0x0027, B:21:0x0036, B:23:0x0044, B:24:0x004d, B:25:0x0057, B:35:0x00a5, B:37:0x00ab, B:38:0x00b3, B:41:0x0098, B:44:0x009e, B:27:0x0065, B:28:0x006d, B:30:0x0073, B:34:0x0083, B:32:0x008b, B:40:0x0093), top: B:2:0x0009, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cf A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.emxc d() {
        /*
            Method dump skipped, instructions count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzvv.d():emxc");
    }
}
