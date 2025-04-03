package defpackage;

import android.database.Cursor;
import android.graphics.Bitmap;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyuh {
    public static emxc a(Cursor cursor) {
        emxc emxcVar;
        Bitmap a;
        if (cursor.getPosition() != -1 || cursor.moveToFirst()) {
            int length = dywm.b.length;
            String[] strArr = dywi.a;
            int i = length + 7;
            dzpj r = dzpk.r();
            if (dzpq.a(cursor.getInt(dywl.a(2))) == dzpq.GROUP) {
                dzin dzinVar = new dzin();
                dzip dzipVar = new dzip();
                dzipVar.c(cursor.getString(dywl.a(3)));
                dzipVar.b(cursor.getString(dywl.a(4)));
                dzinVar.d(dzipVar.a());
                dzinVar.c(dyug.b(length, cursor));
                r.q(dzinVar);
            } else {
                dzin dzinVar2 = new dzin();
                dzinVar2.e(dyug.b(i, cursor));
                dzinVar2.c(dyug.b(length, cursor));
                r.q(dzinVar2);
            }
            r.b(dyhu.h(cursor.getBlob(dywl.a(8))));
            r.l(cursor.getLong(dywl.a(9)));
            r.m(cursor.getLong(dywl.a(10)));
            HashMap g = dyhu.g(cursor.getBlob(dywl.a(11)));
            if (g.isEmpty()) {
                dyhr.c("ConversationCursors", "Failed to deserialize conversation properties: No properties.");
            } else {
                if (g.containsKey("expiration_time_ms")) {
                    r.h(((Long) g.get("expiration_time_ms")).longValue());
                } else {
                    r.h(-1L);
                }
                if (g.containsKey("blockable")) {
                    r.c(((Boolean) g.get("blockable")).booleanValue());
                }
                if (g.containsKey(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE)) {
                    r.p((String) g.get(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE));
                }
                if (g.containsKey("image_url")) {
                    r.j((String) g.get("image_url"));
                }
                if (g.containsKey("image_stale")) {
                    r.k(((Boolean) g.get("image_stale")).booleanValue());
                }
                if (g.containsKey("image") && (a = dyhu.a((byte[]) g.get("image"))) != null) {
                    r.i(a);
                }
                if (g.containsKey("suggestion_list")) {
                    HashMap g2 = dyhu.g((byte[]) g.get("suggestion_list"));
                    try {
                        dzsb f = dzsc.f();
                        f.c((String) g2.get("ID"));
                        f.e(((Integer) g2.get("RENDER_STYLE")).intValue());
                        f.d((String) g2.get("MESSAGE_ID"));
                        f.b((String) g2.get("HINT_TEXT"));
                        engw b = dyhx.b((ArrayList) g2.get("SUGGESTIONS"), new emwl() { // from class: dyvp
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                HashMap hashMap = (HashMap) obj;
                                try {
                                    final dzrz f2 = dzsa.f();
                                    f2.c(((Integer) hashMap.get("ID")).intValue());
                                    f2.f((String) hashMap.get("TEXT"));
                                    f2.e((String) hashMap.get("SECONDARY_TEXT"));
                                    if (hashMap.containsKey("LIGHTER_ICON")) {
                                        dyht.b(dyuk.a((HashMap) hashMap.get("LIGHTER_ICON")), new ksp() { // from class: dyvm
                                            @Override // defpackage.ksp
                                            public final void accept(Object obj2) {
                                                dzrz.this.d((dzqb) obj2);
                                            }
                                        });
                                    }
                                    return dyht.a(dyhu.b(hashMap.get("ACTION")), new emwl() { // from class: dyvn
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            return dytw.a((HashMap) obj2);
                                        }
                                    }).b(new emwl() { // from class: dyvo
                                        @Override // defpackage.emwl
                                        public final Object apply(Object obj2) {
                                            dzrz dzrzVar = dzrz.this;
                                            dzrzVar.b((dzjn) obj2);
                                            return dzrzVar.a();
                                        }
                                    });
                                } catch (IllegalStateException | NullPointerException unused) {
                                    dyhr.c("ChipsListConverters", "failed to convert HashMap to Suggestion");
                                    return emux.a;
                                }
                            }
                        });
                        if (b.isEmpty()) {
                            emxcVar = emux.a;
                        } else {
                            f.f(b);
                            emxcVar = emxc.j(f.a());
                        }
                    } catch (ClassCastException | IllegalStateException | NullPointerException e) {
                        dyhr.d("ChipsListConverters", "failed to convert HashMap to SuggestionList", e);
                        emxcVar = emux.a;
                    }
                    ((dzmv) r).a = emxcVar;
                }
                if (g.containsKey("capabilities")) {
                    try {
                        r.d(engw.n((ArrayList) g.get("capabilities")));
                    } catch (ClassCastException e2) {
                        dyhr.d("ConversationCursors", "Error deserializing Capabilities in Conversation properties", e2);
                    }
                }
                if (g.containsKey("properties_expiration_time_ms")) {
                    r.n(((Long) g.get("properties_expiration_time_ms")).longValue());
                } else {
                    r.n(-1L);
                }
                if (g.containsKey("server_timestamp_us")) {
                    r.o(((Long) g.get("server_timestamp_us")).longValue());
                }
                if (g.containsKey("conversation_context")) {
                    r.e(dyhu.c((String) g.get("conversation_context")));
                }
                if (g.containsKey("created_timestamp_ms")) {
                    r.g(((Long) g.get("created_timestamp_ms")).longValue());
                }
            }
            try {
                return emxc.j(r.a());
            } catch (IllegalStateException unused) {
            }
        }
        return emux.a;
    }

    public static HashMap b(byte[] bArr) {
        try {
            Object readObject = new ObjectInputStream(new ByteArrayInputStream(bArr)).readObject();
            return readObject instanceof HashMap ? (HashMap) readObject : new HashMap();
        } catch (IOException | ClassNotFoundException e) {
            dyhr.d("ConversationCursors", "Error reading conversation properties.", e);
            return new HashMap();
        }
    }

    public static HashMap c(dzpk dzpkVar) {
        HashMap hashMap = new HashMap();
        f(hashMap, dzpkVar);
        if (dzpkVar.k().g()) {
            Object c = dzpkVar.k().c();
            HashMap hashMap2 = new HashMap();
            dzsc dzscVar = (dzsc) c;
            hashMap2.put("ID", dzscVar.d());
            hashMap2.put("MESSAGE_ID", dzscVar.e());
            hashMap2.put("RENDER_STYLE", Integer.valueOf(dzscVar.a()));
            hashMap2.put("SUGGESTIONS", dyhx.d(dzscVar.b(), new emwl() { // from class: dyvq
                @Override // defpackage.emwl
                public final Object apply(Object obj) {
                    dzsa dzsaVar = (dzsa) obj;
                    final HashMap hashMap3 = new HashMap();
                    hashMap3.put("ID", Integer.valueOf(dzsaVar.a()));
                    hashMap3.put("TEXT", dzsaVar.e());
                    hashMap3.put("SECONDARY_TEXT", dzsaVar.d());
                    dyht.b(dzsaVar.c(), new ksp() { // from class: dyvr
                        @Override // defpackage.ksp
                        public final void accept(Object obj2) {
                            hashMap3.put("LIGHTER_ICON", dyuk.b((dzqb) obj2));
                        }
                    });
                    hashMap3.put("ACTION", dytw.b(dzsaVar.b()));
                    return hashMap3;
                }
            }));
            hashMap2.put("HINT_TEXT", dzscVar.c());
            hashMap.put("suggestion_list", dyhu.i(hashMap2));
        }
        hashMap.put("capabilities", new ArrayList(dzpkVar.m()));
        hashMap.put("properties_expiration_time_ms", Long.valueOf(dzpkVar.e()));
        hashMap.put("conversation_context", dyhu.e(dzpkVar.n()));
        return hashMap;
    }

    public static byte[] d(HashMap hashMap) {
        try {
            return dyhu.i(hashMap);
        } catch (IOException e) {
            dyhr.d("ConversationCursors", "Failed to serialize conversation properties.", e);
            return new byte[0];
        }
    }

    public static byte[] e(dzpk dzpkVar) {
        try {
            return dyhu.i(c(dzpkVar));
        } catch (IOException e) {
            dyhr.d("ConversationCursors", "Failed to serialize conversation properties.", e);
            return new byte[0];
        }
    }

    public static void f(HashMap hashMap, dzpk dzpkVar) {
        hashMap.put("expiration_time_ms", Long.valueOf(dzpkVar.b()));
        hashMap.put("blockable", Boolean.valueOf(dzpkVar.p()));
        hashMap.put("image_stale", Boolean.valueOf(dzpkVar.q()));
        hashMap.put("server_timestamp_us", Long.valueOf(dzpkVar.f()));
        hashMap.put("created_timestamp_ms", Long.valueOf(dzpkVar.a()));
        if (dzpkVar.l().g()) {
            hashMap.put(ConversationSuggestion.SUGGESTION_PROPERTY_CALENDAR_TITLE, dzpkVar.l().c());
        }
        if (dzpkVar.j().g()) {
            hashMap.put("image_url", dzpkVar.j().c());
        }
        if (dzpkVar.i().g()) {
            hashMap.put("image", dyhu.j((Bitmap) dzpkVar.i().c()));
        }
    }
}
