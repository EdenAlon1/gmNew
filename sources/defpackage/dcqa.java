package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcqa {
    public final errl a;
    public final qqs b;
    private final Context c;

    public dcqa(Context context, errl errlVar) {
        this.c = context;
        this.a = errlVar;
        this.b = qpt.c(context);
    }

    public final Uri a(dcpz dcpzVar) {
        Uri d = cbgi.d("jpg", this.c);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(cbgi.i(d, this.c));
            try {
                dcpzVar.a(fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                return d;
            } finally {
            }
        } catch (IOException e) {
            cbgi.j(this.c, d);
            throw e;
        }
    }
}
