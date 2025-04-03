package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes8.dex */
public enum cpas {
    DEFAULTS("D"),
    BUGLE_MMS_CONFIG(VCardConstants.PARAM_ENCODING_B),
    OEM_SPECIFIC_OVERRIDE("O"),
    PLATFORM("P"),
    SERVER_SIDE_OVERRIDE_PHENOTYPE("S_P"),
    SERVER_SIDE_OVERRIDE_MOBILE_CONFIG("S_M"),
    EXPERIMENT_OVERRIDE("X"),
    USER_SETTING("U"),
    DEBUG_MENU("🐜");

    public final String j;

    cpas(String str) {
        this.j = str;
    }
}
