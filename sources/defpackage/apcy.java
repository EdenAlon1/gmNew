package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class apcy {
    public final /* synthetic */ fbuk a;

    public apcy(fbuk fbukVar) {
        this.a = fbukVar;
    }

    public final int a() {
        return this.a.i;
    }

    public final int b() {
        return this.a.h;
    }

    public final appv c() {
        int i;
        fbuk fbukVar = this.a;
        fbqt b = fbqt.b(fbukVar.e);
        if (b == null) {
            b = fbqt.UNRECOGNIZED;
        }
        switch (b) {
            case UNSPECIFIED:
                return appv.UNSPECIFIED;
            case OTP:
                return appv.OTP;
            case LINK_ANNOTATION:
                return appv.LINK;
            case LINK_PREVIEW_ANNOTATION:
                return appv.LINK;
            case ASSISTANT_ANNOTATION:
                return appv.ASSISTANT;
            case CONTACT_ANNOTATION:
                return appv.CONTACT;
            case ADDRESS_ANNOTATION:
                return appv.ADDRESS;
            case WEBREF_ANNOTATION:
                return appv.LINK;
            case SIMPLE_ANNOTATION:
                return appv.UNSPECIFIED;
            case MONEY_ANNOTATION:
                return appv.MONEY;
            case DATETIME_ANNOTATION:
                return appv.DATE;
            case TIMELIKE:
                return appv.UNSPECIFIED;
            case NUDGE_ANNOTATION:
                return appv.NUDGE;
            case YOUTUBE_ANNOTATION:
                return appv.LINK;
            case MAP_LINK_ANNOTATION:
                return appv.LINK;
            case EMAIL_ANNOTATION:
                return appv.EMAIL;
            case PHONE_ANNOTATION:
                return appv.PHONE;
            case UX_COMPONENT_ANNOTATION:
                if (fbom.b(fbukVar) != null) {
                    return appv.LINK;
                }
                if (fbom.a(fbukVar) != null) {
                    return appv.IMAGE;
                }
                if (fbom.c(fbukVar) != null) {
                    return appv.ORIGINAL_TEXT;
                }
                switch (fbukVar.g) {
                    case 0:
                        i = 2;
                        break;
                    case 1:
                        i = 3;
                        break;
                    case 2:
                        i = 4;
                        break;
                    case 3:
                        i = 5;
                        break;
                    case 4:
                        i = 6;
                        break;
                    case 5:
                        i = 7;
                        break;
                    case 6:
                        i = 8;
                        break;
                    case 7:
                        i = 9;
                        break;
                    case 8:
                        i = 10;
                        break;
                    case 9:
                        i = 11;
                        break;
                    case 10:
                        i = 12;
                        break;
                    case 11:
                        i = 13;
                        break;
                    case 12:
                        i = 14;
                        break;
                    case 13:
                        i = 15;
                        break;
                    case 14:
                        i = 16;
                        break;
                    case 15:
                        i = 17;
                        break;
                    case 16:
                        i = 18;
                        break;
                    case 17:
                        i = 19;
                        break;
                    case 18:
                        i = 20;
                        break;
                    default:
                        i = 0;
                        break;
                }
                if (i == 0) {
                    i = 1;
                }
                switch (i - 2) {
                    case 4:
                        return appv.BOLD;
                    case 5:
                        return appv.ITALICS;
                    case 6:
                        return appv.STRIKETHROUGH;
                    case 7:
                        return appv.MONOSPACE;
                    case 8:
                    case 11:
                    case 12:
                    default:
                        return appv.UNSPECIFIED;
                    case 9:
                        return appv.BULLET;
                    case 10:
                        return appv.HEADER;
                    case 13:
                        return appv.CODE_BLOCK;
                    case 14:
                        return appv.ORDERED_LIST_ITEM;
                    case 15:
                        return appv.TABLE_HEAD;
                    case 16:
                        return appv.TABLE_BODY;
                    case 17:
                        return appv.TABLE_ROW;
                    case 18:
                        return appv.TABLE_CELL;
                }
            case UNRECOGNIZED:
                return appv.UNSPECIFIED;
            default:
                throw new ffcd();
        }
    }

    public final String d() {
        fbui c = fbom.c(this.a);
        if (c != null) {
            return c.b;
        }
        return null;
    }

    public final String e() {
        fbuk fbukVar = this.a;
        if (fbom.b(fbukVar) != null) {
            return (fbukVar.c == 8 ? (fbue) fbukVar.d : fbue.a).c;
        }
        if (fbom.a(fbukVar) != null) {
            return (fbukVar.c == 21 ? (fbty) fbukVar.d : fbty.a).b;
        }
        return null;
    }
}
