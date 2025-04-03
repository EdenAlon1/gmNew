package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class adv extends adu {
    private final String a;

    public adv(String str) {
        this.a = str;
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        String str = (String) obj;
        str.getClass();
        Intent putExtra = new Intent("android.intent.action.CREATE_DOCUMENT").setType(this.a).putExtra("android.intent.extra.TITLE", str);
        putExtra.getClass();
        return putExtra;
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ Object b(int i, Intent intent) {
        if (i != -1) {
            intent = null;
        }
        if (intent != null) {
            return intent.getData();
        }
        return null;
    }

    @Override // defpackage.adu
    public final /* bridge */ /* synthetic */ adt c(Context context, Object obj) {
        ((String) obj).getClass();
        return null;
    }

    @ffbs
    public adv() {
        this("*/*");
    }
}
