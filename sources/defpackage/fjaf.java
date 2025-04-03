package defpackage;

import com.android.vcard.VCardConstants;
import org.chromium.net.PrivateKeyType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fjaf {
    public static final fjae a;

    static {
        fjae fjaeVar = new fjae();
        a = fjaeVar;
        fjaeVar.g(1, "A", new fiwh());
        fjaeVar.g(2, "NS", new fiyq());
        fjaeVar.g(3, "MD", new fiyb());
        fjaeVar.g(4, "MF", new fiyc());
        fjaeVar.g(5, "CNAME", new fiwl());
        fjaeVar.g(6, "SOA", new fizn());
        fjaeVar.g(7, "MB", new fiya());
        fjaeVar.g(8, "MG", new fiyd());
        fjaeVar.g(9, "MR", new fiyf());
        fjaeVar.g(10, "NULL", new fiyr());
        fjaeVar.g(11, "WKS", new fjam());
        fjaeVar.g(12, "PTR", new fiyz());
        fjaeVar.g(13, "HINFO", new fixo());
        fjaeVar.g(14, "MINFO", new fiye());
        fjaeVar.g(15, "MX", new fiyg());
        fjaeVar.g(16, "TXT", new fjac());
        fjaeVar.g(17, "RP", new fizb());
        fjaeVar.g(18, "AFSDB", new fiwe());
        fjaeVar.g(19, "X25", new fjao());
        fjaeVar.g(20, VCardConstants.PARAM_TYPE_ISDN, new fixr());
        fjaeVar.g(21, "RT", new fize());
        fjaeVar.g(22, "NSAP", new fiyk());
        fjaeVar.g(23, "NSAP-PTR", new fiyl());
        fjaeVar.g(24, "SIG", new fizl());
        fjaeVar.g(25, VCardConstants.PROPERTY_KEY, new fixw());
        fjaeVar.g(26, "PX", new fiza());
        fjaeVar.g(27, "GPOS", new fixm());
        fjaeVar.g(28, "AAAA", new fiwd());
        fjaeVar.g(29, "LOC", new fixy());
        fjaeVar.g(30, "NXT", new fiys());
        fjaeVar.d(31, "EID");
        fjaeVar.d(32, "NIMLOC");
        fjaeVar.g(33, "SRV", new fizp());
        fjaeVar.d(34, "ATMA");
        fjaeVar.g(35, "NAPTR", new fiyj());
        fjaeVar.g(36, "KX", new fixx());
        fjaeVar.g(37, "CERT", new fiwk());
        fjaeVar.g(38, "A6", new fiwc());
        fjaeVar.g(39, "DNAME", new fixa());
        fjaeVar.g(41, "OPT", new fiyw());
        fjaeVar.g(42, "APL", new fiwg());
        fjaeVar.g(43, "DS", new fixe());
        fjaeVar.g(44, "SSHFP", new fizq());
        fjaeVar.g(45, "IPSECKEY", new fixq());
        fjaeVar.g(46, "RRSIG", new fizc());
        fjaeVar.g(47, "NSEC", new fiyo());
        fjaeVar.g(48, "DNSKEY", new fixc());
        fjaeVar.g(49, "DHCID", new fiwy());
        fjaeVar.g(50, "NSEC3", new fiyn());
        fjaeVar.g(51, "NSEC3PARAM", new fiym());
        fjaeVar.g(52, "TLSA", new fizy());
        fjaeVar.g(53, "SMIMEA", new fizm());
        fjaeVar.g(61, "OPENPGPKEY", new fiyv());
        fjaeVar.g(99, "SPF", new fizo());
        fjaeVar.g(249, "TKEY", new fizx());
        fjaeVar.g(250, "TSIG", new fizz());
        fjaeVar.d(251, "IXFR");
        fjaeVar.d(252, "AXFR");
        fjaeVar.d(253, "MAILB");
        fjaeVar.d(254, "MAILA");
        fjaeVar.d(PrivateKeyType.INVALID, "ANY");
        fjaeVar.g(256, "URI", new fjal());
        fjaeVar.g(257, "CAA", new fiwj());
        fjaeVar.g(32769, "DLV", new fiwz());
    }

    public static String a(int i) {
        return a.c(i);
    }

    public static void b(int i) {
        if (i < 0 || i > 65535) {
            throw new fixu(i);
        }
    }
}
