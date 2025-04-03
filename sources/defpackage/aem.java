package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class aem extends adu {
    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        adq adqVar = (adq) obj;
        adqVar.getClass();
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", adqVar);
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.adu
    public final /* synthetic */ Object b(int i, Intent intent) {
        return new ade(i, intent);
    }
}
