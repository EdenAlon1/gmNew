package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcfz implements dcaz {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public dcfz(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffbrVar4;
        this.e = ffbrVar5;
    }

    @Override // defpackage.dcaz
    public final /* synthetic */ dcae a(final dcbc dcbcVar) {
        final ugs ugsVar = (ugs) this.a.b();
        ugsVar.getClass();
        cuxz cuxzVar = (cuxz) this.b.b();
        cuxzVar.getClass();
        dcft dcftVar = (dcft) this.c.b();
        dcftVar.getClass();
        ctud ctudVar = (ctud) this.d.b();
        ctudVar.getClass();
        dcav dcavVar = (dcav) dcbcVar;
        dchw dchwVar = (dchw) new deaf(dcavVar.a, dchy.class).b(this.e);
        eymn eymnVar = eymn.GALLERY;
        dcab dcabVar = new dcab() { // from class: dcfw
            @Override // defpackage.dcab
            public final void e(eptm eptmVar) {
                int i = dcfy.m;
                dcav dcavVar2 = (dcav) dcbc.this;
                dcavVar2.d.k(ugsVar.a(), eptmVar, dcavVar2.b);
            }
        };
        int i = dcavVar.h;
        czgy czgyVar = dcavVar.g;
        ContentGridView contentGridView = dcavVar.i;
        AttachmentQueueState attachmentQueueState = dcavVar.b;
        return new dcfy(cuxzVar, dcftVar, ctudVar, dchwVar, eymnVar, dcavVar.a, dcavVar.d, attachmentQueueState, dcabVar, contentGridView, czgyVar, i, 1L);
    }
}
