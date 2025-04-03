package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azap implements azaj {
    private final Map a;

    public azap(cpbn cpbnVar, cpbw cpbwVar) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        hashMap.put("MMS_ENABLED", String.valueOf(cpbnVar.r()));
        hashMap.put("GROUP_MMS_ENABLED", String.valueOf(cpbwVar.d(cpbnVar.a)));
        hashMap.put("MAX_MESSAGE_SIZE", String.valueOf(cpbnVar.d()));
        hashMap.put("MAX_TEXT_LENGTH", String.valueOf(cpbnVar.f()));
        hashMap.put("MAX_SUBJECT_LENGTH", String.valueOf(cpbnVar.e()));
        hashMap.put("SUPPORTS_MMS_PRIORITY", String.valueOf(cpbnVar.y()));
        hashMap.put("SUPPORTS_FILE_TRANSFER", "true");
        hashMap.put("EMAIL_GATEWAY", cpbnVar.j());
        hashMap.put("EMAIL_SMS_TO_MMS_THRESHOLD", String.valueOf(cpbnVar.a()));
    }

    @Override // defpackage.azaj
    public final String a(String str) {
        return (String) this.a.get(str);
    }
}
