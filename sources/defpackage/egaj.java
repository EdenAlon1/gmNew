package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import com.android.vcard.VCardConfig;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.user.profile.photopicker.common.view.SquareImageView;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class egaj {
    public static final enip a = enip.s("android.resource", "content", "file");
    private final emxc b;
    private final Resources c;
    private final dulp d = new dulp();

    public egaj(emxc emxcVar, Resources resources) {
        this.b = emxcVar;
        this.c = resources;
    }

    private static qqo i(qqo qqoVar) {
        return (qqo) qqoVar.D(fdrm.a.get().q() ? qvx.e : qvx.c);
    }

    private final qqo j(qqo qqoVar, egal egalVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = egalVar.a.iterator();
        while (it.hasNext()) {
            int ordinal = ((egak) it.next()).ordinal();
            if (ordinal == 0) {
                arrayList.add(new rct());
            } else if (ordinal == 1) {
                arrayList.add(new reg(this.c.getDimensionPixelSize(R.dimen.photo_picker_corner_crop_radius)));
            } else if (ordinal == 2) {
                arrayList.add(new rcv());
            } else if (ordinal == 3) {
                arrayList.add(new rdq());
            } else if (ordinal == 4) {
                arrayList.add(new rcu());
            }
        }
        return (qqo) qqoVar.Z((qty[]) arrayList.toArray(new rcq[0]));
    }

    private final qqo k(Context context, Uri uri, egal egalVar) {
        return b(qpt.c(context).b(), uri, egalVar);
    }

    public final qqo a(Context context, Uri uri, egal egalVar) {
        return b(qpt.c(context).c(), uri, egalVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [egae] */
    public final qqo b(qqo qqoVar, Uri uri, egal egalVar) {
        if (egalVar.a.contains(egak.FORCE_SOFTWARE_BITMAP)) {
            qqoVar = (qqo) qqoVar.C();
        }
        qqo i = i(j(qqoVar, egalVar));
        if (this.d.b(uri)) {
            duie duieVar = new duie();
            if (egalVar.a.contains(egak.CENTER_CROP)) {
                duieVar.c(VCardConfig.FLAG_REFRAIN_PHONE_NUMBER_FORMATTING);
            }
            if (egalVar.a.contains(egak.FORCE_MONOGRAM)) {
                duieVar.c(VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            }
            emxc emxcVar = this.b;
            uri = new egae(new duhq(uri.toString(), duieVar, emxcVar.g() ? ((Integer) ((efzx) emxcVar.c()).a.e(-1)).intValue() : -1));
        }
        return (qqo) i.k(uri).V(rbv.a, 7500);
    }

    public final void c(ImageView imageView) {
        qpt.e(imageView).k(imageView);
    }

    public final void d(Bitmap bitmap, egal egalVar, ImageView imageView) {
        i(j(qpt.c(imageView.getContext()).c(), egalVar)).g(bitmap).v(imageView);
    }

    public final void e(Context context, Uri uri, egal egalVar, rix rixVar, rif rifVar) {
        qqo k = k(context, uri, egalVar);
        if (a.contains(uri.getScheme())) {
            k = (qqo) ((qqo) k.D(qvx.c)).ai();
        }
        ((qqo) k.a(rifVar).z()).w(rixVar);
    }

    public final void f(Uri uri, egal egalVar, ImageView imageView) {
        ((qqo) a(imageView.getContext(), uri, egalVar).T(qqe.NORMAL)).v(imageView);
    }

    public final void g(Uri uri, egal egalVar, SquareImageView squareImageView) {
        h(uri, egalVar, squareImageView, qqe.NORMAL);
    }

    public final void h(Uri uri, egal egalVar, SquareImageView squareImageView, qqe qqeVar) {
        ((qqo) k(squareImageView.getContext(), uri, egalVar).T(qqeVar)).w(squareImageView.b);
    }
}
