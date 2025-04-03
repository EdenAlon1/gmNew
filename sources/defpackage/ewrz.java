package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ewrz implements eygj {
    @Override // defpackage.eygj
    public final /* bridge */ /* synthetic */ Object a(int i) {
        ewsc ewscVar;
        switch (i) {
            case 0:
                ewscVar = ewsc.REQUEST_MASK_CONTAINER_UNKNOWN;
                break;
            case 1:
                ewscVar = ewsc.PROFILE;
                break;
            case 2:
                ewscVar = ewsc.CONTACT;
                break;
            case 3:
                ewscVar = ewsc.CIRCLE;
                break;
            case 4:
                ewscVar = ewsc.PLACE;
                break;
            case 5:
                ewscVar = ewsc.ACCOUNT;
                break;
            case 6:
                ewscVar = ewsc.EXTERNAL_ACCOUNT;
                break;
            case 7:
                ewscVar = ewsc.DOMAIN_PROFILE;
                break;
            case 8:
                ewscVar = ewsc.DOMAIN_CONTACT;
                break;
            case 9:
                ewscVar = ewsc.DEVICE_CONTACT;
                break;
            case 10:
                ewscVar = ewsc.GOOGLE_GROUP;
                break;
            case 11:
                ewscVar = ewsc.AFFINITY;
                break;
            case 12:
            case 16:
            default:
                ewscVar = null;
                break;
            case 13:
                ewscVar = ewsc.RAW_DEVICE_CONTACT;
                break;
            case 14:
                ewscVar = ewsc.CONTACT_ANNOTATION;
                break;
            case 15:
                ewscVar = ewsc.DELEGATED_CONTACT;
                break;
            case 17:
                ewscVar = ewsc.CHAT_ROOM;
                break;
        }
        return ewscVar == null ? ewsc.UNRECOGNIZED : ewscVar;
    }
}
