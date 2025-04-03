package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class azzu {
    public static final entd a = entd.c("BugleImage");
    private final Context b;
    private final cbbu c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final cpn g = new cpn();
    private final Object h = new Object();

    public azzu(Context context, cbbu cbbuVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.b = context;
        this.c = cbbuVar;
        this.d = ffbrVar;
        this.e = ffbrVar2;
        this.f = ffbrVar3;
    }

    public final void a(String str) {
        synchronized (this.h) {
            bcpt bcptVar = (bcpt) this.g.remove(str);
            if (bcptVar != null) {
                csix.k(bcptVar.g());
                bcptVar.f();
            }
        }
    }

    public final void b(String str, ParticipantsTable.BindData bindData) {
        csix.l(bindData);
        csix.l(str);
        Uri x = bindData.x();
        if (x == null || TextUtils.isEmpty(x.toString())) {
            return;
        }
        ekzz f = eleg.f("ProfilePhotoBasedParticipantColorUpdater.updateParticipantColorBasedOnProfilePhoto");
        try {
            try {
                azzt azztVar = new azzt(this, str, this.d, this.e, this.f);
                try {
                    int dimension = (int) this.b.getResources().getDimension(R.dimen.min_touch_target_size);
                    cbat e = new cbce(x, dimension, dimension, false, false, 0).e(this.b, azztVar);
                    a(str);
                    bcpt bcptVar = new bcpt();
                    bcptVar.c(e);
                    synchronized (this.h) {
                        this.g.put(str, bcptVar);
                    }
                    this.c.d(e);
                    f.close();
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    try {
                        f.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
