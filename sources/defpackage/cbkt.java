package defpackage;

import android.net.Uri;
import com.android.vcard.VCardConstants;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cbkt implements cbjw {
    public static final cskc a = cskc.g("BugleDataModel", "HandlersToDownloadCallbackAdapter");
    public final Set b = new CopyOnWriteArraySet();
    private final errl c;
    private final errl d;

    public cbkt(errl errlVar, errl errlVar2) {
        this.c = errlVar;
        this.d = errlVar2;
    }

    @Override // defpackage.cbjw
    public final void a(final Uri uri, Throwable th) {
        csjb e = a.e();
        e.I("Download failed, notifying callbacks");
        e.A(VCardConstants.PROPERTY_URL, uri);
        e.s(th);
        for (final cblo cbloVar : this.b) {
            c(new Runnable() { // from class: cbkp
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        cblo.this.b(uri.toString());
                    } catch (RuntimeException e2) {
                        cbkt.a.s("Error while calling #onFailure", e2);
                    }
                }
            });
        }
        this.b.clear();
    }

    final void b(Set set) {
        this.b.addAll(set);
    }

    public final void c(Runnable runnable) {
        elfr.l(elfo.f(runnable, this.c), new cbks(), this.d);
    }
}
