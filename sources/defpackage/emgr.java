package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class emgr implements emgq {
    private final Context a;
    private final enru b;

    public emgr(Context context) {
        context.getClass();
        this.a = context;
        this.b = enru.c("com/google/chat/smartmessaging/penpal/ui/util/BitmapSaverImpl");
    }

    @Override // defpackage.emgq
    public final Object a(Bitmap bitmap, Uri uri, boolean z) {
        eyee eyeeVar = eyee.b;
        eyed eyedVar = new eyed();
        try {
            if (!bitmap.compress(Bitmap.CompressFormat.PNG, 100, eyedVar)) {
                throw new Exception("Could not compress image");
            }
            ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(eepn.a(this.a, uri, "w", z ? eepm.a : eepm.c).getParcelFileDescriptor());
            try {
                autoCloseOutputStream.write(eyedVar.b().I());
                ffig.a(autoCloseOutputStream, null);
                return uri;
            } finally {
            }
        } catch (FileNotFoundException e) {
            ((enrr) this.b.i().h("com/google/chat/smartmessaging/penpal/ui/util/BitmapSaverImpl", "saveToStorage", 57, "BitmapSaverImpl.kt")).t("Could not open output uri for writing. Error: %s", e.getMessage());
            return null;
        } catch (IOException e2) {
            ((enrr) this.b.i().h("com/google/chat/smartmessaging/penpal/ui/util/BitmapSaverImpl", "saveToStorage", 59, "BitmapSaverImpl.kt")).t("Could not write file. Error: %s", e2.getMessage());
            return null;
        }
    }
}
