package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbp extends efeg {
    private final Context a;
    private final efef b;
    private final efef c;
    private final Object d = new Object();
    private String e;

    public efbp(efbo efboVar) {
        this.b = new efce(efboVar.c);
        this.a = efboVar.a;
        this.c = efboVar.b;
    }

    private final void s() {
        if (this.c == null) {
            throw new efci("Android backend cannot perform remote operations without a remote backend");
        }
    }

    private final boolean t(Uri uri) {
        return (TextUtils.isEmpty(uri.getAuthority()) || this.a.getPackageName().equals(uri.getAuthority())) ? false : true;
    }

    @Override // defpackage.efeg, defpackage.efef
    public final Pair b(Uri uri) {
        if (!t(uri)) {
            return this.b.b(q(uri));
        }
        s();
        return this.c.b(uri);
    }

    @Override // defpackage.efeg, defpackage.efef
    public final File d(Uri uri) {
        String str;
        if (t(uri)) {
            throw new IOException("operation is not permitted in other authorities.");
        }
        File a = new efbt(this.a).a(uri);
        if (!dubc.e(this.a)) {
            synchronized (this.d) {
                if (this.e == null) {
                    this.e = efbq.a(this.a).getAbsolutePath();
                }
                str = this.e;
            }
            if (!a.getAbsolutePath().startsWith(str)) {
                throw new efci("Cannot access credential-protected data from direct boot");
            }
        }
        return a;
    }

    @Override // defpackage.efeg, defpackage.efef
    public final InputStream e(Uri uri) {
        if (!t(uri)) {
            return this.b.e(q(uri));
        }
        s();
        return this.c.e(uri);
    }

    @Override // defpackage.efef
    public final String i() {
        return "android";
    }

    @Override // defpackage.efeg, defpackage.efef
    public final boolean n(Uri uri) {
        if (!t(uri)) {
            return this.b.n(q(uri));
        }
        s();
        return this.c.n(uri);
    }

    @Override // defpackage.efeg
    protected final Uri p(Uri uri) {
        try {
            Context context = this.a;
            Pattern pattern = efbs.a;
            efbr efbrVar = new efbr(context);
            efbrVar.b(uri.getPath());
            return efbrVar.a();
        } catch (IllegalArgumentException e) {
            throw new efcv(e);
        }
    }

    @Override // defpackage.efeg
    protected final Uri q(Uri uri) {
        if (t(uri)) {
            throw new efcv("Operation across authorities is not allowed.");
        }
        File d = d(uri);
        Uri.Builder path = new Uri.Builder().scheme("file").authority("").path("/");
        int i = engw.d;
        engr engrVar = new engr();
        efcb.b(d, path);
        return efcb.a(path, engrVar);
    }

    @Override // defpackage.efeg
    protected final efef r() {
        return this.b;
    }
}
