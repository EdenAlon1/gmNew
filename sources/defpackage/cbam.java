package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import j$.util.OptionalInt;
import java.io.InputStream;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
public class cbam extends cbcd implements crjh {
    private static final entd g = entd.c("BugleImage");
    private final crji h;

    public cbam(Context context, crji crjiVar, cban cbanVar) {
        super(context, cbanVar);
        this.h = crjiVar;
    }

    @Override // defpackage.crjh
    public final Bitmap g(int i, int i2, int i3) {
        return m().b(i, i2, i3);
    }

    @Override // defpackage.cbcd, defpackage.cbbh
    protected cbbk h(List list) {
        Throwable th;
        cbam cbamVar = this;
        ekzz f = eleg.f("AvatarRequest.loadMediaInternal");
        try {
            efbd.b();
            Uri uri = ((cban) cbamVar.b).k;
            int i = 1;
            boolean z = csuu.w(uri) || "r".equals(crjm.s(uri));
            Bitmap bitmap = null;
            if (z) {
                try {
                    cbbk h = super.h(list);
                    bitmap = h.d();
                    i = h.d;
                } catch (Exception e) {
                    ((ensz) ((ensz) ((ensz) g.j()).g(e)).h("com/google/android/apps/messaging/shared/datamodel/media/avatar/AvatarRequest", "loadMediaInternal", 'n', "AvatarRequest.java")).q("failed to load local avatar resource, switching to fallback rendering.");
                }
            }
            int i2 = i;
            cban cbanVar = (cban) cbamVar.b;
            int i3 = cbanVar.b;
            int i4 = cbanVar.c;
            if (bitmap == null) {
                if (z && (uri = crjm.m(uri)) == null) {
                    uri = crjm.k(cbamVar.a);
                }
                Integer q = crjm.q(uri);
                String t = crjm.t(uri);
                String s = crjm.s(uri);
                if ("l".equals(s)) {
                    try {
                        bitmap = cbamVar.h.j(crjm.u(uri), t, i3, i4, q, this, false, OptionalInt.empty());
                        cbamVar = this;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        try {
                            f.close();
                            throw th;
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                            throw th;
                        }
                    }
                } else if ("z".equals(s)) {
                    crji crjiVar = cbamVar.h;
                    bitmap = crjiVar.i(t, i3, i4, true, false, q, cbamVar, false, false, false);
                } else if ("p".equals(s)) {
                    crji crjiVar2 = cbamVar.h;
                    bitmap = crjiVar2.i(t, i3, i4, false, false, q, cbamVar, true, false, false);
                } else if ("o".equals(s)) {
                    crji crjiVar3 = cbamVar.h;
                    bitmap = crjiVar3.i(t, i3, i4, false, false, q, cbamVar, false, true, false);
                } else if ("sm".equals(s)) {
                    crji crjiVar4 = cbamVar.h;
                    bitmap = crjiVar4.i(t, i3, i4, false, false, q, cbamVar, false, false, true);
                } else {
                    boolean equals = "b".equals(s);
                    crji crjiVar5 = cbamVar.h;
                    bitmap = crjiVar5.i(t, i3, i4, false, equals, q, cbamVar, false, false, false);
                }
            }
            cbaw cbawVar = new cbaw(cbamVar.f(), bitmap, i2, cbamVar.c, cbamVar.d);
            f.close();
            return cbawVar;
        } catch (Throwable th4) {
            th = th4;
            th = th;
            f.close();
            throw th;
        }
    }

    @Override // defpackage.cbcd, defpackage.cbbh
    protected final InputStream i() {
        Uri uri = ((cban) this.b).k;
        if (uri == null) {
            return null;
        }
        if (csuu.w(uri)) {
            return super.i();
        }
        Uri n = crjm.n(uri);
        if (n == null) {
            return null;
        }
        csix.k(csuu.w(n));
        try {
            this.a.getContentResolver().takePersistableUriPermission(n, 3);
        } catch (SecurityException unused) {
            ensk n2 = g.n();
            n2.Y(cbci.h, n);
            ((ensz) n2.h("com/google/android/apps/messaging/shared/datamodel/media/avatar/AvatarRequest", "getInputStreamForResource", 76, "AvatarRequest.java")).q("Failed to grant persistable URI permissions.");
        }
        return this.a.getContentResolver().openInputStream(n);
    }
}
