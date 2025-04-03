package defpackage;

import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rbb implements rao {
    private final rao a;
    private final Resources b;

    public rbb(Resources resources, rao raoVar) {
        this.b = resources;
        this.a = raoVar;
    }

    private final Uri c(Integer num) {
        try {
            return Uri.parse("android.resource://" + this.b.getResourcePackageName(num.intValue()) + "/" + this.b.getResourceTypeName(num.intValue()) + "/" + this.b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e) {
            if (!Log.isLoggable("ResourceLoader", 5)) {
                return null;
            }
            Objects.toString(num);
            Log.w("ResourceLoader", "Received invalid resource id: ".concat(String.valueOf(num)), e);
            return null;
        }
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ ran a(Object obj, int i, int i2, qtu qtuVar) {
        Uri c = c((Integer) obj);
        if (c == null) {
            return null;
        }
        return this.a.a(c, i, i2, qtuVar);
    }

    @Override // defpackage.rao
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return true;
    }
}
