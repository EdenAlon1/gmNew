package defpackage;

import com.google.android.apps.messaging.ui.mediapicker.audio.AudioContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.contact.VCardContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.MediaContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.expressivesticker.ExpressiveStickerContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.file.FileContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.CameraContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gallery.data.GalleryContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.gif.GifContentItem;
import com.google.android.apps.messaging.ui.mediapicker.c2o.location.LocationContentItem;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dcll {
    public static eppr a(MediaContentItem mediaContentItem, dcle dcleVar) {
        eppq eppqVar = (eppq) eppr.a.createBuilder();
        if (mediaContentItem instanceof AudioContentItem) {
            dclc.c(eppqVar, ((AudioContentItem) mediaContentItem).a);
        } else if (mediaContentItem instanceof ExpressiveStickerContentItem) {
            ExpressiveStickerContentItem expressiveStickerContentItem = (ExpressiveStickerContentItem) mediaContentItem;
            dclc.j(eppqVar, b(expressiveStickerContentItem), eerv.c(expressiveStickerContentItem.a));
        } else if (mediaContentItem instanceof CameraContentItem) {
            CameraContentItem cameraContentItem = (CameraContentItem) mediaContentItem;
            dclc.d(eppqVar, b(cameraContentItem), cameraContentItem.e, cameraContentItem.a);
        } else if (mediaContentItem instanceof GalleryContentItem) {
            GalleryContentItem galleryContentItem = (GalleryContentItem) mediaContentItem;
            dclc.h(eppqVar, b(galleryContentItem), galleryContentItem.a, galleryContentItem.d);
        } else if (mediaContentItem instanceof GifContentItem) {
            GifContentItem gifContentItem = (GifContentItem) mediaContentItem;
            dclc.f(eppqVar, b(gifContentItem), gifContentItem.f);
        } else if (mediaContentItem instanceof LocationContentItem) {
            dclc.i(eppqVar);
        } else if (mediaContentItem instanceof VCardContentItem) {
            dclc.l(eppqVar, 1);
        } else {
            if (!(mediaContentItem instanceof FileContentItem)) {
                throw new IllegalArgumentException("Invalid content item ".concat(String.valueOf(String.valueOf(mediaContentItem))));
            }
            FileContentItem fileContentItem = (FileContentItem) mediaContentItem;
            dclc.e(eppqVar, fileContentItem.e, fileContentItem.c);
        }
        dcleVar.a(eppqVar);
        return (eppr) eppqVar.build();
    }

    @Deprecated
    private static epqs b(MediaContentItem mediaContentItem) {
        epqs epqsVar = (epqs) eprl.a.createBuilder();
        int c = mediaContentItem.c();
        epqsVar.copyOnWrite();
        eprl eprlVar = (eprl) epqsVar.instance;
        eprlVar.b |= 1;
        eprlVar.e = c;
        int b = mediaContentItem.b();
        epqsVar.copyOnWrite();
        eprl eprlVar2 = (eprl) epqsVar.instance;
        eprlVar2.b |= 2;
        eprlVar2.f = b;
        String f = mediaContentItem.f();
        epqsVar.copyOnWrite();
        eprl eprlVar3 = (eprl) epqsVar.instance;
        f.getClass();
        eprlVar3.b |= 8;
        eprlVar3.g = f;
        dclc.b(mediaContentItem.e(), epqsVar);
        return epqsVar;
    }
}
