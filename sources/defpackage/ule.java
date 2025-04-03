package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.util.Size;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.draft.model.GalleryContent;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerActivity;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerButton;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerPrimaryButtonEvent;
import com.google.android.apps.messaging.ui.mediaviewer.MediaViewerSaveButtonEvent;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ule implements dqlv, uic {
    private final uco c;
    private final adgn d;
    private final alcb e;
    private final Supplier f;
    private final eg g;
    private final adn h;
    private final aepg i;
    private final drun j;
    private static final List b = ffdx.g(eohh.GALLERY_CHOOSER, eohh.GALLERY_LIBRARY, eohh.DEVICE_CAMERA_APP, eohh.CAMERA, eohh.MINI_CAMERA, eohh.FULLSCREEN_CAMERA);
    public static final ffbz a = ffca.a(new ffix() { // from class: ukz
        @Override // defpackage.ffix
        public final Object invoke() {
            ffbz ffbzVar = ule.a;
            eptq eptqVar = (eptq) eptv.a.createBuilder();
            epts eptsVar = epts.CAMERA_GALLERY;
            eptqVar.copyOnWrite();
            eptv eptvVar = (eptv) eptqVar.instance;
            eptvVar.c = eptsVar.v;
            eptvVar.b |= 1;
            eptu eptuVar = eptu.EXPANDED;
            eptqVar.copyOnWrite();
            eptv eptvVar2 = (eptv) eptqVar.instance;
            eptvVar2.d = eptuVar.e;
            eptvVar2.b |= 2;
            eptv eptvVar3 = (eptv) eptqVar.build();
            dcle dcleVar = dcle.a;
            int i = dclf.b;
            return new dclg(eptvVar3);
        }
    });

    public ule(Activity activity, uco ucoVar, adgn adgnVar, alcb alcbVar, adgn adgnVar2, Supplier supplier) {
        this.c = ucoVar;
        this.d = adgnVar;
        this.e = alcbVar;
        this.f = supplier;
        this.i = (aepg) adgnVar.a().orElse(null);
        this.j = (drun) adgnVar2.a().orElse(null);
        if (!(activity instanceof eg)) {
            throw new IllegalStateException("Check failed.");
        }
        eg egVar = (eg) activity;
        this.g = egVar;
        this.h = egVar.h;
    }

    static /* synthetic */ MessagePartCoreData g(ule uleVar, drni drniVar, boolean z, Uri uri, String str, Enum r7, int i) {
        int i2 = i & 2;
        doxr doxrVar = drniVar.g;
        if (!z || !(i2 == 0)) {
            if ((i & 16) != 0) {
                r7 = null;
            }
            uco ucoVar = uleVar.c;
            String str2 = drniVar.b;
            ufk o = GalleryContent.o();
            o.k(Uri.parse(str2));
            o.f(drjy.a(drniVar.a).a());
            ((uec) o).a = new Size(drniVar.d, drniVar.e);
            o.e(uee.a(doxrVar));
            o.i(drniVar.f.toEpochMilli());
            o.j(r7 == drwg.a ? byza.GOOGLE_PHOTOS_LINK : byza.STANDARD);
            return ucoVar.a(o.l(), ulb.a());
        }
        if (!(doxrVar instanceof dpgo)) {
            throw new IllegalStateException("Check failed.");
        }
        if ((i & 4) != 0) {
            uri = null;
        }
        uco ucoVar2 = uleVar.c;
        uez o2 = ufa.o();
        if (uri == null) {
            uri = Uri.parse(drniVar.b);
        }
        if ((i & 8) != 0) {
            str = null;
        }
        o2.l(uri);
        if (str == null) {
            str = drjy.a(drniVar.a).a();
        }
        o2.g(str);
        ((ueh) o2).a = new Size(drniVar.d, drniVar.e);
        o2.f(uee.a(doxrVar));
        o2.j(drniVar.f.toEpochMilli());
        o2.e(uil.a((dpgo) doxrVar, 2));
        return ucoVar2.a(o2.m(), ulb.a());
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ Object a(doxs doxsVar, ffgu ffguVar) {
        View findViewById;
        final drni drniVar = (drni) doxsVar;
        doxr doxrVar = drniVar.g;
        if (!(doxrVar instanceof dpgo)) {
            if ((doxrVar instanceof dpgq) || (doxrVar instanceof dpgj) || (doxrVar instanceof doya)) {
                return f(drniVar, ffguVar);
            }
            Objects.toString(doxrVar);
            throw new IllegalStateException("Invalid AttachmentSource: ".concat(doxrVar.toString()));
        }
        dpgo dpgoVar = (dpgo) doxrVar;
        kli kliVar = null;
        if (dpgoVar.a != dpgl.a) {
            return e(drniVar, null, null);
        }
        Integer num = dpgoVar.c;
        if (num != null && (findViewById = this.g.findViewById(num.intValue())) != null) {
            kliVar = kli.b(findViewById, findViewById.getWidth(), findViewById.getHeight());
        }
        adg b2 = this.h.b("compose_media_viewer", new ael(), new adf() { // from class: ula
            @Override // defpackage.adf
            public final void a(Object obj) {
                ade adeVar = (ade) obj;
                adeVar.getClass();
                if (adeVar.a == -1) {
                    drni drniVar2 = drniVar;
                    ule uleVar = ule.this;
                    Intent intent = adeVar.b;
                    intent.getClass();
                    uleVar.e(drniVar2, (Uri) intent.getParcelableExtra("android.intent.extra.STREAM"), intent.getType());
                }
            }
        });
        Intent putExtra = new Intent(this.g, (Class<?>) MediaViewerActivity.class).setFlags(536870912).putExtra(ConversationSuggestion.SUGGESTION_PROPERTY_WEB_URI, Uri.parse(drniVar.b)).putExtra("opening_source", 6);
        dctk e = MediaViewerButton.e();
        e.e(R.string.camera_attach_media);
        e.d(R.drawable.quantum_ic_check_white_24);
        e.b(R.string.camera_attach_media_description);
        e.c(new MediaViewerPrimaryButtonEvent());
        Intent putExtra2 = putExtra.putExtra("primary_button", e.a());
        dctk e2 = MediaViewerButton.e();
        e2.b(R.string.media_viewer_save_media_description);
        e2.d(R.drawable.quantum_ic_save_alt_white_24);
        e2.c(new MediaViewerSaveButtonEvent());
        Intent putExtra3 = putExtra2.putParcelableArrayListExtra("secondary_button_list", new ArrayList<>(ffdx.b(e2.a()))).putExtra("media_editor_type", 1).putExtra("content_type", drjy.a(drniVar.a).a());
        Object e3 = dcut.d.e();
        e3.getClass();
        Intent putExtra4 = putExtra3.putExtra("open_in_editor", ((Boolean) e3).booleanValue());
        putExtra4.getClass();
        b2.a(putExtra4, kliVar);
        return dqmj.a;
    }

    @Override // defpackage.dqlv
    public final /* synthetic */ void c(doxs doxsVar) {
        ((drni) doxsVar).getClass();
    }

    @Override // defpackage.dqlv
    public final /* bridge */ /* synthetic */ void d(doxs doxsVar) {
        Object obj;
        drni drniVar = (drni) doxsVar;
        MessagePartCoreData g = g(this, drniVar, false, null, null, null, 30);
        obj = this.f.get();
        ((ugl) obj).h(g(this, drniVar, false, null, null, null, 30));
        this.e.h(g.O());
    }

    public final dqml e(drni drniVar, Uri uri, String str) {
        Object obj;
        Supplier supplier = this.f;
        MessagePartCoreData g = g(this, drniVar, true, uri, str, null, 16);
        obj = supplier.get();
        int c = ((ugl) obj).c(g);
        if (c < 0) {
            return new dqmk(new uia(drniVar));
        }
        this.e.g(g.O(), c);
        return dqmj.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x008f, code lost:
    
        if (r9 == null) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(defpackage.drni r8, defpackage.ffgu r9) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ule.f(drni, ffgu):java.lang.Object");
    }

    @Override // defpackage.uic
    public final /* synthetic */ ffji h() {
        return uld.a;
    }

    @Override // defpackage.uic
    public final boolean i(MessagePartCoreData messagePartCoreData) {
        messagePartCoreData.getClass();
        return messagePartCoreData.bo() && b.contains(messagePartCoreData.N());
    }

    @Override // defpackage.dqlv
    public final /* synthetic */ void b() {
    }
}
