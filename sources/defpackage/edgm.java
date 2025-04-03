package defpackage;

import android.graphics.Bitmap;
import com.google.android.gms.common.api.Status;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class edgm {
    public final qoo a;

    public edgm(qoo qooVar) {
        this.a = qooVar;
    }

    static /* synthetic */ void a(dhri dhriVar, qou qouVar) {
        dfqu b;
        try {
            qoh qohVar = qouVar.a;
            if (qohVar != null) {
                int i = qohVar.a;
                if (i == 400) {
                    b = new dfqu(new Status(9012, "The provided parameters are invalid (did you include a max width or height?)."));
                } else if (i == 403) {
                    b = new dfqu(new Status(9011, "The provided API key is invalid."));
                }
                dhriVar.c(b);
            }
            b = edgb.b(qouVar);
            dhriVar.c(b);
        } catch (Error | RuntimeException e) {
            edti.b(e);
            throw e;
        }
    }

    static /* synthetic */ void b(edjj edjjVar, dhri dhriVar, Bitmap bitmap) {
        try {
            edjjVar.a = bitmap;
            emxf.m(edjjVar.a != null, "Photo must be set to non-null value.");
            dhriVar.d(new edjk(edjjVar.a));
        } catch (Error | RuntimeException e) {
            edti.b(e);
            throw e;
        }
    }
}
