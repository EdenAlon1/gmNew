package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyjh implements Callable {
    private final String a;
    private final File b;

    public dyjh(Context context, String str) {
        this.a = str;
        this.b = context.getCacheDir();
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Bitmap call() {
        try {
            dyhj.a();
            String str = Long.toString(System.currentTimeMillis(), 16) + Long.toString(System.nanoTime(), 16) + ".jpg";
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.a).openConnection();
            httpURLConnection.setConnectTimeout((int) fdpb.a.get().a());
            httpURLConnection.setReadTimeout((int) fdpb.a.get().b());
            BufferedInputStream bufferedInputStream = new BufferedInputStream(httpURLConnection.getInputStream());
            File createTempFile = File.createTempFile(str, ".jpg", this.b);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(createTempFile));
            byte[] bArr = new byte[256];
            while (true) {
                int read = bufferedInputStream.read(bArr);
                if (read < 0) {
                    bufferedOutputStream.flush();
                    bufferedOutputStream.close();
                    bufferedInputStream.close();
                    FileInputStream fileInputStream = new FileInputStream(createTempFile);
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeStream(fileInputStream, null, options);
                    int i = options.outWidth;
                    int i2 = options.outHeight;
                    float c = fdpb.a.get().c();
                    int max = (int) Math.max(i / c, i2 / c);
                    fileInputStream.close();
                    BitmapFactory.Options options2 = new BitmapFactory.Options();
                    options2.inSampleSize = max;
                    options2.inJustDecodeBounds = false;
                    FileInputStream fileInputStream2 = new FileInputStream(createTempFile);
                    Bitmap decodeStream = BitmapFactory.decodeStream(fileInputStream2, null, options2);
                    fileInputStream2.close();
                    createTempFile.delete();
                    return decodeStream;
                }
                bufferedOutputStream.write(bArr, 0, read);
            }
        } catch (FileNotFoundException e) {
            dyhr.d("DownloadUtils", "ImageUrl path is no longer valid: ".concat(String.valueOf(this.a)), e);
            throw new RuntimeException(e);
        } catch (MalformedURLException e2) {
            dyhr.d("DownloadUtils", "ImageUrl path is not valid: ".concat(String.valueOf(this.a)), e2);
            throw new RuntimeException(e2);
        } catch (Exception e3) {
            dyhr.d("DownloadUtils", "Exception encountered trying to fetch image.", e3);
            return null;
        }
    }
}
