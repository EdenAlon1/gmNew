package defpackage;

import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djqt {
    public final Context a;
    public final ctud b;

    public djqt(Context context, ctud ctudVar) {
        this.a = context;
        this.b = ctudVar;
    }

    public final InputStream a(String str) {
        try {
            return this.a.openFileInput(str);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public final InputStream b(String str) {
        Context context = this.a;
        InputStream openInputStream = context.getContentResolver().openInputStream(Uri.parse(str));
        openInputStream.getClass();
        return openInputStream;
    }

    public final OutputStream c(String str) {
        try {
            return this.a.openFileOutput(str, 0);
        } catch (FileNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    public final String d() {
        return String.valueOf(e()).concat("/rcs/files/");
    }

    public final String e() {
        return this.a.getFilesDir().getPath();
    }
}
