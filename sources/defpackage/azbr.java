package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azbr implements azaj {
    private final Map a;

    public azbr(cpbn cpbnVar, int i, boolean z) {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        int h = cpbnVar.h();
        hashMap.put("SMS_TO_MMS_TEXT_LENGTH_THRESHOLD", String.valueOf(h == -1 ? Integer.MAX_VALUE : h));
        hashMap.put("SMS_MAX_TEXT_PARTS", String.valueOf(i == -1 ? Integer.MAX_VALUE : i));
        hashMap.put("SIMPLE_CHARACTERS_ONLY", String.valueOf(z));
    }

    @Override // defpackage.azaj
    public final String a(String str) {
        return (String) this.a.get(str);
    }
}
