package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class clhp implements clhc {
    public final clha a;

    public clhp(clha clhaVar) {
        this.a = clhaVar;
    }

    @Override // defpackage.clhc
    public final elfl a(Intent intent) {
        emxf.a("com.google.android.apps.messaging.messaging_service_revoke_message_response".equals(intent.getAction()));
        return this.a.b(intent);
    }

    @Override // defpackage.clhc
    public final String b() {
        return "Bugle.MessagingService.RevokeMessageResponse.Latency";
    }
}
