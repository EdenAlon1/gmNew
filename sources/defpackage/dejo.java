package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dejo {
    public static final cvjl a(Intent intent) {
        cvjl b = cvjl.b(intent.getIntExtra("INTENT_EXTRA_WELCOME_FLOW_TRIGGER_SOURCE", cvjl.WELCOME_FLOW_UNSPECIFIED.g));
        return b == null ? cvjl.WELCOME_FLOW_UNSPECIFIED : b;
    }
}
