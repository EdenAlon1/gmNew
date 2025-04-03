package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
class babx extends emwd {
    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object a(Object obj) {
        alkl alklVar = (alkl) obj;
        int ordinal = alklVar.ordinal();
        if (ordinal == 0) {
            return eohr.TRANSPORT_OTHER;
        }
        if (ordinal == 1) {
            return eohr.TRANSPORT_BLUETOOTH;
        }
        if (ordinal == 2) {
            return eohr.TRANSPORT_CELLULAR;
        }
        if (ordinal == 3) {
            return eohr.TRANSPORT_ETHERNET;
        }
        if (ordinal == 4) {
            return eohr.TRANSPORT_VPN;
        }
        if (ordinal == 5) {
            return eohr.TRANSPORT_WIFI;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(alklVar.toString()));
    }

    @Override // defpackage.emwd
    protected final /* bridge */ /* synthetic */ Object b(Object obj) {
        eohr eohrVar = (eohr) obj;
        int ordinal = eohrVar.ordinal();
        if (ordinal == 0) {
            return alkl.TRANSPORT_OTHER;
        }
        if (ordinal == 1) {
            return alkl.TRANSPORT_BLUETOOTH;
        }
        if (ordinal == 2) {
            return alkl.TRANSPORT_CELLULAR;
        }
        if (ordinal == 3) {
            return alkl.TRANSPORT_ETHERNET;
        }
        if (ordinal == 4) {
            return alkl.TRANSPORT_VPN;
        }
        if (ordinal == 5) {
            return alkl.TRANSPORT_WIFI;
        }
        throw new IllegalArgumentException("unknown enum value: ".concat(eohrVar.toString()));
    }
}
