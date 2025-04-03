package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxcu {
    public final Context a;
    public final dxih b;
    public final dxpn c;
    public final dxpq d;
    public final dxsy e;
    public final efbm f;
    public final emxc g;
    public final dwxf h;
    public final Executor i;
    public final dwqy j;
    public final dxbv k;

    public dxcu(Context context, dxih dxihVar, dxpn dxpnVar, dxpq dxpqVar, dxsy dxsyVar, dxbv dxbvVar, efbm efbmVar, emxc emxcVar, dwxf dwxfVar, Executor executor, dwqy dwqyVar) {
        this.a = context;
        this.b = dxihVar;
        this.c = dxpnVar;
        this.d = dxpqVar;
        this.e = dxsyVar;
        this.k = dxbvVar;
        this.f = efbmVar;
        this.g = emxcVar;
        this.h = dwxfVar;
        this.i = executor;
        this.j = dwqyVar;
    }

    public final int a(Uri uri, List list) {
        int i;
        try {
        } catch (IOException e) {
            e = e;
            i = 0;
        }
        if (!this.f.h(uri)) {
            return 0;
        }
        i = 0;
        for (Uri uri2 : this.f.b(uri)) {
            try {
                try {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (uri2.toString().startsWith(((Uri) it.next()).toString())) {
                                break;
                            }
                        } else if (this.f.i(uri2)) {
                            i += a(uri2, list);
                        } else {
                            dxth.c("%s: Deleted unaccounted file with uri %s!", "ExpirationHandler", uri2.getPath());
                            this.f.f(uri2);
                            i++;
                        }
                    }
                } catch (IOException e2) {
                    this.e.l(1059);
                    dxth.k(e2, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                }
            } catch (IOException e3) {
                e = e3;
                this.e.l(1059);
                dxth.k(e, "%s: Failed to delete unaccounted file!", "ExpirationHandler");
                return i;
            }
        }
        return i;
    }
}
