package defpackage;

import android.content.Context;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import com.google.android.ims.rcsmigration.File;
import j$.net.URLEncoder;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkmi {
    private static dkmi a;

    private dkmi() {
    }

    public static dkmi a() {
        if (a == null) {
            a = new dkmi();
        }
        return a;
    }

    public static final String c(djtw djtwVar) {
        String str;
        ImsConfiguration n = djtwVar.c().n();
        if (n == null || (str = n.mPublicIdentity) == null) {
            return null;
        }
        try {
            return a.v(URLEncoder.encode(str, StandardCharsets.UTF_8.name()), "_groupsessions.xml");
        } catch (UnsupportedEncodingException e) {
            dkty.i(e, "URLEncoder does not support UTF-8 encoding", new Object[0]);
            return null;
        }
    }

    public static final File d(Context context, String str) {
        try {
            FileInputStream openFileInput = context.openFileInput(str);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            dfwv.n(openFileInput);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = openFileInput.read(bArr);
                if (read == -1) {
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    dkug.a(openFileInput);
                    return new File(str, byteArray);
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } catch (FileNotFoundException e) {
            dkty.i(e, "File not found.", new Object[0]);
            return null;
        } catch (IOException e2) {
            dkty.i(e2, "Error while converting file to byte[]", new Object[0]);
            return null;
        }
    }

    public final synchronized void b(Context context, djtw djtwVar) {
        dkty.c("Clearing legacy data", new Object[0]);
        dkrx dkrxVar = new dkrx(context);
        djtwVar.c().B();
        csjy.c("RcsProvisioning", "Clearing backup token");
        dkrw d = djtwVar.d();
        d.f("token_value");
        d.f("token_expiration");
        dipg dipgVar = new dipg(context);
        dipgVar.a();
        dipgVar.close();
        dkty.k("Deleted transfers file: %s", Boolean.valueOf(new java.io.File("httpft_pending").delete()));
        String c = c(djtwVar);
        if (c != null) {
            dkty.k("Deleted conferences file: %s", Boolean.valueOf(new java.io.File(c).delete()));
        }
        dkrxVar.a.f("msisdn");
        dkrxVar.a.f("sim_serial_number");
        dkrxVar.a.f("sessionid");
    }
}
