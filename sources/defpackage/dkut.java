package defpackage;

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import com.android.vcard.VCardBuilder;
import com.google.android.ims.provisioning.config.ImsConfiguration;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkut {
    public static final eehk a = new eehk();
    public static final dktn b = new dktn("SipUtils");
    private static final diyy d = dizd.a(188805143);
    public static final diyy c = diyv.b("do_not_respond_to_ack");
    private static final enip e = enip.s("+g.gsma.rcs.msgrevoke", "vnd.google.rcs.encrypted", "+vnd.google.rcs.encrypted");

    public static boolean A(String str, String str2) {
        if (str != null && str2 != null && !dktk.d(str) && !dktk.d(str2)) {
            try {
                eeit d2 = eehk.d(str);
                eeit d3 = eehk.d(str2);
                if (d2.l() && d3.l()) {
                    eeiq eeiqVar = (eeiq) d2;
                    eeiq eeiqVar2 = (eeiq) d3;
                    return dktk.b(eeiqVar.e(), eeiqVar2.e()) && dktk.b(eeiqVar.b(), eeiqVar2.b());
                }
                boolean z = d2 instanceof eeir;
                if (z && (d3 instanceof eeir)) {
                    return dktk.b(((eeir) d2).a(), ((eeir) d3).a());
                }
                eeir eeirVar = null;
                eeiq eeiqVar3 = d2.l() ? (eeiq) d2 : d3.l() ? (eeiq) d3 : null;
                if (z) {
                    eeirVar = (eeir) d2;
                } else if (d3 instanceof eeir) {
                    eeirVar = (eeir) d3;
                }
                if (eeiqVar3 == null || eeirVar == null) {
                    return false;
                }
                boolean b2 = dktk.b(eeiqVar3.e(), eeirVar.b());
                dkty.c("Comparing sip uri %s and tel uri %s equal %b", dktx.URI_SIP.c(eeiqVar3), dktx.URI_TEL.c(eeirVar), Boolean.valueOf(b2));
                return b2;
            } catch (Exception e2) {
                dkty.i(e2, "Cannot compare URIs: %s, %s", str, str2);
            }
        }
        return false;
    }

    public static byte[] B(eenh[] eenhVarArr, String str) {
        StringBuilder sb = new StringBuilder();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i = 0; i < eenhVarArr.length; i++) {
            try {
                sb.setLength(0);
                if (i > 0) {
                    sb.append(VCardBuilder.VCARD_END_OF_LINE);
                }
                sb.append("--");
                sb.append(str);
                sb.append(VCardBuilder.VCARD_END_OF_LINE);
                sb.append("Content-Type: ");
                sb.append(eenhVarArr[i].b);
                sb.append(VCardBuilder.VCARD_END_OF_LINE);
                if (eenhVarArr[i].c != null) {
                    sb.append("Content-Disposition: ");
                    sb.append(eenhVarArr[i].c);
                    sb.append(VCardBuilder.VCARD_END_OF_LINE);
                }
                if (eenhVarArr[i].d != null) {
                    sb.append("Content-ID: <");
                    sb.append(eenhVarArr[i].d);
                    sb.append(">");
                    sb.append(VCardBuilder.VCARD_END_OF_LINE);
                }
                byte[] bArr = eenhVarArr[i].a;
                sb.append("Content-Length: ");
                sb.append(bArr.length);
                sb.append(VCardBuilder.VCARD_END_OF_LINE);
                sb.append(VCardBuilder.VCARD_END_OF_LINE);
                byteArrayOutputStream.write(sb.toString().getBytes("utf-8"));
                byteArrayOutputStream.write(bArr);
            } catch (Exception e2) {
                dkty.i(e2, "Error while getting multipart content: %s", e2.getMessage());
                return null;
            }
        }
        sb.setLength(0);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        sb.append("--");
        sb.append(str);
        sb.append("--");
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        byteArrayOutputStream.write(sb.toString().getBytes("utf-8"));
        return byteArrayOutputStream.toByteArray();
    }

    @Deprecated
    public static String[] C(boolean z) {
        return z ? D(null, null, Arrays.asList("urn%3Aurn-7%3A3gpp-service.ims.icsi.oma.cpm.session")) : D(Arrays.asList("+g.oma.sip-im"), null, null);
    }

    public static String[] D(List list, List list2, List list3) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            arrayList.addAll(list);
        }
        if (list2 != null && !list2.isEmpty()) {
            arrayList.add(String.format("%s=\"%s\"", "+g.3gpp.iari-ref", TextUtils.join(",", list2)));
        }
        if (list3 != null && !list3.isEmpty()) {
            arrayList.add(String.format("%s=\"%s\"", "+g.3gpp.icsi-ref", TextUtils.join(",", list3)));
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int E(eenj eenjVar) {
        char c2;
        String a2 = eenf.a(eenjVar);
        if (a2 == null) {
            return 1;
        }
        switch (a2.hashCode()) {
            case -2130369783:
                if (a2.equals("INVITE")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case -1986360503:
                if (a2.equals("NOTIFY")) {
                    c2 = '\b';
                    break;
                }
                c2 = 65535;
                break;
            case -1785516855:
                if (a2.equals("UPDATE")) {
                    c2 = '\r';
                    break;
                }
                c2 = 65535;
                break;
            case -993530582:
                if (a2.equals("SUBSCRIBE")) {
                    c2 = '\f';
                    break;
                }
                c2 = 65535;
                break;
            case -531492226:
                if (a2.equals("OPTIONS")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 64617:
                if (a2.equals("ACK")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 66254:
                if (a2.equals("BYE")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 2251950:
                if (a2.equals("INFO")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 76389159:
                if (a2.equals("PRACK")) {
                    c2 = '\t';
                    break;
                }
                c2 = 65535;
                break;
            case 77853792:
                if (a2.equals("REFER")) {
                    c2 = 11;
                    break;
                }
                c2 = 65535;
                break;
            case 92413603:
                if (a2.equals("REGISTER")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 482617583:
                if (a2.equals("PUBLISH")) {
                    c2 = '\n';
                    break;
                }
                c2 = 65535;
                break;
            case 1672907751:
                if (a2.equals("MESSAGE")) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            case 1980572282:
                if (a2.equals("CANCEL")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
        }
        return 1;
    }

    public static eeku F() {
        return eene.g("Allow", "INVITE, ACK, BYE, CANCEL, NOTIFY, OPTIONS, MESSAGE");
    }

    private static String G(String str, String str2, String str3, ctvb ctvbVar, boolean z) {
        String x = !dizg.w() ? ctvbVar.x(str) : str;
        boolean isGlobalPhoneNumber = PhoneNumberUtils.isGlobalPhoneNumber(x);
        if (z) {
            if (isGlobalPhoneNumber) {
                return "tel:" + x + emxe.b(str3);
            }
        } else if (isGlobalPhoneNumber) {
            if (str3 == null) {
                str3 = ";user=phone";
            } else if (!str3.contains("user=phone")) {
                str3 = ";user=phone".concat(str3);
            }
            return "sip:" + x + "@" + str2 + str3;
        }
        return H(str, str2, str3);
    }

    private static String H(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            if (str3 == null) {
                str3 = "";
            }
            return "sip:" + str2 + str3;
        }
        if (str3 == null) {
            str3 = "";
        }
        return "sip:" + str + "@" + str2 + str3;
    }

    public static int a(eenj eenjVar) {
        eeku d2 = eenjVar.a.d("Min-Expires");
        if (d2 != null) {
            return d2.h(-1);
        }
        return -1;
    }

    public static eeit b(eenk eenkVar, ctvb ctvbVar) {
        eekk b2;
        eekv e2 = eenkVar.y().e("P-Asserted-Identity");
        if (e2 != null && e2.b() > 0) {
            for (eeku eekuVar : e2.a) {
                try {
                    String a2 = eekuVar.a();
                    String str = eekuVar.c;
                    a2.getClass();
                    eeit eeitVar = eehk.b(a2).b;
                    if (eeitVar != null) {
                        if (!eeitVar.d().equals("tel") || !((eeir) eeitVar).e()) {
                            if (eeitVar.l()) {
                                String e3 = ((eeiq) eeitVar).e();
                                e3.getClass();
                                if (PhoneNumberUtils.isGlobalPhoneNumber(e3)) {
                                }
                            } else {
                                continue;
                            }
                        }
                        return eeitVar;
                    }
                    continue;
                } catch (eeje unused) {
                }
            }
            try {
                eeku f = e2.f();
                f.getClass();
                String a3 = f.a();
                a3.getClass();
                eeit eeitVar2 = eehk.b(a3).b;
                if (eeitVar2.l()) {
                    if (((Boolean) d.a()).booleanValue() && (b2 = eenkVar.b()) != null && b2.l("+g.gsma.rcs.isbot")) {
                        return eeitVar2;
                    }
                    eeiq eeiqVar = (eeiq) eeitVar2;
                    String e4 = eeiqVar.e();
                    e4.getClass();
                    if (!dizg.w()) {
                        e4 = ctvbVar.x(e4);
                    }
                    eeiqVar.k(e4);
                    eeiqVar.b.i("user");
                    eeiqVar.b.f("user", "phone");
                    return eeiqVar;
                }
                if (eeitVar2 instanceof eeir) {
                    eeir eeirVar = (eeir) eeitVar2;
                    String a4 = eeirVar.a();
                    if (!dizg.w()) {
                        a4 = ctvbVar.x(eeirVar.a());
                    }
                    eeis eeisVar = eeirVar.a;
                    eeisVar.b = a4;
                    eeisVar.a = true;
                    return eeirVar;
                }
            } catch (eeje unused2) {
                return null;
            }
        }
        try {
            eekt eektVar = eenkVar.a.e;
            String eeitVar3 = eektVar == null ? null : eektVar.a.b.toString();
            eeitVar3.getClass();
            return eehk.b(eeitVar3).b;
        } catch (eeje e5) {
            dkty.i(e5, "Error while parsing remote address: %s", e5.getMessage());
            return null;
        }
    }

    public static eeit c(String str, ImsConfiguration imsConfiguration, ctvb ctvbVar) {
        return d(str, imsConfiguration.mDomain, ctvbVar, y(imsConfiguration));
    }

    public static eeit d(String str, String str2, ctvb ctvbVar, boolean z) {
        try {
            return eehk.b(m(str, str2, ctvbVar, z)).b;
        } catch (eeje e2) {
            dkty.i(e2, "Error while parsing remote address: %s", e2.getMessage());
            return null;
        }
    }

    public static eeku e(String str) {
        return eene.g("Server", str);
    }

    public static eeku f(String str) {
        if (!TextUtils.isEmpty(djao.r())) {
            str = djao.r();
        }
        return eene.g("User-Agent", str);
    }

    public static eekw g() {
        return eene.h(70);
    }

    public static String h(String str) {
        String str2;
        try {
            eeio b2 = eehk.b(str);
            eeit eeitVar = b2.b;
            if (!(eeitVar instanceof eeiq)) {
                throw new IllegalArgumentException("address is not a SipURI");
            }
            eeiz a2 = ((eeiq) eeitVar).a();
            eeix eeixVar = a2 == null ? null : a2.a;
            if (a2 == null || eeixVar == null) {
                throw new IllegalArgumentException("SipURI does not have host port.");
            }
            String str3 = eeixVar.a;
            if (b2.a() != -1) {
                str2 = ":" + b2.a();
            } else {
                str2 = "";
            }
            return str3 + str2;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String i(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf("tag=")) <= 0) {
            return null;
        }
        return str.substring(indexOf + 4);
    }

    public static String j(eeit eeitVar, ctvb ctvbVar) {
        String eeitVar2;
        if (eeitVar instanceof eeiq) {
            eeitVar2 = (String) ((eeiq) eeitVar).a.a().map(new dkus()).orElse("");
        } else if (eeitVar instanceof eeir) {
            eeir eeirVar = (eeir) eeitVar;
            String a2 = eeirVar.a();
            eeitVar2 = eeirVar.e() ? "+".concat(String.valueOf(a2)) : a2;
        } else {
            eeitVar2 = eeitVar.toString();
        }
        return (!w(eeitVar2) || dizg.w()) ? eeitVar2 : ctvbVar.x(eeitVar2);
    }

    public static String k(String str, ctvb ctvbVar) {
        try {
            eeit eeitVar = eehk.b(str).b;
            if (eeitVar != null) {
                return j(eeitVar, ctvbVar);
            }
            dkty.g("SipUtils: null uri returned for address: %s", str);
            return null;
        } catch (eeje e2) {
            dkty.i(e2, "captured ParseException extracting username from address %s", str);
            return null;
        }
    }

    public static String l(String str, ImsConfiguration imsConfiguration, ctvb ctvbVar) {
        return m(str, imsConfiguration.mDomain, ctvbVar, y(imsConfiguration));
    }

    public static String m(String str, String str2, ctvb ctvbVar, boolean z) {
        int indexOf;
        if (dktk.c(str)) {
            return "sip:".concat(String.valueOf(str));
        }
        String str3 = null;
        if (w(str)) {
            return G(str, str2, null, ctvbVar, z);
        }
        if (str != null && (indexOf = str.indexOf(59)) >= 0) {
            str3 = str.substring(indexOf);
            if (str3.endsWith(">")) {
                str3 = str3.substring(0, str3.length() - 1);
            }
        }
        String k = k(str, ctvbVar);
        String h = h(str);
        if (h != null) {
            str2 = h;
        }
        if (k != null) {
            str = k;
        }
        return w(str) ? G(str, str2, str3, ctvbVar, z) : H(str, str2, str3);
    }

    public static String n(String str, ctvb ctvbVar) {
        String k = k(str, ctvbVar);
        String h = h(str);
        if (TextUtils.isEmpty(k) || TextUtils.isEmpty(h)) {
            return null;
        }
        return a.w(h, k, "@");
    }

    public static String o(String str, ctvb ctvbVar) {
        String k = k(str, ctvbVar);
        return TextUtils.isEmpty(k) ? str : k;
    }

    public static String p() {
        return "z9hG4bK".concat(eeja.a());
    }

    public static ArrayList q(eehy eehyVar) {
        return r(eehyVar, false);
    }

    public static ArrayList r(eehy eehyVar, boolean z) {
        String p = p();
        if (eehyVar == null) {
            throw new IllegalArgumentException("sipStack cannot be null.");
        }
        eelo j = eene.j(eehyVar.n(), eehyVar.i(), eehyVar.p(), p);
        if (z) {
            j.f();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(j);
        return arrayList;
    }

    public static ArrayList s(eenj eenjVar, boolean z) {
        int i;
        ArrayList arrayList = new ArrayList();
        Iterator it = eenjVar.a.j("Record-Route").iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            eeld eeldVar = (eeld) ((eeku) it.next());
            eelg eelgVar = new eelg(eeldVar.a);
            if (eeldVar.m()) {
                Iterator<eejc> it2 = eeldVar.e.iterator();
                while (it2.hasNext()) {
                    eelgVar.e.e((eejc) it2.next().clone());
                }
            }
            if (z) {
                arrayList.add(0, eelgVar.a());
            } else {
                arrayList.add(eelgVar.a());
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (i = 0; i < arrayList.size(); i++) {
            try {
                arrayList2.add((eelg) eene.g("Route", (String) arrayList.get(i)));
            } catch (eeje e2) {
                System.err.print("Can't create default Route header ".concat(String.valueOf(e2.getMessage())));
            }
        }
        return arrayList2;
    }

    public static void t(eenj eenjVar, String[] strArr, boolean z, boolean z2) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            if (E(eenjVar) != 2 || !e.contains(str)) {
                sb.append(";");
                sb.append(str);
            }
        }
        if (z) {
            sb.append(";explicit");
        }
        if (z2) {
            sb.append(";require");
        }
        eenjVar.a.p(eene.g("Accept-Contact", "*".concat(sb.toString())));
    }

    public static void u(eenj eenjVar, String str, String[] strArr) {
        boolean z;
        String[] strArr2;
        Object[] objArr;
        eekl c2;
        boolean z2 = false;
        if (strArr.length != 0 && (c2 = eenjVar.a.c()) != null && !c2.i()) {
            eekk eekkVar = (eekk) eenjVar.a.c().f();
            eekkVar.getClass();
            for (int i = 0; i < strArr.length; i++) {
                if (!strArr[i].contains("+sip.instance")) {
                    eekkVar.j(new eejc(strArr[i], null));
                }
            }
        }
        if (eenjVar.x()) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            z = false;
            strArr2 = strArr;
        } else {
            Object a2 = a.a(str, "+sip.instance=\"<", ">\"");
            z = true;
            if (strArr == null) {
                Object[] objArr2 = (Object[]) Array.newInstance(a2.getClass(), 1);
                objArr2[0] = a2;
                objArr = objArr2;
            } else {
                Class<?> componentType = strArr.getClass().getComponentType();
                objArr = strArr;
                if (!Objects.isNull(componentType)) {
                    int length = strArr.length;
                    Object[] objArr3 = (Object[]) Array.newInstance(componentType, length + 1);
                    System.arraycopy(strArr, 0, objArr3, 0, length);
                    objArr3[objArr3.length - 1] = a2;
                    objArr = objArr3;
                }
            }
            z2 = true;
            strArr2 = (String[]) objArr;
        }
        t(eenjVar, strArr2, z2, z);
    }

    public static boolean v(String str) {
        if (TextUtils.isEmpty(str) || !str.toLowerCase(Locale.US).startsWith("sip:") || w(str.substring(4).split("@", -1)[0])) {
            return false;
        }
        return dktk.c(str.substring(4));
    }

    public static boolean w(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!PhoneNumberUtils.isDialable(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static boolean x(String str, String str2) {
        return str != null && str.toLowerCase(Locale.US).contains(str2);
    }

    public static boolean y(ImsConfiguration imsConfiguration) {
        return "tel".equals(imsConfiguration.mIntUrlFmt);
    }

    public static boolean z(eenk eenkVar) {
        return (((Boolean) c.a()).booleanValue() && "ACK".equals(eenkVar.z())) ? false : true;
    }
}
