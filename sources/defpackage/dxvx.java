package defpackage;

import android.content.Context;
import android.net.Uri;
import android.system.ErrnoException;
import android.system.Os;
import java.io.IOException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxvx {
    public static Uri a(Context context, Uri uri) {
        try {
            String readlink = Os.readlink(new efbt(context).a(uri).getAbsolutePath());
            if (readlink == null) {
                throw new IOException("Unable to read symlink");
            }
            Pattern pattern = efbs.a;
            efbr efbrVar = new efbr(context);
            efbrVar.b(readlink);
            return efbrVar.a();
        } catch (ErrnoException | efcv e) {
            throw new IOException("Unable to read symlink", e);
        }
    }

    public static void b(Context context, Uri uri, Uri uri2) {
        try {
            efbt efbtVar = new efbt(context);
            Os.symlink(efbtVar.a(uri2).getAbsolutePath(), efbtVar.a(uri).getAbsolutePath());
        } catch (ErrnoException | efcv e) {
            throw new IOException("Unable to create symlink", e);
        }
    }
}
