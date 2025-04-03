package defpackage;

import android.util.Base64;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dlbo extends ffhv implements ffjm {
    final /* synthetic */ dlbp a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dlbo(dlbp dlbpVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.a = dlbpVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((dlbo) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        URLConnection openConnection = new URL(this.a.b.a.concat("/on-device-safety/bt_log_signature_key.txt")).openConnection();
        openConnection.getClass();
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        try {
            try {
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    throw new RuntimeException("BT log key fetch failed with status " + httpURLConnection.getResponseCode());
                }
                InputStream inputStream = httpURLConnection.getInputStream();
                inputStream.getClass();
                byte[] a = ffif.a(inputStream instanceof BufferedInputStream ? (BufferedInputStream) inputStream : new BufferedInputStream(inputStream, 8192));
                httpURLConnection.getInputStream().close();
                httpURLConnection.disconnect();
                try {
                    byte[] decode = Base64.decode(a, 0);
                    decode.getClass();
                    return decode;
                } catch (IllegalArgumentException e) {
                    throw new RuntimeException("Invalid base-64 encoding for BT log key.", e);
                }
            } catch (IOException e2) {
                throw new RuntimeException("Error fetching BT log key.", e2);
            }
        } catch (Throwable th) {
            httpURLConnection.getInputStream().close();
            httpURLConnection.disconnect();
            throw th;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        return new dlbo(this.a, ffguVar);
    }
}
