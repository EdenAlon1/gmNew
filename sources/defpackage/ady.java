package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ady extends adu {
    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        return intent != null ? adx.a(intent) : ffel.a;
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ adt c(Context context, Object obj) {
        ((String) obj).getClass();
        return null;
    }

    @Override // defpackage.adu
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Intent a(Context context, String str) {
        str.getClass();
        Intent putExtra = new Intent("android.intent.action.GET_CONTENT").addCategory("android.intent.category.OPENABLE").setType(str).putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        putExtra.getClass();
        return putExtra;
    }
}
