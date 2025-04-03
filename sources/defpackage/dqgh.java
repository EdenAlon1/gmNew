package defpackage;

import android.content.Context;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqgh extends ady {
    final /* synthetic */ eg a;
    final /* synthetic */ dqgf b;

    public dqgh(eg egVar, dqgf dqgfVar) {
        this.a = egVar;
        this.b = dqgfVar;
    }

    @Override // defpackage.ady, defpackage.adu
    public final /* bridge */ /* synthetic */ Intent a(Context context, Object obj) {
        return a(context, (String) obj);
    }

    @Override // defpackage.ady
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
