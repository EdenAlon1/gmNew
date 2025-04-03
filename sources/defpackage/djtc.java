package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djtc {
    public final eqwf a;

    public djtc(eqwf eqwfVar) {
        this.a = eqwfVar;
    }

    public final String a() {
        switch (this.a) {
            case INVALID_PRE_KOTO:
                return "INVALID_PRE_KOTO (This device is pre-Koto)";
            case BUGLE_LOADING_AVAILABILITY_IN_PROGRESS:
                return "BUGLE_LOADING_AVAILABILITY_IN_PROGRESS (Bugle client is still loading the status)";
            case DISABLED_VIA_GSERVICES:
                return "DISABLED_VIA_GSERVICES (RCS is disabled for this carrier by Google)";
            case DOGFOOD_SETUP_PENDING:
                return "DOGFOOD_SETUP_PENDING (Dogfood RCS is not set up)";
            case DISABLED_FROM_PREFERENCES:
                return "DISABLED_FROM_PREFERENCES (You turned off RCS. Turn it back on in settings)";
            case DISABLED_NOT_DEFAULT_SMS_APP:
                return "DISABLED_NOT_DEFAULT_SMS_APP (We aren't the default SMS app)";
            case DISABLED_REMOTELY:
                return "DISABLED_REMOTELY (The carrier disabled this device remotely)";
            case AVAILABLE:
                return "AVAILABLE (RCS is setup)";
            case DISABLED_OLD_RCS_SERVICE_VERSION:
                return "DISABLED_OLD_RCS_SERVICE_VERSION (RCS service version is old)";
            case DISABLED_SIM_ABSENT:
                return "DISABLED_SIM_ABSENT (RCS is disabled due to SIM absent)";
            case CARRIER_SETUP_PENDING:
                return "CARRIER_SETUP_PENDING (Carrier RCS is not set up)";
            case DISABLED_MULTI_SLOT_DEVICE:
                return "DISABLED_MULTI_SLOT_DEVICE (Multi sim disabled or it's not default sim)";
            case DISABLED_FOR_FI:
            case DISABLED_FOR_SECONDARY_USER:
            default:
                return "RcsAvailability is in an invalid state " + this.a.N + "! This is a bug!";
            case BUGLE_LOADING_AVAILABILITY_EXCEPTION:
                return "BUGLE_LOADING_AVAILABILITY_EXCEPTION (Bugle client threw an exception loading the status)";
            case DISABLED_LEGACY_CLIENT_ENABLED:
                return "RCS is disabled because third-party RCS client is enabled";
            case DISABLED_NO_PERMISSIONS:
                return "DISABLED_NO_PERMISSIONS (RCS is disabled because it doesn't have phone permission)";
            case CARRIER_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING:
                return "CARRIER_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING (Carrier RCS is setup, waiting for T&C acceptance)";
            case DOGFOOD_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING:
                return "DOGFOOD_TERMS_AND_CONDITIONS_ACCEPTANCE_PENDING (Dogfood RCS is setup, waiting for T&C acceptance)";
            case DISABLED_TERMS_AND_CONDITIONS_REJECTED:
                return "DISABLED_TERMS_AND_CONDITIONS_REJECTED (RCS is disabled due to user rejection of T&Cs)";
            case SUBJECT_TO_BATTERY_OPTIMIZATIONS:
                return "SUBJECT_TO_BATTERY_OPTIMIZATIONS (RCS services can't run in the background)";
            case UNKNOWN_PEV2_DISABLED:
                return "UNKNOWN_PEV2_DISABLED (PEv2 is now default. You should never see this message.)";
            case DISABLED_WAITING_FOR_PHENOTYPE:
                return "DISABLED_WAITING_FOR_PHENOTYPE (Phenotype flags have not updated yet)";
            case DISABLED_STUB_PROVISIONING_ENGINE:
                return "DISABLED_STUB_PROVISIONING_ENGINE (The RCS availability query was done on a stub implementation)";
            case DISABLED_VIA_FLAGS:
                return "DISABLED_VIA_FLAGS";
            case DISABLED_BY_EMM:
                return "DISABLED_BY_EMM (RCS is disabled by IT admin)";
            case DISABLED_VIA_RCS_CONFIG_CHAT_AUTH:
                return "DISABLED_VIA_RCS_CONFIG_CHAT_AUTH (chatAuth=0 in ServicesConfiguration). Provisioning is NOT disabled. RCS registration is disabled.";
            case DISABLED_BY_PROVISIONING_RULE:
                return "DISABLED_BY_PROVISIONING_RULE (RCS is disabled based on provisioning rules for this sim)";
            case DISABLED_FOR_WEAR:
                return "DISABLED_FOR_WEAR (RCS is disabled for a Wear OS device that does not support RCS)";
            case DISABLED_AUTOMATIC_PROVISIONING_RULE:
                return "DISABLED_AUTOMATIC_PROVISIONING_RULE (RCS is disabled by default, user must manually enable RCS for this sim from Settings)";
            case DISABLED_BY_CONFIG_VERSION_ZERO_POSITIVE_VALIDITY:
                return "RCS is disabled because the configuration has version = 0, and validity seconds > 0";
            case DISABLED_BY_CONFIG_VERSION_CARRIER:
                return "RCS is disabled because the carrier indicated the user is ineligible for RCS";
            case DISABLED_BY_CONFIG_VERSION_APP_VERSION:
                return "RCS is disabled because the provisioning device has too low of an App version for RCS";
            case DISABLED_BY_CONFIG_VERSION_PERMANENT:
                return "RCS is disabled because the configuration indicates the user or device is permanently banned";
            case DISABLED_BY_CONFIG_VERSION_AWAITING_INPUT:
                return "RCS is disabled because the configuration indicates awaiting user input";
            case DISABLED_BY_CONFIG_VERSION_ATTESTATION_FAILURE:
                return "RCS is disabled because the configuration indicates an attestation failure for this user or device";
            case DISABLED_BY_CONFIG_VERSION_OTHER:
                return "RCS is disabled because the configuration has an invalid version number";
            case DISABLED_BY_CONFIG_VERSION_VENDOR_NOT_SUPPORTED:
                return "RCS is disabled because the configuration indicates the app vendor is not supported";
            case DISABLED_NOT_DEFAULT_SIM:
                return "DISABLED_NOT_DEFAULT_SIM (RCS is disabled because the sim is not the default sim)";
        }
    }

    public final boolean b() {
        switch (this.a.ordinal()) {
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
                return true;
            default:
                return false;
        }
    }

    public final boolean c() {
        return this.a == eqwf.AVAILABLE;
    }

    public final boolean d() {
        int ordinal = this.a.ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2 && ordinal != 4 && ordinal != 5 && ordinal != 6 && ordinal != 8 && ordinal != 9 && ordinal != 11 && ordinal != 12 && ordinal != 14 && ordinal != 15 && ordinal != 18 && ordinal != 38) {
            switch (ordinal) {
                default:
                    switch (ordinal) {
                        case 27:
                        case 28:
                        case 29:
                            break;
                        default:
                            return false;
                    }
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                    return true;
            }
        }
        return true;
    }

    public final boolean e() {
        return !d();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djtc) && this.a == ((djtc) obj).a;
    }

    public final boolean f() {
        eqwf eqwfVar = this.a;
        return eqwfVar == eqwf.DISABLED_FROM_PREFERENCES || eqwfVar == eqwf.DISABLED_AUTOMATIC_PROVISIONING_RULE;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return a.a(this.a != null ? a() : "null", "RcsAvailability{mAvailability=", "}");
    }
}
