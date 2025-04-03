package defpackage;

import com.google.chat.smartmessaging.smartreply.android.models.mediapipe.TextClassifier;
import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Packet;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emns implements emnk {
    private int a;
    private TextClassifier b;
    private boolean c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00b3 A[Catch: Exception -> 0x016f, TRY_LEAVE, TryCatch #1 {Exception -> 0x016f, blocks: (B:3:0x000c, B:5:0x0010, B:6:0x0012, B:13:0x00b3, B:27:0x0152, B:28:0x0155, B:42:0x016d, B:41:0x016a, B:9:0x00a4, B:11:0x00a8, B:58:0x0096, B:60:0x009c, B:15:0x00bb, B:17:0x00e6, B:19:0x00f9, B:22:0x0102, B:23:0x0109, B:25:0x010a, B:30:0x0158, B:31:0x015f, B:36:0x0164, B:47:0x0018, B:49:0x0028, B:51:0x0055, B:52:0x005b, B:54:0x0061, B:56:0x0072, B:57:0x0080), top: B:2:0x000c, inners: #0, #2, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x016e A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public emns(android.content.Context r11, defpackage.emji r12, defpackage.emmt r13) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.emns.<init>(android.content.Context, emji, emmt):void");
    }

    @Override // defpackage.emnk
    public final engw a(fbup fbupVar, String str, emrk emrkVar) {
        if (fbupVar == null) {
            int i = engw.d;
            return enou.a;
        }
        if (this.b == null) {
            int i2 = engw.d;
            return enou.a;
        }
        int i3 = engw.d;
        engr engrVar = new engr();
        int i4 = this.a;
        if (i4 > 0) {
            int size = fbupVar.b.size();
            fbuo fbuoVar = (fbuo) fbupVar.toBuilder();
            fbuoVar.copyOnWrite();
            ((fbup) fbuoVar.instance).b = fbup.emptyProtobufList();
            fbuoVar.a(fbupVar.b.subList(Math.max(size - i4, 0), size));
            fbupVar = (fbup) fbuoVar.build();
        }
        eygr<fbun> eygrVar = fbupVar.b;
        if (!eygrVar.isEmpty()) {
            fbun fbunVar = (fbun) enjk.j(eygrVar);
            if (!(fbunVar.b == 30 ? (String) fbunVar.c : "").isEmpty()) {
                StringBuilder sb = new StringBuilder();
                for (fbun fbunVar2 : eygrVar) {
                    String str2 = fbunVar2.d;
                    String str3 = fbunVar2.b == 30 ? (String) fbunVar2.c : "";
                    if (this.c) {
                        if (str2.equalsIgnoreCase(str)) {
                            sb.append("[user]: ");
                        } else {
                            sb.append("[remote]: ");
                        }
                    }
                    sb.append(str3);
                    sb.append("\n");
                }
                TextClassifier textClassifier = this.b;
                String sb2 = sb.toString();
                HashMap hashMap = new HashMap();
                AndroidPacketCreator androidPacketCreator = textClassifier.c.b;
                hashMap.put("text_in", Packet.create(androidPacketCreator.nativeCreateString(androidPacketCreator.a.a(), sb2)));
                emny emnyVar = (emny) textClassifier.c.a(hashMap);
                emnyVar.b();
                if (!((exmu) emnyVar.b()).a.isEmpty()) {
                    for (exmy exmyVar : ((exmu) emnyVar.b()).a) {
                        if (!exmyVar.c().isEmpty()) {
                            for (exmw exmwVar : exmyVar.c()) {
                                emni f = emnj.f();
                                f.c(exmwVar.c());
                                f.d(exmwVar.a());
                                f.e(fbrg.MEDIAPIPE_TEXT_CLASSIFIER);
                                engrVar.h(f.a());
                            }
                        }
                    }
                }
                return engrVar.g();
            }
        }
        return enou.a;
    }

    @Override // defpackage.emnk
    public final void b() {
        TextClassifier textClassifier = this.b;
        if (textClassifier != null) {
            textClassifier.close();
            this.b = null;
        }
    }
}
