package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.util.Base64;
import com.android.vcard.VCardConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyug {
    public static ContentValues a(dzpb dzpbVar) {
        byte[] bArr;
        emxc emxcVar;
        ContentValues contentValues = new ContentValues();
        dzms dzmsVar = (dzms) dzpbVar;
        contentValues.put("lighter_id_type", Integer.valueOf(dzmsVar.a.b().f));
        contentValues.put("lighter_id_id", dzmsVar.a.d());
        dzpg dzpgVar = dzmsVar.a;
        contentValues.put("lighter_id_normalized_id", dzpgVar.b() == dzpf.EMAIL ? dyhm.a(dzpgVar.d()) : dzpgVar.d());
        contentValues.put("lighter_handler_id", (String) dzmsVar.a.c().f());
        contentValues.put("lighter_id_app_name", dzmsVar.a.e());
        HashMap hashMap = new HashMap();
        hashMap.put("expiration_time_ms", Long.valueOf(dzmsVar.g));
        hashMap.put("image_stale", Boolean.valueOf(dzmsVar.f));
        hashMap.put("server_timestamp_us", Long.valueOf(dzmsVar.l));
        if (dzmsVar.b.g()) {
            hashMap.put("name", dzmsVar.b.c());
        }
        if (dzmsVar.d.g()) {
            hashMap.put("image_url", dzmsVar.d.c());
        }
        if (dzmsVar.e.g()) {
            hashMap.put("image", dyhu.j((Bitmap) dzmsVar.e.c()));
        }
        if (!dzmsVar.h.isEmpty()) {
            hashMap.put("menu_items", dyhx.d(dzmsVar.h, new emwl() { // from class: dyuf
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    dzqd dzqdVar = (dzqd) obj;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("MENU_NAME", dzqdVar.c());
                    hashMap2.put("ACTION", dytw.b(dzqdVar.a()));
                    if (dzqdVar.b().g()) {
                        hashMap2.put("ICON", Base64.encodeToString((byte[]) dzqdVar.b().c(), 2));
                    }
                    return hashMap2;
                }
            }));
        }
        if (dzmsVar.j.g()) {
            Object c = dzmsVar.j.c();
            HashMap hashMap2 = new HashMap();
            hashMap2.put(VCardConstants.PARAM_TYPE, 1);
            hashMap2.put("CONTENT", dyvl.d(((dzry) c).a()));
            try {
                emxcVar = emxc.j(dyhu.i(hashMap2));
            } catch (IOException e) {
                dyhr.d("SerRichTextModel", "Failed to serialize contact properties.", e);
                emxcVar = emux.a;
            }
            if (emxcVar.g()) {
                hashMap.put("custom_view_content_type", 1);
                hashMap.put("custom_view_content", emxcVar.c());
            }
        }
        if (!dzmsVar.i.isEmpty()) {
            hashMap.put("toolbar_buttons", dyhx.d(dzmsVar.i, new emwl() { // from class: dyuf
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    dzqd dzqdVar = (dzqd) obj;
                    HashMap hashMap22 = new HashMap();
                    hashMap22.put("MENU_NAME", dzqdVar.c());
                    hashMap22.put("ACTION", dytw.b(dzqdVar.a()));
                    if (dzqdVar.b().g()) {
                        hashMap22.put("ICON", Base64.encodeToString((byte[]) dzqdVar.b().c(), 2));
                    }
                    return hashMap22;
                }
            }));
        }
        if (dzmsVar.k.g()) {
            Object c2 = dzmsVar.k.c();
            HashMap hashMap3 = new HashMap();
            dzqf dzqfVar = (dzqf) c2;
            hashMap3.put("BADGE", Integer.valueOf(dzqfVar.a()));
            hashMap3.put("PROFILE_LABEL_STYLE", Integer.valueOf(dzqfVar.b()));
            hashMap.put("ui_configurations", hashMap3);
        }
        try {
            bArr = dyhu.i(hashMap);
        } catch (IOException e2) {
            dyhr.d("ContactCursors", "Failed to serialize contact properties.", e2);
            bArr = new byte[0];
        }
        contentValues.put("contact_properties", bArr);
        return contentValues;
    }

    public static dzpg b(int i, Cursor cursor) {
        dzil dzilVar = new dzil();
        dzilVar.c(cursor.getString(dywh.a(3) + i));
        dzilVar.d(cursor.getString(dywh.a(5) + i));
        dzilVar.e(dzpf.a(cursor.getInt(dywh.a(2) + i)));
        String string = cursor.getString(i + dywh.a(4));
        if (string != null) {
            dzilVar.b(string);
        }
        return dzilVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v26, types: [dzpu, java.lang.Object] */
    public static emxc c(Cursor cursor) {
        emxc emxcVar;
        Bitmap a;
        emxc emxcVar2;
        if (cursor.getPosition() == -1 && !cursor.moveToFirst()) {
            return emux.a;
        }
        dzpa k = dzpb.k();
        k.c(b(0, cursor));
        HashMap g = dyhu.g(cursor.getBlob(dywh.a(6)));
        if (g.containsKey("expiration_time_ms")) {
            k.e(((Long) g.get("expiration_time_ms")).longValue());
        } else {
            k.e(-1L);
        }
        if (g.containsKey("name")) {
            k.k((String) g.get("name"));
        }
        if (g.containsKey("image_url")) {
            k.g((String) g.get("image_url"));
        }
        if (g.containsKey("image_stale")) {
            k.h(((Boolean) g.get("image_stale")).booleanValue());
        }
        if (g.containsKey("custom_view_content") && ((Integer) g.get("custom_view_content_type")).intValue() == 1) {
            byte[] bArr = (byte[]) g.get("custom_view_content");
            if (bArr == null || bArr.length == 0) {
                emxcVar2 = emux.a;
            } else {
                HashMap g2 = dyhu.g(bArr);
                if (g2.containsKey(VCardConstants.PARAM_TYPE) && ((Integer) g2.get(VCardConstants.PARAM_TYPE)).intValue() == 1) {
                    emxc b = dyhu.b(g2.get("CONTENT"));
                    if (b.g()) {
                        emxc c = dyvl.c((HashMap) b.c());
                        if (c.g()) {
                            dzoa dzoaVar = new dzoa();
                            dzoaVar.a = (dzrw) c.c();
                            emxcVar2 = emxc.j(dzoaVar.a());
                        }
                    }
                    emxcVar2 = emux.a;
                } else {
                    emxcVar2 = emux.a;
                }
            }
            if (emxcVar2.g()) {
                k.d(emxcVar2.c());
            }
        }
        k.j(d(g, "menu_items").g());
        k.m(d(g, "toolbar_buttons").g());
        if (g.containsKey("image") && (a = dyhu.a((byte[]) g.get("image"))) != null) {
            k.f(a);
        }
        if (g.containsKey("ui_configurations")) {
            try {
                HashMap hashMap = (HashMap) g.get("ui_configurations");
                try {
                    dznj dznjVar = new dznj();
                    dznjVar.b(0);
                    dznjVar.c(0);
                    if (hashMap.containsKey("BADGE")) {
                        dznjVar.b(((Integer) hashMap.get("BADGE")).intValue());
                    }
                    if (hashMap.containsKey("PROFILE_LABEL_STYLE")) {
                        dznjVar.c(((Integer) hashMap.get("PROFILE_LABEL_STYLE")).intValue());
                    }
                    emxcVar = emxc.j(dznjVar.a());
                } catch (ClassCastException unused) {
                    dyhr.c("ContactCursors", "Failed to de-serialize UI configurations properties.");
                    emxcVar = emux.a;
                }
                if (emxcVar.g()) {
                    k.i((dzqf) emxcVar.c());
                }
            } catch (ClassCastException unused2) {
                dyhr.c("ContactCursors", "Failed to de-serialize UI configurations map.");
            }
        }
        if (g.containsKey("server_timestamp_us")) {
            k.l(((Long) g.get("server_timestamp_us")).longValue());
        }
        return emxc.j(k.a());
    }

    private static engr d(HashMap hashMap, String str) {
        ArrayList arrayList;
        emxc emxcVar;
        int i = engw.d;
        engr engrVar = new engr();
        if (hashMap.containsKey(str)) {
            try {
                arrayList = (ArrayList) hashMap.get(str);
            } catch (ClassCastException e) {
                dyhr.d("ContactCursors", "Failed to deserialize ".concat(str), e);
                arrayList = new ArrayList();
            }
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Map map = (Map) arrayList.get(i2);
                if (map.containsKey("ACTION") && map.containsKey("MENU_NAME")) {
                    dznh dznhVar = new dznh();
                    dznhVar.c((String) map.get("MENU_NAME"));
                    emxc a = dyht.a(dyhu.b(map.get("ACTION")), new emwl() { // from class: dyul
                        @Override // defpackage.emwl
                        public final Object apply(Object obj) {
                            return dytw.a((HashMap) obj);
                        }
                    });
                    if (a.g()) {
                        dznhVar.a = (dzjn) a.c();
                        if (map.containsKey("ICON")) {
                            dznhVar.b(Base64.decode((String) map.get("ICON"), 2));
                        }
                        emxcVar = emxc.j(dznhVar.a());
                    } else {
                        dyhr.c("MenuItemConv", "Parse Action failed.");
                        emxcVar = emux.a;
                    }
                } else {
                    dyhr.c("MenuItemConv", "Missing necessary properties.");
                    emxcVar = emux.a;
                }
                if (emxcVar.g()) {
                    engrVar.h(emxcVar.c());
                }
            }
        }
        return engrVar;
    }
}
