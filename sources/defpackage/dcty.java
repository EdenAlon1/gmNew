package defpackage;

import android.content.Context;
import android.content.Intent;
import android.database.DataSetObserver;
import android.net.Uri;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediaviewer.BaseMediaViewerEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewPager;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerAddMoreButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerPrimaryButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerSaveButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerShareButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.data.MediaViewerItem;
import com.google.android.material.button.MaterialButton;
import j$.util.Optional;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcty implements cxra, dbtg, dcsx {
    public static final cskc a = cskc.g("Bugle", "MediaViewerFragmentPeer");
    private static final enru ao = enru.c("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer");
    public ImageView A;
    public TextView B;
    public View C;
    public crly D;
    public dcta E;
    public TextView F;
    public MaterialButton G;
    public final dctl H;
    public final ellq I;
    public final Optional J;
    public Uri M;
    public MediaViewerItem N;
    public ea O;
    public boolean P;
    public boolean Q;
    public String R;
    public final dede S;
    public final dbxg T;
    public int V;
    public long X;
    public dcur Y;
    public dcus Z;
    public final aufg af;
    public final axop al;
    public final dcvj am;
    public final dcvh an;
    private final sfy ap;
    private final alih aq;
    private final alhx ar;
    private final alhn as;
    private final alht at;
    private final alhq au;
    private final Optional av;
    private final cbgh aw;
    private final aufh ax;
    private final aslu ay;
    public final ddwj b;
    public final dbth c;
    public final ejwl d;
    public final ejlq e;
    public final ayfg f;
    public final ffbr g;
    public final csmj h;
    public final alia i;
    public final ffbr j;
    public final cqoh k;
    public final ffbr l;
    public final tam m;
    public final cuxh n;
    public MediaViewerButton o;
    public ArrayList p;
    public MediaViewerButton q;
    public List r;
    public MediaViewerButton s;
    public ea t;
    public dcwy u;
    public ViewGroup v;
    public TextView w;
    public TextView x;
    public TextView y;
    public LinearLayout z;
    public int K = -1;
    public boolean L = false;
    public final aw U = new aw();
    public boolean W = false;
    public boolean aa = false;
    public boolean ab = false;
    public boolean ac = false;
    public int ad = 0;
    public int ae = 0;
    public final ejwd ag = new ejwd<List<MediaViewerItem>>() { // from class: dcty.2
        @Override // defpackage.ejwd
        public final void a(Throwable th) {
            dcty.a.r("Media Viewer data service failed ".concat(String.valueOf(th.getMessage())));
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            List list = (List) obj;
            if (dcty.this.E == null || list == null || list.isEmpty()) {
                return;
            }
            dcty.this.E.h = engw.n(list);
            dcta dctaVar = dcty.this.E;
            synchronized (dctaVar) {
                DataSetObserver dataSetObserver = dctaVar.g;
                if (dataSetObserver != null) {
                    dataSetObserver.onChanged();
                }
            }
            dctaVar.f.notifyChanged();
            int i = dcty.this.K;
            if (i == -1) {
                i = -1;
                for (int i2 = 0; i2 < list.size(); i2++) {
                    MediaViewerItem mediaViewerItem = (MediaViewerItem) list.get(i2);
                    if (mediaViewerItem != null && (dcty.this.w(mediaViewerItem.b()) || dcty.this.w(mediaViewerItem.a()))) {
                        dcty.this.K = i2;
                        i = i2;
                    }
                }
            }
            if (i == -1) {
                ((akzt) dcty.this.j.b()).c("Bugle.Media.Viewer.Photo.Not.Found.Counts");
                if (list.isEmpty()) {
                    ((akzt) dcty.this.j.b()).c("Bugle.Media.Viewer.Loaded.With.Empty.Data.Counts");
                }
                i = -1;
            }
            if (i == -1) {
                csjb e = dcty.a.e();
                e.I("MediaViewer failed to find media:");
                e.I(dcty.this.M);
                e.I("in data.");
                e.L("count", list);
                e.r();
                i = !list.isEmpty() ? list.size() - 1 : -1;
            }
            if (i != -1) {
                ((MediaViewPager) dcty.this.D.b()).l(i, false);
                if (i == 0) {
                    dcty.this.l(0);
                }
                dcty dctyVar = dcty.this;
                if (dctyVar.W) {
                    long epochMilli = dctyVar.k.f().toEpochMilli() - dctyVar.X;
                    emxf.a(epochMilli >= 0 && epochMilli <= 2147483647L);
                    dctyVar.Z = new dcus((int) epochMilli, dcty.this.K, list.size());
                    dcty dctyVar2 = dcty.this;
                    dctyVar2.W = false;
                    dctyVar2.i();
                }
            }
        }

        @Override // defpackage.ejwd
        public final void hB() {
        }
    };
    public final ejlr ah = new ejlr<Uri, Uri>() { // from class: dcty.4
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            dcty.this.B(3);
            dcty dctyVar = dcty.this;
            dctyVar.p((Uri) obj2, dctyVar.N.h());
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            dcty.this.B(2);
            ((cfyt) dcty.this.l.b()).b(th);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final ejlr ai = new ejlr<Uri, Uri>() { // from class: dcty.5
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Uri uri = (Uri) obj2;
            dcty.this.B(5);
            dcty.this.A(4);
            BaseMediaViewerEvent d = ((MediaViewerButton) dcty.this.r.get(0)).d();
            boolean z = d instanceof MediaViewerAddMoreButtonEvent;
            BaseMediaViewerEvent baseMediaViewerEvent = d;
            if (z) {
                MediaViewerAddMoreButtonEvent mediaViewerAddMoreButtonEvent = (MediaViewerAddMoreButtonEvent) d;
                dcva g = dcty.this.N.g();
                g.c(uri);
                mediaViewerAddMoreButtonEvent.a = Optional.of(g.a());
                dcty dctyVar = dcty.this;
                baseMediaViewerEvent = mediaViewerAddMoreButtonEvent;
                if (dctyVar.aa) {
                    mediaViewerAddMoreButtonEvent.b = Optional.ofNullable(dctyVar.F.getText() == null ? null : dcty.this.F.getText().toString());
                    baseMediaViewerEvent = mediaViewerAddMoreButtonEvent;
                }
            }
            View view = dcty.this.H.Q;
            if (view != null) {
                ellj.g(baseMediaViewerEvent, view);
            }
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            dcty.this.B(2);
            ((cfyt) dcty.this.l.b()).b(th);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final ejlr aj = new ejlr<Uri, Uri>() { // from class: dcty.6
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Uri uri = (Uri) obj2;
            dcty.this.B(5);
            dcty.this.A(4);
            dcty dctyVar = dcty.this;
            BaseMediaViewerEvent baseMediaViewerEvent = ((dcsh) dctyVar.q).a;
            boolean z = baseMediaViewerEvent instanceof MediaViewerPrimaryButtonEvent;
            BaseMediaViewerEvent baseMediaViewerEvent2 = baseMediaViewerEvent;
            if (z) {
                MediaViewerPrimaryButtonEvent mediaViewerPrimaryButtonEvent = (MediaViewerPrimaryButtonEvent) baseMediaViewerEvent;
                dcva g = dctyVar.N.g();
                g.c(uri);
                mediaViewerPrimaryButtonEvent.a = Optional.of(g.a());
                dcty dctyVar2 = dcty.this;
                baseMediaViewerEvent2 = mediaViewerPrimaryButtonEvent;
                if (dctyVar2.aa) {
                    mediaViewerPrimaryButtonEvent.b = Optional.ofNullable(dctyVar2.F.getText() == null ? null : dcty.this.F.getText().toString());
                    baseMediaViewerEvent2 = mediaViewerPrimaryButtonEvent;
                }
            }
            ellj.g(baseMediaViewerEvent2, dcty.this.H.Q);
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            dcty.this.B(2);
            ((cfyt) dcty.this.l.b()).b(th);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };
    public final ejlr ak = new ejlr<Uri, Uri>() { // from class: dcty.1
        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
            Uri uri = (Uri) obj2;
            dcty.this.B(4);
            dcty.this.A(4);
            if (dcty.this.N.b().equals((Uri) obj)) {
                dcty dctyVar = dcty.this;
                if (dctyVar.N == null || dctyVar.H.G() == null) {
                    return;
                }
                dcty dctyVar2 = dcty.this;
                dctyVar2.v(uri, dctyVar2.N.h());
            }
        }

        @Override // defpackage.ejlr
        public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
            dcty.this.B(2);
            ((cfyt) dcty.this.l.b()).b(th);
        }

        @Override // defpackage.ejlr
        public final /* synthetic */ void b(Object obj) {
        }
    };

    public dcty(dctl dctlVar, ellq ellqVar, ejwl ejwlVar, ejlq ejlqVar, dcvh dcvhVar, ayfg ayfgVar, ffbr ffbrVar, sfy sfyVar, csmj csmjVar, alih alihVar, alia aliaVar, alhx alhxVar, alhn alhnVar, alht alhtVar, alhq alhqVar, ffbr ffbrVar2, cqoh cqohVar, tam tamVar, Optional optional, Optional optional2, ffbr ffbrVar3, axop axopVar, cuxh cuxhVar, dede dedeVar, dbxg dbxgVar, dcvj dcvjVar, cbgh cbghVar, aufg aufgVar, aufh aufhVar, ffbr ffbrVar4, aslu asluVar) {
        this.H = dctlVar;
        this.I = ellqVar;
        this.d = ejwlVar;
        this.e = ejlqVar;
        this.an = dcvhVar;
        this.f = ayfgVar;
        this.g = ffbrVar;
        this.ap = sfyVar;
        this.h = csmjVar;
        this.aq = alihVar;
        this.i = aliaVar;
        this.ar = alhxVar;
        this.as = alhnVar;
        this.at = alhtVar;
        this.au = alhqVar;
        this.j = ffbrVar2;
        this.k = cqohVar;
        this.av = optional;
        this.J = optional2;
        this.l = ffbrVar3;
        this.m = tamVar;
        this.al = axopVar;
        this.n = cuxhVar;
        this.S = dedeVar;
        this.T = dbxgVar;
        this.am = dcvjVar;
        this.aw = cbghVar;
        this.af = aufgVar;
        this.ax = aufhVar;
        this.ay = asluVar;
        if (ctid.b && dctlVar.G() != null) {
            eg G = dctlVar.G();
            G.getClass();
            if (G.getWindow() != null) {
                eg G2 = dctlVar.G();
                G2.getClass();
                if (G2.getWindow().getAttributes() != null) {
                    eg G3 = dctlVar.G();
                    G3.getClass();
                    G3.getWindow().getAttributes().layoutInDisplayCutoutMode = 1;
                }
            }
        }
        this.c = new dbth(dctlVar);
        if (!((auxx) ffbrVar4.b()).a()) {
            eg G4 = dctlVar.G();
            G4.getClass();
            G4.getWindow().setStatusBarColor(ehdr.d(dctlVar.G(), R.attr.colorBackgroundDark, "MediaViewerFragmentPeer"));
        }
        this.b = new ddwj(dctlVar, dctlVar.a, ehdr.d(dctlVar.G(), R.attr.colorBackgroundDark, "MediaViewerFragmentPeer"));
    }

    private static MediaViewerButton E() {
        dctk e = MediaViewerButton.e();
        e.e(R.string.camera_attach_media);
        e.d(R.drawable.quantum_gm_ic_check_vd_theme_24);
        e.b(R.string.camera_attach_media_to_draft_description);
        e.c(new MediaViewerPrimaryButtonEvent());
        return e.a();
    }

    private final epzq F(int i) {
        String h = this.N.h();
        int i2 = this.Y.d;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        }
        int i4 = 1;
        switch (i3) {
            case 4:
            case 5:
            case 6:
                i4 = 2;
                break;
        }
        epqs epqsVar = (epqs) eprl.a.createBuilder();
        epqsVar.copyOnWrite();
        eprl eprlVar = (eprl) epqsVar.instance;
        eprlVar.b |= 8;
        eprlVar.g = h;
        return alhu.a(i, i4, (eprl) epqsVar.build(), D(i2, h));
    }

    private final void G(String str) {
        if (this.y == null) {
            return;
        }
        if (this.aa && this.G == null) {
            return;
        }
        ddxx.a(this.aa ? this.G : this.y, (this.P && le.A(str)) ? R.dimen.media_viewer_primary_button_margin_bottom_with_video_palyer : this.aa ? R.dimen.direct_send_viewer_primary_button_margin_bottom : R.dimen.media_viewer_primary_button_margin_bottom);
    }

    private final void H(String str) {
        if (this.z == null) {
            return;
        }
        ddxx.a(this.z, (this.P && le.A(str)) ? R.dimen.media_viewer_secondary_button_margin_bottom_with_video_palyer : this.aa ? R.dimen.direct_send_viewer_secondary_button_margin_bottom : R.dimen.media_viewer_secondary_button_margin_bottom);
    }

    private static MediaViewerButton I(boolean z) {
        dctk e = MediaViewerButton.e();
        e.e(R.string.camera_send_media);
        e.d(b(true, z));
        e.b(a(true, z));
        e.c(new MediaViewerPrimaryButtonEvent());
        return e.a();
    }

    public static int a(boolean z, boolean z2) {
        return z ? z2 ? R.string.camera_send_encrypted_media_description : R.string.camera_send_media_description : R.string.camera_attach_media_to_draft_description;
    }

    public static int b(boolean z, boolean z2) {
        return z ? z2 ? R.drawable.ic_e2ee_send_icon : R.drawable.quantum_gm_ic_send_vd_theme_24 : R.drawable.quantum_gm_ic_check_vd_theme_24;
    }

    public static int z(Bundle bundle) {
        if (bundle == null || bundle.getInt("opening_source") == 0) {
            return 1;
        }
        return eqac.a(bundle.getInt("opening_source"));
    }

    public final void A(final int i) {
        if (this.Y == null || this.Z == null) {
            return;
        }
        alhq alhqVar = this.au;
        final eqad e = e();
        final epzq F = F(0);
        alhqVar.o(new Supplier() { // from class: alho
            @Override // java.util.function.Supplier
            public final Object get() {
                epyz epyzVar = (epyz) epzb.a.createBuilder();
                epyzVar.copyOnWrite();
                epzb epzbVar = (epzb) epyzVar.instance;
                eqad eqadVar = eqad.this;
                eqadVar.getClass();
                epzbVar.c = eqadVar;
                epzbVar.b |= 1;
                epyzVar.copyOnWrite();
                epzb epzbVar2 = (epzb) epyzVar.instance;
                epzq epzqVar = F;
                epzqVar.getClass();
                epzbVar2.d = epzqVar;
                epzbVar2.b |= 2;
                epyzVar.copyOnWrite();
                epzb epzbVar3 = (epzb) epyzVar.instance;
                epzbVar3.e = i - 1;
                epzbVar3.b |= 4;
                return (epzb) epyzVar.build();
            }
        });
    }

    public final void B(final int i) {
        final int i2;
        final int i3;
        if (this.Y == null || this.Z == null) {
            return;
        }
        ea eaVar = this.t;
        if (eaVar != null) {
            eepy eepyVar = ((dcwf) eaVar).H().d;
            int i4 = eepyVar.i;
            int i5 = eepyVar.j;
            i3 = i5;
            i2 = i4 - i5;
        } else {
            i2 = 0;
            i3 = 0;
        }
        alht alhtVar = this.at;
        final eqad e = e();
        final epzq F = F(0);
        alhtVar.o(new Supplier() { // from class: alhs
            @Override // java.util.function.Supplier
            public final Object get() {
                epzc epzcVar = (epzc) epzf.a.createBuilder();
                epzcVar.copyOnWrite();
                epzf epzfVar = (epzf) epzcVar.instance;
                eqad eqadVar = eqad.this;
                eqadVar.getClass();
                epzfVar.c = eqadVar;
                epzfVar.b |= 1;
                epzcVar.copyOnWrite();
                epzf epzfVar2 = (epzf) epzcVar.instance;
                epzq epzqVar = F;
                epzqVar.getClass();
                epzfVar2.d = epzqVar;
                epzfVar2.b |= 2;
                epzcVar.copyOnWrite();
                epzf epzfVar3 = (epzf) epzcVar.instance;
                epzfVar3.e = i - 1;
                epzfVar3.b |= 4;
                epzcVar.copyOnWrite();
                epzf epzfVar4 = (epzf) epzcVar.instance;
                epzfVar4.f = alht.b(i2) - 1;
                epzfVar4.b |= 8;
                epzcVar.copyOnWrite();
                epzf epzfVar5 = (epzf) epzcVar.instance;
                epzfVar5.g = alht.b(i3) - 1;
                epzfVar5.b |= 16;
                return (epzf) epzcVar.build();
            }
        });
    }

    public final void C(int i) {
        dcur dcurVar = this.Y;
        dcurVar.getClass();
        dcurVar.e = i;
    }

    public final boolean D(int i, String str) {
        boolean booleanValue;
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case 1:
                booleanValue = ((Boolean) dcut.e.e()).booleanValue();
                break;
            case 2:
            case 3:
                booleanValue = ((Boolean) dcut.g.e()).booleanValue();
                break;
            case 4:
                booleanValue = ((Boolean) dcut.a.e()).booleanValue();
                break;
            case 5:
                booleanValue = ((Boolean) dcut.f.e()).booleanValue();
                break;
            case 6:
                booleanValue = ((Boolean) dcut.c.e()).booleanValue();
                break;
            default:
                return false;
        }
        if (!booleanValue) {
            return false;
        }
        this.av.isPresent();
        return (le.A(str) || le.j(str)) ? false : true;
    }

    public final View c() {
        return this.aa ? this.H.N().findViewById(R.id.media_viewer_action_bar_direct_send_viewer) : this.H.N().findViewById(R.id.media_viewer_action_bar);
    }

    public final MediaViewerButton d() {
        int i = this.V;
        if (i == 1) {
            if (this.ab) {
                this.ab = true;
                return I(this.ac);
            }
            if (this.aa) {
                return E();
            }
            dctk e = MediaViewerButton.e();
            e.e(R.string.camera_attach_media);
            e.d(R.drawable.quantum_ic_check_white_24);
            e.b(R.string.camera_attach_media_description);
            e.c(new MediaViewerPrimaryButtonEvent());
            return e.a();
        }
        if (i != 2) {
            return null;
        }
        if (this.ab) {
            this.ab = true;
            return I(this.ac);
        }
        if (this.aa) {
            return E();
        }
        dctk e2 = MediaViewerButton.e();
        e2.e(R.string.media_viewer_done_label);
        e2.d(R.drawable.quantum_ic_check_white_24);
        e2.b(R.string.media_viewer_done_label);
        e2.c(new MediaViewerPrimaryButtonEvent());
        return e2.a();
    }

    public final eqad e() {
        int i = this.Y.d;
        dcus dcusVar = this.Z;
        return alie.a(i, dcusVar != null ? dcusVar.b : 0);
    }

    public final ArrayList f() {
        ArrayList arrayList = new ArrayList();
        if (this.aa) {
            dctk e = MediaViewerButton.e();
            e.e(R.string.camera_add_more_media);
            e.b(R.string.camera_add_more_media_description);
            e.d(R.drawable.quantum_gm_ic_add_photo_alternate_vd_theme_24);
            e.c(new MediaViewerAddMoreButtonEvent());
            arrayList.add(e.a());
        } else {
            dctk e2 = MediaViewerButton.e();
            e2.b(R.string.media_viewer_save_media_description);
            e2.d(R.drawable.quantum_ic_save_alt_white_24);
            e2.c(new MediaViewerSaveButtonEvent());
            arrayList.add(e2.a());
        }
        int i = this.V;
        if (i != 1 && i != 2) {
            if (i != 3) {
                arrayList.clear();
                return arrayList;
            }
            dctk e3 = MediaViewerButton.e();
            e3.b(R.string.media_viewer_share_media_description);
            e3.d(R.drawable.quantum_gm_ic_share_white_24);
            e3.c(new MediaViewerShareButtonEvent());
            arrayList.add(e3.a());
        }
        return arrayList;
    }

    public final void g(ejlr ejlrVar) {
        dcwv H = ((dcwf) this.t).H();
        this.e.i(new ejlp(H.b.a(this.N.b(), H.m)), new ejlm(this.N.b()), ejlrVar);
    }

    public final void h(int i) {
        if (this.Y == null || this.Z == null) {
            return;
        }
        this.ar.b(e(), F(i));
    }

    public final void i() {
        if (this.Y == null || this.Z == null) {
            return;
        }
        alih alihVar = this.aq;
        final eqad e = e();
        dcus dcusVar = this.Z;
        final int i = dcusVar.a;
        final int i2 = dcusVar.c;
        alihVar.o(new Supplier() { // from class: alif
            @Override // java.util.function.Supplier
            public final Object get() {
                eqae eqaeVar = (eqae) eqaf.a.createBuilder();
                eqaeVar.copyOnWrite();
                eqaf eqafVar = (eqaf) eqaeVar.instance;
                eqad eqadVar = eqad.this;
                eqadVar.getClass();
                eqafVar.c = eqadVar;
                eqafVar.b |= 1;
                eqaeVar.copyOnWrite();
                eqaf eqafVar2 = (eqaf) eqaeVar.instance;
                eqafVar2.b |= 2;
                eqafVar2.d = i;
                eqaeVar.copyOnWrite();
                eqaf eqafVar3 = (eqaf) eqaeVar.instance;
                eqafVar3.b |= 4;
                eqafVar3.e = i2;
                return (eqaf) eqaeVar.build();
            }
        });
    }

    public final void j() {
        if (x()) {
            g(this.ai);
            return;
        }
        if (this.t != null) {
            B(5);
            A(4);
        }
        this.H.Q.getClass();
        if (!this.aa) {
            ellj.g(((MediaViewerButton) this.p.get(0)).d(), this.H.Q);
            return;
        }
        MediaViewerAddMoreButtonEvent mediaViewerAddMoreButtonEvent = (MediaViewerAddMoreButtonEvent) ((MediaViewerButton) this.p.get(0)).d();
        mediaViewerAddMoreButtonEvent.b = Optional.ofNullable(this.F.getText() == null ? null : this.F.getText().toString());
        ellj.g(mediaViewerAddMoreButtonEvent, this.H.Q);
    }

    public final void k() {
        int a2;
        emxf.l(this.aa);
        emxf.l(this.aa);
        View N = this.H.N();
        int i = 0;
        int i2 = true != this.S.b ? 8 : 0;
        int i3 = true != this.S.b ? 0 : 8;
        N.findViewById(R.id.direct_send_done_button).setVisibility(i2);
        N.findViewById(R.id.media_overlay).setVisibility(i2);
        this.U.l(R.id.primary_button_icon, i2);
        this.U.l(R.id.primary_button, i3);
        this.U.l(R.id.secondary_button_container, i3);
        emxf.l(this.aa);
        if (this.S.b && (a2 = this.S.a()) > 0) {
            i = a2;
        }
        this.U.h(R.id.media_viewer_caption, 4, this.S.b ? i + this.ae : this.ad);
        ConstraintLayout constraintLayout = (ConstraintLayout) this.v;
        constraintLayout.getClass();
        this.U.b(constraintLayout);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void l(int i) {
        MediaViewerItem mediaViewerItem = (MediaViewerItem) this.E.h.get(i);
        this.N = mediaViewerItem;
        TextView textView = this.w;
        if (textView != null) {
            textView.setText(this.n.c(mediaViewerItem.j()));
        }
        TextView textView2 = this.x;
        if (textView2 != null) {
            textView2.setText(mediaViewerItem.i());
        }
        this.O = this.E.b(i);
        h(i);
        dcur dcurVar = this.Y;
        if (D(dcurVar != null ? dcurVar.d : 1, this.N.h())) {
            s();
        } else {
            this.C.setVisibility(8);
        }
        String h = this.N.h();
        G(h);
        H(h);
    }

    public final void m() {
        if (x()) {
            g(this.aj);
            return;
        }
        if (this.t != null) {
            B(5);
            A(4);
        }
        if (!this.aa) {
            ellj.g(this.o.d(), this.H.Q);
            return;
        }
        MediaViewerPrimaryButtonEvent mediaViewerPrimaryButtonEvent = (MediaViewerPrimaryButtonEvent) this.o.d();
        mediaViewerPrimaryButtonEvent.b = Optional.ofNullable(this.F.getText() == null ? null : this.F.getText().toString());
        ellj.g(mediaViewerPrimaryButtonEvent, this.H.Q);
    }

    public final void n() {
        ea eaVar;
        if (this.av.isEmpty() || le.A(this.N.h())) {
            return;
        }
        if (this.E != null) {
            ((MediaViewPager) this.D.b()).v(false);
        }
        dctl dctlVar = this.H;
        Optional optional = this.av;
        fr I = dctlVar.I();
        optional.get();
        dcwf dcwfVar = new dcwf();
        fbae.e(dcwfVar);
        this.t = dcwfVar;
        cg cgVar = new cg(I);
        cgVar.s(R.id.media_editor_container, this.t);
        cgVar.c();
        ea eaVar2 = this.O;
        if (eaVar2 instanceof dcso) {
            dcso dcsoVar = (dcso) eaVar2;
            if (!((ersq) ((auej) this.ax).a.b()).a("bugle.enable_fix_for_open_media_editor") || ((eaVar = this.O) != null && eaVar.aF())) {
                ((dcwf) this.t).H().a(dcsoVar.H().a());
            }
        }
        this.C.setVisibility(8);
        c().setVisibility(8);
        this.c.h(this);
        if (this.Y == null || this.Z == null) {
            return;
        }
        alhn alhnVar = this.as;
        final eqad e = e();
        final epzq F = F(0);
        alhnVar.o(new Supplier() { // from class: alhm
            @Override // java.util.function.Supplier
            public final Object get() {
                epyx epyxVar = (epyx) epyy.a.createBuilder();
                epyxVar.copyOnWrite();
                epyy epyyVar = (epyy) epyxVar.instance;
                eqad eqadVar = eqad.this;
                eqadVar.getClass();
                epyyVar.c = eqadVar;
                epyyVar.b |= 1;
                epyxVar.copyOnWrite();
                epyy epyyVar2 = (epyy) epyxVar.instance;
                epzq epzqVar = F;
                epzqVar.getClass();
                epyyVar2.d = epzqVar;
                epyyVar2.b |= 2;
                return (epyy) epyxVar.build();
            }
        });
    }

    public final void o() {
        if (this.N == null) {
            return;
        }
        if (x()) {
            g(this.ah);
            return;
        }
        if (this.t != null) {
            B(3);
        }
        p(this.N.b(), this.N.h());
    }

    public final void p(Uri uri, String str) {
        if (this.H.G() != null) {
            sfx a2 = this.ap.a("Bugle.Async.BuglePhotoViewController.onOptionsItemSelected.Duration");
            a2.b(uri, str, null, null);
            a2.e(new Void[0]);
        }
    }

    @Override // defpackage.cxra
    public final boolean q() {
        ea eaVar = this.t;
        if (eaVar == null) {
            return false;
        }
        dcwv H = ((dcwf) eaVar).H();
        if (H.d.e != eepw.a) {
            H.c.b().b(eepw.a);
            return true;
        }
        if (H.b()) {
            H.g();
            return true;
        }
        ellj.f(new dcvv(false), H.a);
        return true;
    }

    public final void r(View view, MediaViewerButton mediaViewerButton) {
        if (mediaViewerButton.a() != -1) {
            view.setContentDescription(this.H.Y(mediaViewerButton.a()));
        }
    }

    public final void s() {
        this.d.b(this.an.a(), new AnonymousClass3());
        this.q = d();
        this.r = f();
    }

    public final void t(MediaViewerButton mediaViewerButton) {
        if (!this.aa) {
            this.y.setAlpha(mediaViewerButton == null ? 0.0f : 1.0f);
        }
        if (!this.aa) {
            this.y.getLayoutParams().height = -2;
        }
        if (mediaViewerButton != null) {
            if (this.aa) {
                this.G.setText(mediaViewerButton.c());
                this.G.d(mediaViewerButton.b());
                r(this.G, mediaViewerButton);
                if (this.ab) {
                    this.G.setOnClickListener(new View.OnClickListener() { // from class: dctp
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dcty.this.m();
                        }
                    });
                } else {
                    this.G.setOnClickListener(new View.OnClickListener() { // from class: dctq
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            dcty.this.j();
                        }
                    });
                }
            } else {
                this.y.setText(mediaViewerButton.c());
                if (mediaViewerButton.b() != -1) {
                    TextView textView = this.y;
                    int b = mediaViewerButton.b();
                    int dimensionPixelSize = this.H.B().getDimensionPixelSize(R.dimen.media_viewer_button_drawable_padding);
                    int layoutDirection = textView.getContext().getResources().getConfiguration().getLayoutDirection();
                    int i = layoutDirection == 1 ? 0 : b;
                    if (layoutDirection != 1) {
                        b = 0;
                    }
                    textView.setCompoundDrawablesWithIntrinsicBounds(i, 0, b, 0);
                    textView.setCompoundDrawablePadding(dimensionPixelSize);
                }
                r(this.y, mediaViewerButton);
                this.y.setOnClickListener(new View.OnClickListener() { // from class: dctr
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dcty.this.m();
                    }
                });
            }
        }
        G(this.H.m.getString("content_type"));
        if (this.aa) {
            this.G.setAccessibilityDelegate(new dcug());
        } else {
            this.y.setAccessibilityDelegate(new dcug());
        }
    }

    public final void u(List list) {
        this.z.removeAllViews();
        if (list == null) {
            return;
        }
        emxf.b(this.p.size() <= 2, "Media Viewer should not have  more than two secondary buttons.");
        LayoutInflater K = this.H.K();
        for (int i = 0; i < list.size(); i++) {
            MediaViewerButton mediaViewerButton = (MediaViewerButton) list.get(i);
            if (this.aa && mediaViewerButton.c() == R.string.camera_add_more_media) {
                MaterialButton materialButton = (MaterialButton) K.inflate(R.layout.direct_send_viewer_add_more_button, (ViewGroup) this.z, false);
                this.z.addView(materialButton);
                emxf.a(mediaViewerButton.b() != -1);
                r(materialButton, mediaViewerButton);
                materialButton.setText(mediaViewerButton.c());
                materialButton.d(mediaViewerButton.b());
                if (this.aa) {
                    ddxx.b(materialButton, R.dimen.direct_send_viewer_secondary_button_margin);
                }
                if (i == list.size() - 1) {
                    ddxx.c(materialButton);
                }
                materialButton.setOnClickListener(new View.OnClickListener() { // from class: dctu
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        dcty.this.j();
                    }
                });
            } else {
                ImageView imageView = (ImageView) K.inflate(R.layout.media_viewer_secondary_button, (ViewGroup) this.z, false);
                this.z.addView(imageView);
                emxf.a(mediaViewerButton.b() != -1);
                imageView.setImageResource(mediaViewerButton.b());
                r(imageView, mediaViewerButton);
                ddxx.b(imageView, R.dimen.media_viewer_secondary_button_margin);
                if (i == list.size() - 1) {
                    ddxx.c(imageView);
                }
                this.I.b(imageView, mediaViewerButton.d());
            }
        }
        H(this.H.m.getString("content_type"));
    }

    public final void v(Uri uri, String str) {
        eg G;
        Intent S;
        if (this.N == null || (G = this.H.G()) == null) {
            return;
        }
        Context applicationContext = G.getApplicationContext();
        String o = csuu.o(uri);
        if (o == null) {
            S = akvg.S(applicationContext, uri, str);
        } else if (((ersq) ((arpk) this.ay).a.b()).a("bugle.enable_additional_logging_in_media_viewer_fragment_peer")) {
            try {
                S = akvg.S(applicationContext, FileProvider.a(applicationContext, this.aw.a, new File(o)), str);
            } catch (IllegalArgumentException e) {
                try {
                    o = new File(o).getCanonicalPath();
                } catch (IOException e2) {
                    ensk j = ao.j();
                    j.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) j).g(e2)).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1862, "MediaViewerFragmentPeer.java")).t("Failed to get canonical path for file: %s", o);
                }
                String absolutePath = applicationContext.getFilesDir().getAbsolutePath();
                try {
                    absolutePath = applicationContext.getFilesDir().getCanonicalPath();
                } catch (IOException e3) {
                    ensk j2 = ao.j();
                    j2.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) j2).g(e3)).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1869, "MediaViewerFragmentPeer.java")).t("Failed to get canonical path for files dir: %s", absolutePath);
                }
                String absolutePath2 = applicationContext.getCacheDir().getAbsolutePath();
                try {
                    absolutePath2 = applicationContext.getCacheDir().getCanonicalPath();
                } catch (IOException e4) {
                    ensk j3 = ao.j();
                    j3.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) ((enrr) j3).g(e4)).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1876, "MediaViewerFragmentPeer.java")).t("Failed to get canonical path for cache dir: %s", absolutePath2);
                }
                if (o.startsWith(absolutePath)) {
                    ensk j4 = ao.j();
                    j4.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j4).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1880, "MediaViewerFragmentPeer.java")).q("File URI starts with files path.");
                    throw e;
                }
                if (o.startsWith(absolutePath2)) {
                    ensk j5 = ao.j();
                    j5.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j5).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1882, "MediaViewerFragmentPeer.java")).q("File URI starts with cache path.");
                    throw e;
                }
                if (o.startsWith("/storage/")) {
                    ensk j6 = ao.j();
                    j6.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j6).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1884, "MediaViewerFragmentPeer.java")).q("File URI starts with /storage/.");
                    throw e;
                }
                if (o.startsWith("/cache/")) {
                    ensk j7 = ao.j();
                    j7.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j7).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1886, "MediaViewerFragmentPeer.java")).q("File URI starts with /cache/.");
                    throw e;
                }
                if (o.startsWith("/data/")) {
                    ensk j8 = ao.j();
                    j8.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j8).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1888, "MediaViewerFragmentPeer.java")).q("File URI starts with /data/.");
                    throw e;
                }
                if (o.startsWith("/mnt/")) {
                    ensk j9 = ao.j();
                    j9.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j9).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1890, "MediaViewerFragmentPeer.java")).q("File URI starts with /mnt/.");
                    throw e;
                }
                if (o.startsWith("/sdcard/")) {
                    ensk j10 = ao.j();
                    j10.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j10).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1892, "MediaViewerFragmentPeer.java")).q("File URI starts with /sdcard/.");
                    throw e;
                }
                if (o.startsWith("/tmp/")) {
                    ensk j11 = ao.j();
                    j11.Y(ente.a, "Bugle");
                    ((enrr) ((enrr) j11).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1894, "MediaViewerFragmentPeer.java")).q("File URI starts with /tmp/.");
                    throw e;
                }
                ensk j12 = ao.j();
                j12.Y(ente.a, "Bugle");
                ((enrr) ((enrr) j12).h("com/google/android/apps/messaging/ui/mediaviewer/MediaViewerFragmentPeer", "startShareActivity", 1896, "MediaViewerFragmentPeer.java")).q("File URI does not start with any standard paths.");
                throw e;
            }
        } else {
            S = akvg.S(applicationContext, FileProvider.a(applicationContext, this.aw.a, new File(o)), str);
        }
        G.startActivity(Intent.createChooser(S, this.H.G().getResources().getText(R.string.action_share)));
    }

    public final boolean w(Uri uri) {
        return uri != null && uri.equals(this.M);
    }

    public final boolean x() {
        ea eaVar = this.t;
        return eaVar != null && ((dcwf) eaVar).H().b();
    }

    public final boolean y() {
        return x() ? this.q != null : this.o != null;
    }

    /* compiled from: PG */
    /* renamed from: dcty$3, reason: invalid class name */
    class AnonymousClass3 implements ejwd<Boolean> {
        public AnonymousClass3() {
        }

        @Override // defpackage.ejwd
        public final /* bridge */ /* synthetic */ void b(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                dcty.a.r("Media editor library failed to load.");
                return;
            }
            dcty dctyVar = dcty.this;
            dctyVar.C.setVisibility(true != dctyVar.aa ? 0 : 8);
            dcty.this.C.setOnClickListener(new View.OnClickListener() { // from class: dcud
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    dcty.this.n();
                }
            });
        }

        @Override // defpackage.ejwd
        public final void hB() {
        }

        @Override // defpackage.ejwd
        public final void a(Throwable th) {
        }
    }
}
