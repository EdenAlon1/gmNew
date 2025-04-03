package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbr {
    public String a;
    public final engr b;
    private final Context c;
    private String d = "files";
    private String e = "common";
    private Account f = efbs.b;
    private String g = "";

    public efbr(Context context) {
        int i = engw.d;
        this.b = new engr();
        efdh.a(context != null, "Context cannot be null", new Object[0]);
        this.c = context;
        this.a = context.getPackageName();
    }

    public final Uri a() {
        return new Uri.Builder().scheme("android").authority(this.a).path("/" + this.d + "/" + this.e + "/" + efbn.b(this.f) + "/" + this.g).encodedFragment(efdg.a(this.b.g())).build();
    }

    public final void b(String str) {
        String substring;
        File b = efbq.b(this.c);
        String absolutePath = new File(b, "managed").getAbsolutePath();
        if (str.startsWith(absolutePath)) {
            e("managed");
            substring = str.substring(absolutePath.length());
        } else {
            String absolutePath2 = b.getAbsolutePath();
            if (str.startsWith(absolutePath2)) {
                e("files");
                substring = str.substring(absolutePath2.length());
            } else {
                String absolutePath3 = this.c.getCacheDir().getAbsolutePath();
                if (str.startsWith(absolutePath3)) {
                    e("cache");
                    substring = str.substring(absolutePath3.length());
                } else {
                    File externalFilesDir = this.c.getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        String absolutePath4 = externalFilesDir.getAbsolutePath();
                        if (str.startsWith(absolutePath4)) {
                            e("external");
                            substring = str.substring(absolutePath4.length());
                        }
                    }
                    File a = efbq.a(this.c);
                    String absolutePath5 = new File(a, "files").getAbsolutePath();
                    if (str.startsWith(absolutePath5)) {
                        e("directboot-files");
                        substring = str.substring(absolutePath5.length());
                    } else {
                        String absolutePath6 = new File(a, "cache").getAbsolutePath();
                        if (!str.startsWith(absolutePath6)) {
                            throw new IllegalArgumentException("Path must be in app-private files dir or external files dir: ".concat(String.valueOf(str)));
                        }
                        e("directboot-cache");
                        substring = str.substring(absolutePath6.length());
                    }
                }
            }
        }
        List asList = Arrays.asList(substring.split(File.separator));
        efdh.a(asList.size() >= 3, "Path must be in module and account subdirectories: %s", str);
        f((String) asList.get(1));
        String str2 = (String) asList.get(2);
        if (!"managed".equals(this.d) || efbn.d(str2)) {
            c(efbn.a(str2));
            g(substring.substring(this.e.length() + str2.length() + 2));
            return;
        }
        try {
            Integer.parseInt(str2);
            efdh.a(false, "AccountManager cannot be null", new Object[0]);
            try {
                throw null;
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalArgumentException(new efcv(e));
            } catch (ExecutionException e2) {
                throw new IllegalArgumentException(new efcv(e2.getCause()));
            }
        } catch (NumberFormatException e3) {
            throw new IllegalArgumentException(e3);
        }
    }

    public final void c(Account account) {
        efbn.b(account);
        this.f = account;
    }

    public final void d() {
        e("directboot-files");
    }

    public final void e(String str) {
        efdh.a(efbs.d.contains(str), "The only supported locations are %s: %s", efbs.d, str);
        this.d = str;
    }

    public final void f(String str) {
        efdh.a(efbs.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        efdh.a(!efbs.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.e = str;
    }

    public final void g(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = efbs.a;
        this.g = str;
    }
}
