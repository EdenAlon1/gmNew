package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rbj implements rao {
    private final rao a;

    public rbj(rao raoVar) {
        this.a = raoVar;
    }

    private static Uri c(String str) {
        return Uri.fromFile(new File(str));
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        Uri c;
        String str = (String) obj;
        if (TextUtils.isEmpty(str)) {
            c = null;
        } else if (str.charAt(0) == '/') {
            c = c(str);
        } else {
            Uri parse = Uri.parse(str);
            c = parse.getScheme() == null ? c(str) : parse;
        }
        if (c == null || !this.a.b(c)) {
            return null;
        }
        return this.a.a(c, i, i2, qtuVar);
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
