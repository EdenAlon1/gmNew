package defpackage;

import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.util.Size;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import com.google.android.apps.messaging.videotrimmer.FileInfoResult;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import j$.util.function.Consumer$CC;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcfs extends dclr {
    public static final cskc f = cskc.g("Bugle", "GalleryCategoryPresenter");
    private final ugs B;
    private final ekms C;
    private final errl D;
    private final adgn E;
    private final adgn F;
    private final ffbr G;
    private final czgy H;
    private int I;
    public final Context g;
    public final cqoh h;
    public final ctud i;
    public final ffbr j;
    public final dchz k;
    public final dbxy l;
    public final adsd m;
    public final List n;
    public final List o;
    public final errl p;
    public final ddzb q;
    public final sfz r;
    public final ea s;
    public Uri t;
    String u;
    public File v;
    final long w;
    final emyl x;
    elfl y;
    public Function z;

    public dcfs(Context context, ugs ugsVar, cqoh cqohVar, adsd adsdVar, ctud ctudVar, ffbr ffbrVar, errl errlVar, errl errlVar2, ddzb ddzbVar, sfz sfzVar, adgn adgnVar, adgn adgnVar2, ffbr ffbrVar2, ea eaVar, dchz dchzVar, AttachmentQueueState attachmentQueueState, dcab dcabVar, dbxy dbxyVar, czgy czgyVar, ContentGridView contentGridView, int i, long j, emyl emylVar) {
        super(dchzVar, attachmentQueueState, dcabVar, contentGridView, i);
        this.g = context;
        this.B = ugsVar;
        this.h = cqohVar;
        this.m = adsdVar;
        this.i = ctudVar;
        this.j = ffbrVar;
        this.l = dbxyVar;
        this.k = dchzVar;
        this.D = errlVar;
        this.p = errlVar2;
        this.q = ddzbVar;
        this.r = sfzVar;
        this.E = adgnVar;
        this.w = j;
        this.x = emylVar;
        this.F = adgnVar2;
        this.G = ffbrVar2;
        this.s = eaVar;
        this.H = czgyVar;
        this.n = new ArrayList();
        this.o = new ArrayList();
        this.C = ekmq.a(context).c().q(rig.a()).p(rff.b());
        if (adgnVar2.a().isPresent() && ((Boolean) cful.o.e()).booleanValue()) {
            ellj.c(eaVar, aetc.class, new ellh() { // from class: dcfq
                @Override // defpackage.ellh
                public final elli a(ellf ellfVar) {
                    aetc aetcVar = (aetc) ellfVar;
                    dcfs.this.q(aetcVar.a, null, true, aetcVar.b);
                    return elli.a;
                }
            });
        }
    }

    private final void x() {
        this.t = null;
        this.I = 0;
        this.u = null;
    }

    private final void y(final int i) {
        this.I = i;
        this.u = i == 2 ? "video/mp4" : "image/jpeg";
        ListenableFuture submit = this.D.submit(new Callable() { // from class: dcfi
            /* JADX WARN: Code restructure failed: missing block: B:47:0x0111, code lost:
            
                if (r8 != false) goto L43;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0113, code lost:
            
                defpackage.csjy.f("Bugle", "GalleryCameraFileProvider: Could not create a shared media file after 10 tries.");
             */
            /* JADX WARN: Removed duplicated region for block: B:26:0x0139  */
            /* JADX WARN: Removed duplicated region for block: B:28:0x0142  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object call() {
                /*
                    Method dump skipped, instructions count: 348
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dcfi.call():java.lang.Object");
            }
        });
        final String str = i == 1 ? "android.media.action.IMAGE_CAPTURE" : "android.media.action.VIDEO_CAPTURE";
        erqt.r(submit, axou.a(new csvw(new Consumer() { // from class: dcfj
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                Uri uri = (Uri) obj;
                if (uri == null) {
                    return;
                }
                String str2 = str;
                Intent putExtra = new Intent(str2).putExtra("output", uri);
                if (str2.equals("android.media.action.VIDEO_CAPTURE")) {
                    putExtra.putExtra("android.intent.extra.durationLimit", ((Integer) uky.q.e()).intValue());
                }
                dcfs.this.l.r(putExtra);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        }, new Consumer() { // from class: dcfk
            @Override // java.util.function.Consumer
            /* renamed from: accept */
            public final void o(Object obj) {
                dcfs.f.o("Failed to create media file for capture", (Throwable) obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        })), this.p);
    }

    @Override // defpackage.dbzy
    public final int b(int i) {
        return this.k.b(i);
    }

    @Override // defpackage.dbzy
    protected final long c(int i, int i2) {
        return this.k.d(i, i2);
    }

    @Override // defpackage.dbzy
    public final void d(dcal dcalVar, int i) {
        super.d(dcalVar, i);
        this.k.g(dcalVar, i, this.A, this.C);
    }

    @Override // defpackage.dbzy
    protected final void f(dcal dcalVar, int i) {
        int a = dcalVar.a();
        if (a == 2) {
            r();
            return;
        }
        if (a == 3) {
            u(eptm.EXPAND);
            return;
        }
        if (a == 7) {
            this.l.j(eptm.EXPAND);
            return;
        }
        if (a == 8) {
            this.l.k(this.B.a(), eptm.EXPAND, this.A);
        } else {
            if (a == 12) {
                o();
                return;
            }
            dcia dciaVar = (dcia) dcalVar;
            if (t(dciaVar.c(), i, dciaVar.isSelected())) {
                return;
            }
            boolean isSelected = dciaVar.isSelected();
            boolean z = !isSelected;
            ecri a2 = !isSelected ? ((alrv) this.G.b()).a() : null;
            q((GalleryContent) dciaVar.c(), (GalleryContentItem) dciaVar.d(), z, i);
            if (a2 != null) {
                ((alrv) this.G.b()).h(a2, alrv.C);
            }
        }
    }

    @Override // defpackage.dbzy, defpackage.dcah
    public final void g() {
        p();
    }

    final int h() {
        return this.k.c();
    }

    @Override // defpackage.dclr
    protected final epts i() {
        dchz dchzVar = this.k;
        dchzVar.getClass();
        return dchzVar.e();
    }

    @Override // defpackage.dclr
    protected final eptu j() {
        dchz dchzVar = this.k;
        dchzVar.getClass();
        return dchzVar.f();
    }

    public final void k() {
        File file = this.v;
        if (file == null || !file.exists()) {
            return;
        }
        try {
            if (!this.v.delete()) {
                csjy.f("Bugle", "GalleryCategoryPresenter: Failed to delete the shared image file");
            }
            x();
        } catch (Throwable th) {
            csjy.f("Bugle", "GalleryCategoryPresenter: Failed to delete the shared image file");
            x();
            throw th;
        }
    }

    final void l() {
        String path;
        Uri uri = this.t;
        if (uri == null || this.I == 0 || (path = uri.getPath()) == null) {
            return;
        }
        String b = emxe.b(this.u);
        if (((Boolean) cful.o.e()).booleanValue()) {
            List list = this.o;
            ufk o = GalleryContent.o();
            o.k(uri);
            o.f(b);
            ((uec) o).a = new Size(-1, -1);
            o.e(eohh.DEVICE_CAMERA_APP);
            o.i(TimeUnit.MILLISECONDS.toSeconds(this.h.f().toEpochMilli()));
            list.add(o.l());
        }
        this.n.add(new GalleryContentItem(uri, b, -1, -1, eohh.DEVICE_CAMERA_APP, TimeUnit.MILLISECONDS.toSeconds(this.h.f().toEpochMilli())));
        MediaScannerConnection.scanFile(this.g, new String[]{path}, new String[]{b}, new MediaScannerConnection.OnScanCompletedListener() { // from class: dcfe
            @Override // android.media.MediaScannerConnection.OnScanCompletedListener
            public final void onScanCompleted(String str, Uri uri2) {
                final dcfs dcfsVar = dcfs.this;
                cslq.f(new Runnable() { // from class: dcfp
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean booleanValue = ((Boolean) cful.o.e()).booleanValue();
                        dcfs dcfsVar2 = dcfs.this;
                        if (booleanValue) {
                            Iterator it = dcfsVar2.o.iterator();
                            while (it.hasNext()) {
                                dcfsVar2.v((GalleryContent) it.next(), true, -1);
                            }
                        } else {
                            Iterator it2 = dcfsVar2.n.iterator();
                            while (it2.hasNext()) {
                                dcfsVar2.w((GalleryContentItem) it2.next(), true, -1);
                            }
                        }
                        dcfsVar2.m.a(26);
                        dcfsVar2.o.clear();
                        dcfsVar2.n.clear();
                    }
                });
            }
        });
        x();
    }

    public final void m(Bundle bundle) {
        if (bundle != null) {
            this.t = (Uri) bundle.getParcelable("media_uri");
            int i = bundle.getInt("media_type");
            int[] iArr = {1, 2};
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= 2) {
                    break;
                }
                int i4 = iArr[i3];
                int i5 = i4 - 1;
                if (i4 == 0) {
                    throw null;
                }
                if (i5 == i) {
                    i2 = i4;
                    break;
                }
                i3++;
            }
            this.I = i2;
            this.u = bundle.getString("media_content_type");
            String string = bundle.getString("media_file");
            if (string != null) {
                this.v = new File(string);
            }
        }
    }

    public final void n(Bundle bundle) {
        bundle.putParcelable("media_uri", this.t);
        int i = this.I;
        bundle.putInt("media_type", i != 0 ? (-1) + i : -1);
        String str = this.u;
        if (str != null) {
            bundle.putString("media_content_type", str);
        }
        File file = this.v;
        bundle.putString("media_file", file == null ? null : file.getAbsolutePath());
    }

    public final void o() {
        if (this.i.e()) {
            y(1);
        } else {
            ((ctuk) this.j.b()).c(new ctuj() { // from class: dcfl
                @Override // defpackage.ctuj
                public final void d() {
                    dcfs.this.o();
                }

                @Override // defpackage.ctuj
                public final /* synthetic */ boolean e() {
                    return true;
                }

                @Override // defpackage.ctuj
                public final /* synthetic */ void a() {
                }

                @Override // defpackage.ctuj
                public final /* synthetic */ void b() {
                }

                @Override // defpackage.ctuj
                public final /* synthetic */ void c() {
                }
            });
        }
    }

    public final void p() {
        if (this.i.g()) {
            y(2);
        } else {
            ((ctuk) this.j.b()).e(new ctuj() { // from class: dcfm
                @Override // defpackage.ctuj
                public final void d() {
                    dcfs.this.p();
                }

                @Override // defpackage.ctuj
                public final /* synthetic */ boolean e() {
                    return true;
                }

                @Override // defpackage.ctuj
                public final /* synthetic */ void a() {
                }

                @Override // defpackage.ctuj
                public final /* synthetic */ void b() {
                }

                @Override // defpackage.ctuj
                public final /* synthetic */ void c() {
                }
            });
        }
    }

    final void q(final GalleryContent galleryContent, final GalleryContentItem galleryContentItem, final boolean z, final int i) {
        int i2;
        String str;
        final Uri uri;
        int i3;
        if (((Boolean) dedt.a.e()).booleanValue()) {
            Context context = this.g;
            context.getClass();
            if (dedn.a(context.getPackageManager())) {
                byza byzaVar = byza.STANDARD;
                if (((Boolean) cful.o.e()).booleanValue() && galleryContent != null) {
                    uri = galleryContent.e();
                    str = galleryContent.b();
                    i2 = galleryContent.f().getWidth();
                    i3 = galleryContent.f().getHeight();
                    if (((Boolean) cjja.a.e()).booleanValue()) {
                        byzaVar = galleryContent.h();
                    }
                } else if (galleryContentItem != null) {
                    uri = galleryContentItem.e();
                    str = galleryContentItem.f();
                    i2 = galleryContentItem.c();
                    i3 = galleryContentItem.b();
                } else {
                    i2 = 0;
                    str = "";
                    uri = null;
                    i3 = 0;
                }
                if (uri == null || !le.A(str) || !byzaVar.equals(byza.STANDARD)) {
                    s(galleryContent, galleryContentItem, z, i);
                    return;
                }
                elfl elflVar = this.y;
                if (elflVar != null) {
                    elflVar.cancel(true);
                    this.y = null;
                }
                adgn adgnVar = this.E;
                adgnVar.getClass();
                final String str2 = str;
                final int i4 = i2;
                final int i5 = i3;
                adgnVar.a().ifPresent(new Consumer() { // from class: dcfh
                    @Override // java.util.function.Consumer
                    /* renamed from: accept */
                    public final void o(Object obj) {
                        final dcfs dcfsVar = dcfs.this;
                        elfl a = ((dedv) obj).a(dcfsVar.g, uri);
                        final String str3 = str2;
                        final int i6 = i4;
                        final int i7 = i5;
                        final GalleryContent galleryContent2 = galleryContent;
                        final GalleryContentItem galleryContentItem2 = galleryContentItem;
                        final boolean z2 = z;
                        final int i8 = i;
                        emwl emwlVar = new emwl() { // from class: dcfg
                            @Override // defpackage.emwl
                            public final Object apply(Object obj2) {
                                dcfs dcfsVar2 = dcfs.this;
                                FileInfoResult fileInfoResult = (FileInfoResult) obj2;
                                if (fileInfoResult != null) {
                                    if (dedn.b(str3, fileInfoResult.b, dcfsVar2.w)) {
                                        int i9 = i7;
                                        dedi dediVar = new dedi(Uri.parse(fileInfoResult.a), dcfsVar2.w / 1024, i6, i9);
                                        ea eaVar = dcfsVar2.s;
                                        eaVar.getClass();
                                        ellj.f(dediVar, eaVar);
                                        return null;
                                    }
                                }
                                int i10 = i8;
                                boolean z3 = z2;
                                dcfsVar2.s(galleryContent2, galleryContentItem2, z3, i10);
                                return null;
                            }
                        };
                        errl errlVar = dcfsVar.p;
                        errlVar.getClass();
                        dcfsVar.y = a.h(emwlVar, errlVar);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
                return;
            }
        }
        s(galleryContent, galleryContentItem, z, i);
    }

    final void r() {
        ctuk ctukVar = (ctuk) this.j.b();
        final dchz dchzVar = this.k;
        dchzVar.getClass();
        ctukVar.k(new ctuj() { // from class: dcfo
            @Override // defpackage.ctuj
            public final void d() {
                dchz.this.h();
            }

            @Override // defpackage.ctuj
            public final /* synthetic */ boolean e() {
                return true;
            }

            @Override // defpackage.ctuj
            public final /* synthetic */ void a() {
            }

            @Override // defpackage.ctuj
            public final /* synthetic */ void b() {
            }

            @Override // defpackage.ctuj
            public final /* synthetic */ void c() {
            }
        });
    }

    public final void s(ufd ufdVar, GalleryContentItem galleryContentItem, boolean z, int i) {
        if (((Boolean) cful.o.e()).booleanValue() && ufdVar != null) {
            v(ufdVar, z, i);
        } else if (galleryContentItem != null) {
            w(galleryContentItem, z, i);
        }
    }

    protected final boolean t(ufd ufdVar, int i, boolean z) {
        aetd aetdVar = (aetd) this.F.a().orElse(null);
        if (!((Boolean) cful.o.e()).booleanValue() || aetdVar == null) {
            return false;
        }
        czgy czgyVar = this.H;
        if ((czgyVar == null || czgyVar.fu()) && !((Boolean) this.x.get()).booleanValue()) {
            return false;
        }
        if ((!le.A(ufdVar.b()) && (!((Boolean) cjja.c.e()).booleanValue() || !le.n(ufdVar.b()))) || z) {
            return false;
        }
        aetdVar.a((GalleryContent) ufdVar, i);
        return true;
    }

    final void u(final eptm eptmVar) {
        if (this.l == null) {
            erqt.i(false);
        } else {
            if (this.i.e()) {
                erqt.i(Boolean.valueOf(this.l.p(eptmVar, this.A)));
                return;
            }
            ffbr ffbrVar = this.j;
            final SettableFuture create = SettableFuture.create();
            ((ctuk) ffbrVar.b()).c(new ctuj() { // from class: dcfn
                @Override // defpackage.ctuj
                public final void d() {
                    dcfs dcfsVar = dcfs.this;
                    create.set(Boolean.valueOf(dcfsVar.l.p(eptmVar, dcfsVar.A)));
                }

                @Override // defpackage.ctuj
                public final /* synthetic */ boolean e() {
                    return true;
                }

                @Override // defpackage.ctuj
                public final /* synthetic */ void a() {
                }

                @Override // defpackage.ctuj
                public final /* synthetic */ void b() {
                }

                @Override // defpackage.ctuj
                public final /* synthetic */ void c() {
                }
            });
        }
    }
}
