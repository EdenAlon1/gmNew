package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqgi extends adw {
    final /* synthetic */ eg a;
    final /* synthetic */ dqgf b;

    public dqgi(eg egVar, dqgf dqgfVar) {
        this.a = egVar;
        this.b = dqgfVar;
    }

    @Override // defpackage.adw, defpackage.adu
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        return a(context, (String) obj);
    }

    @Override // defpackage.adw
    /* renamed from: d */
    public final Intent a(Context context, String str) {
        str.getClass();
        eg egVar = this.a;
        Intent a = super.a(context, str);
        egVar.getPackageManager().getClass();
        a.putExtra("android.intent.extra.MIME_TYPES", (String[]) this.b.a.toArray(new String[0]));
        return a;
    }
}
