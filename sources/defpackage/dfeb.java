package defpackage;

import com.google.android.gms.common.api.Status;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dfeb implements Runnable {
    public static final /* synthetic */ int b = 0;
    private static final dfxq c = new dfxq("RevokeAccessOperation", new String[0]);
    public final dfuk a;
    private final String d;

    public dfeb(String str) {
        dfwv.l(str);
        this.d = str;
        this.a = new dfuk(null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        Status status = Status.c;
        try {
            URL url = new URL("https://accounts.google.com/o/oauth2/revoke?token=" + this.d);
            int i = dgxu.b;
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestProperty(fhpi.a, "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.a;
            } else {
                c.c("Unable to revoke access!", new Object[0]);
            }
            c.b(a.h(responseCode, "Response Code: "), new Object[0]);
        } catch (IOException e) {
            c.c("IOException when revoking access: ".concat(String.valueOf(e.toString())), new Object[0]);
        } catch (Exception e2) {
            c.c("Exception when revoking access: ".concat(String.valueOf(e2.toString())), new Object[0]);
        }
        this.a.l(status);
    }
}
