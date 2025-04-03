package defpackage;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sfx extends cslh {
    public final List a;
    private final Context b;
    private final csum c;
    private final ddzb k;
    private final sfz l;
    private Uri m;
    private Uri n;

    public sfx(Context context, ddzb ddzbVar, csum csumVar, sfz sfzVar, String str) {
        super(str);
        this.a = new ArrayList();
        this.k = ddzbVar;
        this.b = context;
        this.c = csumVar;
        this.l = sfzVar;
    }

    private static boolean f(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!le.u(((sfw) it.next()).b)) {
                return true;
            }
        }
        return false;
    }

    private final boolean g() {
        return (this.m == null || this.n == null) ? false : true;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a5  */
    @Override // defpackage.cslh
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object a(java.lang.Object[] r15) {
        /*
            r14 = this;
            java.lang.Void[] r15 = (java.lang.Void[]) r15
            android.net.Uri r15 = r14.m
            if (r15 == 0) goto L11
            android.net.Uri r0 = r14.n
            if (r0 == 0) goto L11
            android.content.Context r1 = r14.b
            defpackage.csuu.r(r1, r15, r0)
            goto Laf
        L11:
            cfva r15 = defpackage.sfu.a
            java.lang.Object r15 = r15.e()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L30
            java.util.List r15 = r14.a
            boolean r15 = f(r15)
            if (r15 != 0) goto L30
            sfz r15 = r14.l
            java.util.List r0 = r14.a
            r15.c(r0)
            goto Laf
        L30:
            java.io.File r15 = new java.io.File
            java.lang.String r0 = android.os.Environment.DIRECTORY_PICTURES
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            android.content.Context r1 = r14.b
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2132082915(0x7f1500e3, float:1.9805958E38)
            java.lang.String r1 = r1.getString(r2)
            r15.<init>(r0, r1)
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            android.content.Context r1 = r14.b
            java.util.List r2 = r14.a
            android.content.ContentResolver r1 = r1.getContentResolver()
            java.util.Iterator r2 = r2.iterator()
        L5a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Laf
            java.lang.Object r3 = r2.next()
            sfw r3 = (defpackage.sfw) r3
            java.lang.String r4 = r3.b
            java.lang.String r5 = defpackage.le.d(r4)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            r6 = 1
            if (r5 == 0) goto L81
            android.net.Uri r5 = r3.a
            java.lang.String r5 = r1.getType(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r6 == r7) goto L81
            r11 = r5
            goto L82
        L81:
            r11 = r4
        L82:
            boolean r4 = defpackage.le.n(r11)
            if (r4 != 0) goto L91
            boolean r4 = defpackage.le.A(r11)
            if (r4 == 0) goto L8f
            goto L91
        L8f:
            r4 = 0
            goto L92
        L91:
            r4 = r6
        L92:
            java.lang.String r5 = r3.e
            if (r5 != 0) goto L9c
            android.net.Uri r5 = r3.d
            java.lang.String r5 = defpackage.csum.c(r5)
        L9c:
            r12 = r5
            android.content.Context r8 = r14.b
            android.net.Uri r9 = r3.a
            if (r6 == r4) goto La5
            r10 = r0
            goto La6
        La5:
            r10 = r15
        La6:
            csum r13 = r14.c
            android.net.Uri r4 = defpackage.csuu.i(r8, r9, r10, r11, r12, r13)
            r3.c = r4
            goto L5a
        Laf:
            r15 = 0
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sfx.a(java.lang.Object[]):java.lang.Object");
    }

    public final void b(Uri uri, String str, Uri uri2, String str2) {
        this.a.add(new sfw(uri, str, uri2, str2));
    }

    public final void c(Uri uri, Uri uri2, String str) {
        sfw sfwVar = new sfw(uri, str, null, null);
        sfwVar.c = uri2;
        this.a.add(sfwVar);
        this.m = uri;
        this.n = uri2;
    }

    @Override // defpackage.cslh
    protected final /* bridge */ /* synthetic */ void d(Object obj) {
        String quantityString;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (sfw sfwVar : this.a) {
            Uri uri = sfwVar.c;
            if (uri == null) {
                i++;
            } else {
                if (!g() && (!((Boolean) sfu.a.e()).booleanValue() || f(this.a))) {
                    Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                    intent.setData(sfwVar.c);
                    this.b.sendBroadcast(intent);
                }
                if (le.n(sfwVar.b)) {
                    i3++;
                } else if (le.A(sfwVar.b)) {
                    i4++;
                } else if (le.f(sfwVar.b)) {
                    i5++;
                } else {
                    i2++;
                    if (g()) {
                        continue;
                    } else {
                        DownloadManager downloadManager = (DownloadManager) this.b.getSystemService("download");
                        String path = uri.getPath();
                        if (path == null || downloadManager == null) {
                            return;
                        }
                        File file = new File(path);
                        if (file.exists()) {
                            downloadManager.addCompletedDownload(file.getName(), this.b.getString(R.string.attachment_file_description), true, sfwVar.b, file.getAbsolutePath(), file.length(), false);
                        }
                    }
                }
            }
        }
        if (i > 0) {
            quantityString = this.b.getResources().getQuantityString(R.plurals.attachment_save_error, i, Integer.valueOf(i));
        } else {
            int i6 = R.plurals.attachments_saved;
            if (i2 == 0) {
                if (i3 > 0) {
                    i6 = R.plurals.photos_saved_to_folder;
                } else if (i4 > 0) {
                    i6 = R.plurals.videos_saved_to_folder;
                } else if (i5 > 0) {
                    i6 = R.plurals.voice_messages_saved_to_folder;
                }
                i2 = 0;
            }
            int i7 = i3 + i4 + i2 + i5;
            quantityString = this.b.getResources().getQuantityString(i6, i7, Integer.valueOf(i7), this.b.getResources().getString(R.string.app_name));
        }
        this.k.l(quantityString);
    }
}
