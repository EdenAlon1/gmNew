package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efbt {
    private final Context a;

    public efbt(Context context) {
        this.a = context;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final File a(Uri uri) {
        char c;
        Context createDeviceProtectedStorageContext;
        File filesDir;
        Context createDeviceProtectedStorageContext2;
        if (!uri.getScheme().equals("android")) {
            throw new efcv("Scheme must be 'android'");
        }
        if (uri.getPathSegments().isEmpty()) {
            throw new efcv(String.format("Path must start with a valid logical location: %s", uri));
        }
        if (!TextUtils.isEmpty(uri.getQuery())) {
            throw new efcv("Did not expect uri to have query");
        }
        ArrayList arrayList = new ArrayList(uri.getPathSegments());
        String str = (String) arrayList.get(0);
        switch (str.hashCode()) {
            case -1820761141:
                if (str.equals("external")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 94416770:
                if (str.equals("cache")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 97434231:
                if (str.equals("files")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 835260319:
                if (str.equals("managed")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 988548496:
                if (str.equals("directboot-cache")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 991565957:
                if (str.equals("directboot-files")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            createDeviceProtectedStorageContext = this.a.createDeviceProtectedStorageContext();
            filesDir = createDeviceProtectedStorageContext.getFilesDir();
        } else if (c == 1) {
            createDeviceProtectedStorageContext2 = this.a.createDeviceProtectedStorageContext();
            filesDir = createDeviceProtectedStorageContext2.getCacheDir();
        } else if (c == 2) {
            filesDir = efbq.b(this.a);
        } else if (c == 3) {
            filesDir = this.a.getCacheDir();
        } else if (c == 4) {
            File file = new File(efbq.b(this.a), "managed");
            if (arrayList.size() >= 3) {
                try {
                    if (!efbn.c(efbn.a((String) arrayList.get(2)))) {
                        throw new efcv("AccountManager cannot be null");
                    }
                } catch (IllegalArgumentException e) {
                    throw new efcv(e);
                }
            }
            filesDir = file;
        } else {
            if (c != 5) {
                throw new efcv(String.format("Path must start with a valid logical location: %s", uri));
            }
            filesDir = this.a.getExternalFilesDir(null);
        }
        return new File(filesDir, TextUtils.join(File.separator, arrayList.subList(1, arrayList.size())));
    }
}
