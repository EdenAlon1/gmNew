package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxsf {
    private static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static String a(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length + length];
        int i = 0;
        for (byte b : bArr) {
            char[] cArr2 = a;
            cArr[i] = cArr2[(b & 255) >>> 4];
            cArr[i + 1] = cArr2[b & 15];
            i += 2;
        }
        return new String(cArr);
    }

    public static String b(efbm efbmVar, Uri uri) {
        String a2;
        try {
            InputStream inputStream = (InputStream) efbmVar.c(uri, new efdy());
            try {
                MessageDigest e = e();
                if (e == null) {
                    a2 = "";
                } else {
                    byte[] bArr = new byte[8192];
                    for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                        e.update(bArr, 0, read);
                    }
                    a2 = a(e.digest());
                }
                if (inputStream != null) {
                    inputStream.close();
                }
                return a2;
            } finally {
            }
        } catch (IOException unused) {
            dxth.h("%s: Failed to open file, uri = %s", "FileValidator", uri);
            return "";
        }
    }

    public static void c(efbm efbmVar, dwsi dwsiVar, Uri uri, String str) {
        long j;
        try {
            if (!efbmVar.h(uri)) {
                dxth.i("%s: Downloaded file %s is not present at %s", "FileValidator", dxvk.e(dwsiVar), uri);
                dwql a2 = dwqn.a();
                a2.a = dwqm.DOWNLOADED_FILE_NOT_FOUND_ERROR;
                throw a2.a();
            }
            int a3 = dwsh.a(dwsiVar.f);
            if (a3 != 0 && a3 == 2) {
                return;
            }
            if (d(efbmVar, uri, str)) {
                return;
            }
            try {
                j = efbmVar.a(uri);
            } catch (IOException unused) {
                j = -1;
            }
            dxth.i("%s: Downloaded file at uri = %s, checksum = %s, size = %s verification failed", "FileValidator", uri, str, Long.valueOf(j));
            dwql a4 = dwqn.a();
            a4.a = dwqm.DOWNLOADED_FILE_CHECKSUM_MISMATCH_ERROR;
            throw a4.a();
        } catch (IOException e) {
            dxth.k(e, "%s: Failed to validate download file %s", "FileValidator", dxvk.e(dwsiVar));
            dwql a5 = dwqn.a();
            a5.a = dwqm.UNABLE_TO_VALIDATE_DOWNLOAD_FILE_ERROR;
            a5.c = e;
            throw a5.a();
        }
    }

    public static boolean d(efbm efbmVar, Uri uri, String str) {
        return b(efbmVar, uri).equals(str);
    }

    public static MessageDigest e() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA1");
            if (messageDigest != null) {
                return messageDigest;
            }
            return null;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
