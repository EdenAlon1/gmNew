package defpackage;

import android.content.Context;
import com.google.android.libraries.glide.fife.module.FifeGlideModule;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
final class qqm {
    public static void a(Context context, qpt qptVar, qqk qqkVar, List list, rhl rhlVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FifeGlideModule fifeGlideModule = (FifeGlideModule) it.next();
            try {
                qqkVar.j(String.class, InputStream.class, new duia());
                qqkVar.j(String.class, ByteBuffer.class, new duhz());
                qqkVar.g(duhq.class, ByteBuffer.class, new duhw());
                qqkVar.g(duhq.class, InputStream.class, new duhx());
            } catch (AbstractMethodError e) {
                throw new IllegalStateException("Attempting to register a Glide v3 module. If you see this, you or one of your dependencies may be including Glide v3 even though you're using Glide v4. You'll need to find and remove (or update) the offending dependency. The v3 module name is: ".concat(String.valueOf(fifeGlideModule.getClass().getName())), e);
            }
        }
        if (rhlVar != null) {
            rhlVar.d(context, qptVar, qqkVar);
        }
    }
}
