package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class euvb {
    private File a;
    private final eumr b;

    public euvb(eumr eumrVar) {
        this.b = eumrVar;
    }

    private final File c() {
        if (this.a == null) {
            synchronized (this) {
                if (this.a == null) {
                    this.a = new File(this.b.a().getFilesDir(), "PersistedInstallation." + this.b.h() + ".json");
                }
            }
        }
        return this.a;
    }

    public final euvd a() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            FileInputStream fileInputStream = new FileInputStream(c());
            while (true) {
                try {
                    int read = fileInputStream.read(bArr, 0, 16384);
                    if (read < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStream.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String optString = jSONObject.optString("Fid", null);
        int optInt = jSONObject.optInt("Status", 0);
        String optString2 = jSONObject.optString("AuthToken", null);
        String optString3 = jSONObject.optString("RefreshToken", null);
        long optLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long optLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String optString4 = jSONObject.optString("FisError", null);
        euvc i = euvd.i();
        euuy euuyVar = (euuy) i;
        euuyVar.a = optString;
        i.c(new int[]{1, 2, 3, 4, 5}[optInt]);
        euuyVar.b = optString2;
        euuyVar.c = optString3;
        i.d(optLong);
        i.b(optLong2);
        euuyVar.d = optString4;
        return i.a();
    }

    public final void b(euvd euvdVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", ((euuz) euvdVar).a);
            int i = ((euuz) euvdVar).g;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            jSONObject.put("Status", i2);
            jSONObject.put("AuthToken", ((euuz) euvdVar).b);
            jSONObject.put("RefreshToken", ((euuz) euvdVar).c);
            jSONObject.put("TokenCreationEpochInSecs", ((euuz) euvdVar).e);
            jSONObject.put("ExpiresInSecs", ((euuz) euvdVar).d);
            jSONObject.put("FisError", ((euuz) euvdVar).f);
            File createTempFile = File.createTempFile("PersistedInstallation", "tmp", this.b.a().getFilesDir());
            FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
            fileOutputStream.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStream.close();
            if (!createTempFile.renameTo(c())) {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }
}
