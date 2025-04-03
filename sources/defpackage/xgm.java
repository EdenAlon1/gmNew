package defpackage;

import com.google.android.apps.messaging.conversation.input.compose.VideoTrimmerSource;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xgm {
    public static final xgm a = new xgm();
    private static final enru b = enru.c("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/OriginSetter");

    private xgm() {
    }

    public static final void b(epog epogVar, int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                d(epogVar, epts.EMOJI, null);
                return;
            }
            if (i2 != 4) {
                epql epqlVar = (epql) epqn.a.createBuilder();
                epqlVar.getClass();
                eqrz.b(1, epqlVar);
                epogVar.c(eqrz.a(epqlVar));
                return;
            }
            epql epqlVar2 = (epql) epqn.a.createBuilder();
            epqlVar2.getClass();
            eqrz.b(2, epqlVar2);
            epogVar.c(eqrz.a(epqlVar2));
        }
    }

    public static final void c(epog epogVar, doxr doxrVar, ffmo ffmoVar) {
        if (doxrVar instanceof doyb) {
            doyb doybVar = (doyb) doxrVar;
            if (doybVar instanceof doya) {
                d(epogVar, epts.FILE, null);
                return;
            }
            if (!(doybVar instanceof drnj)) {
                ensk i = b.i();
                i.Y(ente.a, "BugleComposeRow2");
                ((enrr) i.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/OriginSetter", "setLocalAttachmentOrigin", 139, "OriginSetter.kt")).t("Cannot set AttachmentInfo Origin for unknown LocalAttachment.Source %s", doybVar);
                return;
            }
            drnj drnjVar = (drnj) doybVar;
            if (drnjVar instanceof dpgj) {
                d(epogVar, epts.CAMERA_GALLERY, null);
                return;
            }
            if (drnjVar instanceof dpgr) {
                dpgr dpgrVar = (dpgr) drnjVar;
                if (dpgrVar instanceof dpgo) {
                    d(epogVar, epts.CAMERA_GALLERY, ((dpgo) dpgrVar).a == dpgl.b ? eptu.EXPANDED : null);
                    return;
                } else {
                    if (!(dpgrVar instanceof dpgq)) {
                        throw new ffcd();
                    }
                    d(epogVar, epts.CAMERA_GALLERY, eptu.EXPANDED);
                    return;
                }
            }
            if (drnjVar instanceof dqzn) {
                d(epogVar, epts.EMOTIFY, null);
                return;
            }
            if (drnjVar instanceof dtem) {
                d(epogVar, epts.VOICE, null);
                return;
            } else {
                if (drnjVar instanceof VideoTrimmerSource) {
                    d(epogVar, epts.UNKNOWN_COMPOSE_SCREEN_CATEGORY, null);
                    return;
                }
                ensk i2 = b.i();
                i2.Y(ente.a, "BugleComposeRow2");
                ((enrr) i2.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/OriginSetter", "setLocalMediaOrigin", 154, "OriginSetter.kt")).t("Cannot set AttachmentInfo Origin for unknown LocalMedia.Source %s", drnjVar);
                return;
            }
        }
        if (!(doxrVar instanceof drek)) {
            if (!(doxrVar instanceof doxm)) {
                if (doxrVar instanceof doxo) {
                    d(epogVar, epts.EXTERNAL, null);
                    return;
                } else {
                    if (doxrVar instanceof doxq) {
                        d(epogVar, epts.UNKNOWN_COMPOSE_SCREEN_CATEGORY, null);
                        return;
                    }
                    return;
                }
            }
            doxm doxmVar = (doxm) doxrVar;
            int i3 = doxmVar.b - 1;
            if (i3 != 2 && i3 != 3) {
                d(epogVar, epts.EXTERNAL, null);
                return;
            }
            epql epqlVar = (epql) epqn.a.createBuilder();
            epqlVar.getClass();
            String str = doxmVar.a;
            eqrz.b((str == null || !ffpc.t(str, "com.google.android.inputmethod.latin")) ? 1 : 2, epqlVar);
            epogVar.c(eqrz.a(epqlVar));
            return;
        }
        drek drekVar = (drek) doxrVar;
        if (!(drekVar instanceof drej)) {
            if (drekVar instanceof dsch) {
                if (!ffkj.e((dsch) drekVar, dsch.a)) {
                    throw new ffcd();
                }
                d(epogVar, epts.STICKER, null);
                return;
            } else {
                ensk i4 = b.i();
                i4.Y(ente.a, "BugleComposeRow2");
                ((enrr) i4.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/OriginSetter", "setGifStickerMediaOrigin", 195, "OriginSetter.kt")).t("Cannot set AttachmentInfo Origin for unknown GifStickerMedia.Source %s", drekVar);
                return;
            }
        }
        int i5 = fflc.a;
        if (ffkj.e(ffmoVar, new ffkb(drcr.class))) {
            d(epogVar, epts.GIF, null);
            return;
        }
        if (ffkj.e(ffmoVar, new ffkb(dsci.class))) {
            d(epogVar, epts.STICKER, null);
        } else {
            if (ffmoVar == null) {
                d(epogVar, epts.EMOTIVE, null);
                return;
            }
            ensk i6 = b.i();
            i6.Y(ente.a, "BugleComposeRow2");
            ((enrr) i6.h("com/google/android/apps/messaging/conversation2/bottomcontent/composerow/analytics/attachment/OriginSetter", "setGifStickerMediaOrigin", 185, "OriginSetter.kt")).t("Cannot set AttachmentInfo Origin for GifStickerMedia.Source with attachment type", ffmoVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(epog epogVar, epts eptsVar, eptu eptuVar) {
        eptq eptqVar = (eptq) eptv.a.createBuilder();
        eptqVar.getClass();
        eqni.b(eptsVar, eptqVar);
        if (eptuVar != null) {
            eqni.c(eptuVar, eptqVar);
        }
        epogVar.e(eqni.a(eptqVar));
    }
}
