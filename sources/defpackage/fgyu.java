package defpackage;

import com.android.vcard.VCardConstants;

/* compiled from: PG */
/* loaded from: classes6.dex */
public class fgyu extends fguk implements fgwp {
    public static final fgyu a = new fgyu();
    private static final long serialVersionUID = -7174232004486979641L;

    protected fgyu() {
        b("ACTION", new fgwq());
        b("ATTACH", new fgwr());
        b("ATTENDEE", new fgws());
        b("CALSCALE", new fgwt());
        b(VCardConstants.PROPERTY_CATEGORIES, new fgwu());
        b("CLASS", new fgwv());
        b("COMMENT", new fgww());
        b("COMPLETED", new fgwx());
        b("CONTACT", new fgwy());
        b("COUNTRY", new fgwz());
        b("CREATED", new fgxa());
        b("DESCRIPTION", new fgxb());
        b("DTEND", new fgxc());
        b("DTSTAMP", new fgxd());
        b("DTSTART", new fgxe());
        b("DUE", new fgxf());
        b("DURATION", new fgxg());
        b("EXDATE", new fgxh());
        b("EXRULE", new fgxi());
        b("EXTENDED-ADDRESS", new fgxj());
        b("FREEBUSY", new fgxk());
        b(VCardConstants.PROPERTY_GEO, new fgxl());
        b("LAST-MODIFIED", new fgxm());
        b("LOCALITY", new fgxn());
        b("LOCATION", new fgxo());
        b("LOCATION-TYPE", new fgxp());
        b("METHOD", new fgxq());
        b(VCardConstants.PROPERTY_NAME, new fgxr());
        b("ORGANIZER", new fgxs());
        b("PERCENT-COMPLETE", new fgxt());
        b("POSTAL-CODE", new fgxu());
        b("PRIORITY", new fgxv());
        b(VCardConstants.PROPERTY_PRODID, new fgxw());
        b("RDATE", new fgxx());
        b("RECURRENCE-ID", new fgxz());
        b("REGION", new fgya());
        b("RELATED-TO", new fgyb());
        b("REPEAT", new fgyc());
        b("REQUEST-STATUS", new fgyd());
        b("RESOURCES", new fgye());
        b("RRULE", new fgxy());
        b("SEQUENCE", new fgyf());
        b("STATUS", new fgyg());
        b("STREET-ADDRESS", new fgyh());
        b("SUMMARY", new fgyi());
        b(VCardConstants.PROPERTY_TEL, new fgyj());
        b("TRANSP", new fgyk());
        b("TRIGGER", new fgyl());
        b("TZID", new fgym());
        b("TZNAME", new fgyn());
        b("TZOFFSETFROM", new fgyo());
        b("TZOFFSETTO", new fgyp());
        b("TZURL", new fgyq());
        b(VCardConstants.PROPERTY_UID, new fgyr());
        b(VCardConstants.PROPERTY_URL, new fgys());
        b(VCardConstants.PROPERTY_VERSION, new fgyt());
    }

    @Override // defpackage.fgwp
    public final fgwo a(String str) {
        fgwp fgwpVar = (fgwp) ic(str);
        if (fgwpVar != null) {
            return fgwpVar.a(str);
        }
        if (str.startsWith("X-") && str.length() > 2) {
            return new fhek(str);
        }
        if (c()) {
            return new fhek(str);
        }
        throw new IllegalArgumentException(a.a(str, "Illegal property [", "]"));
    }
}
