package defpackage;

import android.content.Context;
import java.io.File;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class faez {
    public static volatile faez a;
    public String b;
    public int c = 0;

    public faez(Context context) {
        for (File file : context.getFilesDir().listFiles(new faey())) {
            fadr.a(file);
        }
        this.b = a(context);
    }

    public final String a(Context context) {
        File file = new File(context.getFilesDir(), "XenoEffectBuilderSandboxes_".concat(String.valueOf(String.valueOf(UUID.randomUUID()))));
        if (file.mkdirs()) {
            return file.getPath();
        }
        return null;
    }
}
