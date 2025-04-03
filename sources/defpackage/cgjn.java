package defpackage;

import android.content.Intent;
import android.util.Base64;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgjn {
    public static final cskc a = cskc.g("Lighter", "LighterUtils");

    public static fbes a(Intent intent) {
        String stringExtra = intent.getStringExtra("args");
        if (stringExtra == null) {
            return null;
        }
        try {
            return (fbes) eyfy.parseFrom(fbes.a, Base64.decode(stringExtra, 10), eyfc.a());
        } catch (eygu e) {
            a.s("InvalidProtocolBufferException in getChatIntentApiArgs.", e);
            return null;
        }
    }
}
