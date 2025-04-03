package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tcs implements ellh {
    final /* synthetic */ tcr a;

    public tcs(tcr tcrVar) {
        this.a = tcrVar;
    }

    @Override // defpackage.ellh
    public final /* bridge */ /* synthetic */ elli a(ellf ellfVar) {
        tcr tcrVar = this.a;
        try {
            ejhd ejhdVar = tcrVar.b;
            efbd.c();
            emxf.m(ejhdVar.b != null, "Must call initialize() in onCreate().");
            ejhdVar.b.b();
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message == null || !message.contains("Cannot open account menu when the account list is empty")) {
                throw e;
            }
            Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
            intent.putExtra("account_types", new String[]{"com.google"});
            eldl.p(tcrVar.a, intent);
        }
        return elli.a;
    }
}
