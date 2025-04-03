package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class alqm extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eopp eoppVar = (eopp) obj;
        switch (eoppVar) {
            case UNSPECIFIED:
                return byzl.UNKNOWN;
            case TELEPHONY:
                return byzl.TELEPHONY;
            case SLM:
                return byzl.SLM;
            case TELEPHONY_UNSPECIFIED:
                return byzl.TELEPHONY_UNSPECIFIED;
            case TELEPHONY_IMS:
                return byzl.TELEPHONY_IMS;
            case TELEPHONY_CARRIER_APP:
                return byzl.TELEPHONY_CARRIER_APP;
            case TRANSPORT_NOT_SELECTED:
                return byzl.TRANSPORT_NOT_SELECTED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(eoppVar.toString()));
        }
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        byzl byzlVar = (byzl) obj;
        switch (byzlVar) {
            case UNKNOWN:
                return eopp.UNSPECIFIED;
            case TELEPHONY:
                return eopp.TELEPHONY;
            case SLM:
                return eopp.SLM;
            case TELEPHONY_UNSPECIFIED:
                return eopp.TELEPHONY_UNSPECIFIED;
            case TELEPHONY_IMS:
                return eopp.TELEPHONY_IMS;
            case TELEPHONY_CARRIER_APP:
                return eopp.TELEPHONY_CARRIER_APP;
            case TRANSPORT_NOT_SELECTED:
                return eopp.TRANSPORT_NOT_SELECTED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(byzlVar.toString()));
        }
    }
}
