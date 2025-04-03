package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfv extends adu {
    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        Bundle bundle = (Bundle) obj;
        return new Intent("android.intent.action.CREATE_DOCUMENT").setType(bundle.getString("messaging.attachment.documentType")).putExtra("android.intent.extra.TITLE", bundle.getString("messaging.attachment.documentName"));
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        return (intent == null || i != -1) ? Optional.empty() : Optional.ofNullable(intent.getData());
    }
}
