package defpackage;

import android.R;
import android.content.Intent;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.GalleryBrowserActivity;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcew extends dcey implements eivv {
    public final GalleryBrowserActivity a;
    public abo b;
    private final ffbr d;

    public dcew(GalleryBrowserActivity galleryBrowserActivity, eito eitoVar, ffbr ffbrVar) {
        this.a = galleryBrowserActivity;
        this.d = ffbrVar;
        eitoVar.e(this);
    }

    @Override // defpackage.eivv
    public final void aa(eivt eivtVar) {
        eisx a = eivtVar.a();
        dcer dcerVar = (dcer) dces.a.createBuilder();
        long j = ((dbxx) this.a).G;
        Long.valueOf(j).getClass();
        dcerVar.copyOnWrite();
        ((dces) dcerVar.instance).b = j;
        boolean z = ((dbxx) this.a).H;
        dcerVar.copyOnWrite();
        ((dces) dcerVar.instance).c = z;
        dces dcesVar = (dces) dcerVar.build();
        dcdf dcdfVar = new dcdf();
        fbae.e(dcdfVar);
        ekky.b(dcdfVar, a);
        ekku.a(dcdfVar, dcesVar);
        cg cgVar = new cg(this.a.a());
        cgVar.x(R.id.content, dcdfVar, "gallery_browser_fragment_tag");
        cgVar.c();
    }

    @Override // defpackage.eivv
    public final void ac(eiup eiupVar) {
        ((adio) this.d.b()).a(eiupVar);
    }

    final void e() {
        Intent intent = new Intent();
        intent.putExtra("attachment_queue_state_extra_key", ((dbxx) this.a).n);
        this.a.setResult(-1, intent);
        this.a.finish();
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void ab() {
    }

    @Override // defpackage.eivv
    public final /* synthetic */ void d() {
    }
}
