package defpackage;

import androidx.car.app.navigation.model.Maneuver;

/* compiled from: PG */
/* loaded from: classes5.dex */
public enum eohh implements eyge {
    NOT_AVAILABLE(0),
    UNKNOWN(1),
    TEXT_PART(2),
    CAMERA(3),
    GALLERY_CHOOSER(4),
    GALLERY_LIBRARY(5),
    LOCATION_CURRENT(6),
    LOCATION_BROWSE(7),
    LOCATION_SEARCH(8),
    LOCATION_CUSTOM(9),
    AUDIO_CHOOSER(10),
    STICKER_CHOOSER(11),
    SHARE(12),
    DRAFT(13),
    FORWARD(14),
    RICH_CARD(15),
    RICH_CARD_MEDIA(18),
    RICH_CARD_THUMBNAIL(19),
    RICH_CARD_CAROUSEL(22),
    MONEY_SEND(16),
    MONEY_REQUEST(17),
    SUGGESTED_REPLY_RESPONSE(20),
    SUGGESTED_ACTION_RESPONSE(21),
    BLOBSTORE(23),
    RBM_PAYMENT_RECEIPT(24),
    GIF_CHOOSER(25),
    EXPRESSIVE_STICKER_CHOOSER(26),
    EXPRESSIVE_STICKER_PACK_DETAILS(34),
    EXPRESSIVE_STICKER_GALLERY_SEARCH(35),
    CONTACT_CHOOSER(27),
    TOMBSTONE_PART(28),
    CONTACT_SUGGESTION(29),
    RECENT_IMAGE_SUGGESTION(30),
    GBOARD_EMOJI(31),
    FILE_CHOOSER(32),
    UNKNOWN_IME(33),
    STICKER_SUGGESTION(36),
    MEDIA_EDITOR_ATTACH(37),
    VIDEO_TRIMMER(38),
    DEVICE_CAMERA_APP(39),
    CLIPBOARD(40),
    DRAG_AND_DROP(41),
    MINI_CAMERA(42),
    FULLSCREEN_CAMERA(43),
    CUSTOM_STICKER_SELF_OWNED(44),
    CUSTOM_STICKER_AUTO_SAVED(45),
    POPUP_CAMERA(46),
    UNRECOGNIZED(-1);

    private final int X;

    eohh(int i) {
        this.X = i;
    }

    public static eohh b(int i) {
        switch (i) {
            case 0:
                return NOT_AVAILABLE;
            case 1:
                return UNKNOWN;
            case 2:
                return TEXT_PART;
            case 3:
                return CAMERA;
            case 4:
                return GALLERY_CHOOSER;
            case 5:
                return GALLERY_LIBRARY;
            case 6:
                return LOCATION_CURRENT;
            case 7:
                return LOCATION_BROWSE;
            case 8:
                return LOCATION_SEARCH;
            case 9:
                return LOCATION_CUSTOM;
            case 10:
                return AUDIO_CHOOSER;
            case 11:
                return STICKER_CHOOSER;
            case 12:
                return SHARE;
            case 13:
                return DRAFT;
            case 14:
                return FORWARD;
            case 15:
                return RICH_CARD;
            case 16:
                return MONEY_SEND;
            case 17:
                return MONEY_REQUEST;
            case 18:
                return RICH_CARD_MEDIA;
            case 19:
                return RICH_CARD_THUMBNAIL;
            case 20:
                return SUGGESTED_REPLY_RESPONSE;
            case 21:
                return SUGGESTED_ACTION_RESPONSE;
            case 22:
                return RICH_CARD_CAROUSEL;
            case 23:
                return BLOBSTORE;
            case 24:
                return RBM_PAYMENT_RECEIPT;
            case 25:
                return GIF_CHOOSER;
            case 26:
                return EXPRESSIVE_STICKER_CHOOSER;
            case 27:
                return CONTACT_CHOOSER;
            case 28:
                return TOMBSTONE_PART;
            case 29:
                return CONTACT_SUGGESTION;
            case 30:
                return RECENT_IMAGE_SUGGESTION;
            case 31:
                return GBOARD_EMOJI;
            case 32:
                return FILE_CHOOSER;
            case 33:
                return UNKNOWN_IME;
            case 34:
                return EXPRESSIVE_STICKER_PACK_DETAILS;
            case 35:
                return EXPRESSIVE_STICKER_GALLERY_SEARCH;
            case 36:
                return STICKER_SUGGESTION;
            case 37:
                return MEDIA_EDITOR_ATTACH;
            case 38:
                return VIDEO_TRIMMER;
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return DEVICE_CAMERA_APP;
            case 40:
                return CLIPBOARD;
            case 41:
                return DRAG_AND_DROP;
            case 42:
                return MINI_CAMERA;
            case 43:
                return FULLSCREEN_CAMERA;
            case 44:
                return CUSTOM_STICKER_SELF_OWNED;
            case 45:
                return CUSTOM_STICKER_AUTO_SAVED;
            case 46:
                return POPUP_CAMERA;
            default:
                return null;
        }
    }

    @Override // defpackage.eyge
    public final int a() {
        if (this != UNRECOGNIZED) {
            return this.X;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(a());
    }
}
