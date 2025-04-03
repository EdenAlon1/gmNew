package defpackage;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dgbu {
    public final Context a;
    public final List b = new ArrayList();

    public dgbu(Context context) {
        this.a = context;
    }

    public static File d(Context context) {
        return context.getDir("dg_cache", 0);
    }

    public static void f(File file, File file2) {
        if (file.renameTo(file2)) {
            return;
        }
        throw new dgbp("Failed to rename " + String.valueOf(file) + " -> " + String.valueOf(file2) + ".");
    }

    public static final void g(dgbw dgbwVar) {
        File file = dgbwVar.b;
        try {
            if (!file.exists() && !file.createNewFile()) {
                throw new dgbp(a.b(dgbwVar, "Failed to touch last-used file for ", "."));
            }
            if (!file.setLastModified(System.currentTimeMillis())) {
                throw new dgbp(a.b(dgbwVar, "Failed to update last-used timestamp for ", "."));
            }
        } catch (IOException e) {
            throw new dgbp(a.c(e, dgbwVar, "Failed to touch last-used file for ", ": "));
        }
    }

    public final dgbw a() {
        return b("tmp_".concat(String.valueOf(UUID.randomUUID().toString())));
    }

    public final dgbw b(String str) {
        dgwl dgwlVar = dgwj.a;
        File file = new File(dgwk.a(d(this.a), str));
        dgbs dgbsVar = new dgbs(file, "the.apk");
        dgwl dgwlVar2 = dgwj.a;
        File file2 = new File(dgwk.a(file, "opt"));
        dgwl dgwlVar3 = dgwj.a;
        return new dgbw(dgbsVar, file2, new File(dgwk.a(file, "t")));
    }

    public final dgbw c(dgbx dgbxVar) {
        dgbw b = b(dgbxVar.a);
        if (!b.c()) {
            return null;
        }
        g(b);
        return b;
    }

    public final void e() {
        for (File file : this.b) {
            if (!dgcf.a(file)) {
                Log.e("DG", a.F(file, "Failed to clean up temporary file ", "."));
            }
        }
        this.b.clear();
    }
}
