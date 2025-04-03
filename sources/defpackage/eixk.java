package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eixk {
    private final Activity a;

    public eixk(Activity activity) {
        this.a = activity;
    }

    static void b(Intent intent, boolean z) {
        intent.putExtra("$tiktok$canRestartAccountSelector", z);
    }

    private final void d(Intent intent) {
        eitk eitkVar;
        if (eitl.a(this.a.getIntent())) {
            Intent intent2 = this.a.getIntent();
            intent2.getClass();
            if (!eitl.a(intent2)) {
                throw new IllegalStateException("AccountOperationContext not stored in the intent");
            }
            Object a = koc.a(intent2, "tiktok_account_operation_contexts", eitk.class);
            if (a == null) {
                throw new IllegalStateException("Required value was null.");
            }
            eitkVar = (eitk) a;
        } else {
            eitkVar = null;
        }
        if (eitkVar != null) {
            intent.getClass();
            intent.putExtra("tiktok_account_operation_contexts", eitkVar);
        }
    }

    public final void a() {
        Intent putExtra = new Intent().putExtra("account_error", new eiuw());
        d(putExtra);
        this.a.setResult(0, putExtra);
        this.a.finish();
        this.a.overridePendingTransition(0, 0);
    }

    public final void c(eisx eisxVar) {
        Intent putExtra = new Intent().putExtra("new_account_id", eisxVar.a());
        d(putExtra);
        this.a.setResult(-1, putExtra);
        this.a.finish();
        this.a.overridePendingTransition(0, 0);
    }
}
