package defpackage;

import com.android.vcard.VCardConstants;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyuq {
    /* JADX WARN: Can't wrap try/catch for region: R(23:0|1|(1:(1:4)(2:109|110))(1:111)|5|(2:7|(2:9|(18:(1:(1:(1:14)(4:92|(1:94)|95|(1:97)(1:98)))(1:100))(1:101)|15|(4:17|(2:20|18)|21|22)|23|(1:25)|26|(1:28)|29|30|31|32|33|34|(2:37|35)|38|39|40|(5:42|(1:(3:(1:(1:47))(19:52|(1:54)|55|(1:57)|58|(1:60)|61|(1:63)|64|(1:66)(1:81)|67|(1:69)(1:80)|70|(1:72)|73|(1:75)|76|(1:78)|79)|49|50)(1:82))(1:83)|48|49|50)(2:84|85))(3:102|(1:104)(1:106)|105))(1:107))(1:108)|99|15|(0)|23|(0)|26|(0)|29|30|31|32|33|34|(1:35)|38|39|40|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0205, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x020a, code lost:
    
        defpackage.dyhr.g("MessageCursors", "Failed to deserialize possible decorations.", r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01bc, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01bd, code lost:
    
        defpackage.dyhr.g("MessageCursors", "Failed to deserialize active decoration ids.", r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01ed A[Catch: IOException | ClassCastException | ClassNotFoundException -> 0x0205, ClassNotFoundException -> 0x0207, IOException -> 0x0209, LOOP:1: B:35:0x01e7->B:37:0x01ed, LOOP_END, TryCatch #5 {IOException | ClassCastException | ClassNotFoundException -> 0x0205, blocks: (B:34:0x01ca, B:35:0x01e7, B:37:0x01ed, B:39:0x01fb), top: B:33:0x01ca }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0367  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.dzqs a(defpackage.dzpt r12, android.database.Cursor r13) {
        /*
            Method dump skipped, instructions count: 879
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dyuq.a(dzpt, android.database.Cursor):dzqs");
    }

    public static HashMap b(dzqs dzqsVar) {
        byte[] bArr;
        HashMap hashMap = new HashMap();
        hashMap.put("content_type", ermn.k(dzqsVar.h().a() - 1));
        int a = dzqsVar.h().a() - 1;
        if (a == 0) {
            hashMap.put("message_content", dzqsVar.h().e().I());
        } else if (a == 1) {
            hashMap.put("message_content", dyhv.b(dzqsVar.h().d()));
        } else if (a == 2) {
            hashMap.put("message_content", ((dznp) dzqsVar.h().b()).b);
            hashMap.put("custom_message_content_type", dyhv.b(((dznp) dzqsVar.h().b()).a));
        } else if (a == 3) {
            hashMap.put("message_content", dyhu.i(dyvl.d(dzqsVar.h().c())));
        }
        if (!dzqsVar.o().isEmpty()) {
            HashMap hashMap2 = new HashMap(dzqsVar.o());
            try {
                HashMap hashMap3 = new HashMap();
                for (Map.Entry entry : hashMap2.entrySet()) {
                    hashMap3.put((String) entry.getKey(), ((eyee) entry.getValue()).I());
                }
                bArr = dyhu.i(hashMap3);
            } catch (IOException e) {
                dyhr.d("MessageCursors", "Failed to serialize message metadata.", e);
                bArr = new byte[0];
            }
            hashMap.put("metadata", bArr);
        }
        emxc k = dzqsVar.k();
        if (k.g()) {
            hashMap.put("fallback", dyhv.b((String) k.c()));
        }
        emxc m = dzqsVar.m();
        if (m.g()) {
            hashMap.put("snippet", dyhv.b((String) m.c()));
        }
        dzqp j = dzqsVar.j();
        if (j.a().ordinal() == 2) {
            dzqo b = j.b();
            HashMap hashMap4 = new HashMap();
            dznr dznrVar = (dznr) b;
            hashMap4.put("time_to_live_sec", Integer.valueOf(dznrVar.e));
            hashMap4.put("OVERLAY_STYLE", Integer.valueOf(dznrVar.j));
            if (dznrVar.a.g()) {
                hashMap4.put("dismiss_action", dytw.b((dzjn) dznrVar.a.c()));
            }
            if (dznrVar.b.g()) {
                hashMap4.put("display_icon", ((eyee) dznrVar.b.c()).I());
            }
            if (dznrVar.d.g()) {
                hashMap4.put("display_text", dznrVar.d.c());
            }
            if (dznrVar.c.g()) {
                hashMap4.put("overlay_lighter_icon", dyhu.i(dyuk.b((dzqb) dznrVar.c.c())));
            }
            if (dznrVar.i.g()) {
                hashMap4.put("overlay_expire_time", ermn.k(((Integer) dznrVar.i.c()).intValue()));
            }
            hashMap4.put("hide_snippet_in_conversation_list", Boolean.valueOf(dznrVar.f));
            hashMap4.put("hide_dismiss_button", Boolean.valueOf(dznrVar.g));
            hashMap4.put("dismissible_by_tapping_outside", Boolean.valueOf(dznrVar.h));
            hashMap.put("overlay_header", dyhu.i(hashMap4));
        }
        hashMap.put("intended_rendering_type", ermn.k(dzqsVar.c()));
        hashMap.put("ACTIVE_DECORATION_IDS", dyhu.i(new ArrayList(dzqsVar.n())));
        hashMap.put("POSSIBLE_DECORATIONS", dyhu.i(dyhx.d(dzqsVar.p().values(), new emwl() { // from class: dyuo
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                dzqx dzqxVar = (dzqx) obj;
                HashMap hashMap5 = new HashMap();
                hashMap5.put("DECORATION_ID", dzqxVar.c());
                hashMap5.put("RENDER_CRITERIA", Integer.valueOf(dzqxVar.b().c));
                dzqu a2 = dzqxVar.a();
                HashMap hashMap6 = new HashMap();
                hashMap6.put(VCardConstants.PARAM_TYPE, 0);
                dzqt dzqtVar = dzqt.a;
                if (dzqtVar.equals(dzqtVar)) {
                    dzot dzotVar = ((dzkq) a2).a;
                    HashMap hashMap7 = new HashMap();
                    dzmm dzmmVar = (dzmm) dzotVar;
                    hashMap7.put("PROMPT_TEXT", dyvl.d(dzmmVar.a));
                    hashMap7.put("BUTTONS", dyhx.d(dzmmVar.b, new emwl() { // from class: dyur
                        @Override // defpackage.emwl
                        public final Object apply(Object obj2) {
                            return dyva.b((dzrd) obj2);
                        }
                    }));
                    hashMap6.put("DECORATION_CONTENT", hashMap7);
                }
                hashMap5.put("CONTENT", hashMap6);
                return hashMap5;
            }
        })));
        return hashMap;
    }

    public static HashMap c(byte[] bArr) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    HashMap hashMap = (HashMap) objectInputStream.readObject();
                    objectInputStream.close();
                    byteArrayInputStream.close();
                    return hashMap;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException | ClassNotFoundException e) {
            dyhr.d("MessageCursors", "Error loading message profile.", e);
            return new HashMap();
        }
    }
}
