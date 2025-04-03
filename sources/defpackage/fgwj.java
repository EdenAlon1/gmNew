package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgwj extends fguk implements fgvj {
    public static final /* synthetic */ int a = 0;
    private static final long serialVersionUID = -4034423507432249165L;

    static {
        new fgwj();
    }

    protected fgwj() {
        b("ABBREV", new fgvk());
        b("ALTREP", new fgvl());
        b("CN", new fgvm());
        b("CUTYPE", new fgvn());
        b("DELEGATED-FROM", new fgvo());
        b("DELEGATED-TO", new fgvp());
        b("DIR", new fgvq());
        b(VCardConstants.PARAM_ENCODING, new fgvr());
        b("FMTTYPE", new fgvt());
        b("FBTYPE", new fgvs());
        b(VCardConstants.PARAM_LANGUAGE, new fgvu());
        b(VCardConstants.PROPERTY_MEMBER, new fgvv());
        b("PARTSTAT", new fgvw());
        b("RANGE", new fgvx());
        b(VCardConstants.PROPERTY_RELATED, new fgvz());
        b("RELTYPE", new fgvy());
        b(VCardConstants.PROPERTY_ROLE, new fgwa());
        b("RSVP", new fgwb());
        b("SCHEDULE-AGENT", new fgwc());
        b("SCHEDULE-STATUS", new fgwd());
        b("SENT-BY", new fgwe());
        b(VCardConstants.PARAM_TYPE, new fgwf());
        b("TZID", new fgwg());
        b(VCardConstants.PARAM_VALUE, new fgwh());
        b("VVENUE", new fgwi());
    }

    @Override // defpackage.fgvj
    public final fgvi a(String str, String str2) {
        fgvj fgvjVar = (fgvj) ic(str);
        if (fgvjVar != null) {
            return fgvjVar.a(str, str2);
        }
        if (str.startsWith("X-") && str.length() > 2) {
            return new fhbu(str, str2);
        }
        if (c()) {
            return new fhbu(str, str2);
        }
        throw new IllegalArgumentException("Invalid parameter name: ".concat(String.valueOf(str)));
    }
}
