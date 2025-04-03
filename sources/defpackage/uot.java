package defpackage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.MessagePartData;
import com.google.android.apps.messaging.shared.datamodel.data.PendingAttachmentData;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.ui.mediapicker.audio.AudioContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.file.FileContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uot {
    private final bcxm a;
    private final bcwz b;

    public uot(bcxm bcxmVar, bcwz bcwzVar) {
        this.a = bcxmVar;
        this.b = bcwzVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v69, types: [com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData] */
    public final MessagePartCoreData a(MediaContentItem mediaContentItem, dcle dcleVar) {
        MessagePartData pendingAttachmentData;
        MessagePartData messagePartData;
        boolean z = mediaContentItem instanceof LocationContentItem;
        Uri e = mediaContentItem.e();
        String f = mediaContentItem.f();
        int c = mediaContentItem.c();
        int b = mediaContentItem.b();
        if (z) {
            messagePartData = ((LocationContentItem) mediaContentItem).a;
        } else {
            eohh eohhVar = mediaContentItem.d;
            if (mediaContentItem instanceof AudioContentItem) {
                bcwz bcwzVar = this.b;
                bcxb C = bcxc.C();
                bcqk bcqkVar = (bcqk) C;
                bcqkVar.c = f;
                bcqkVar.d = e;
                bcqkVar.e = e;
                C.g(((AudioContentItem) mediaContentItem).a);
                C.o(eohhVar);
                messagePartData = bcwzVar.c(C.r());
            } else if (mediaContentItem instanceof CameraContentItem) {
                CameraContentItem cameraContentItem = (CameraContentItem) mediaContentItem;
                bcwz bcwzVar2 = this.b;
                bcxb C2 = bcxc.C();
                bcqk bcqkVar2 = (bcqk) C2;
                bcqkVar2.c = f;
                bcqkVar2.d = e;
                bcqkVar2.e = e;
                C2.q(c);
                C2.i(b);
                C2.g(cameraContentItem.e);
                C2.o(eohhVar);
                C2.j(cameraContentItem.f);
                messagePartData = bcwzVar2.c(C2.r());
            } else if (mediaContentItem instanceof GalleryContentItem) {
                GalleryContentItem galleryContentItem = (GalleryContentItem) mediaContentItem;
                bcwz bcwzVar3 = this.b;
                bcxb C3 = bcxc.C();
                bcqk bcqkVar3 = (bcqk) C3;
                bcqkVar3.c = f;
                bcqkVar3.d = e;
                bcqkVar3.e = e;
                C3.q(c);
                C3.i(b);
                C3.g(galleryContentItem.a);
                C3.o(eohhVar);
                C3.j(galleryContentItem.e);
                C3.k(galleryContentItem.f);
                pendingAttachmentData = bcwzVar3.c(C3.r());
                if (galleryContentItem.f != byza.GOOGLE_PHOTOS_LINK) {
                    messagePartData = this.a.a(pendingAttachmentData);
                }
                messagePartData = pendingAttachmentData;
            } else if (mediaContentItem instanceof GifContentItem) {
                PendingAttachmentData b2 = this.a.b("image/gif", mediaContentItem.e(), eohh.GIF_CHOOSER);
                b2.m = ((GifContentItem) mediaContentItem).e;
                messagePartData = b2;
            } else if (mediaContentItem instanceof ExpressiveStickerContentItem) {
                bcxm bcxmVar = this.a;
                String str = ((ExpressiveStickerContentItem) mediaContentItem).a;
                ctfj ctfjVar = (ctfj) bcxmVar.a.b();
                ctfjVar.getClass();
                Context context = (Context) bcxmVar.b.b();
                context.getClass();
                csuk csukVar = (csuk) bcxmVar.c.b();
                csukVar.getClass();
                cpbs cpbsVar = (cpbs) bcxmVar.d.b();
                cpbsVar.getClass();
                csuu csuuVar = (csuu) bcxmVar.e.b();
                csuuVar.getClass();
                bcwz bcwzVar4 = (bcwz) bcxmVar.f.b();
                bcwzVar4.getClass();
                cbar cbarVar = (cbar) bcxmVar.g.b();
                cbarVar.getClass();
                ffbr ffbrVar = bcxmVar.h;
                cpaz cpazVar = (cpaz) bcxmVar.i.b();
                cpazVar.getClass();
                bcxm bcxmVar2 = (bcxm) bcxmVar.u.b();
                bcxmVar2.getClass();
                ctap ctapVar = (ctap) bcxmVar.j.b();
                ctapVar.getClass();
                cqoh cqohVar = (cqoh) bcxmVar.k.b();
                cqohVar.getClass();
                ctyz ctyzVar = (ctyz) bcxmVar.l.b();
                ctyzVar.getClass();
                cswf cswfVar = (cswf) bcxmVar.m.b();
                cswfVar.getClass();
                Optional optional = (Optional) bcxmVar.n.b();
                optional.getClass();
                ctfn ctfnVar = (ctfn) bcxmVar.o.b();
                ctfnVar.getClass();
                errl errlVar = (errl) bcxmVar.p.b();
                errlVar.getClass();
                asmj asmjVar = (asmj) bcxmVar.q.b();
                asmjVar.getClass();
                ffbr ffbrVar2 = bcxmVar.r;
                eohhVar.getClass();
                str.getClass();
                aswd aswdVar = (aswd) bcxmVar.s.b();
                aswdVar.getClass();
                pendingAttachmentData = new PendingAttachmentData(ctfjVar, context, csukVar, cpbsVar, csuuVar, bcwzVar4, cbarVar, ffbrVar, cpazVar, bcxmVar2, ctapVar, cqohVar, ctyzVar, cswfVar, optional, ctfnVar, errlVar, asmjVar, ffbrVar2, null, f, e, null, c, b, null, null, -1L, eohhVar, -1L, null, str, null, aswdVar);
                messagePartData = pendingAttachmentData;
            } else if (mediaContentItem instanceof FileContentItem) {
                FileContentItem fileContentItem = (FileContentItem) mediaContentItem;
                messagePartData = this.a.d(f, e, null, c, b, fileContentItem.e, eohhVar, null, null, -1L, null, fileContentItem.a);
            } else {
                bcwz bcwzVar5 = this.b;
                bcxb C4 = bcxc.C();
                bcqk bcqkVar4 = (bcqk) C4;
                bcqkVar4.c = f;
                bcqkVar4.d = e;
                bcqkVar4.e = e;
                C4.q(c);
                C4.i(b);
                C4.o(eohhVar);
                C4.j(mediaContentItem.d());
                messagePartData = bcwzVar5.c(C4.r());
            }
        }
        messagePartData.an(dcll.a(mediaContentItem, dcleVar));
        return messagePartData;
    }
}
