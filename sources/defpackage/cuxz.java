package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class cuxz {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/util/ui/UiUtil");
    protected final ctvs a;
    private final Context c;

    public cuxz(Context context, ctvs ctvsVar) {
        this.c = context;
        this.a = ctvsVar;
    }

    public abstract Drawable a(Resources resources);

    public final void b(String str, String str2) {
        ClipboardManager clipboardManager = (ClipboardManager) this.c.getSystemService("clipboard");
        if (clipboardManager == null) {
            ensk j = b.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/ui/UiUtil", "copyToClipboardAndShowToast", 67, "UiUtil.java")).q("Could not get clipboard system service.");
        } else {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(null, str));
            if (Build.VERSION.SDK_INT <= 32) {
                Toast.makeText(this.c, str2, 1).show();
            }
        }
    }

    public final boolean c(Context context) {
        return this.a.e() && this.a.d() && ctid.i(context);
    }

    public final boolean d(RecyclerView recyclerView, boolean z) {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.o;
        if (linearLayoutManager == null) {
            return false;
        }
        int L = linearLayoutManager.L();
        View U = linearLayoutManager.U(L);
        if (L <= 0 && U != null) {
            if ((z ? U.getTop() : U.getLeft()) >= 0) {
                return true;
            }
        }
        return false;
    }
}
