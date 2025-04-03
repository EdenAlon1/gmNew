package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crpr {
    private static final enru b = enru.c("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil");
    public final ffbr a;
    private final Context c;
    private final cbbu d;
    private final crji e;

    public crpr(Context context, cbbu cbbuVar, crji crjiVar, ffbr ffbrVar) {
        this.c = context;
        this.d = cbbuVar;
        this.e = crjiVar;
        this.a = ffbrVar;
    }

    public final Bitmap a(Context context, Uri uri, int i, int i2) {
        cbbk cbbkVar = (cbbk) this.d.b(new cban(this.e, uri, i, i2, true).f(context));
        try {
            if (cbbkVar == null) {
                return null;
            }
            try {
                try {
                    Bitmap d = cbbkVar.d();
                    d.getClass();
                    Bitmap d2 = ctap.d(d);
                    cbbkVar.q();
                    return d2;
                } catch (OutOfMemoryError unused) {
                    ensk j = b.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil", "getAvatarBitmapForNotification", 106, "AvatarImageUtil.java")).q("OOM creating avatarBitmap");
                    cbbkVar.q();
                    return null;
                }
            } catch (cbbj unused2) {
                ensk j2 = b.j();
                j2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil", "getAvatarBitmapForNotification", 108, "AvatarImageUtil.java")).q("Could not get bitmap from image type for building notifications");
                cbbkVar.q();
                return null;
            }
        } catch (Throwable th) {
            cbbkVar.q();
            throw th;
        }
    }

    public final Bitmap b(Context context, Uri uri, int i, int i2, int i3, boolean z) {
        cbbk cbbkVar = (cbbk) this.d.b(c(uri, i, i2, i3, z).f(context));
        if (cbbkVar == null) {
            return null;
        }
        try {
            return cbbkVar.d();
        } catch (cbbj unused) {
            ensk j = b.j();
            j.Y(ente.a, "Bugle");
            ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil", "getAvatarBitmapSync", 78, "AvatarImageUtil.java")).q("Could not retrieve avatar image bitmap from image type.");
            return null;
        }
    }

    public final cbbi c(Uri uri, int i, int i2, int i3, boolean z) {
        Uri uri2;
        int i4;
        boolean z2;
        int i5;
        if (Objects.equals(crjm.s(uri), "s")) {
            uri2 = uri;
            i4 = i2;
            z2 = z;
            i5 = i;
        } else {
            if (!crjm.x(this.c, uri)) {
                return new cbce(uri, i, i2, true, z, i3);
            }
            uri2 = uri;
            i5 = i;
            i4 = i2;
            z2 = z;
        }
        boolean z3 = z2;
        return new cban(this.e, uri2, i5, i4, z3);
    }

    public final Bitmap d(Context context, Uri uri, int i, int i2) {
        if (!csuu.C(uri)) {
            return null;
        }
        cbbz cbbzVar = new cbbz(context, new cbce(uri, i, i2, true, false, 0));
        cbbzVar.f = 0;
        cbbk cbbkVar = (cbbk) this.d.b(cbbzVar);
        try {
            if (cbbkVar == null) {
                return null;
            }
            try {
                Bitmap d = cbbkVar.d();
                d.getClass();
                Bitmap d2 = ctap.d(d);
                cbbkVar.q();
                return d2;
            } catch (cbbj unused) {
                ensk j = b.j();
                j.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j).h("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil", "getRemoteAvatarBitmap", 157, "AvatarImageUtil.java")).q("Could not get bitmap from image type for remote URI");
                cbbkVar.q();
                return null;
            } catch (OutOfMemoryError unused2) {
                ensk j2 = b.j();
                j2.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j2).h("com/google/android/apps/messaging/shared/util/avatar/AvatarImageUtil", "getRemoteAvatarBitmap", 155, "AvatarImageUtil.java")).q("OOM creating avatarBitmap from remote URI ");
                cbbkVar.q();
                return null;
            }
        } catch (Throwable th) {
            cbbkVar.q();
            throw th;
        }
    }
}
