package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class esed implements eygj {
    @Override // defpackage.eygj
    public final /* bridge */ /* synthetic */ Object a(int i) {
        esee eseeVar;
        switch (i) {
            case 0:
                eseeVar = esee.UNKNOWN_API_FEATURE;
                break;
            case 1:
                eseeVar = esee.CALL_INTENT_API_CALL_PHONE_NUMBER;
                break;
            case 2:
                eseeVar = esee.CALL_INTENT_API_TARGETED_CALL;
                break;
            case 3:
                eseeVar = esee.INTENT_API_OPEN_SETTINGS;
                break;
            case 4:
                eseeVar = esee.INTENT_API_OPEN_BLOCKED_CONTACTS;
                break;
            case 5:
                eseeVar = esee.CALL_INTENT_API_SELF_CALL;
                break;
            case 6:
                eseeVar = esee.SERVICE_API_GET_REGISTRATION_INFO;
                break;
            case 7:
                eseeVar = esee.SERVICE_API_GET_REGISTERED_ID_TYPE;
                break;
            case 8:
                eseeVar = esee.DUO_KIT_REQUESTS;
                break;
            case 9:
                eseeVar = esee.MEET_API_REQUESTS;
                break;
            default:
                eseeVar = null;
                break;
        }
        return eseeVar == null ? esee.UNRECOGNIZED : eseeVar;
    }
}
