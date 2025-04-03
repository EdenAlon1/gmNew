package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class aljr extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        eohr eohrVar = (eohr) obj;
        int ordinal = eohrVar.ordinal();
        if (ordinal == 0) {
            return csmy.OTHER;
        }
        if (ordinal == 1) {
            return csmy.BLUETOOTH;
        }
        if (ordinal == 2) {
            return csmy.CELLULAR;
        }
        if (ordinal == 3) {
            return csmy.ETHERNET;
        }
        if (ordinal == 4) {
            return csmy.VPN;
        }
        if (ordinal == 5) {
            return csmy.WIFI;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eohrVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        csmy csmyVar = (csmy) obj;
        int ordinal = csmyVar.ordinal();
        if (ordinal == 0) {
            return eohr.TRANSPORT_BLUETOOTH;
        }
        if (ordinal == 1) {
            return eohr.TRANSPORT_CELLULAR;
        }
        if (ordinal == 2) {
            return eohr.TRANSPORT_ETHERNET;
        }
        if (ordinal == 3) {
            return eohr.TRANSPORT_VPN;
        }
        if (ordinal == 4) {
            return eohr.TRANSPORT_WIFI;
        }
        if (ordinal == 5) {
            return eohr.TRANSPORT_OTHER;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(csmyVar.toString()));
    }
}
