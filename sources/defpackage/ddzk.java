package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.apps.messaging.ui.vcard.VCardDetailFragment;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ddzk extends cslh {
    final /* synthetic */ Uri a;
    final /* synthetic */ VCardDetailFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ddzk(VCardDetailFragment vCardDetailFragment, Uri uri) {
        super("Bugle.Async.VCardDetailFragment.onOptionsItemSelected.Duration");
        this.a = uri;
        this.b = vCardDetailFragment;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ Object a(Object[] objArr) {
        VCardDetailFragment vCardDetailFragment = this.b;
        Uri uri = vCardDetailFragment.d;
        return uri != null ? uri : cbgi.f(this.a, vCardDetailFragment.G());
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        Uri uri = (Uri) obj;
        if (uri != null) {
            Uri e = cbgi.e(this.b.z(), uri);
            VCardDetailFragment vCardDetailFragment = this.b;
            vCardDetailFragment.d = e;
            if (vCardDetailFragment.G() != null) {
                String m = ((bcyd) vCardDetailFragment.a.a()).m();
                if (!TextUtils.isEmpty(m)) {
                    synchronized (cbgi.a) {
                        cbgi.a.put(e, m);
                    }
                }
                VCardDetailFragment vCardDetailFragment2 = this.b;
                vCardDetailFragment2.ag.b(vCardDetailFragment2.G(), e);
            }
        }
    }
}
