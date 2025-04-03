package defpackage;

import com.google.android.apps.messaging.conversation.input.compose.VideoTrimmerSource;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uee {
    private static final enru a = enru.c("com/google/android/apps/messaging/conversation/draft/model/AttachmentSourceToBugleMessageAttachmentSourceKt");

    public static final eohh a(doxr doxrVar) {
        if (doxrVar instanceof dpgq) {
            return eohh.DEVICE_CAMERA_APP;
        }
        if (doxrVar instanceof dpgo) {
            int ordinal = ((dpgo) doxrVar).a.ordinal();
            if (ordinal == 0) {
                return eohh.MINI_CAMERA;
            }
            if (ordinal == 1) {
                return eohh.FULLSCREEN_CAMERA;
            }
            if (ordinal == 2) {
                return eohh.POPUP_CAMERA;
            }
            throw new ffcd();
        }
        if (doxrVar instanceof dpgj) {
            dpgj dpgjVar = (dpgj) doxrVar;
            if (ffkj.e(dpgjVar, dpgg.a)) {
                return eohh.GALLERY_CHOOSER;
            }
            if (ffkj.e(dpgjVar, dpgi.a)) {
                return eohh.GALLERY_LIBRARY;
            }
            throw new ffcd();
        }
        if (doxrVar instanceof doya) {
            return eohh.FILE_CHOOSER;
        }
        if (doxrVar instanceof dsch) {
            return eohh.EXPRESSIVE_STICKER_CHOOSER;
        }
        if (doxrVar instanceof drej) {
            return eohh.GIF_CHOOSER;
        }
        if (doxrVar instanceof doxm) {
            int i = ((doxm) doxrVar).b - 1;
            return (i == 0 || i == 1) ? eohh.SHARE : i != 2 ? i != 3 ? eohh.DRAG_AND_DROP : eohh.CLIPBOARD : eohh.UNKNOWN_IME;
        }
        if (doxrVar instanceof VideoTrimmerSource) {
            return eohh.VIDEO_TRIMMER;
        }
        if (doxrVar instanceof dqzn) {
            return ((dqzn) doxrVar).a() ? eohh.CUSTOM_STICKER_SELF_OWNED : eohh.CUSTOM_STICKER_AUTO_SAVED;
        }
        enrr enrrVar = (enrr) a.i();
        Objects.toString(doxrVar);
        ((enrr) enrrVar.g(new IllegalStateException("Unhandled attachment source ".concat(doxrVar.toString()))).h("com/google/android/apps/messaging/conversation/draft/model/AttachmentSourceToBugleMessageAttachmentSourceKt", "toBugleMessageAttachmentSource", 60, "AttachmentSourceToBugleMessageAttachmentSource.kt")).q("Falling back to NOT_AVAILABLE");
        return eohh.NOT_AVAILABLE;
    }
}
