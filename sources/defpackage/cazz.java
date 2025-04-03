package defpackage;

import android.content.Context;
import android.net.Uri;
import com.android.vcard.VCardEntry;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cazz implements cbcf {
    final CountDownLatch a;
    final /* synthetic */ cbaa b;

    public cazz(cbaa cbaaVar, CountDownLatch countDownLatch) {
        this.b = cbaaVar;
        this.a = countDownLatch;
    }

    @Override // defpackage.cbcf
    public final void a() {
        if (!this.b.f.isEmpty()) {
            cbaa cbaaVar = this.b;
            cbal cbalVar = cbaaVar.b;
            ffbr ffbrVar = cbalVar.a;
            String f = cbaaVar.f();
            Context context = (Context) ffbrVar.b();
            context.getClass();
            cqoh cqohVar = (cqoh) cbalVar.b.b();
            cqohVar.getClass();
            f.getClass();
            cbaaVar.g = new cbaf(context, cqohVar, f, cbaaVar.f);
        }
        this.a.countDown();
    }

    @Override // defpackage.cbcf
    public final void b(VCardEntry vCardEntry) {
        Uri uri;
        csix.h();
        String displayName = vCardEntry.getDisplayName();
        List<VCardEntry.PhotoData> photoList = vCardEntry.getPhotoList();
        if (photoList == null || photoList.isEmpty()) {
            uri = null;
        } else {
            Iterator<VCardEntry.PhotoData> it = photoList.iterator();
            uri = null;
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                byte[] bytes = it.next().getBytes();
                if (bytes != null) {
                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
                    try {
                        Uri g = cbgi.g(byteArrayInputStream, this.b.e);
                        if (g != null) {
                            uri = g;
                            break;
                        } else {
                            try {
                                byteArrayInputStream.close();
                            } catch (IOException unused) {
                            }
                            uri = g;
                        }
                    } finally {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException unused2) {
                        }
                    }
                }
            }
        }
        if (uri == null) {
            List<VCardEntry.PhoneData> phoneList = vCardEntry.getPhoneList();
            aoku k = (phoneList == null || phoneList.isEmpty()) ? null : ((aolr) this.b.d.b()).k(((aolr) this.b.d.b()).n(phoneList.get(0).getNumber()));
            if (k == null) {
                List<VCardEntry.EmailData> emailList = vCardEntry.getEmailList();
                k = (emailList == null || emailList.isEmpty()) ? ((aolr) this.b.d.b()).f() : ((aolr) this.b.d.b()).n(emailList.get(0).getAddress());
            }
            uri = this.b.a.f(null, displayName, k, null);
        }
        cbaa cbaaVar = this.b;
        Context context = (Context) cbaaVar.c.a.b();
        context.getClass();
        uri.getClass();
        cbaaVar.f.add(new cbaj(context, vCardEntry, uri));
    }

    @Override // defpackage.cbcf
    public final void c() {
    }
}
