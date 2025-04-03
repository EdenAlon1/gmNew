package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.net.Uri;
import com.google.android.libraries.smartmessaging.expressivetext.impl.ExpressiveTextContext;
import com.google.android.libraries.smartmessaging.expressivetext.impl.opengl.GLTextureView;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.FileOutputStream;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcwc implements dcvw {
    public final Context a;
    public final eept b;
    private final errl c;
    private final errm d;
    private final ekmz e;

    public dcwc(Context context, eept eeptVar, errl errlVar, errm errmVar, ekmz ekmzVar) {
        this.b = eeptVar;
        this.a = context;
        this.c = errlVar;
        this.d = errmVar;
        this.e = ekmzVar;
    }

    @Override // defpackage.dcvw
    public final elfl a(Uri uri, final GLTextureView gLTextureView) {
        return elfl.g(qsl.a(this.e.b().i(uri))).i(new eroh() { // from class: dcvx
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final Bitmap bitmap = (Bitmap) obj;
                final dcwc dcwcVar = dcwc.this;
                final GLTextureView gLTextureView2 = gLTextureView;
                return kfg.a(new kfd() { // from class: dcwb
                    @Override // defpackage.kfd
                    public final Object a(final kfb kfbVar) {
                        final dcwc dcwcVar2 = dcwc.this;
                        final Bitmap bitmap2 = bitmap;
                        Runnable runnable = new Runnable() { // from class: dcwa
                            @Override // java.lang.Runnable
                            public final void run() {
                                final Bitmap bitmap3 = bitmap2;
                                final kfb kfbVar2 = kfbVar;
                                eeqb b = dcwc.this.b.b();
                                int width = bitmap3.getWidth();
                                int height = bitmap3.getHeight();
                                ffji ffjiVar = new ffji() { // from class: dcvz
                                    @Override // defpackage.ffji
                                    public final Object invoke(Object obj2) {
                                        Bitmap bitmap4 = bitmap3;
                                        Bitmap createBitmap = Bitmap.createBitmap(bitmap4.getWidth(), bitmap4.getHeight(), bitmap4.getConfig());
                                        Canvas canvas = new Canvas(createBitmap);
                                        canvas.drawBitmap(bitmap4, new Matrix(), null);
                                        canvas.drawBitmap((Bitmap) obj2, 0.0f, 0.0f, (Paint) null);
                                        kfbVar2.b(createBitmap);
                                        return ffcu.a;
                                    }
                                };
                                ExpressiveTextContext expressiveTextContext = b.a;
                                if (expressiveTextContext.p()) {
                                    int i = b.c;
                                    if (i < 0) {
                                        i = expressiveTextContext.a();
                                        b.c = i;
                                    }
                                    if (width > i && width > height) {
                                        height = (int) ((height * i) / width);
                                        width = i;
                                    } else if (height > i) {
                                        width = (int) ((width * i) / height);
                                        height = i;
                                    }
                                    Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                                    createBitmap.getClass();
                                    b.a.u(createBitmap);
                                    ffjiVar.invoke(createBitmap);
                                }
                            }
                        };
                        eeqi eeqiVar = gLTextureView2.c;
                        synchronized (GLTextureView.a) {
                            eeqiVar.j.add(runnable);
                            GLTextureView.a.notifyAll();
                        }
                        return "ExpressiveText.onExportSelected and merge operation.";
                    }
                });
            }
        }, this.d).h(new emwl() { // from class: dcvy
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                Context context = dcwc.this.a;
                Uri d = cbgi.d("jpg", context);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(cbgi.i(d, context));
                    try {
                        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                        fileOutputStream.close();
                        return d;
                    } finally {
                    }
                } catch (IOException unused) {
                    return Uri.EMPTY;
                }
            }
        }, this.c);
    }
}
