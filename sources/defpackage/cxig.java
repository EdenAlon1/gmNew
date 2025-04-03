package defpackage;

import android.content.Context;
import com.google.android.apps.messaging.R;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cxig {
    public static final ejui a = new ejtz("SwipeActionSettings");
    public static final ejui b = new ejtz("SwipeLeftAction");
    public static final ejui c = new ejtz("SwipeRightAction");
    public final AtomicBoolean d = new AtomicBoolean(false);
    public final ffbr e;
    private final ffbr f;

    public cxig(ffbr ffbrVar, ffbr ffbrVar2) {
        this.e = ffbrVar;
        this.f = ffbrVar2;
    }

    public static String a(Context context, cxhv cxhvVar) {
        int ordinal = cxhvVar.ordinal();
        if (ordinal == 0) {
            return context.getString(R.string.action_off);
        }
        if (ordinal == 1) {
            return context.getString(R.string.action_archive);
        }
        if (ordinal == 2) {
            return context.getString(R.string.action_delete);
        }
        if (ordinal == 3) {
            return context.getString(R.string.action_mark_as_read_or_unread);
        }
        throw new AssertionError("Encountered unknown swipe action value.");
    }

    public static final cxhv[] d() {
        return new cxhv[]{cxhv.ARCHIVE, cxhv.DELETE, cxhv.MARK_AS_READ_OR_UNREAD, cxhv.NONE};
    }

    public final void b() {
        ((ejvp) this.f.b()).a(elfo.e(null), a);
    }

    public final void c(ejui ejuiVar) {
        ((ejvp) this.f.b()).a(elfo.e(null), ejuiVar);
        b();
    }
}
