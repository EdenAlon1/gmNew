package defpackage;

import com.android.vcard.VCardConstants;
import java.security.InvalidParameterException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes4.dex */
public abstract class dzvn {
    private static final String a = "dzvn";

    public static dzvm g() {
        return new dzuq().f(new byte[0]);
    }

    public static emxc h(JSONObject jSONObject) {
        emxc emxcVar;
        dzvp dzvpVar;
        try {
            dzvm g = g();
            JSONObject jSONObject2 = jSONObject.getJSONObject("MEDIA_SOURCE");
            String str = dzvq.a;
            try {
                final int i = jSONObject2.getInt(VCardConstants.PARAM_TYPE);
                dzvpVar = (dzvp) enfc.e(dzvp.values()).a(new emxg() { // from class: dzvo
                    @Override // defpackage.emxg
                    public final boolean a(Object obj) {
                        return ((dzvp) obj).c == i;
                    }
                }).f();
            } catch (JSONException e) {
                dyhr.d(dzvq.a, "Failed to convert JSONObject to MediaSource.", e);
                emxcVar = emux.a;
            }
            if (dzvpVar == null) {
                throw new InvalidParameterException("Invalid SourceType.");
            }
            int ordinal = dzvpVar.ordinal();
            if (ordinal == 0) {
                emxc c = dzsq.c(jSONObject2.getJSONObject("MEDIA_ID"));
                if (c.g()) {
                    emxcVar = emxc.j(new dztm((dzsq) c.c()));
                } else {
                    dyhr.c(dzvq.a, "Failed to convert JSONObject to MediaSource.");
                    emxcVar = emux.a;
                }
            } else if (ordinal != 1) {
                dyhr.c(dzvq.a, "Failed to convert JSONObject to MediaSource, unsupported type: " + dzvpVar.toString());
                emxcVar = emux.a;
            } else {
                String string = jSONObject2.getString(VCardConstants.PROPERTY_URL);
                if (string == null) {
                    dyhr.c(dzvq.a, "Failed to convert JSONObject to MediaSource.");
                    emxcVar = emux.a;
                } else {
                    emxcVar = emxc.j(dztp.a(string));
                }
            }
            if (!emxcVar.g()) {
                dyhr.c(a, "Failed to convert MediaElement from JSONObject.");
                return emux.a;
            }
            ((dzuq) g).a = (dzvq) emxcVar.c();
            if (jSONObject.has("LOCAL_URI")) {
                ((dzuq) g).b = jSONObject.getString("LOCAL_URI");
            }
            if (jSONObject.has("THUMBNAIL")) {
                g.f(dyhu.k(jSONObject.getString("THUMBNAIL")));
            }
            g.e(jSONObject.getInt("WIDTH"));
            g.c(jSONObject.getInt("HEIGHT"));
            g.d(jSONObject.getString("MEDIA_DESCRIPTION"));
            return emxc.j(g.b());
        } catch (JSONException e2) {
            dyhr.d(a, "Failed to convert MediaElement from JSONObject.", e2);
            return emux.a;
        }
    }

    public abstract int a();

    public abstract int b();

    public abstract dzvq c();

    public abstract eyee d();

    public abstract String e();

    public abstract String f();

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a A[Catch: JSONException -> 0x00c7, TryCatch #0 {JSONException -> 0x00c7, blocks: (B:2:0x0000, B:10:0x0064, B:12:0x006a, B:14:0x0079, B:15:0x0082, B:17:0x008c, B:18:0x009d, B:21:0x00bd, B:29:0x005b, B:4:0x0009, B:9:0x0055, B:23:0x0027, B:24:0x0034, B:26:0x0042, B:27:0x004c), top: B:1:0x0000, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00bd A[Catch: JSONException -> 0x00c7, TRY_LEAVE, TryCatch #0 {JSONException -> 0x00c7, blocks: (B:2:0x0000, B:10:0x0064, B:12:0x006a, B:14:0x0079, B:15:0x0082, B:17:0x008c, B:18:0x009d, B:21:0x00bd, B:29:0x005b, B:4:0x0009, B:9:0x0055, B:23:0x0027, B:24:0x0034, B:26:0x0042, B:27:0x004c), top: B:1:0x0000, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.emxc i() {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lc7
            r0.<init>()     // Catch: org.json.JSONException -> Lc7
            dzvq r1 = r5.c()     // Catch: org.json.JSONException -> Lc7
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5a
            r2.<init>()     // Catch: org.json.JSONException -> L5a
            java.lang.String r3 = "TYPE"
            dzvp r4 = r1.b()     // Catch: org.json.JSONException -> L5a
            int r4 = r4.c     // Catch: org.json.JSONException -> L5a
            r2.put(r3, r4)     // Catch: org.json.JSONException -> L5a
            dzvp r3 = r1.b()     // Catch: org.json.JSONException -> L5a
            int r3 = r3.ordinal()     // Catch: org.json.JSONException -> L5a
            if (r3 == 0) goto L34
            r4 = 1
            if (r3 == r4) goto L27
            goto L55
        L27:
            r1.c()     // Catch: org.json.JSONException -> L5a
            java.lang.String r3 = "URL"
            java.lang.String r1 = r1.c()     // Catch: org.json.JSONException -> L5a
            r2.put(r3, r1)     // Catch: org.json.JSONException -> L5a
            goto L55
        L34:
            dzsq r1 = r1.a()     // Catch: org.json.JSONException -> L5a
            emxc r1 = r1.d()     // Catch: org.json.JSONException -> L5a
            boolean r3 = r1.g()     // Catch: org.json.JSONException -> L5a
            if (r3 != 0) goto L4c
            java.lang.String r1 = defpackage.dzvq.a     // Catch: org.json.JSONException -> L5a
            java.lang.String r2 = "Failed to convert MediaId to JSONObject."
            defpackage.dyhr.c(r1, r2)     // Catch: org.json.JSONException -> L5a
            emux r1 = defpackage.emux.a     // Catch: org.json.JSONException -> L5a
            goto L64
        L4c:
            java.lang.String r3 = "MEDIA_ID"
            java.lang.Object r1 = r1.c()     // Catch: org.json.JSONException -> L5a
            r2.put(r3, r1)     // Catch: org.json.JSONException -> L5a
        L55:
            emxc r1 = defpackage.emxc.j(r2)     // Catch: org.json.JSONException -> L5a
            goto L64
        L5a:
            r1 = move-exception
            java.lang.String r2 = defpackage.dzvq.a     // Catch: org.json.JSONException -> Lc7
            java.lang.String r3 = "Failed to convert MediaSource to JSONObject."
            defpackage.dyhr.d(r2, r3, r1)     // Catch: org.json.JSONException -> Lc7
            emux r1 = defpackage.emux.a     // Catch: org.json.JSONException -> Lc7
        L64:
            boolean r2 = r1.g()     // Catch: org.json.JSONException -> Lc7
            if (r2 == 0) goto Lbd
            java.lang.String r2 = "MEDIA_SOURCE"
            java.lang.Object r1 = r1.c()     // Catch: org.json.JSONException -> Lc7
            r0.put(r2, r1)     // Catch: org.json.JSONException -> Lc7
            java.lang.String r1 = r5.e()     // Catch: org.json.JSONException -> Lc7
            if (r1 == 0) goto L82
            java.lang.String r1 = "LOCAL_URI"
            java.lang.String r2 = r5.e()     // Catch: org.json.JSONException -> Lc7
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc7
        L82:
            eyee r1 = r5.d()     // Catch: org.json.JSONException -> Lc7
            int r1 = r1.d()     // Catch: org.json.JSONException -> Lc7
            if (r1 <= 0) goto L9d
            java.lang.String r1 = "THUMBNAIL"
            eyee r2 = r5.d()     // Catch: org.json.JSONException -> Lc7
            byte[] r2 = r2.I()     // Catch: org.json.JSONException -> Lc7
            java.lang.String r2 = defpackage.dyhu.f(r2)     // Catch: org.json.JSONException -> Lc7
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc7
        L9d:
            java.lang.String r1 = "WIDTH"
            int r2 = r5.b()     // Catch: org.json.JSONException -> Lc7
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc7
            java.lang.String r1 = "HEIGHT"
            int r2 = r5.a()     // Catch: org.json.JSONException -> Lc7
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc7
            java.lang.String r1 = "MEDIA_DESCRIPTION"
            java.lang.String r2 = r5.f()     // Catch: org.json.JSONException -> Lc7
            r0.put(r1, r2)     // Catch: org.json.JSONException -> Lc7
            emxc r0 = defpackage.emxc.j(r0)     // Catch: org.json.JSONException -> Lc7
            return r0
        Lbd:
            java.lang.String r0 = defpackage.dzvn.a     // Catch: org.json.JSONException -> Lc7
            java.lang.String r1 = "failed to convert MediaElement to JSONObject."
            defpackage.dyhr.c(r0, r1)     // Catch: org.json.JSONException -> Lc7
            emux r0 = defpackage.emux.a     // Catch: org.json.JSONException -> Lc7
            return r0
        Lc7:
            r0 = move-exception
            java.lang.String r1 = defpackage.dzvn.a
            java.lang.String r2 = "Failed to convert MediaElement to JSONObject."
            defpackage.dyhr.d(r1, r2, r0)
            emux r0 = defpackage.emux.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzvn.i():emxc");
    }
}
